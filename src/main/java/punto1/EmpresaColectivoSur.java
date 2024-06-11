package punto1;

import java.util.HashMap;

public class EmpresaColectivoSur implements Empresa{

    private HashMap<Destino, Double> valorDeLaCiudad = new HashMap<>();

    public EmpresaColectivoSur(){
        this.valorDeLaCiudad.put(Destino.GRAN_BUENOS_AIRES, 1500.0);
        this.valorDeLaCiudad.put(Destino.CAPITAL_FEDERAL, 1000.0);
        this.valorDeLaCiudad.put(Destino.OTRO_DESTINO,3000.0);
    }

    @Override
    public double calcularCostoSegunViaje(Destino destino, double peso) {
        var total =  valorDeLaCiudad.get(destino);
        if (30 < peso){
            total += 2000;
        }else if (5 < peso ){
            total += 500;
        }
        return total;
    }
}
