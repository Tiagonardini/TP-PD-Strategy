package punto2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaDeCumpleañosLarga implements FechaDeCumpleaños{

    @Override
    public String parsearCumpleaños(LocalDate fNascimiento) {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        return fNascimiento.format(formatter);
    }
}
