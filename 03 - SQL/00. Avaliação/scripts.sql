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
  UNIQUE INDEX `cod_UNIQUE` (`cod` ASC) VISIBLE,
  CONSTRAINT `cliente_cod`
    FOREIGN KEY (`cod`)
    REFERENCES `estacionamento-gis`.`tb_cliente` (`cod`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
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

