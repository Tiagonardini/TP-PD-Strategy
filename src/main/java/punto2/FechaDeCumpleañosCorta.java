package punto2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaDeCumpleañosCorta implements FechaDeCumpleaños{
    @Override
    public String parsearCumpleaños(LocalDate fNascimiento) {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("d-MM-yyyy");
         return fNascimiento.format(formatter);
    }
}
