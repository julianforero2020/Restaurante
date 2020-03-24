
public class agregacion {
    
    private persona persona;
    
    public agregacion (){}
    
    public void cargar ()
    {
    
    persona.setCodigo(224);
    persona.setDirrecion("prados norte");
    persona.setNombre("julian");
    persona.setTelefono(312345);
    
    //carga correspondintes a la agregacion
    
     Domicilio domicilio = new Domicilio();
     domicilio.setId(23);
     domicilio.setLugar("prados norte");
     
     persona.setDomicilio(domicilio);
     
     //carga correspondientes
     
     persona.getsucursal().setId(202);
     persona.getsucursal().setNombre("carlos");
    
    
    }
    
    public void imprimir ()
    {
    
    
        System.out.println(persona.toString());
    
    }
    
    public static void main(String[] args) {
        agregacion a = new agregacion();
        a.cargar();
        a.imprimir();
    }
}