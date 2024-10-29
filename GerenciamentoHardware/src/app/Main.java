
package app;

import dao.LaboratorioDAO;
import dao.MaquinaDAO;
import dao.PeçaDAO;
import dao.UsuarioDAO;
import model.Laboratorio;
import model.Maquina;
import model.Peça;
import model.Usuario;

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
        PeçaDAO peçaDAO = new PeçaDAO();

        // Inserir uma peça
        Peça peça = new Peça("Memória RAM", "Memória", "Memória RAM de 16GB", 10);
        peçaDAO.inserirPeça(peça);
        
        // Listar peças
        System.out.println("Peças:");
        for (Peça p : peçaDAO.listarPeças()) {
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

