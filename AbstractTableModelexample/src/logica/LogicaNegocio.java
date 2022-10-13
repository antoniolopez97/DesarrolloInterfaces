/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import beans.Alumno;
import java.util.ArrayList;
import java.util.List;


public class LogicaNegocio {
   
    public List<Alumno> listaAlumnos = new ArrayList<>();
    
    public LogicaNegocio()
    {
        
       listaAlumnos=new ArrayList<>();
       listaAlumnos.add(new Alumno("Pablo","Dam2"));
       listaAlumnos.add(new Alumno("Juan","Dam1"));
       listaAlumnos.add(new Alumno("Pedro","Dam1"));
        
    
    }
    public List<Alumno> getListaAlumnos(){
        return listaAlumnos;
    
    }
    
}
