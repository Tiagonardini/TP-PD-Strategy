import org.junit.Test;
import punto1.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Punto1 {
    @Test
    public void envioPorCorreo(){
        var producto = new Producto("Jabon ALA", 20.0, 2000.0);
        var producto1 = new Producto("Jabon Suavecito", 12.0, 1200.0);
        var producto2 = new Producto("Jabon MrMusculo", 32.0, 3200.0);
        var correo = new EmpresaCorreo();
        var envio = new Envio(Destino.CAPITAL_FEDERAL, List.of(producto, producto1, producto2));

        assertEquals(6900, envio.calcularEnvio(correo), 0.001);
    }
    @Test
    public void envioPorColectivoSur(){
        var producto = new Producto("Jabon ALA", 20.0, 2000.0);
        var producto1 = new Producto("Jabon Suavecito", 12.0, 1200.0);
        var producto2 = new Producto("Jabon MrMusculo", 32.0, 3200.0);
        var colectivoSur = new EmpresaColectivoSur();
        var envio = new Envio(Destino.CAPITAL_FEDERAL, List.of(producto, producto1, producto2));

        assertEquals(9400, envio.calcularEnvio(colectivoSur), 0.001);
    }



}
