package punto1;

public class Producto {
    private String nombre;
    private double peso;
    private double precio;

    public Producto(String nombre, double peso, double precio){
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }
}

