import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num = 0, cant,ten=0,remv,strong;
        char numero;
        Scanner Lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        strong = Lector.nextInt();
        String arm = "0";
        arm = arm+strong;
        cant = arm.length();
        while (ten<cant)
        {
            numero = arm.charAt(ten);
            remv = Integer.parseInt(String.valueOf(numero));
            remv= (int) Math.pow(remv,cant-1);
            num=remv+num;
            ten++;
        }
        if (strong==num)
        {
            System.out.println("Es Armstrong");
        }
        else
        {
            System.out.println("No es Armstrong");
        }
    }
}
