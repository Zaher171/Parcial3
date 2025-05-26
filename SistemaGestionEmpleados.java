/**
 * Clase principal que contiene el método main para gestionar empleados.
 */
public class SistemaGestionEmpleados {
    /**
     * Método principal que ejecuta la gestión de empleados.
     * @param args Argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        // Dar de alta empleados de ejemplo
        empleados.altaEmpleado(new Empleado("Juan", "Gerente", 3000));
        empleados.altaEmpleado(new Empleado("Ana", "Secretaria", 2000));
        empleados.altaEmpleado(new Empleado("Luis", "Contable", 2500));

        // Mostrar empleados
        empleados.mostrarEmpleados();

        // Aumentar salario a un empleado
        empleados.aumentarSalario("Ana", 10);

        // Mostrar empleados tras aumento
        System.out.println(Textos.TRAS_AUMENTO);
        empleados.mostrarEmpleados();
    }
}