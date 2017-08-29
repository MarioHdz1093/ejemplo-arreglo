
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }

    public void inscrbir(Estudiante unEstudiante)
    {
        for (int i=0 ; i < 10 ; i++)
        {
            if (i == 0 )
            {
                estudiantes[i] = unEstudiante;
                
            }
            if(estudiantes[i] == null)
            {
                estudiantes[i] = unEstudiante;
            }
        }
    }
    
    public void darBaja(String nombre)
    {
        for(int i=0; i < 10; i++)
        {
            if(estudiantes[i].nombre == nombre)
            {
                estudiantes[i] = null;
            }
        }
    }

    
}
