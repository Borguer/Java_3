package com.unitec.weba;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DAOAdministracion {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    
    static{
       factory=  HibernateUtilidades.getSessionFactory();
       session= factory.openSession();
       tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    
    public DAOAdministracion(){
        
    }
    
    //Creamos el insert
    public void guardar(Administracion u)throws Exception{
        //Aqui poner el codigo de tu guardado
        // despues invocas el metodo cerrarTodo
      
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Administracion u)throws Exception{
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Administracion> buscarTodos()throws Exception{
        
        return null;
    }
    
    //Creamos el buscarPorId
    public Administracion buscarPorId(Integer id)throws Exception{
        
        return null;
    }
    
    //Creamos el de autenticar 
    public boolean autenticar(Administracion u)throws Exception{
    
    return false;
    }
}
