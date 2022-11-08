import java.util.*;
public class Imc
{
    Scanner sc=new Scanner (System.in);
    private Persona [][] persona=null;
    
    public Imc(int tam)
    {
        persona = new Persona [tam][tam];
        for (int i=0; i<persona.length; i++)
        {
            for (int j=0; j<persona.length; j++)
            {
                persona [i][j]=new Persona(); 
            }
        }
    }

    public void agregarPersona(int pos)
    {
        System.out.println("Ingrese el nombre de la persona");
        persona[pos][pos].setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona");
        persona[pos][pos].setApellido(sc.next());
        System.out.println("Ingrese la estatura de la persona");
        persona[pos][pos].setEstatura(sc.nextInt());
        System.out.println("Ingrese el peso de la persona");
        persona[pos][pos].setPeso(sc.nextInt());
    }
    
    public void llenarDatos()
    {
        for (int i=0; i<persona.length; i++)
        {
            for (int j=0; j<persona.length; j++)
            {
                agregarPersona(i); 
                agregarPersona(j);
            }
        }
    }
    
    public void verPersona(int pos)
    {
        System.out.println(persona[pos][pos].getNombre());
        System.out.println(persona[pos][pos].getApellido());
        System.out.println(persona[pos][pos].getIndice());
    }
}
