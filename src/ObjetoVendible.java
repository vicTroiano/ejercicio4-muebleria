

public class ObjetoVendible {
    private String nombre;
    private double precioLista;
    private Reserva reserva;
    private Compra compra;

    //constructor
    public ObjetoVendible(String nombre, double precioLista){  //cuando creamos objetos esto es lo que le pasamos
        this.nombre = nombre;
        this.precioLista = precioLista;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
