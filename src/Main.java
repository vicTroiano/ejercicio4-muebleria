public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        ObjetoVendible silla = new ObjetoVendible("Silla", 1000);
        ObjetoVendible mesa = new ObjetoVendible("Mesa ratona", 2000);
        Cliente mario = new Cliente("mario");
        Cliente julio = new Cliente("julio");
        Vendedor luigi = new Vendedor("luigi");
        //mario va a querer reservar la silla
        Reserva reservaDeHoy = new Reserva(mario, luigi, silla);
        //julio va a querer reservar la mesa
        Reserva reservaDeManiana = new Reserva(julio,luigi,mesa);
        //reservaDeHoy.agregarReserva(silla);

        //mario va a querer comprar la silla
        Compra compraDeHoy = new Compra(mario,luigi);
        compraDeHoy.agregarAlCarrito(silla);
        compraDeHoy.generarTicket("Efectivo", 1, 0);

        //julio va a querer comprar la mesa
        //realizamos la compra
        Compra compraDeManiana = new Compra(julio,luigi);
        //agregamos al carrito
        compraDeManiana.agregarAlCarrito(mesa);
        //generamos ticket
        compraDeManiana.generarTicket("Tarjeta",2,30);


    }
}
