package app;

import model.DAO.LaboratoriosDAO;
import model.DAO.MaquinaDAO;
import model.DAO.UsuariosDAO;
import model.DTO.Laboratorios;
import model.DTO.Maquina;
import model.DTO.Usuarios;

public class Main {

    public static void main(String[] args) {
        // Criar uma instância de LaboratoriosDAO
        LaboratoriosDAO laboratorioDAO = new LaboratoriosDAO();

        // Inserir um laboratório
        Laboratorios laboratorios = new Laboratorios("Laboratório A", "Sala 101");
        laboratorioDAO.inserirLaboratorio(laboratorios);

        // Listar laboratórios
        System.out.println("Laboratórios:");
        for (Laboratorios lab : laboratorioDAO.listarLaboratorios()) {
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

        // Criar uma instância de UsuariosDAO
        UsuariosDAO usuarioDAO = new UsuariosDAO();

        // Inserir um usuário
        Usuarios usuario = new Usuarios("Carlos Silva", "carlos.silva@example.com", "senha123");
        usuarioDAO.inserirUsuario(usuario);

        // Listar usuários
        System.out.println("Usuários:");
        for (Usuarios u : usuarioDAO.listarUsuarios()) {
            System.out.println(u);
        }
    }
}
