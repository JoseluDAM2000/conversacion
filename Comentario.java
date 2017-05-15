
/**
 * Write a description of class Comentario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comentario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String comentario;
    /**
     * Constructor for objects of class Comentario
     */
    public Comentario(String nombre, String comentario)
    {
        this.nombre = nombre;
        this.comentario = comentario;
    }
    
    @Override
    public String toString()
    {
        return nombre + "\n" + comentario;
    }
}
