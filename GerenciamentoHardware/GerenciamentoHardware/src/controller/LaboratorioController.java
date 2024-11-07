package controller;

import model.DAO.LaboratorioDAO;
import model.DTO.Laboratorio;
import view.TelaLaboratorio;

import java.util.List;

public class LaboratorioController {
    private TelaLaboratorio view;
    private LaboratorioDAO dao;

    public LaboratorioController(TelaLaboratorio view, LaboratorioDAO dao) {
        this.view = view;
        this.dao = dao;
        adicionarListeners();
    }

    private void adicionarListeners() {
        view.getAdicionarButton().addActionListener(e -> adicionarLaboratorio());
        view.getListarButton().addActionListener(e -> listarLaboratorios());
        view.getLimparButton().addActionListener(e -> view.limparCampos());
    }

    private void adicionarLaboratorio() {
        String nome = view.getNomeField().getText();
        String localizacao = view.getLocalizacaoField().getText();

        if (validarCampos(nome, localizacao)) {
            Laboratorio laboratorio = new Laboratorio(nome, localizacao);
            dao.inserirLaboratorio(laboratorio);
            view.limparCampos();
            view.exibirMensagem("Laboratório adicionado com sucesso!");
        } else {
            view.exibirMensagem("Por favor, preencha todos os campos.");
        }
    }

    private void listarLaboratorios() {
        List<Laboratorio> laboratorios = dao.listarLaboratorios();
        view.exibirLaboratorios(laboratorios);
    }

    private boolean validarCampos(String nome, String localizacao) {
        return !nome.trim().isEmpty() && !localizacao.trim().isEmpty();
    }
}
