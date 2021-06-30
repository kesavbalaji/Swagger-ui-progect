--changeset - id = 1 , name = kesav
CREATE TABLE IF NOT EXISTS customer_info  (id int NOT NULL, address VARCHAR(255) NOT NULL, city VARCHAR(255), country VARCHAR(255), postal_code VARCHAR(255), state VARCHAR(255));

--cahngeset - id = 2 , name = kesav
CREATE TABLE IF NOT EXISTS admin_info (id int NOT NULL, address VARCHAR(255) NOT NULL, city VARCHAR(255), country VARCHAR(255), postal_code VARCHAR(255), state VARCHAR(255));

--changeset - id =3 , name = kesav
INSERT  INTO  public.customer_info  (id,address,city,country,postal_code,state)  VALUES  ('1','Eden Garden','Chennai','India','600095','TamilNadu');