package punto1;

import java.util.List;

public class Envio {
    private Destino destino;
    private List<Producto> productos;

    public Envio(Destino destino, List<Producto> productos){
        this.destino = destino;
        this.productos = productos;
    }


    public double calcularEnvio(Empresa empresa){
        var pesoTotal = pesoDelEnvio();
        var totalPrecio = precioTotalDeLosProductos();
        totalPrecio += empresa.calcularCostoSegunViaje(this.destino, pesoTotal);
        return totalPrecio;
    }

    private double pesoDelEnvio (){
        double peso = 0;
        for (Producto producto: this.productos){
            peso += producto.getPeso();
        }
        return peso;
    }

    private double precioTotalDeLosProductos(){
        double total = 0;
        for (Producto producto: this.productos){
            total += producto.getPrecio();
        }
        return total;
    }

}
