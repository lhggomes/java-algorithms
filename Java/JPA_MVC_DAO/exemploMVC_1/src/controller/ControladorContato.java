/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.GUImodel.ContatoTableModel;
import model.dao.DAOGenerico;
import model.entity.Contato;
import view.ViewContato2;

/**
 *
 * @author Iara Silva
 */
public class ControladorContato implements ActionListener, ComponentListener {

    private ViewContato2 viewContato;
    private DAOGenerico<Contato> contatoDao;
    
    
    public ControladorContato(ViewContato2 view, DAOGenerico<Contato> model) {
        viewContato = view;
        contatoDao = model;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // novo
        if (e.getSource() == viewContato.getBtnNovo()) {
            Object [] conts = contatoDao.obtemTodos(Contato.class).toArray();
            Contato ultimo = (Contato) conts[conts.length-1];
            long id = ultimo.getId() + 1;
            viewContato.getTxtId().setText(String.valueOf(id));
        }
        // editar
        else if (e.getSource() == viewContato.getBtnEditar()) {
            if(viewContato.getTable().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um contato na lista para editar");
            }	
            else {
                int linha = viewContato.getTable().getSelectedRow();
                Contato con = (Contato) contatoDao.obtemTodos(Contato.class).toArray()[linha];
                viewContato.getTxtId().setText(Long.toString(con.getId()));
                viewContato.getTxtNome().setText(con.getNome());
                viewContato.getTxtTelefone().setText(con.getTelefone());
                // NOTIFICAR O OBSERVADOR
            }
        }
        // salvar
        else if (e.getSource() == viewContato.getBtnSalvar()) {
            long id = Integer.parseInt(viewContato.getTxtId().getText());
            String nome = viewContato.getTxtNome().getText();
            String telefone = viewContato.getTxtTelefone().getText();
            contatoDao.grava(Contato.class, new Contato(id,nome,telefone));
            atualizaTabelaContatos();
            
            viewContato.getTxtId().setText("");
            viewContato.getTxtNome().setText("");
            viewContato.getTxtTelefone().setText("");
        }
        // remover
        else if(e.getSource() == viewContato.getBtnRemover()) {
            if(viewContato.getTable().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um contato na lista para remover");
            }	
            else {
                long id = (Long) viewContato.getTable().getModel().getValueAt(viewContato.getTable().getSelectedRow(),0);
                contatoDao.apaga(Contato.class, contatoDao.obtemPorID(Contato.class, id));
                atualizaTabelaContatos();
            }
        } else if (e.getSource() == viewContato.getBtnPesquisar()){
            String nome = viewContato.getTxtPesquisar().getText();
            Collection<Contato> contatc = contatoDao.obtemPorNome(Contato.class, nome);
            viewContato.getTable().setModel(new ContatoTableModel(contatc));
            
           
            
        }
    }
        
    private void atualizaTabelaContatos() {
        Collection<Contato> contatos = contatoDao.obtemTodos(Contato.class);
        viewContato.getTable().setModel(new ContatoTableModel(contatos));		
    } 

    @Override
    public void componentResized(ComponentEvent e) {
       
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
        atualizaTabelaContatos();
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        
    }
    
}
