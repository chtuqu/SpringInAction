CREATE DATABASE spring_in_action;

USE spring_in_action;

CREATE TABLE employees (
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  salary DECIMAL(8,2),
  PRIMARY KEY (id)
);

INSERT INTO spring_in_action.employees (first_name, last_name, salary) VALUES ('John', 'Doe', '34027.54');