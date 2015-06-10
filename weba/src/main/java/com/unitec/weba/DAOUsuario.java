package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DAOUsuario {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    static{
        factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    public DAOUsuario(){
        
    }
    
    //Creamos el insert
    public void guardar(Usuario u) throws Exception{
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Usuario> buscarTodos()throws Exception{
        return null;
    }
    
    //Creamos el buscarPorId
    public Usuario buscarPorId(Integer id)throws Exception{
        return null;
    }
    
    //Creamos el de autenticar
    public boolean autenticar(Usuario u)throws Exception{
        
        return false;
    }
    
}
