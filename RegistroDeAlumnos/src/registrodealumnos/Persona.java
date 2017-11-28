package registrodealumnos;

/**
 *
 * @author Chris Luciano
 */
public class Persona 
{
    //Creacion atrivutos
    String Nombre;
    String Matricula;
    
    
    //METODO COSNTRUCTOR

    public Persona() {
        this.Nombre = "";
        this.Matricula = "";
    }
    
    
    
    
    
    //METODO SET Y GET

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    
    
}
