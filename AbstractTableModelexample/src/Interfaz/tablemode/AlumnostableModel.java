/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz.tablemode;

import beans.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntonioL√≥pezMielgo
 */
public class AlumnostableModel extends AbstractTableModel{
    
    private List<Alumno> listAlumno;
    private String[] columnas ={"Nombre","Curso"};
    
    public AlumnostableModel(List<Alumno> listalumno){
        this.listAlumno=listAlumno;
    }
    
    @Override
    public int getRowCount() {
        return listAlumno.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listAlumno.get(rowIndex).getNombre();
            case 1:
                return listAlumno.get(rowIndex).getCurso();
                 }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return  columnas[column];
    }
    
}
