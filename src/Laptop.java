public class Laptop extends Producto implements Vendible{

    protected String procesador;
    protected String memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, String memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidadStock=" + cantidadStock + ", procesador=" + procesador + ", memoriaRAM=" + memoriaRAM + "]");
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precioFinal = precio * cantidad;
        if (cantidad > 5) {
            precioFinal *= 0.9;
        }
        return precioFinal;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
