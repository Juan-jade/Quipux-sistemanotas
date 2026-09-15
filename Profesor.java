import java.util.Scanner;

/**
 * Clase Profesor.
 *
 * >>> HERENCIA <<<
 * Igual que Estudiante, Profesor también extiende Persona y hereda
 * nombre y cedula. Aquí se ve que dos clases distintas pueden
 * heredar de la misma clase padre sin duplicar código.
 */
public class Profesor extends Persona {

    private String materia;

    public Profesor(String nombre, String cedula, String materia) {
        super(nombre, cedula);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Método principal del Profesor: ingresa "cantidadNotas" notas
     * para un Estudiante dado, usando el mismo Scanner del programa.
     * Se valida que cada nota esté en un rango razonable (0.0 a 5.0).
     */
    public void ingresarNotas(Estudiante estudiante, Scanner sc, int cantidadNotas) {
        System.out.println("\nEl profesor " + getNombre() + " (" + materia
                + ") va a registrar " + cantidadNotas + " nota(s) para "
                + estudiante.getNombre() + ":");

        for (int i = 1; i <= cantidadNotas; i++) {
            double nota = -1;
            boolean esValida = false;

            // Repetimos hasta que el profesor ingrese una nota válida
            while (!esValida) {
                System.out.print("  Nota #" + i + " (0.0 - 5.0): ");
                nota = sc.nextDouble();

                if (nota >= 0.0 && nota <= 5.0) {
                    esValida = true;
                    estudiante.agregarNota(nota); // se guarda en el ArrayList del estudiante
                } else {
                    System.out.println("  Nota inválida, debe estar entre 0.0 y 5.0. Intenta de nuevo.");
                }
            }
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + getNombre() + " - Materia a cargo: " + materia);
    }
}
