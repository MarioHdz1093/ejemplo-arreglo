public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    public String dimeDetalles()
    {
        return "clave" +clave+ "Estudiante" +nombre;
    }
    
}
