DROP DATABASE IF EXISTS jcrud;
CREATE DATABASE jcrud CHARACTER SET utf8 COLLATE utf8_general_ci;
USE jcrud;

CREATE TABLE users (
	u_id INt PRIMARY KEY AUTO_INCREMENT,
    u_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    u_name VARCHAR(255),
    u_email VARCHAR(255),
    u_password VARCHAR(63),
    u_status ENUM('on', 'off', 'del') DEFAULT 'on'
);

INSERT INTO users ( u_name, u_email, u_password ) VALUES 
("Joca da Silva", "joca@silva.com.br", SHA1("Senha123")),
("Setembrino Troca Tapas", "set@brino.com", SHA1("Senha123")),
("Hermenilda Siriliado Souza", "heremnilda@gmail.com", SHA1("Senha123")),
("Marineuza Siriliano", "mari@neuza.com.br", SHA1("Senha123"));
