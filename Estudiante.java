import java.util.ArrayList;

/**
 * Clase Estudiante.
 *
 * >>> HERENCIA <<<
 * "extends Persona" significa que Estudiante HEREDA los atributos
 * (nombre, cedula) y métodos (getNombre, setNombre, etc.) de Persona,
 * sin tener que volver a escribirlos aquí. Solo agregamos lo propio
 * de un estudiante: carrera y notas.
 *
 * >>> LISTAS (ArrayList) <<<
 * Usamos ArrayList<Double> porque no sabemos de antemano cuántas
 * notas va a tener un estudiante (puede ser 2, 5, 10...). Un
 * ArrayList es una lista que crece dinámicamente a medida que se
 * agregan elementos con .add().
 */
public class Estudiante extends Persona {

    // Atributos propios de Estudiante (también privados -> Encapsulamiento)
    private String carrera;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, String cedula, String carrera) {
        // "super" llama al constructor de la clase padre (Persona)
        super(nombre, cedula);
        this.carrera = carrera;
        this.notas = new ArrayList<>(); // lista vacía al crear el estudiante
    }

    // ---- Getters y Setters propios ----
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    // Método para agregar una nota nueva a la lista
    public void agregarNota(double nota) {
        notas.add(nota);
    }

    /**
     * Calcula el promedio de todas las notas guardadas.
     * Recorremos el ArrayList con un for-each, sumamos todo,
     * y dividimos entre la cantidad de notas.
     */
    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0; // evita dividir entre cero si no hay notas
        }
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    /**
     * Evalúa el estado académico según el promedio.
     * Regla del negocio: promedio >= 3.0 => Aprobado
     */
    public String evaluarEstado() {
        if (calcularPromedio() >= 3.0) {
            return "Aprobado";
        } else {
            return "No Aprobado";
        }
    }

    // Implementación obligatoria del método abstracto de Persona
    // (Polimorfismo: Estudiante define su propia versión)
    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== RESUMEN DEL ESTUDIANTE =====");
        System.out.println("Universidad: UCO - Universidad Católica de Oriente");
        System.out.println("Nombre     : " + getNombre());
        System.out.println("Cédula     : " + getCedula());
        System.out.println("Carrera    : " + carrera);
        System.out.println("Notas      : " + notas);
        System.out.printf ("Promedio   : %.2f%n", calcularPromedio());
        System.out.println("Estado     : " + evaluarEstado());
        System.out.println("===================================");
    }
}
