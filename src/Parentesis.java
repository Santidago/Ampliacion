import java.util.ArrayList;
import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        int error=0;
        char check;
        ArrayList<Character> com = new ArrayList<>();//, end = new ArrayList<Character>();
        com.add('D');
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte una oracion");
            String ora = lector.nextLine();
            for (int i = 0; i < ora.length(); i++) {
                check = ora.charAt(i);
                if (check == '[') {
                    com.add(check);
                } else if (check == '(') {
                    com.add(check);
                } else if (check == '{') {
                    com.add(check);
                } else if (check == ']') {
                    //end.add(check);
                    if (com.getLast().equals('[')) {
                        com.removeLast();
                    } else {
                        error++;
                    }
                } else if (check == ')') {
                    //end.add(check);
                    if (com.getLast().equals('(')) {
                        com.removeLast();
                    } else {
                        error++;
                    }
                } else if (check == '}') {
                   // end.add(check);
                    if (com.getLast().equals('{')) {
                        com.removeLast();
                    } else {
                        error++;
                    }
                }
            }
        com.removeFirst();
        if (error!=0)
        {
            System.out.println("No esta bien balanceada");
        }
        else if (!com.isEmpty())
        {
            System.out.println("No esta bien balanceada cantidad");
        }else {
            System.out.println("Esta Balanceada");
        }
    }
}
