import org.junit.Test;
import punto2.Cumpleaños;
import punto2.FechaDeCumpleañosCorta;
import punto2.FechaDeCumpleañosLarga;
import punto2.Persona;

import java.time.LocalDate;

public class Punto2 {
    @Test
    public void fechaDeCumpleañosCorta(){
        var persona = new Persona("Tiago", LocalDate.of(2003,02,6),  Cumpleaños.CORTO);

        System.out.print(persona.fechaDeNascimiento());
    }
    @Test
    public void fechaDeCumpleañosLarga(){
         var persona = new Persona("Tiago", LocalDate.of(2003,02,6), Cumpleaños.LARGO);


        System.out.print(persona.fechaDeNascimiento());
    }
}
