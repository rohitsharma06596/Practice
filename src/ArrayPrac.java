import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPrac {

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new FileReader("/Users/rohitsharma/IdeaProjects/Practice/a.txt"));
        System.out.println(reader.readLine());
        Scanner sc = new Scanner(System.in);
        String value  = sc.findInLine("xklfdnk");
        System.out.println(value);
        ArrayList a = new ArrayList();
        a.add(new Integer(0));
        a.add(new Character('d'));



    }
    void SelectionSort(){
        int []holder = {1,10,90,76,4,3,6,7,8,9,1};
        int min = (int)Double.POSITIVE_INFINITY;
        int count = 0;
        int index = 0;
        while(count < holder.length) {
            for (int i = count; i < holder.length; i++) {
                if(holder[i] <= min){
                    min = holder[i];
                    index =i;
                }
            }
            holder[index] = holder[count];
            holder[count] = min;
            min = (int)Double.POSITIVE_INFINITY;
            count = count+1;
        }
    }
    void insertionSort(){
        int j = 0;
        int temp =0;
        int []holder = {1,10,90,76,4,3,6,7,8,9,1};
        for(int i = 1; i<holder.length; i++){
            if(holder[i-1] < holder[i]){
                continue;
            }
            else {
                j = i;
                while (j > 0) {
                    if(holder[j]< holder[j-1]){
                        temp = holder[j-1];
                        holder[j-1]= holder[j];
                        holder[j] = temp;
                        j = j-1;
                    }
                    else{
                        break;
                    }


                }
            }
        }
    }
}
