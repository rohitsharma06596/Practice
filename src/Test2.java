import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String args[])
    {
        System.out.println("Enter your String");
        Scanner sc = new Scanner(System.in);
        String newly = sc.nextLine();
        newly = newly.toLowerCase();
        System.out.println(newly);
        String [] splitwise = newly.split("\\s|\n");
        ArrayList<String> finalInstance = new ArrayList<String>();
        for (int i =0; i < splitwise.length; i++){
            if (finalInstance.contains(splitwise[i].trim()))
            {
                continue;
            }
            else
            {
                finalInstance.add(splitwise[i].trim());
            }
        }
        //System.out.println(finalInstance);
        System.out.println(finalInstance.size());
    }
}
