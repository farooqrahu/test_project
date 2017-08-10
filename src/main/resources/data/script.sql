INSERT INTO `roles` (`id`, `name`) VALUES
	(1, 'ROLE_IFG_OWNER'),
	(2, 'ROLE_SALE_MANAGER'),
	(3, 'ROLE_DATA_ENTRY'),
	(4, 'ROLE_SALE_REP'),
	(5, 'ROLE_WAREHOUSE_MANAGER');

INSERT INTO users  VALUES ('1', 'owner', 'ifgowner@ifgowner.com', '1', b'1', 'ifg','$2a$10$npxwaJc/i.y6SB.E73eNl..N.YPFsm4fWFPinEgaG36gKCb9mWQMW', '123', b'0', 'ifgowner'); 
INSERT INTO user_roles (user_id, roles_id) VALUES ('1', '4');


INSERT INTO warehouse (warehouse_id, code, created_by, creation_date, description, is_active, modification_date, modified_by, name) VALUES
	(1, '001', 'admin', '1463146383178', 'IFGWareHouse', b'1', NULL, NULL, 'IFG'),
	(2, '001', 'admin', '1463146383178', 'TrimuphWareHouse', b'1', NULL, NULL, 'Trimuph'),
	(3, '001', 'admin', '1463146383178', 'CentralWareHouse', b'1', NULL, NULL, 'Central');
	
INSERT INTO brand (brand_id, created_by, creation_date, description, is_active, modification_date, modified_by, name) VALUES
	(1, 'none', '1463146383178', 'IFG', b'1', NULL, NULL, 'IFG'),
	(2, 'none', '1463146383178', 'TRIUMPH', b'1', NULL, NULL, 'TRIUMPH');	
	
INSERT INTO `size` (`size_id`, `created_by`, `creation_date`, `is_active`, `modification_date`, `modified_by`, `product_size`, `brand_id`) VALUES	
	(1, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '30', 1),
	(2, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '32', 1),
	(3, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '34', 1),
	(4, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '36', 1),
	(5, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '38', 1),
	(6, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '40', 1),
	(7, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '42', 1),
	(8, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '44', 1),
	(9, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '46', 1),
	(10, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '30(S)', 2),
	(11, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '32(S)', 2),
	(12, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '34(M)', 2),
	(13, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '36(M)', 2),
	(14, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '38(L)', 2),
	(15, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '40(L)', 2),
	(16, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '42(XL)', 2),
	(17, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '44(XL)', 2),
	(18, 'admin', '2016-04-25 09:42:28', b'1', NULL, NULL, '46(XL)', 2);

INSERT INTO payment_method (payment_method_id, created_by, creation_date, description, is_active, name) VALUES ('1', 'admin', '1463146383178', 'abc', b'1', 'ADVANCE');
INSERT INTO payment_method (payment_method_id, created_by, creation_date, description, is_active, name) VALUES ('2', 'admin', '1463146383178', 'abc', b'1', 'BANK');
INSERT INTO payment_method (payment_method_id, created_by, creation_date, description, is_active, name) VALUES ('3', 'admin', '1463146383178', 'abc', b'1', 'CASH');
INSERT INTO payment_method (payment_method_id, created_by, creation_date, description, is_active, name) VALUES ('4', 'admin', '1463146383178', 'abc', b'1', 'CREDIT');
