
public class Comentario
{
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
        return nombre + ":\n" + comentario;
    }
}
