import java.util.ArrayList;

/**
 * Gestiona una lista de empleados y operaciones sobre ellos.
 */
public class Empleados {
    /** Lista de empleados */
    public ArrayList<Empleado> lista;

    /**
     * Crea una nueva lista de empleados vacía.
     */
    public Empleados() {
        lista = new ArrayList<>();
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param empleado Empleado a añadir
     */
    public void altaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    /**
     * Muestra por pantalla todos los empleados de la lista.
     */
    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    /**
     * Aumenta el salario de un empleado identificado por su nombre.
     * @param nombre Nombre del empleado
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(String nombre, double porcentaje) {
        for (Empleado e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
                e.setSalario(nuevoSalario);
                break;
            }
        }
    }
}