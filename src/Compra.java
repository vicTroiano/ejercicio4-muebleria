public class Compra extends Transaccion{
    private double precioFinal;

    //metodo agregarAlCarrito

    public void agregarAlCarrito(ObjetoVendible vendible) {
        if(vendible.getReserva() != null) { //si el vendible tiene una reserva que no es nula
            Cliente clienteQueReservo = vendible.getReserva().getCliente();
            Cliente clienteActual = getCliente();
            if(clienteQueReservo.getNombre() != clienteActual.getNombre()) {
                System.out.println(String.format(
                        "El producto ya fue reservado a %s",
                        vendible.getReserva().getCliente().getNombre()

                ));
                return;
            }
        }
        super.agregarVendible(vendible);
        System.out.println(String.format(
                "El producto %s ya fue agregado al carrito con exito",
                vendible.getNombre()

        ));
    }

    //metodo generar ticket
    public void generarTicket(String medioPago, int cantidadCuotas, int descuento ) {
        int descuentoFinal = descuento;
        if(medioPago == "Efectivo") {
            descuentoFinal = 10;
        }
        int finalDescuentoFinal = descuentoFinal;
        System.out.println("Lista de compra");
        getVendibles().forEach(vendible -> {
            vendible.setCompra(this);
            double precioProducto = vendible.getPrecioLista()*(100 - finalDescuentoFinal)/100;
            precioFinal += precioProducto;
            System.out.println(String.format(
                    "%s %f (con descuento %f)",
                    vendible.getNombre(),
                    vendible.getPrecioLista(),
                    precioProducto
            ));
        });
        System.out.println(getPrecioFinal());
    }

    //constructor
    public Compra(Cliente cliente, Vendedor vendedor) {
        super(cliente, vendedor);
    }


    //setter y getter
    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
