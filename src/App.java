import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"ab", "o", "le"};
        String[] array2 = new String[]{"ab", "abo", "0", "la"};
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].equals(array2[j])){
                    System.out.println("O elemento repetido é: "+array1[i]);
                }
            }
        }
        System.out.println("FIM");

    }
}
