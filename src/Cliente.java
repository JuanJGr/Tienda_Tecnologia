public class Cliente {

    protected String nombre;
    protected String correo;
    protected List<Producto> productosComprados;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, List<Producto> productosComprados) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = productosComprados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", productosComprados=" + productosComprados +
                '}';
    }
}
