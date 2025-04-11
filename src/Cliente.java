import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected String nombre;
    protected String correo;
    protected List<Compra> compras; // Lista de compras

    public Cliente() {
        this.compras = new ArrayList<>();
    }

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.compras = new ArrayList<>();
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

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", compras=" + compras +
                '}';
    }
}

