import java.util.Scanner;

public class Luckynumber {
    public static void main(String[] args) {
        int num = 0, cant,conv;
        char fecha;
        Scanner Lector = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento(ddmmaaaa)");
        String nac = Lector.next();
        do
        {
            for (cant = nac.length() - 1; cant > -1; cant--)
            {
            fecha = nac.charAt(cant);
            conv = Integer.parseInt(String.valueOf(fecha));
            num = num + conv;
            }
            nac = "0" + num;
            if (nac.length() > 2) {
                num = 0;
                for (cant = nac.length() - 1; cant > -1; cant--) {
                    fecha = nac.charAt(cant);
                    conv = Integer.parseInt(String.valueOf(fecha));
                    num = num + conv;
                }
            }
        }while(nac.length()!= 2);

        System.out.println(num);
    }
}
