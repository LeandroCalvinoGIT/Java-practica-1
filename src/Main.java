import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        // Mi primer programa de java!
        System.out.println("Hola amigos de youtube");
        System.out.println("hoy vamos a aprender java para conseguir trabajo!!");

        //con sout se autogenera la funcion para print
        System.out.println("xd");

        // VARIABLES
        // Hay de tipos Primitivas

        int age = 21;
        double height = 1.86;
        char initial = 'L';
        boolean isStudent = true;

        if (!(isStudent)){
            System.out.println("Tengo " + age + " y mido " + height + "m.");
        }

        // Tipo Reference

        String name = "Leandro";
        String food = "Fatays";

        //Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        name = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Te llamas " + name + " y tenes " + age + " años.");

        // Calcular area de un rectangulo
        System.out.println("Ingresa la medida de la base: ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa la medida de la altura: ");
        double h = scanner.nextDouble();
        scanner.nextLine();

        double area = b * h;
        System.out.println("El área del rectángulo será: " + area);


        scanner.close();
    }
}