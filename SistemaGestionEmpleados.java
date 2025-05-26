public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        // Dar de alta empleados
        empleados.altaEmpleado(new Empleado("Juan", "Gerente", 3000));
        empleados.altaEmpleado(new Empleado("Ana", "Secretaria", 2000));
        empleados.altaEmpleado(new Empleado("Luis", "Contable", 2500));

        // Mostrar empleados
        empleados.mostrarEmpleados();

        // Aumentar salario a un empleado
        empleados.aumentarSalario("Ana", 10);

        // Mostrar empleados tras aumento
        System.out.println("\nTras aumento de salario:");
        empleados.mostrarEmpleados();
    }
}