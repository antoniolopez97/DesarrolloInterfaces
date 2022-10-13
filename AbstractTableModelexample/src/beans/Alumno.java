package beans;


public class Alumno {

    private String nombre;
    private String curso;
    
    public Alumno(String nombre, String curso) {
        
        this.nombre=nombre;
        this.curso=curso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    
}
