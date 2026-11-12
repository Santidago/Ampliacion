import java.util.Scanner;

public class Vampiros {
    public static void main(String[] args) {
        int c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,conv,res;
        int [] Vam={0,0,0,0};
        int [] Vam10={0,0,0,0};
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero de 4 digitos");
        String vam = lector.next();
        for (int i =0;i<4;i++)
        {
            conv = Integer.parseInt(vam.substring(i,i+1));
            Vam[i] =conv;
        }
        for (int i =0;i<4;i++)
        {
            conv = Integer.parseInt(vam.substring(i,i+1));
            Vam10[i] =conv*10;
        }
        c1=(Vam10[0]+Vam[1])*(Vam10[2]+Vam[3]);
        c2=(Vam10[0]+Vam[1])*(Vam10[3]+Vam[2]);
        c3=(Vam10[0]+Vam[2])*(Vam10[1]+Vam[3]);
        c4=(Vam10[0]+Vam[2])*(Vam10[3]+Vam[1]);
        c5=(Vam10[0]+Vam[3])*(Vam10[1]+Vam[2]);
        c6=(Vam10[0]+Vam[3])*(Vam10[2]+Vam[1]);
        c7=(Vam10[1]+Vam[0])*(Vam10[2]+Vam[3]);
        c8=(Vam10[1]+Vam[0])*(Vam10[3]+Vam[2]);
        c9=(Vam10[1]+Vam[2])*(Vam10[3]+Vam[0]);
        c10=(Vam10[1]+Vam[3])*(Vam10[2]+Vam[0]);
        c11=(Vam10[2]+Vam[0])*(Vam10[3]+Vam[1]);
        c12=(Vam10[2]+Vam[1])*(Vam10[3]+Vam[0]);
        res =Integer.parseInt(vam);
        if (res==c1||res==c2||res==c3||res==c4||res==c5||res==c6||res==c7||res==c8||res==c9||res==c10||res==c11||res==c12)
        {
            System.out.println("Vampiro!!!");
        }
    }

}
// 01 02 03 10 12 13 20 21 23 30 31 32
// 01 * 23/32 02 * 13/31 03 * 12/21
// 10 * 23/32 12 * xx/30 13 * xx/20
// 20 * xx/31 21 * xx/30 23 * xx/xx
// 30 * xx/xx 31 * xx/xx 32 * xx/xx