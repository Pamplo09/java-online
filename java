// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de estudiantes del grupo de sistemas ");
        int tamano = scanner.nextInt();
        scanner.nextLine();
       
        String[] nombres = new String [tamano];
        String[] apellidos = new String [tamano]
       
        for(int i= 0;i < nombres.length; i++){
            System.out.print("ingrese un nombre" + (i+1)+":");
            nombres[i]=scanner.nextLine();  
           
             System.out.print("ingrese un apellido" + (i+1)+":");
            nombres[i]=scanner.nextLine();
        }
       
        System.out.print("\nombres ingresados");
       
        for(int i= 0;i < nombres.length; i++){
            System.out.print("ingrese un apellido" + (i+1)+":");
            nombres[i]=scanner.nextLine();  
   
         System.out.print("ingrese un apellido" + (i+1)+":");
            nombres[i]=scanner.nextLine();
        }
    }
    }
