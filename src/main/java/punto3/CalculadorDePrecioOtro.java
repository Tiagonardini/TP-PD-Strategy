package punto3;

import java.util.HashMap;

public class CalculadorDePrecioOtro implements CalculadorDePrecios {

    @Override
    public double calcularPrecioTotal(double precio) {
        if (precio > 200){
            return precio * (1 + 0.15) * (1- 0.05) -10;
        }
        if (precio > 50){
            return precio * (1 + 0.15) * (1- 0.05);
        }
        return precio * (1 + 0.15);
    }
    //            impuestos = 0.15;
//            if (precio > 50) {
//                descuentos = 0.05;
//            }
//            if (precio > 200) {
//                envioGratis = true;
//            }
//        }
    //        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//            total -= 10;
//        }

}

