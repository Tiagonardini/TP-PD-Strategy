package punto2;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private String nombre;
    private LocalDate fechaDeCumpleaños;
    private Cumpleaños cumpleaños;

    private HashMap<String, FechaDeCumpleaños> queTipoDeCumpleaños = new HashMap<>();

    public Persona (String nombre, LocalDate fechaDeCumpleaños, Cumpleaños cumpleaños){
        this.nombre = nombre;
        this.fechaDeCumpleaños = fechaDeCumpleaños;
        this.cumpleaños = cumpleaños;

        this.queTipoDeCumpleaños.put(Cumpleaños.CORTO.name(), new FechaDeCumpleañosCorta());
        this.queTipoDeCumpleaños.put(Cumpleaños.LARGO.name(), new FechaDeCumpleañosLarga());
     }

    public String fechaDeNascimiento( ){
        return this.queTipoDeCumpleaños.get(cumpleaños.name()).parsearCumpleaños(this.fechaDeCumpleaños);
    }


}
