public class Compra {
    protected Producto producto;
    protected int cantidad;
    protected double total;

    public Compra() {
    }

    public Compra(Producto producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() +
                " | Cantidad: " + cantidad +
                " | Total: $" + String.format("%.2f", total);
    }
}
