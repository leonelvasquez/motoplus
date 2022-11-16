/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package motoplus.com.service;

import java.util.List;
import motoplus.com.entity.Clientes;




/**
 *
 * @author labso10
 */
public interface IClientesService {
     public void insertarRegistro(Clientes cliente);
        public List<Clientes> obtenerRegistros();
}
