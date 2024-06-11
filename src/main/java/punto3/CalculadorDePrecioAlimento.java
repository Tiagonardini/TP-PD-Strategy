package punto3;

public class CalculadorDePrecioAlimento implements CalculadorDePrecios{

    @Override
    public double calcularPrecioTotal(double precio) {
        if (precio > 200){
            return (precio * (1 + 0.05) * (1 - 0.15)) -10;
        }
        if (precio > 100){
            return precio * (1 + 0.05) * (1 - 0.15);
        }
        return precio * (1 + 0.05);
    }
    //} else if (tipo == TipoProducto.ALIMENTO) {
////            impuestos = 0.05;
////            if (precio > 100) {
////                descuentos = 0.15;
////            }
////            if (precio > 200) {
////                envioGratis = true;
////            }
////        }
    //        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//            total -= 10;
//        }
}
