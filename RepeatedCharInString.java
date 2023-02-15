import java.util.Scanner;

public class RepeatedCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // change string to char array
        char[] charArray = name.toCharArray();
        char[] result=new char[charArray.length];
        // outer loop for traverse by one by one 
        for (int i = 0; i < charArray.length; i++) {
            // inner loop for traverse on all element
            for (int j =i+1; j <charArray.length; j++) {
                
                if (charArray[i] == charArray[j]) {
                   charArray[j]=' ';
                }
            }
        }
        //remove space
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]!=' ') {
                result[count]=charArray[i];
                count++;
            }
        }
        // print string
        for (char c : result) {
            System.out.print(c); 
        }
        
    }
}
