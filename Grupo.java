
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }

    public boolean inscrbir(Estudiante unEstudiante)
    {
        int existe = this.buscaEstudiantes(unEstudiante.dimeClave());
        if (existe == 1)
        {
            return false; //el estudiante ya existe
        }    
        
        int posDisponible = this.buscaEspacioDisponible();
        if (posDisponible != -1)
        {
            return false;
        }
        estudiantes[posDisponible] = unEstudiante;
        
        return true;
    }
    
    /**
     * inscribe un estudiante
     * @param unEstudiante Es el objeto estudiante en el grupo
     * @return Regresa regresa verdadero si fue inscrito
     */
    public int buscaEstudiantes(int claveEstudiante)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if( claveEstudiante == estudiantes[i].dimeClave())
            {
                return i;
            }
        }
        return -1;
    }
    
    private int buscaEspacioDisponible()
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if(estudiantes[i] == null)
            {
                return 1;
            }
        }
        return -1;
    }
    
    public void darBaja(int clave)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if( clave == estudiantes[i].dimeClave())
            {
                estudiantes[i] = null;
            }
        }
    }

    
}
