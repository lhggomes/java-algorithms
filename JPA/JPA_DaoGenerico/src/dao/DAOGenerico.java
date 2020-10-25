package dao;


import entity.EntidadeBase;
import java.util.Collection;

import entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAOGenerico<T extends EntidadeBase> {
    private static DAOGenerico instance;
    protected EntityManager entityManager;

    public static DAOGenerico getInstance(){
        if (instance == null){
            instance = new DAOGenerico();
        } 
        return instance;
    }

    private DAOGenerico() {
        entityManager = getEntityManager();
    }
 
    private EntityManager getEntityManager() {
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("ex2jpaPU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }    

    public T obtemPorID(Class<T> classe, long id) {
        return entityManager.find(classe, id);
    }

    public void grava(Class<T> classe, T c) {
        try {
            entityManager.getTransaction().begin();
            T cont = entityManager.find(classe, c.getId());
            if (cont == null) {
                entityManager.persist(c);
            } else {
                entityManager.merge(c);
            }
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public List<T> obtemTodos(Class<T> classe) {
        return entityManager.createNamedQuery(classe.getSimpleName()+".findAll").getResultList();
    }

    public void apaga(Class<T> classe, T c) {
        try {
            entityManager.getTransaction().begin();
            c = entityManager.find(classe, c.getId());
            entityManager.remove(c);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
