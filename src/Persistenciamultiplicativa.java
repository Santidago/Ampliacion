import java.util.Scanner;

public class Persistenciamultiplicativa {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = input.nextInt();
        System.out.println("La Persistencia multiplicativa es: " + multiplicativa(numero));
    }
    public static int multiplicativa(int numero) {
        String entero=String.valueOf(numero);
        String []partes;
        int resultado,contador=0;
        do {
            resultado=1;
            partes = entero.split("");
            for (String parte : partes) {
                resultado = resultado * Integer.parseInt(parte);
            }
            entero=String.valueOf(resultado);
            contador++;
        }while(resultado>9);
        return contador;
    }
}
