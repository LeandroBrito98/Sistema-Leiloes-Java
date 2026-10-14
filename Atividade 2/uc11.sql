-- Sistema de Leilões
-- Banco de dados: uc11

CREATE DATABASE IF NOT EXISTS uc11;

USE uc11;

-- Remove a tabela anterior, se existir
DROP TABLE IF EXISTS produtos;

-- Criação da tabela de produtos
CREATE TABLE produtos (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome TEXT DEFAULT NULL,
    valor INT DEFAULT NULL,
    status TEXT DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Cadastro dos produtos de exemplo
INSERT INTO produtos (id, nome, valor, status) VALUES
(2, 'PS4', 1500, 'Vendido'),
(3, 'Xbox 360', 800, 'Vendido'),
(4, 'Iphone 12', 4800, 'Vendido'),
(5, 'PS2', 400, 'A Venda');

-- Configuração do próximo identificador
ALTER TABLE produtos AUTO_INCREMENT = 6;

-- Consulta para verificar os registros
SELECT * FROM produtos;