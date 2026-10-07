//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana",30,"Ventas",18000);
        Empleado e2 = new Empleado("Carlos",25,"TI",22000);

        System.out.println(e1.nombre);
        System.out.println(e1.edad);
        System.out.println(e1.departamento);
        System.out.println(e1.salario);
        System.out.println(e2.nombre);
        System.out.println(e2.edad);
        System.out.println(e2.departamento);
        System.out.println(e2.salario);

    }
}


