package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAutenticar extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String ip=request.getRemoteAddr();
        Date fecha=Calendar.getInstance().getTime();
        /*
        Buscar aqu� el usuario cuyo login y password se proporcionaron
        una vez buscado, verificar su id, supongamos es "1"
        */
        Usuario u1=new Usuario();
        u1.setIDUsuario(1);
        //Despues de esto guardar la sesion con la clase administracion
        Administracion a=new Administracion();
        a.setFecha(fecha);
        a.setIDUsuario(u1);
        a.setIp(ip);
        DAOAdministracion daoadmon=new DAOAdministracion();
        try{
            daoadmon.guardar(a);
        } catch(Exception ex){
            
        }
        
        //Creamos un model
        Usuario u = new Usuario();
        
        //Ajustamos su login y password
        u.setLogin(login);
        u.setPassword(password);
        
        //Redireccionamos el servlet
        ModeloAutenticar modelo = new ModeloAutenticar();
        
        if(modelo.autenticar(u)){
            RequestDispatcher despachador = request.getRequestDispatcher("/bienvenido.jsp");
            despachador.forward(request, response);
        }else{
            RequestDispatcher despachador = request.getRequestDispatcher("/error.jsp");
            despachador.forward(request, response);
        }
    }
    
}