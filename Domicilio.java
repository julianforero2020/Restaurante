
import java.util.Date;


public class Domicilio {
    Integer id;
    
    String Lugar;
    sucursal sucursal;
    
    public Domicilio (){
    
        sucursal = new sucursal();
    
    }

    public Domicilio(Integer id, Date fecha, String Lugar,sucursal sucursal) {
        this.id = id;
      
        this.Lugar = Lugar;
        sucursal = new sucursal();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }
    @Override
    public String toString()
    {
    return "domicilio{" + "id" + id + "fecha" +  "lugar" + Lugar;
    }
}