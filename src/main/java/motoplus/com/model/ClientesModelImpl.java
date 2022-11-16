/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motoplus.com.model;

import java.util.List;
import motoplus.com.entity.Clientes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labso10
 */
public class ClientesModelImpl implements IClientesModel{
    private SessionFactory sf;
    private Session session;
    //prueba
    @Override
    public void insertarRegistro(Clientes cliente) {
    try{
        sf=new Configuration().configure().buildSessionFactory();
        session=sf.openSession();
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
        session.close();
        sf.close();
        
    }catch(HibernateException e){
        System.out.println("Error:"+e.getMessage());
    }
    }
    
    public static void main(String[] args) {
        IClientesModel modelo= new ClientesModelImpl();
        Clientes cliente=new Clientes();
        cliente.setNombre("admin2");
        modelo.insertarRegistro(cliente);
    }

    @Override
    public List<Clientes> obtenerRegistros() {
        List<Clientes>listaClientes=null;
        try{
        sf=new Configuration().configure().buildSessionFactory();
        session=sf.openSession();
    
        listaClientes=session.createCriteria(Clientes.class).list();
        
      
        session.close();
        sf.close();
        
    }catch(HibernateException e){
        System.out.println("Error:"+e.getMessage());
    }
        return listaClientes;
    }
}
