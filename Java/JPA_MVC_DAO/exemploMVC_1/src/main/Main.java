
package main;

import controller.ControladorContato;
import model.dao.DAOGenerico;
import model.entity.Contato;
import view.ViewContato2;

public class Main {
    public static void main(String [] args) {
        ViewContato2 view;
        DAOGenerico<Contato> model;
        ControladorContato controlador;
        ViewContato2.inicia();
        view = new ViewContato2();
        model = DAOGenerico.getInstance();
        controlador = new ControladorContato(view, model);
        view.addComponentListener(controlador);
        view.getBtnEditar().addActionListener(controlador);
        view.getBtnNovo().addActionListener(controlador);
        view.getBtnPesquisar().addActionListener(controlador);
        view.getBtnSalvar().addActionListener(controlador);
        view.getBtnRemover().addActionListener(controlador);
        // inicialização da interface
        view.setVisible(true);
    }
}
