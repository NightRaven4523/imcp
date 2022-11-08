public class Persona
{
    private String nombre;
    private String apellido;
    private int estatura;
    private int peso;
    private int indice;
    public Persona()
    {
        nombre="";
        apellido="";
        estatura=0;
        peso=0;
        indice=0;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEstatura(){
        return this.estatura;
    }
    public void setEstatura(int estatura){
        this.estatura = estatura;
    }
    
    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
      
    public int getIndice(){
        return this.indice;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
}