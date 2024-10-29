
create database GerenciamentoHardware;

use GerenciamentoHardware;

-- Tabela de Máquinas
CREATE TABLE maquina (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_serie VARCHAR(50) NOT NULL UNIQUE,
    processador VARCHAR(100),
    ram VARCHAR(50),
    armazenamento VARCHAR(50),
    data_aquisicao DATE,
    localizacao VARCHAR(100),
    status ENUM('funcionando', 'em_manutencao', 'fora_de_uso') NOT NULL,
    laboratorio_id INT
);

-- Tabela de Laboratórios
CREATE TABLE laboratorio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100),
    responsavel VARCHAR(100)
);

-- Tabela de Peças
CREATE TABLE peca (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    fabricante VARCHAR(50),
    numero_serie VARCHAR(50) UNIQUE,
    quantidade_estoque INT NOT NULL,
    imagem VARCHAR(255)
);

-- Tabela de Manutenções
CREATE TABLE manutencao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    maquina_id INT,
    data_conserto DATE NOT NULL,
    problema TEXT,
    solucao TEXT,
    tecnico_id INT,
    FOREIGN KEY (maquina_id) REFERENCES maquina(id),
    FOREIGN KEY (tecnico_id) REFERENCES usuario(id)
);

-- Tabela de Histórico de Manutenções
CREATE TABLE historico_manutencao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    maquina_id INT,
    data DATE NOT NULL,
    descricao TEXT,
    FOREIGN KEY (maquina_id) REFERENCES maquina(id)
);

-- Tabela de Controle de Peças Trocadas
CREATE TABLE peca_trocada (
    id INT AUTO_INCREMENT PRIMARY KEY,
    manutencao_id INT,
    peca_id INT,
    quantidade INT NOT NULL,
    FOREIGN KEY (manutencao_id) REFERENCES manutencao(id),
    FOREIGN KEY (peca_id) REFERENCES peca(id)
);

-- Tabela de Usuários
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    perfil ENUM('tecnico', 'administrador', 'professor') NOT NULL
);

-- Tabela de Permissões por Usuário
CREATE TABLE permissao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    permissao VARCHAR(50) NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

-- Tabela de Agendamento de Manutenções Preventivas
CREATE TABLE agendamento_preventivo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    maquina_id INT,
    data_agendada DATE NOT NULL,
    status ENUM('pendente', 'concluido') NOT NULL,
    FOREIGN KEY (maquina_id) REFERENCES maquina(id)
);