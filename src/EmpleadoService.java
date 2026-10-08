import java.util.ArrayList;

public class EmpleadoService {
    private int siguienteId = 1;

    private ArrayList<Empleado> empleadoList = new ArrayList<>();

   public void agregarEmpleado(String nombre, int edad, String departamento, double salario) {

        Empleado empleado = new Empleado(
                siguienteId,
                nombre,
                edad,
                departamento,
                salario
        );

        empleadoList.add(empleado);

        siguienteId++;
    }

    public ArrayList<Empleado> listarEmpleados() {
        return new ArrayList<>(empleadoList);
    }

    public ArrayList<Empleado> buscarEmpleado(String nombre) {
        ArrayList<Empleado> resultados = new ArrayList<>();
        for (Empleado empleado : empleadoList) {
            if (empleado.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
               resultados.add(empleado);
            }
        }
        return resultados;
    }

    public Empleado buscarEmpleadoPorId(int id) {

        for (Empleado empleado : empleadoList) {

            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    public Empleado actualizarEmpleado(int id, String departamento, double salario) {
       Empleado empleado = buscarEmpleadoPorId(id);

       if (empleado != null) {
           empleado.setDepartamento(departamento);
           empleado.setSalario(salario);

           return empleado;
       }
return null;
    }

    public Empleado eliminarEmpleado(int id) {
       Empleado empleado = buscarEmpleadoPorId(id);
       if (empleado != null) {
           empleadoList.remove(empleado);
           return empleado;
       }
       return null;
    }
}
