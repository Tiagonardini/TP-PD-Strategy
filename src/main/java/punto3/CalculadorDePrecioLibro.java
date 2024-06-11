package punto3;

public class CalculadorDePrecioLibro implements CalculadorDePrecios{


    @Override
    public double calcularPrecioTotal(double precio) {
        if (precio > 100){
            return (precio * (1 + 0.1) * (1 - 0.1) - 10);
        }
        return precio * (1 + 0.1) * (1 - 0.1);
    }
    //if (tipo == TipoProducto.LIBRO) {
//            impuestos = 0.1;
//            descuentos = 0.1;
//            if (precio > 100) {
//                envioGratis = true;
//            }
    //        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//            total -= 10;
//        }
}
