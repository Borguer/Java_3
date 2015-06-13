/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TestPojos {

    public static void main(String[] args)throws Exception{
       
        System.out.println("Probaremos todas las operaciones sql");
        Usuario u=new Usuario();
        u.setEmail("bor@gmail");
        u.setIDUsuario(1);
        u.setNombre("Daniel");
        u.setLogin("borguer");
        u.setPassword("gatucho");
        
     DAOUsuario daou=new DAOUsuario();
     daou.actualizar(u);
        
        
        
    }
    
}
