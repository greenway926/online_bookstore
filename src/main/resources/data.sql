INSERT INTO public.role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO public.role (role_name) VALUES ('ROLE_USER');

INSERT INTO public."user" (id, created_by, created_time, status, updated_by, updated_time, address, email, full_name, password, phone_number, username) VALUES (1, 'init', '2020-03-12 00:00:00', 'ACTIVE', NULL, '2020-03-12 00:00:00', 'Malang, Jawa Timur', 'admin@email.com', 'Administrator', '$2a$04$lMlZP3e/6RlxOyFWQvXvY.yqI2Y4nJxRhy/wCvGVqfm.5qXeNMxxG', '081234567890', 'admin');
INSERT INTO public."user" (id, created_by, created_time, status, updated_by, updated_time, address, email, full_name, password, phone_number, username) VALUES (2, 'init', '2020-03-12 00:00:00', 'ACTIVE', NULL, '2020-03-12 00:00:00', 'Bogor, Jawa Barat', 'user@email.com', 'Customer', '$2a$04$Q1tJAQ0UhNGSX9H5aL4A5uCaHW2wt7KEeuTpPyNg9KsSkjKmLf8iy', '081987654321', 'customer');

INSERT INTO public.user_role (username, role_name) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO public.user_role (username, role_name) VALUES ('customer', 'ROLE_USER');