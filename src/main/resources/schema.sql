DROP TABLE IF EXISTS pets;

CREATE TABLE pets (
      id       INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
      name     VARCHAR(30) NOT NULL,
      owner_id INT         NOT NULL,
      type_id  INT         NOT NULL
);
