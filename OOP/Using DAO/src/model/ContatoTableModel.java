package model;

import java.util.Collection;

import javax.swing.table.AbstractTableModel;

public class ContatoTableModel extends AbstractTableModel {

	private String[] columnNames = {"ID","Nome","Telefone"};
	private Collection<Contato> contatos;
	
	public ContatoTableModel(Collection<Contato> conts) {
		contatos = conts;
	}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return contatos.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		Contato c = (Contato) contatos.toArray()[arg0];
		switch (arg1) {
		case 0:
			return c.getId();
		case 1:
			return c.getNome();
		case 2:
			return c.getTelefone();
		}
		return null;
	}
	
	@Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
	
	@Override
	public Class<?> getColumnClass(int columnIndex){
		switch (columnIndex){
		case 0: 
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		}
		return null;
	}

}
