import java.util.Arrays;

public class burbuja {
    public static void main(String[] args) {
        int[]lista={65,2,7,2,7,2,7,2,8,9,1};
        int contador_c=0,contador_p=0,carry;
        do {
            if (lista[contador_p]>lista[contador_p+1]) {
                carry=lista[contador_p];
                lista[contador_p]=lista[contador_p+1];
                lista[contador_p+1]=carry;
            }else {
                contador_c++;
            }
            if(contador_c==lista.length-1) {
                break;
            }
            if(contador_p==lista.length-2){
                contador_p=0;
                contador_c=0;
            }else{
                contador_p++;
            }
        }while(true);
        System.out.println(Arrays.toString(lista));
    }
}
