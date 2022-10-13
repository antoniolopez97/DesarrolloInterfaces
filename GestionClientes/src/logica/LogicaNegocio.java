/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import gestionclientes.dto.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AntonioLópezMielgo
 */
public class LogicaNegocio {
    private static List<Cliente> listaClientes=new ArrayList<>();
    
    public static void aniadirCliente(Cliente cliente ){
    listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
}
