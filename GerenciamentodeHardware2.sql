create database GerenciamentodeHardware2;

use GerenciamentodeHardware2;

-- 1. Tabela `usuarios`
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    perfil ENUM('tecnico', 'administrador', 'professor', 'estagiario') NOT NULL
);

-- 2. Tabela `laboratorios`
CREATE TABLE laboratorios (
    id_laboratorio INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

-- 3. Tabela `maquinas`
CREATE TABLE maquinas (
    id_maquina INT AUTO_INCREMENT PRIMARY KEY,
    id_laboratorio INT,
    nome VARCHAR(100) NOT NULL,
    processador VARCHAR(100),
    memoria_RAM VARCHAR(50),
    armazenamento VARCHAR(50),
    numero_serie VARCHAR(100) UNIQUE,
    data_aquisicao DATE,
    status ENUM('funcionando', 'em_manutencao', 'fora_de_uso') NOT NULL,
    FOREIGN KEY (id_laboratorio) REFERENCES laboratorios(id_laboratorio)
);

-- 4. Tabela `manutencoes`
CREATE TABLE manutencoes (
    id_manutencao INT AUTO_INCREMENT PRIMARY KEY,
    id_maquina INT,
    data_manutencao DATE NOT NULL,
    diagnostico TEXT,
    solucao TEXT,
    tecnico_responsavel VARCHAR(100),
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina)
);

-- 5. Tabela `pecas`
CREATE TABLE pecas (
    id_peca INT AUTO_INCREMENT PRIMARY KEY,
    nome_peca VARCHAR(100) NOT NULL,
    quantidade_estoque INT DEFAULT 0,
    descricao TEXT,
    imagem BLOB
);

-- 6. Tabela `pecas_manutencao`
CREATE TABLE pecas_manutencao (
    id_peca_manutencao INT AUTO_INCREMENT PRIMARY KEY,
    id_manutencao INT,
    id_peca INT,
    quantidade_utilizada INT NOT NULL,
    FOREIGN KEY (id_manutencao) REFERENCES manutencoes(id_manutencao),
    FOREIGN KEY (id_peca) REFERENCES pecas(id_peca)
);


-- Inserindo dados na tabela `usuarios`
INSERT INTO usuarios (nome, email, senha, perfil) VALUES
('Carlos Silva', 'carlos@lab.com', 'tec', 'tecnico'),
('Ana Oliveira', 'ana@lab.com', 'adm', 'administrador'),
('João Santos', 'joao@lab.com', 'prof', 'professor');

-- Inserindo dados na tabela `laboratorios`
INSERT INTO laboratorios (nome) VALUES
('LabinA'),
('LabinB'),
('LabinC'),
('LabinD');

-- Inserindo dados na tabela `maquinas`
INSERT INTO maquinas (id_laboratorio, nome, processador, memoria_RAM, armazenamento, numero_serie, data_aquisicao, status) VALUES
(1, 'Máquina A', 'Intel Core i5', '8GB', '500GB SSD', 'SN001', '2023-01-10', 'funcionando'),
(2, 'Máquina B', 'Intel Core i7', '16GB', '1TB HDD', 'SN002', '2022-11-20', 'em_manutencao'),
(3, 'Máquina C', 'AMD Ryzen 5', '8GB', '256GB SSD', 'SN003', '2023-05-15', 'fora_de_uso');

-- Inserindo dados na tabela `manutencoes`
INSERT INTO manutencoes (id_maquina, data_manutencao, diagnostico, solucao, tecnico_responsavel) VALUES
(1, '2024-01-15', 'Reparação do sistema', 'Reinstalação do SO', 'Carlos Silva'),
(2, '2024-02-20', 'Troca de fonte', 'Fonte substituída', 'Ana Oliveira'),
(3, '2024-03-05', 'Aquecimento excessivo', 'Limpeza interna', 'João Santos');

-- Inserindo dados na tabela `pecas`
INSERT INTO pecas (nome_peca, quantidade_estoque, descricao, imagem) VALUES
('Fonte de Alimentação 500W', 10, 'Fonte para desktops com 500W', NULL),
('Memória RAM 8GB', 20, 'DDR4 para notebooks e desktops', NULL),
('Disco SSD 256GB', 15, 'SSD SATA para alto desempenho', NULL);

-- Inserindo dados na tabela `pecas_manutencao`
INSERT INTO pecas_manutencao (id_manutencao, id_peca, quantidade_utilizada) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 1);

select * from usuarios;

select * from pecas;

