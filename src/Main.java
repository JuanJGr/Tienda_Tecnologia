    import java.util.*;

    public class Main {
        public static void main(String[] args) {

            List<Producto> productos = new ArrayList<>();
            productos.add(new Laptop("HP Pavilon", "Dell", 150000.00, 10, "Intel i7", "12GB"));
            productos.add(new Laptop("MacBook Pro", "Apple", 220000.00, 12, "M2 Pro", "16GB"));
            productos.add(new Celular("iPhone 16", "Apple", 9900.00, 15, "5000mAh", "50MP"));
            productos.add(new Celular("Galaxy S23", "Samsung", 3000.99, 20, "4000mAh", "40MP"));

            // Lista de clientes
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("Laura Gómez", "laurag@gmail.com"));
            clientes.add(new Cliente("Pedro Sánchez", "pedroS@gmail.com"));
            clientes.add(new Cliente("Ana Martínez", "anam@gmail.com"));

            System.out.println("=== SIMULACIÓN DE COMPRAS ===");


            realizarCompra(clientes.get(0), productos.get(0), 2);
            realizarCompra(clientes.get(0), productos.get(2), 1);

            realizarCompra(clientes.get(1), productos.get(3), 6);
            realizarCompra(clientes.get(1), productos.get(1), 1);

            realizarCompra(clientes.get(2), productos.get(0), 8);
            realizarCompra(clientes.get(2), productos.get(2), 5);


            System.out.println("\n=== RESUMEN DE COMPRAS POR CLIENTE ===");
            for (Cliente cliente : clientes) {
                System.out.println("\nCliente: " + cliente.getNombre() + " | Correo: " + cliente.getCorreo());
                double totalCliente = 0;
                for (Compra compra : cliente.getCompras()) {
                    System.out.println(compra);
                    totalCliente += compra.getTotal();
                }
                System.out.println("-> Total a pagar: $" + String.format("%.2f", totalCliente));
            }


            System.out.println("\n=== INVENTARIO ACTUALIZADO ===");
            for (Producto p : productos) {
                System.out.println(p.getNombre() + " - Stock disponible: " + p.getCantidadStock());
            }
        }

        public static void realizarCompra(Cliente cliente, Producto producto, int cantidad) {
            if (producto.getCantidadStock() >= cantidad) {
                producto.setCantidadStock(producto.getCantidadStock() - cantidad);

                double precioFinal = 0;
                boolean descuentoAplicado = false;

                if (producto instanceof Vendible) {
                    precioFinal = ((Vendible) producto).calcularPrecioVenta(cantidad);


                    if (cantidad > 5) {
                        if (producto instanceof Laptop) {
                            descuentoAplicado = true;
                            System.out.println(cliente.getNombre() + " compró " + cantidad + " laptops: " + producto.getNombre());
                            System.out.println(" Descuento aplicado del 10%.");
                        } else if (producto instanceof Celular) {
                            descuentoAplicado = true;
                            System.out.println(cliente.getNombre() + " compró " + cantidad + " celulares: " + producto.getNombre());
                            System.out.println(" Descuento aplicado del 15%.");
                        }
                    } else {
                        System.out.println(cliente.getNombre() + " compró " + cantidad + " unidad(es) de " + producto.getNombre());
                        System.out.println(" No se aplicó descuento.");
                    }

                    System.out.println("   Total a pagar: $" + String.format("%.2f", precioFinal));
                }


                Compra compra = new Compra(producto, cantidad, precioFinal);
                cliente.getCompras().add(compra);

            } else {
                System.out.println(" No hay suficiente stock de " + producto.getNombre() +
                        " (solicitado: " + cantidad + ", disponible: " + producto.getCantidadStock() + ")");
            }
        }
    }
