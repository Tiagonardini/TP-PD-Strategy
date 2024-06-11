package punto1;

import java.util.HashMap;
import java.util.List;

public class Envio {
    private Destino destino;
    private List<Producto> productos;
    private EmpresaEnum empresa;

    private HashMap<String, Empresa> enQueTransporteViaja = new HashMap<>();

    public Envio(Destino destino, List<Producto> productos, EmpresaEnum empresa){
        this.destino = destino;
        this.productos = productos;
        this.empresa = empresa;
        enQueTransporteViaja.put(EmpresaEnum.COLECTIVO_SUR.name(), new EmpresaColectivoSur());
        enQueTransporteViaja.put(EmpresaEnum.CORREO_ARG.name(), new EmpresaCorreo());
    }


    public double calcularEnvio(){
        return precioTotalDeLosProductos() + this.enQueTransporteViaja.get(this.empresa.name()).calcularCostoSegunViaje(this.destino,  pesoDelEnvio());
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
