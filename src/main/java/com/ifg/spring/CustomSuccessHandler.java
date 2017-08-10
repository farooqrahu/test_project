package com.ifg.spring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.ifg.spring.instrumentation.Utility;
import com.ifg.spring.model.User;

/**
 * @author Farooq
 *
 */
@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	private static final Logger logger = Logger.getLogger(CustomSuccessHandler.class);

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {
		String targetUrl = determineTargetUrl(authentication, request);

		if (response.isCommitted()) {
			System.out.println("Can't redirect");
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	protected String determineTargetUrl(Authentication authentication, HttpServletRequest request) {
		String url = "";
		logger.info("Check User Role.");
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		List<String> roles = new ArrayList<String>();
		for (GrantedAuthority a : authorities) {
			logger.info("User logged in hase Role: " + a.getAuthority().toString());
			roles.add(a.getAuthority());
		}

		if (isIfgOwner(roles) || isSaleManager(roles) || isDataEntry(roles) || isSaleRep(roles)
				|| isWareHouseManager(roles)) {
			logger.info("User has Logged In Successfully.");
			User user = Utility.getLoggedInUser();
			if (user.isTempPassword()) {
				request.getSession().setAttribute("tempPass", "true");
				url = "/index";
			} else {
				url = "/index";
			}

		} else {
			logger.info("error no role");
			request.getSession().setAttribute("accessDenied", "true");
			;
			url = "/accessDenied";
		}

		return url;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	protected RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	private boolean isIfgOwner(List<String> roles) {
		if (roles.contains("ROLE_IFG_OWNER")) {
			return true;
		}
		return false;
	}

	private boolean isSaleManager(List<String> roles) {
		if (roles.contains("ROLE_SALE_MANAGER")) {
			return true;
		}
		return false;
	}

	private boolean isDataEntry(List<String> roles) {
		if (roles.contains("ROLE_DATA_ENTRY")) {
			return true;
		}
		return false;
	}

	private boolean isWareHouseManager(List<String> roles) {
		if (roles.contains("ROLE_WAREHOUSE_MANAGER")) {
			return true;
		}
		return false;
	}

	private boolean isSaleRep(List<String> roles) {
		if (roles.contains("ROLE_SALE_REP")) {
			return true;
		}
		return false;
	}

}