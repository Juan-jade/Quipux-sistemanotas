import java.util.Scanner;

/**
 * Clase Main - Sistema de Gestión Académica UCO.
 *
 * Aquí se unen todas las piezas: creamos un Profesor y un Estudiante,
 * el profesor le ingresa notas al estudiante, y al final mostramos
 * el resumen completo.
 *
 * Fíjate cómo tanto "profesor" como "estudiante" son tratados como
 * Persona en cuanto a nombre/cédula (Herencia), pero cada uno tiene
 * su propio comportamiento en mostrarInformacion() (Polimorfismo).
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" SISTEMA DE GESTIÓN ACADÉMICA - UCO");
        System.out.println(" Universidad Católica de Oriente");
        System.out.println("========================================\n");

        // ---- Datos del Profesor ----
        System.out.println("--- Registro del Profesor ---");
        System.out.print("Nombre del profesor: ");
        String nombreProfe = sc.nextLine();
        System.out.print("Cédula del profesor: ");
        String cedulaProfe = sc.nextLine();
        System.out.print("Materia que dicta: ");
        String materia = sc.nextLine();

        Profesor profesor = new Profesor(nombreProfe, cedulaProfe, materia);

        // ---- Datos del Estudiante ----
        System.out.println("\n--- Registro del Estudiante ---");
        System.out.print("Nombre del estudiante: ");
        String nombreEst = sc.nextLine();
        System.out.print("Cédula del estudiante: ");
        String cedulaEst = sc.nextLine();
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombreEst, cedulaEst, carrera);

        // ---- Ingreso de notas ----
        System.out.print("\n¿Cuántas notas deseas ingresar para este estudiante? ");
        int cantidadNotas = sc.nextInt();

        profesor.ingresarNotas(estudiante, sc, cantidadNotas);

        // ---- Resultado final ----
        estudiante.mostrarInformacion();

        sc.close();
    }
}
