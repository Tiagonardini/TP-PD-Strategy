package punto3;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    private TipoProducto tipoProducto;
    private Map<String, CalculadorDePrecios> estrategiasCalculo = new HashMap<>();

    private double precio;

    public Producto(TipoProducto tipoProducto, double precio) {
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.estrategiasCalculo.put(TipoProducto.LIBRO.name(), new CalculadorDePrecioLibro());
        this.estrategiasCalculo.put(TipoProducto.ALIMENTO.name(), new CalculadorDePrecioAlimento());
        this.estrategiasCalculo.put(TipoProducto.MEDICINA.name(), new CalculadorDePrecioMedicina());
        this.estrategiasCalculo.put(TipoProducto.OTRO.name(), new CalculadorDePrecioOtro());


    }

    public double precioFinal() {
        return this.estrategiasCalculo.get(this.tipoProducto.name()).calcularPrecioTotal(precio);
    }
}

