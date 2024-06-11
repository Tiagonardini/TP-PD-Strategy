import org.junit.Test;
import punto2.FechaDeCumpleañosCorta;
import punto2.FechaDeCumpleañosLarga;
import punto2.Persona;

import java.time.LocalDate;

public class Punto2 {
    @Test
    public void fechaDeCumpleañosCorta(){
        var persona = new Persona("Tiago", LocalDate.of(2003,02,6));
        var Ifecha = new FechaDeCumpleañosCorta();

        System.out.print(persona.fechaDeNascimiento(Ifecha));
    }
    @Test
    public void fechaDeCumpleañosLarga(){
        var persona = new Persona("Tiago", LocalDate.of(2003,02,6));
        var Ifecha = new FechaDeCumpleañosLarga();

        System.out.print(persona.fechaDeNascimiento(Ifecha));
    }
}
