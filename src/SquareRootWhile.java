import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
   
        while(number < 1)
        {
            System.out.println("Número inválido, tente novamente");
            number = console.nextInt();
        }
        
        double resultado = Math.sqrt(number);
        System.out.println("A raiz quadrada de " + number + "é " + resultado);
    }
    
}
