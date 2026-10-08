import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoService service = new EmpleadoService();

        int opcion;
        String nombre;
        int edad;
        String departamento;
        double salario;
        int opcionBuscar;
        int id;

        do {
            System.out.println("\n===== SISTEMA DE EMPLEADOS =====");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Listar empleados");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("*** Agregar empleado ***");

                    System.out.println("Nombre del empleado: ");
                    nombre = sc.nextLine();
                    System.out.println("Edad del empleado: ");
                    edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Departamento del empleado: ");
                    departamento = sc.nextLine();
                    System.out.println("Salario del empleado: ");
                    salario = sc.nextDouble();
                    service.agregarEmpleado(nombre, edad, departamento, salario);
                    break;

                case 2:
                    System.out.println("*** Buscar empleado ***");
                    System.out.println("¿Como deseas realizar tu busqueda? (elige una opción)");
                    System.out.println("1. Buscar por nombre del empleado");
                    System.out.println("2. Buscar por ID del empleado");
                    opcionBuscar = sc.nextInt();
                    sc.nextLine();
                    if (opcionBuscar == 1) {
                        System.out.println("Escribe el nombre del empleado: ");
                        nombre = sc.nextLine();
                        ArrayList<Empleado> encontrado = service.buscarEmpleado(nombre);
                        if (!encontrado.isEmpty()) {
                            System.out.println("Empleados encontrados:");
                            mostrarEmpleados(encontrado);
                        } else {
                            System.out.println("Empleado no encontrado");
                        }
                    }else if (opcionBuscar == 2) {
                        System.out.print("Escribe el ID del empleado: ");
                        id = sc.nextInt();
                        Empleado encontrado = service.buscarEmpleadoPorId(id);
                        if (encontrado != null) {
                            System.out.println("Empleado encontrado:");
                           mostrarEmpleado(encontrado);
                        } else {
                            System.out.println("Empleado no encontrado");
                        }
                    }else{
                        System.out.println("Opción invalida");
                    }

                    break;

                case 3:
                    System.out.println("*** Actualizar empleado ***");
                    System.out.println("Escribe el Id del empleado que desea actualizar: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Escribe el nuevo departamento del empleado que desea actualizar: ");
                    departamento = sc.nextLine();
                    System.out.println("Escribe el nuevo salario del empleado que desea actualizar: ");
                    salario = sc.nextDouble();

                    try {
                        Empleado actualizado = service.actualizarEmpleado(id, departamento, salario);
                        if (actualizado != null) {
                            System.out.println("Empleado actualizado:");
                            mostrarEmpleado(actualizado);
                        }else {
                            System.out.println("Empleado no encontrado");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("*** Eliminar empleado ***");
                    System.out.print("Escribe el ID del empleado que deseas eliminar: ");
                    id = sc.nextInt();
                    Empleado eliminado = service.eliminarEmpleado(id);
                    if (eliminado != null) {
                        System.out.println("Empleado eliminado:");
                        mostrarEmpleado(eliminado);
                    }else {
                        System.out.println("Empleado no encontrado");
                    }
                    break;

                case 5:
                    ArrayList<Empleado> empleados = service.listarEmpleados();
                    if (empleados.isEmpty()) {
                    System.out.println("No hay empleados registrados");
                    } else {
                        mostrarEmpleados(empleados);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 6);

        sc.close();
    }

    private static void mostrarEmpleado(Empleado empleado){
        System.out.println("ID: " + empleado.getId());
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Salario: " + empleado.getSalario());
    }

    private static void mostrarEmpleados(ArrayList<Empleado> empleados){
        for (Empleado empleado : empleados) {
            mostrarEmpleado(empleado);
            System.out.println("----------------------------");
        }
    }
}
