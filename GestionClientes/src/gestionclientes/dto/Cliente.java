/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclientes.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AntonioLópezMielgo
 */
public class Cliente {
    
        private String nombre;
        private String apellido;
        private Date fechaAlta;
        private String provincia;
        private SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");

        public Cliente(String nombre, String apellido, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
     public String[] toArrayString(){
     String[]s =new String[4];
     s[0]=nombre;
     s[1]=apellido;
     s[2]=sdf.format(fechaAlta);
     s[3]=provincia;
     return s;
    }
  
        
    
}
