public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana",30,"Ventas",18000);
        Empleado e2 = new Empleado("Carlos",25,"TI",22000);


        try {

        }
        catch (IllegalArgumentException e) {
            System.out.println("Error en la actualización: " + e.getMessage());
        }


        System.out.println(e1.getNombre());
        System.out.println(e1.getEdad());
        System.out.println(e1.getDepartamento());
        System.out.println(e1.getSalario());

        System.out.println("");

        System.out.println(e2.getNombre());
        System.out.println(e2.getEdad());
        System.out.println(e2.getDepartamento());
        System.out.println(e2.getSalario());

    }
}


