import java.util.Scanner;
        
public class Eficiente {
    
    public static void main(String[] args) {
        System.out.print("Tabla de multiplicar (1-10) \n");
        Scanner s = new Scanner(System.in);
        System.out.print("Inserte un numero: \n");
        int n=s.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf(n+" * "+i+" = "+n*i+" \n");
        }
    }
}
