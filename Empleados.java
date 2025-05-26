import java.util.ArrayList;

public class Empleados {
    public ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    // Método para dar de alta un empleado
    public void altaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    // Método para mostrar el listado de empleados
    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    // Método para aumentar el salario de un empleado por nombre
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