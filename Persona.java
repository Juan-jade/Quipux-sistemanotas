/**
 * Clase ABSTRACTA Persona.
 *
 * >>> ABSTRACCIÓN <<<
 * Es abstracta porque "Persona" por sí sola es un concepto genérico:
 * en el sistema real nunca existe una "Persona" suelta, sino un
 * Estudiante o un Profesor. Por eso no se puede instanciar
 * directamente (no se puede hacer "new Persona(...)").
 * El método mostrarInformacion() es abstracto: obligamos a cada
 * subclase a decidir CÓMO se muestra su propia información.
 *
 * >>> ENCAPSULAMIENTO <<<
 * Los atributos son 'private': nadie fuera de esta clase puede
 * tocarlos directamente. Solo se accede a ellos mediante los
 * métodos públicos getNombre()/setNombre(), etc. (los getters y
 * setters), protegiendo así los datos.
 */
public abstract class Persona {

    // Atributos privados -> Encapsulamiento
    private String nombre;
    private String cedula;

    // Constructor: se usa desde las subclases con "super(...)"
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // ---- Getters y Setters (Encapsulamiento) ----
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Método abstracto: cada subclase (Estudiante, Profesor) debe
    // implementarlo a su manera. Esto también es Polimorfismo:
    // el mismo nombre de método se comporta distinto según la clase.
    public abstract void mostrarInformacion();
}
