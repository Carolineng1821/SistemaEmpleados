public class Empleado {

    private int id;
    private String nombre;
    private int edad;
    private String departamento;
    private double salario;

    public Empleado(int id, String nombre, int edad, String departamento, double salario){

        if (edad < 18) {
            throw new IllegalArgumentException("Debes tener al menos 18 años de edad para continuar");
        }

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
        }
            this.salario = salario;
    }

}
