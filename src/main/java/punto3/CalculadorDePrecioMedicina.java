package punto3;

public class CalculadorDePrecioMedicina implements CalculadorDePrecios{

    @Override
    public double calcularPrecioTotal(double precio) {
        if (precio > 100){
            return precio * (1 - 0.1) - 10;
        }
        if (precio > 50){
            return precio * (1 - 0.1);
        }
        return precio;
    }
//         else if (tipo == TipoProducto.MEDICINA) {
//            impuestos = 0;
//            if (precio > 50) {
//                descuentos = 0.1;
//            }
//            if (precio > 100) {
//                envioGratis = true;
//            }
//        } else
    //        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//            total -= 10;
//        }
}
