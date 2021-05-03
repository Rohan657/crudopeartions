DROP TABLE IF EXISTS User;
CREATE TABLE User(id INT  PRIMARY KEY, name VARCHAR(250) NOT NULL,address VARCHAR(250) NOT NULL,email VARCHAR(250) NOT NULL,phone INT NOT NULL);
INSERT INTO User(id,name,address,email,phone) VALUES (1, 'Rohan' , 'sonipat', 'r46@gmail.com', 8929),
(2, 'Rohan' , 'sonipat', 'r46@gmail.com', 8929),(3, 'Rohan' , 'sonipat', 'r46@gmail.com', 8929);