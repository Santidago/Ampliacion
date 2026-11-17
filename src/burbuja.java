import java.util.Arrays;

public class burbuja {
    public static void main(String[] args) {
        int[]lista={65,2,7,2,7,2,7,2,8,9,1};
        int carry;
        int [] sorted= Arrays.copyOf(lista,lista.length);
        Arrays.sort(sorted);
        for (int contador_p = 0; !(Arrays.equals(sorted,lista)); contador_p++) {
            if(contador_p==lista.length-1){
                contador_p=0;
            }
            if (lista[contador_p]>lista[contador_p+1]) {
                carry = lista[contador_p];
                lista[contador_p] = lista[contador_p + 1];
                lista[contador_p + 1] = carry;
            }
        }
        System.out.println(Arrays.toString(lista));
    }
}