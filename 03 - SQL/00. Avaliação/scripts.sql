/*
    CRIANDO A DATABASE
*/
CREATE SCHEMA `estacionamento-gis`;

/*
    CRIANDO A TABELA REFERENTE AO ESTACIONAMENTO
*/
CREATE TABLE `estacionamento-gis`.`tb_estacionamento` (
  `num_vaga` INT NOT NULL,
  `valor_hora` INT NOT NULL,
  PRIMARY KEY (`num_vaga`),
  UNIQUE INDEX `num_vaga_UNIQUE` ('num_vaga' ASC) VISIBLE);

/*
    CRIANDO A TABELA REFERENTE AO CLIENTE
*/
CREATE TABLE `estacionamento-gis`.`tb_cliente` (
  `cod` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE INDEX `cod_UNIQUE` (`cod` ASC) VISIBLE);

/* e aqui já alterando o tipo de campo em CPF */
ALTER TABLE `estacionamento-gis`.`tb_cliente` 
  CHANGE COLUMN `cpf` `cpf` CHAR(11) NOT NULL ;


/*
    CRIANDO A TABELA REFERENTE AO VEÍCULO JÁ INDICANDO
    A CHAVE ESTRANGEIRA REFERENTE AO CLIENTE QUE É DONO DO VEÍCULO
*/
CREATE TABLE `estacionamento-gis`.`tb_veiculo` (
  `cod` INT NOT NULL AUTO_INCREMENT,
  `modelo` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `placa` VARCHAR(45) NOT NULL,
  `cor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE INDEX `cod_UNIQUE` (`cod` ASC) VISIBLE);

ALTER TABLE `estacionamento-gis`.`tb_veiculo` 
  ADD COLUMN `cliente_cod` INT NULL AFTER `cod`,
  ADD INDEX `cliente_cod_idx` (`cliente_cod` ASC) VISIBLE;

ALTER TABLE `estacionamento-gis`.`tb_veiculo` 
ADD CONSTRAINT `cliente_cod`
  FOREIGN KEY (`cliente_cod`)
  REFERENCES `estacionamento-gis`.`tb_cliente` (`cod`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

/*
    CRIANDO A TABELA DE RECIBOS, NA 3a FORMA NORMAL
*/

CREATE TABLE `estacionamento-gis`.`tb_recibos_estacionamento` (
  `cod` INT NOT NULL AUTO_INCREMENT,
  `qtde_horas_estacionadas` INT NOT NULL,
  `numVaga` INT NOT NULL,
  `veiculo_cod` INT NOT NULL,
  PRIMARY KEY (`cod`),
  INDEX `numVaga_idx` (`numVaga` ASC) VISIBLE,
  INDEX `veiculo_cod_idx` (`veiculo_cod` ASC) VISIBLE,
  CONSTRAINT `numVaga`
    FOREIGN KEY (`numVaga`)
    REFERENCES `estacionamento-gis`.`tb_estacionamento` (`num_vaga`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `veiculo_cod`
    FOREIGN KEY (`veiculo_cod`)
    REFERENCES `estacionamento-gis`.`tb_veiculo` (`cod`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

/*
    INSERINDO DADOS NA TABELA tb_cliente
*/
INSERT INTO `estacionamento-gis`.`tb_cliente` (`nome`, `cpf`) VALUES ('José Silva', '12345678999');
INSERT INTO `estacionamento-gis`.`tb_cliente` (`nome`, `cpf`) VALUES ('João Silva', '98765432111');
INSERT INTO `estacionamento-gis`.`tb_cliente` (`nome`, `cpf`) VALUES ('Maria Santos', '45612378944');
/*
    INSERINDO DADOS NA TABELA tb_veiculo
*/
INSERT INTO `estacionamento-gis`.`tb_veiculo` (`cliente_cod`, `modelo`, `marca`, `placa`, `cor`) VALUES ('2', 'Civic', 'Honda', 'ABC-123', 'Prata');
INSERT INTO `estacionamento-gis`.`tb_veiculo` (`cliente_cod`, `modelo`, `marca`, `placa`, `cor`) VALUES ('3', 'Fiesta', 'Ford', 'XYZ-987', 'Vermelho');
INSERT INTO `estacionamento-gis`.`tb_veiculo` (`cliente_cod`, `modelo`, `marca`, `placa`, `cor`) VALUES ('1', 'Corolla', 'Toyota', 'DEF-456', 'Preto');
/*
    INSERINDO DADOS NA TABELA tb_estacionamento
*/
INSERT INTO `estacionamento-gis`.`tb_estacionamento` (`num_vaga`, `valor_hora`) VALUES ('12', '10');
INSERT INTO `estacionamento-gis`.`tb_estacionamento` (`num_vaga`, `valor_hora`) VALUES ('18', '10');
INSERT INTO `estacionamento-gis`.`tb_estacionamento` (`num_vaga`, `valor_hora`) VALUES ('23', '10');
/*
    INSERINDO DADOS NA TABELA tb_recibos_estacionamento
*/
INSERT INTO `estacionamento-gis`.`tb_recibos_estacionamento` (`qtde_horas_estacionadas`, `numVaga`, `veiculo_cod`) VALUES ('3', '12', '1');
INSERT INTO `estacionamento-gis`.`tb_recibos_estacionamento` (`qtde_horas_estacionadas`, `numVaga`, `veiculo_cod`) VALUES ('7', '18', '2');
INSERT INTO `estacionamento-gis`.`tb_recibos_estacionamento` (`qtde_horas_estacionadas`, `numVaga`, `veiculo_cod`) VALUES ('9', '23', '3');
/*
    CRIANDO UMA VIEW PARA RETORNAR OS DADOS DO CLIENTE E DO VEÍCULO
*/
CREATE VIEW cliente_veiculo AS
  SELECT veic.modelo AS modelo, veic.marca AS marca, veic.placa AS placa, tb_cliente.nome AS nome_cliente, tb_cliente.cpf AS cpf
  FROM tb_veiculo veic
  JOIN tb_cliente
  ON tb_cliente.cod = veic.cliente_cod
  GROUP BY marca, modelo, placa, nome_cliente, cpf
/*
    USANO O RELACIONAMENTO DA TABELA DE RECIBOS PARA TRAZER VÁRIOS DADOS AO MESMO TEMPO
*/
SELECT tb_estacionamento.num_vaga AS vaga, tb_cliente.nome AS nome, tb_veiculo.placa AS placa, tb_recibos_estacionamento.qtde_horas_estacionadas AS horas_estacionado
  FROM tb_recibos_estacionamento
  JOIN tb_estacionamento
  ON tb_recibos_estacionamento.numVaga = tb_estacionamento.num_vaga
  JOIN tb_veiculo
  ON tb_recibos_estacionamento.veiculo_cod = tb_veiculo.cod
  JOIN tb_cliente
  ON tb_veiculo.cliente_cod = tb_cliente.cod
  GROUP BY vaga, nome, placa, horas_estacionado ORDER BY horas_estacionado ASC





