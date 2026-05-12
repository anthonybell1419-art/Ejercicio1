import java.util.*;

public class Main{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Visitante> visitantes = new ArrayList<>();

    int opcion;
        do{

            System.out.println("\n==========Menú========== ");
            System.out.println("1. Registrar visitante");
            System.out.println("2. Mostrar visitante");
            System.out.println("3. Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del visitante: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del visitante: ");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese la cédula del visitante: ");
                    String cedula = scanner.next();
                    Visitante nuevoVisitante = new Visitante(nombre, edad, cedula);
                    visitantes.add(nuevoVisitante);
                    System.out.println("Visitante registrado"); 
                    break;

                case 2:
                    System.out.println("Visitantes registrados:");
                    for(Visitante v : visitantes){
                        System.out.println("- " + v.getNombre() + ", " + v.getEdad() + " años, cédula: " + v.getCedula());
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                System.out.println("Opción no válida, intente de nuevo.");
            }

        }while(opcion != 3);
        
        scanner.close();
    }
}


