import java.util.Scanner;

public class Cuanto_llevarse {
    public static void main(String[] args) {
        int lleva=0,llevo=0,remv,cant;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte dos Numero");
        String numero = lector.next();
        String numero2 = lector.next();
        remv=numero.length();
        remv--;
        for (int i = 0; i < numero.length(); i++)
        {
            cant = Integer.parseInt(numero.substring((remv),(remv+1)));
            cant = Integer.parseInt(numero2.substring((remv),(remv+1)))+cant+lleva;
            lleva = 0;
            remv--;
            if (cant >= 10)
            {
                llevo++;
                lleva = 1;
            }
        }
        System.out.println("tiene una dificultad de "+llevo);
    }
}
