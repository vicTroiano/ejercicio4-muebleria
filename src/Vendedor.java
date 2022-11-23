import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private ArrayList <ObjetoVendible> objetoVendibles;

    //constructor
    public Vendedor(String nombre) {
        this.nombre = nombre;
        setObjetoVendibles(new ArrayList<ObjetoVendible>());
    }

    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ObjetoVendible> getObjetoVendibles() {
        return objetoVendibles;
    }

    public void setObjetoVendibles(ArrayList<ObjetoVendible> objetoVendibles) {
        this.objetoVendibles = objetoVendibles;
    }
}
