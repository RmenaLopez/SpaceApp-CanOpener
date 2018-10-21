-- schema.sql
CREATE TABLE natural_disasters_record(
  id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  disaster_name varchar (255) NOT NULL
);