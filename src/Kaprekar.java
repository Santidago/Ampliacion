import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
  public static void main(String[] args) {
      int cant, remv, resta, suma, kar,iteraciones=0;
      char cremv;
      int[] kap = {0, 0, 0, 0};
      int[] neg = {0, 0, 0, 0};
      Scanner lector = new Scanner(System.in);
      System.out.println("Introdusca un numero de 4 digitos");
      String Kapprekar = lector.next();
      for (cant = 0; cant < 4; cant++) {
          cremv = Kapprekar.charAt(cant);
          remv = Integer.parseInt(String.valueOf(cremv));
          kap[cant] = remv;
      }if (Kapprekar.length()>4)
      {
          System.out.println("El numero es muy grande");
      }
      else if (kap[0] == kap[1] && kap[0] == kap[2] && kap[0] == kap[3]) {
         System.out.println("No es un numero valido");
      }
      else {
          do {
              Arrays.sort(kap);
              for (cant = 0; cant < 4; cant++) {
                  neg[cant] = kap[3-cant];
              }
              resta = neg[0] * 1000;
              resta = resta + neg[1] * 100;
              resta = resta + neg[2] * 10;
              resta = resta + neg[3];
              suma = kap[0] * 1000;
              suma = suma + kap[1] * 100;
              suma = suma + kap[2] * 10;
              suma = suma + kap[3];
              if (suma>resta)
              {
                  kar = suma - resta;
              }
              else
              {
                  kar = resta - suma;
              }
              Kapprekar = kar + "0";
              for (cant = 0; cant <4; cant++) {
                  cremv = Kapprekar.charAt(cant);
                  remv = Integer.parseInt(String.valueOf(cremv));
                  kap[cant] = remv;
              }
              iteraciones++;
          } while (kar != 6174);
          System.out.println("El numero es Kapprekar y llego en "+ iteraciones+" iteraciones");
      }
  }
}
