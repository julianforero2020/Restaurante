
public class Categoria
{
   
Integer Cod;
    String Descripcion;
       
    public Categoria (){}

    public Categoria(Integer Cod, String Descripcion) {
        this.Cod = Cod;
        this.Descripcion = Descripcion;
    }

    public Integer getCod() {
        return Cod;
    }

    public void setCod(Integer Cod) {
        this.Cod = Cod;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
    
