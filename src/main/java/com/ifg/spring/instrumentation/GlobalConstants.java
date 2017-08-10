package com.ifg.spring.instrumentation;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;

import com.ifg.spring.ApplicationContextProvider;

/*
 * 
 * @author Farooq.Rahu
 * */

public class GlobalConstants {

	static ApplicationContext appContext = new ApplicationContextProvider().getApplicationContext();

	static Locale locale = LocaleContextHolder.getLocale();

	public static String getMessage(String msg) {
		return appContext.getMessage(msg, null, locale);
	}

	public static String getParametarizedMessage(String msg, Object object[]) {
		return appContext.getMessage(msg, object, locale);
	}

	public final static String USER_LIST = "usersList";
	/***USER-ALL-ROLES ****/
	public final static String IFG_ROLE_SALEREP = "ROLE_SALE_REP";
	public final static String ROLE_WAREHOUSE_MANAGER = "ROLE_WAREHOUSE_MANAGER";
	public final static String ROLE_DATA_ENTRY = "ROLE_DATA_ENTRY";

	public static final String IFG_USER_DELETE_SUCCESS = "IFG.USER.DELETE.SUCCESS";
	public static final String IFG_USER_DELETE_FAIL = "IFG.USER.DELETE.FAIL";
	public static final String IFG_USER_DELETE_FAIL_MSG = "IFG.USER.DELETE.FAIL.MSG";

	public static final String IFG_USER_CREATED_SUCCESS = "IFG.USER.CREATED.SUCCESS";
	public static final String IFG_USER_CREATED_FAIL = "IFG.USER.CREATED.FAIL";
	public static final String IFG_USER_UPDATED_SUCCESS = "IFG.USER.UPDATED.SUCCESS";
	public static final String IFG_USER_UPDATED_FAIL = "IFG.USER.CREATED.FAIL";
	public static final String IFG_USER_CREATE_UPDATE_FAIL = "IFG.USER.CREATE.UPDATE.FAIL";

	public static final String SAVE = "true";
	public static final String UPDATE = "true";
	public static final String SUCCESS = "s_msg";
	public static final String FAIL = "f_msg";

	/***HTML Pages **/
	public final static String MANAGEUSER_HTML_PAGE = "manageuser";
	public static final String USER_MODALS_HTML_PAGE = "usermodals";
	public static final String CHANGE_USER_PASSWORD_HTML_PAGE = "settings";

	public static final String DUPLICATE_EMPLOYEE_ID = "DUPLICATE.EMPLOYEE.ID";
	public static final String DUPLICATE_USER_NAME = "DUPLICATE.USER.NAME";
	public static final String IFG_USER_PASSWORD_MATCH_FAIL = "IFG.USER.PASSWORD.MATCH.FAIL";
	public static final String IFG_USER_PASSWORD_CHANGE_SUCCESS = "IFG.USER.PASSWORD.CHANGE.SUCCESS";
	public static final String IFG_USER_PASSWORD_CHANGE_FAIL = "IFG.USER.PASSWORD.CHANGE.FAIL";
	public static final String IFG_USER_PASSWORD_RESET_SUCCESS = "IFG.USER.PASSWORD.RESET.SUCCESS";
	public static final String IFG_USER_PASSWORD_RESET_FAIL = "IFG.USER.PASSWORD.RESET.FAIL";
	public static final String INDEX_HTML_PAGE = "index";

	public static final String ORDER_ALREADY_RETURNED = "ORDER.ALREADY.RETURNED";
	public static final String ORDER_RETURNED = "ORDER.RETURNED";
	public static final String GENERATE_INVOICE = "GENERATE.INVOICE";
	public static final String INVOICE_GENERATE_SUCCESS = "INVOICE.GENERATE.SUCCESS";
	public static final String INVOICE_GENERATE_FAIL = "INVOICE.GENERATE.FAIL";
	public static final String TEX_SAVE_SUCCESS = "TEX.SAVE.SUCCESS";
	public static final String TEX_SAVE_FAILED ="TEX.SAVE.FAILED";
	
	public static final String IFG_CUSTOMER_APPROVE_SUCCESS = "IFG.CUSTOMER.APPROVE.SUCCESS";
	public static final String IFG_CUSTOMER_APPROVE_FAIL = "IFG.CUSTOMER.APPROVE.FAIL";
	public static final String IFG_CUSTOMER_SAVE_SUCCESS = "IFG.CUSTOMER.SAVE.SUCCESS";
	public static final String IFG_CUSTOMER_CODE_DUPLICATE = "IFG.CUSTOMER.CODE.DUPLICATE";
	public static final String IFG_CUSTOMER_CNIC_DUPLICATE = "IFG.CUSTOMER.CNIC.DUPLICATE";
	public static final String IFG_CUSTOMER_NTN_DUPLICATE = "IFG.CUSTOMER.NTN.DUPLICATE";
	public static final String IFG_CUSTOMER_UPDATE_SUCCESS = "IFG.CUSTOMER.UPDATE.SUCCESS";
	public static final String IFG_CUSTOMER_SAVE_FAIL = "IFG.CUSTOMER.SAVE.FAIL";
	public static final String IFG_ORDER_DELIVERED_SUCCESS = "IFG.ORDER.DELIVERED.SUCCESS";
	public static final String IFG_PRODUCT_TOTAL_PRICE_MARKET_PRICE = "IFG.PRODUCT.TOTAL.PRICE.MARKET.PRICE";
	public static final String IFG_PRODUCT_UPDATE_SUCCESS = "IFG.PRODUCT.UPDATE.SUCCESS";
	public static final String IFG_PRODUCT_SAVE_SUCCESS = "IFG.PRODUCT.SAVE.SUCCESS";
	public static final String IFG_PRODUCT_UPDATE_FAIL = "IFG.PRODUCT.UPDATE.FAIL";
	public static final String IFG_PRODUCT_SAVE_FAIL = "IFG.PRODUCT.SAVE.FAIL";
	public static final String IFG_PRODUCT_DELETE_SUCCESS = "IFG.PRODUCT.DELETE.SUCCESS";
	public static final String IFG_PRODUCT_DELETE_FAIL = "IFG.PRODUCT.DELETE.FAIL";
	public static final String IFG_PRODUCT_NOT_FOUND_DELETE_FAIL = "IFG.PRODUCT.NOT.FOUND.DELETE.FAIL";
	public static final String IFG_PRODUCT_SIZE_NOT_AVAILABLE = "IFG.PRODUCT.SIZE.NOT.AVAILABLE";
	public static final String IFG_PRODUCT_SIZE_AVAILABLE_QUANTITY = "IFG.PRODUCT.SIZE.AVAILABLE.QUANTITY";
	public static final String IFG_PRODUCT_SIZE_OUT_OF_STOCK = "IFG.PRODUCT.SIZE.OUT.OF.STOCK";

	public static ApplicationContext getAppContext() {
		return appContext;
	}

	public static void setAppContext(ApplicationContext appContext) {
		GlobalConstants.appContext = appContext;
	};

}
