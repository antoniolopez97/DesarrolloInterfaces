
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AntonioLópezMielgo
 */
public class PruebaFechas {
    public static void main(String[] args) {
        
        //Creamos un constructor y le pasamos como parametro el estilo de fechas que queremos
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");//la MM mayuscula por que date format sirve para formatear hora m es para minuscula M meses
        Date d = new Date();//Cra una fecha con el dia y hora actual
        System.out.println(sdf.format(d));//Format para dar formato a la fecha 
        
        
        String s = "10-10-2022";
        try {
            d=sdf.parse(s);//para pasar el froamto de fecha de un string
        } catch (ParseException ex) {
            System.out.println("Hubo un error con la fecha ");
        }
        System.out.println(d.toString());
        
    }
}
