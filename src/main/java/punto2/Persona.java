package punto2;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaDeCumpleaños;

    public Persona (String nombre, LocalDate fechaDeCumpleaños){
        this.nombre = nombre;
        this.fechaDeCumpleaños = fechaDeCumpleaños;
    }

    public String fechaDeNascimiento(FechaDeCumpleaños Ifecha){
        return Ifecha.parsearCumpleaños(fechaDeCumpleaños);
    }


}
