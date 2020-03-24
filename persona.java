
public class persona {
    Integer Codigo;
    String Nombre;
    String Direccion;
    Integer Telefono;
    Domicilio domicilio;
    sucursal sucursal;
    Categoria categoria;
    
    public persona()
    {
    
    domicilio = new Domicilio();
    sucursal = new sucursal();
    categoria = new Categoria();
    }

    
  

    public persona(Integer Codigo, String Nombre, String Dirrecion, Integer Telefono, Domicilio domicilio, sucursal sucursal,Categoria categoria) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Dirrecion;
        this.Telefono = Telefono;
        
        domicilio = new Domicilio();
        sucursal = new sucursal();
        categoria = new Categoria();
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirrecion() {
        return Direccion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Direccion = Dirrecion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public sucursal getsucursal()
    {
        return sucursal;
    }
    public void setsucursal (sucursal sucursal)
    {
        this.sucursal=sucursal;
    }
    
    public Categoria getcategoria()
    {
    return categoria;
    }
    public void setcategoria(Categoria categoria)
    {
    this.categoria=categoria;
    }
    
    
   public String toString()
   {
       return "Domicilio{" + "\n codigo" + Codigo + "\n Nombre " + Nombre + "\n dirrecion" + Direccion + "telefono" + Telefono + "\n domicilio" + domicilio + "\n sucursal " + sucursal + "\n categoria" + categoria;
                
   }
    
    
    
    
}
