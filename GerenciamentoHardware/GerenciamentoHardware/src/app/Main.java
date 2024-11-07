
package app;

import model.DAO.LaboratorioDAO;
import model.DAO.MaquinaDAO;
import model.DAO.PecaDAO;
import model.DAO.UsuarioDAO;
import model.DTO.Laboratorio;
import model.DTO.Maquina;
import model.DTO.Peca;
import model.DTO.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância de LaboratorioDAO
        LaboratorioDAO laboratorioDAO = new LaboratorioDAO();
        
        // Inserir um laboratório
        Laboratorio laboratorio = new Laboratorio("Laboratório A", "Sala 101");
        laboratorioDAO.inserirLaboratorio(laboratorio);
        
        // Listar laboratórios
        System.out.println("Laboratórios:");
        for (Laboratorio lab : laboratorioDAO.listarLaboratorios()) {
            System.out.println(lab);
        }

        // Criar uma instância de MaquinaDAO
        MaquinaDAO maquinaDAO = new MaquinaDAO();

        // Inserir uma máquina
        Maquina maquina = new Maquina("ABC123", "Intel i7", "16GB", "512GB SSD",
                                       "2023-01-15", "Sala 101", "Ativa", 1);
        maquinaDAO.inserirMaquina(maquina);
        
        // Listar máquinas
        System.out.println("Máquinas:");
        for (Maquina m : maquinaDAO.listarMaquinas()) {
            System.out.println(m);
        }

        // Criar uma instância de PeçaDAO
        PecaDAO peçaDAO = new PecaDAO();

        // Inserir uma peça
        Peca peça = new Peca("Memória RAM", "Memória", "Memória RAM de 16GB", 10);
        peçaDAO.inserirPeca(peça);
        
        // Listar peças
        System.out.println("Peças:");
        for (Peca p : peçaDAO.listarPecas()) {
            System.out.println(p);
        }

        // Criar uma instância de UsuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Inserir um usuário
        Usuario usuario = new Usuario("Carlos Silva", "carlos.silva@example.com", "senha123");
        usuarioDAO.inserirUsuario(usuario);
        
        // Listar usuários
        System.out.println("Usuários:");
        for (Usuario u : usuarioDAO.listarUsuarios()) {
            System.out.println(u);
        }
    }
}

