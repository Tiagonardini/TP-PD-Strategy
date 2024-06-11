package punto1;

import java.util.HashMap;

public class EmpresaCorreo implements Empresa {
    private HashMap<Destino, Double> valoresPorCiudad = new HashMap();

    public EmpresaCorreo() {
        valoresPorCiudad.put(Destino.CAPITAL_FEDERAL, 500.0);
        valoresPorCiudad.put(Destino.OTRO_DESTINO, 800.0);
        valoresPorCiudad.put(Destino.GRAN_BUENOS_AIRES, 800.0);
    }

    @Override
    public double calcularCostoSegunViaje(Destino destino, double peso) {
        return valoresPorCiudad.get(destino);
    }
}