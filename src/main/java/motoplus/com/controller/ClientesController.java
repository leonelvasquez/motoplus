/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motoplus.com.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import motoplus.com.entity.Clientes;
import motoplus.com.service.ClientesServiceImpl;
import motoplus.com.service.IClientesService;
import org.primefaces.event.RowEditEvent;

@RequestScoped//alcance del bean en todo el ciclo de vida de la aplicaciones.
@ManagedBean(name="cliente")//Administrar
public class ClientesController implements Serializable{
    private  IClientesService service;
    private  Clientes  cliente;
    private  List<Clientes>listaRegistros;
    @PostConstruct
    public  void init(){
          service=new ClientesServiceImpl();
          cliente= new Clientes();
          listaRegistros=service.obtenerRegistros();
    }

//    public static void main(String[] args) {
//       // RolController controller=new RolController();
//      init();
//        System.out.println("Tamaño"+listaRegistros.size());
//    }
      public void onRowEdit(RowEditEvent event){
          FacesMessage mensaje=new FacesMessage("Registro editado exitosamente");
          FacesContext.getCurrentInstance().addMessage(null,mensaje);
      }
      public void crearRegistro(){
        service.insertarRegistro(cliente);
        System.out.println("ingresando....");
        
    }

    public Clientes getClientes() {
        return cliente;
    }

    public void setClientes(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Clientes> getListaRegistros() {
        return listaRegistros;
    }

   
    
  
}
