use miu;
CREATE TABLE product (
                          product_id BIGINT PRIMARY KEY,
                          name VARCHAR(255),
                          unit_price DECIMAL(10, 2),
                          quantity_stocks INT,
                          date_supplied DATE
);

INSERT INTO product (product_id, name, unit_price, quantity_stocks, date_supplied) VALUES
                                                                                        (1, 'Laptop', 999.99, 50, '2022-09-15'),
                                                                                        (2, 'Smartphone', 599.99, 100, '2022-10-01'),
                                                                                        (3, 'Headphones', 79.99, 200, '2022-08-25'),
                                                                                        (4, 'Tablet', 399.99, 75, '2022-09-05'),
                                                                                        (5, 'Smartwatch', 199.99, 120, '2022-10-10');
