import java.util.ArrayList;
import java.util.Scanner;

public class Anio2013 {
    public static void main(String[] args) {
        int anio,otro=0;
        Scanner lector = new Scanner(System.in);
        ArrayList<Integer> doble = new ArrayList<>();
        System.out.println("Inserte un Año");
        String repite = lector.next();
        for (int i = 0;i<repite.length();i++)
        {
            int numero = Integer.parseInt(repite.substring((i), (i + 1)));
            if (doble.contains(numero))
            {
                otro=1;//contiene un numero mas de una ves
            }
            doble.add(numero);
        }
        if (otro==0) {
            do {//numero no repite
                doble.clear();
                anio = Integer.parseInt(repite);
                anio--;
                repite = String.valueOf(anio);
                for (int i = 0; i < repite.length(); i++) {
                    int numero = Integer.parseInt(repite.substring((i), (i + 1)));
                    if (doble.contains(numero)) {
                        otro = 1;//contiene un numero mas de una ves
                    }
                    doble.add(numero);
                }
            } while (otro == 0);
            anio++;
        }
        else {
            do {//numero se repite
                doble.clear();
                anio = Integer.parseInt(repite);
                anio--;
                repite = String.valueOf(anio);
                otro=0;
                for (int i = 0; i < repite.length(); i++) {
                    int numero = Integer.parseInt(repite.substring((i), (i + 1)));
                    if (doble.contains(numero)) {
                        otro = 1;//no contiene un numero mas de una ves
                    }

                    doble.add(numero);
                }
            } while (otro == 1);
            anio++;
        }
        System.out.println(anio);
    }
}
