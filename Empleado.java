/**
 * Representa un empleado con nombre, cargo y salario.
 */
public class Empleado {
    /** Nombre del empleado */
    private String nombre;
    /** Cargo que ocupa el empleado */
    private String cargo;
    /** Salario del empleado */
    private double salario;

    /**
     * Crea un nuevo empleado.
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     * @return Cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Obtiene el salario del empleado.
     * @return Salario del empleado
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el cargo del empleado.
     * @param cargo Nuevo cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Establece el salario del empleado.
     * @param salario Nuevo salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en texto del empleado.
     * @return Cadena con los datos del empleado
     */
    @Override
    public String toString() {
        return Textos.EMPLEADO_PREFIX +
                Textos.NOMBRE + nombre + '\'' +
                Textos.CARGO + cargo + '\'' +
                Textos.SALARIO + salario +
                Textos.SUFFIX;
    }
}