/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motoplus.com.service;

import java.util.List;
import motoplus.com.entity.Clientes;
import motoplus.com.model.ClientesModelImpl;
import motoplus.com.model.IClientesModel;


/**
 *
 * @author labso10
 */
public class ClientesServiceImpl implements IClientesService {
    private IClientesModel model= new ClientesModelImpl();
    @Override
    public void insertarRegistro(Clientes cliente) {
       model.insertarRegistro(cliente);
    }

    @Override
    public List<Clientes> obtenerRegistros() {
      return model.obtenerRegistros();
    }
    
}
