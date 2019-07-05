import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String take = sc.nextLine();
        HashMap<String,Integer> storage = new HashMap<String,Integer>();
        storage.put("[",0);
        storage.put("{",0);
        storage.put("(",0);
        for( int i = 0; i< take.length(); i++)
        {
            if(take.charAt(i) == '{')
            {
                int temp = storage.get("{");
                temp = temp +1;
                storage.remove("{");
                storage.put("{",temp);

            }
            if(take.charAt(i) == '[')
            {
                int temp = storage.get("[");
                temp = temp +1;
                storage.remove("[");
                storage.put("[",temp);

            }
            if(take.charAt(i) == '(')
            {
                int temp = storage.get("(");
                temp = temp +1;
                storage.remove("(");
                storage.put("(",temp);

            }
            if(take.charAt(i) == '}')
            {
                int temp = storage.get("{");
                temp = temp  - 1;
                storage.remove("}");
                storage.put("{",temp);

            }
            if(take.charAt(i) == ']')
            {
                int temp = storage.get("[");
                temp = temp -1;
                storage.remove("[");
                storage.put("[",temp);

            }
            if(take.charAt(i) == ')')
            {
                int temp = storage.get("(");
                temp = temp -1;
                storage.remove("(");
                storage.put("(",temp);

            }

        }
        if((storage.get("{")==0)&&(storage.get("[")==0)&&(storage.get("(")==0))
        {
            System.out.println("String is valid");
        }
        else
        {
            System.out.println("String is invalid");
        }

    }
}
