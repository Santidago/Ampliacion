public class Expresiones {
    public static void main(String[] args) {
        //now uncomplete
        int uno,dos;
        String expresion="5 1 2 + 4 * + 3 -";
        String [] partes=expresion.split(" ");
        for(int contador=0;contador<partes.length;contador++){
            if(partes[contador].equals("+")){
                uno=Integer.parseInt(partes[contador-1]);
                dos=Integer.parseInt(partes[contador-2]);
                partes[contador-1]=String.valueOf(uno+dos);
            }else if(partes[contador].equals("-")){
                uno=Integer.parseInt(partes[contador-1]);
                dos=Integer.parseInt(partes[contador-2]);
                partes[contador-1]=String.valueOf(uno-dos);
            }else if(partes[contador].equals("*")){
                uno=Integer.parseInt(partes[contador-1]);
                dos=Integer.parseInt(partes[contador-2]);
                partes[contador-1]=String.valueOf(uno*dos);
            }else if(partes[contador].equals("/")){
                uno=Integer.parseInt(partes[contador-1]);
                dos=Integer.parseInt(partes[contador-2]);
                partes[contador-1]=String.valueOf(dos/uno);
            }
        }
    }
}
