public class Reserva extends Transaccion {

    //metodo para agregar la reserva
    public void agregarReserva(ObjetoVendible vendible){
        agregarVendible(vendible);
        vendible.setReserva(this);
    }

    //constructor primero se hace el constructor, despues el metodo
    public Reserva(Cliente cliente, Vendedor vendedor, ObjetoVendible objetoVendible) { //esto le voy a pasar a el objeto que cree
        super(cliente, vendedor);
        agregarReserva(objetoVendible);
        System.out.println(String.format(
                "El vendedor %s pudo reservarle a %s el articulo %s",
                vendedor.getNombre(),
                cliente.getNombre(),
                objetoVendible.getNombre()
        ));

    }
}
