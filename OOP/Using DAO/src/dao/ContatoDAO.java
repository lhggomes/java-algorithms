package dao;

import java.util.Collection;

import model.Contato;

public interface ContatoDAO {
	public Contato obtemContatoPorID(int id);
	public void gravaContato(Contato c);
	public Collection<Contato> obtemTodosContatos();
	public void apagaContato(Contato c);
}
