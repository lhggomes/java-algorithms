package model;

import entity.Pessoa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel {

	private String[] columnNames = {"ID","Nome"};
	private List<Pessoa> pessoas;
	
	public PessoaTableModel(List<Pessoa> conts) {
		pessoas = conts;
	}
	
	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return pessoas.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		Pessoa c = (Pessoa) pessoas.toArray()[arg0];
		switch (arg1) {
		case 0:
			return c.getId();
		case 1:
			return c.getNome();
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
		}
		return null;
	}
        
        public Pessoa getObjectAtRow(int row) {
            return pessoas.get(row);
        }
}
