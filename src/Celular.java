public class Celular extends Producto implements Vendible {

    protected String capacidadBateria;
    protected String camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock, String capacidadBateria, String camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidadStock=" + cantidadStock + ", capacidadBateria=" + capacidadBateria + ", camaraResolucion=" + camaraResolucion + "]");
    }

    public double calcularPrecioVenta(int cantidad) {
        double precioFinal = precio * cantidad;
        if (cantidad > 5) {
            precioFinal *= 0.85;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capacidadBateria='" + capacidadBateria + '\'' +
                ", camaraResolucion='" + camaraResolucion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
