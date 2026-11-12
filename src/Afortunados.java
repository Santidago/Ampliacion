import java.util.ArrayList;
import java.util.Scanner;

public class Afortunados {
    public static void main(String[] args) {
        int afor,eliminador=0,veces=1;
        Scanner lector = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Inserte un numero mayor a 1");
        afor = lector.nextInt();
        if (afor < 1) {
            System.out.println("MAYOR de 1");
        } else {
            for (int i = 1; i <= afor; i++)
            {
                lista.add(i);
            }
            do {
                do {
                    lista.remove(eliminador);
                    eliminador=eliminador+veces;
                }while(eliminador< lista.size());
                veces++;
                eliminador=0;
            }while(veces< lista.size());
            System.out.println(lista);
        }
    }
}
