import java.util.*;

class GenericsMethods {

    public static void main(String[] args){

        LinkedList<String> holder = new LinkedList<String>();
        LinkedList<String> holder2 = new LinkedList<String>();
        holder.add("LA");
        holder2.add("KA");
        holder.add("KA");
        holder2.add("LA");
        System.out.println(holder.equals(holder2));
        LinkedList<String> holder3 = (LinkedList)holder.clone();
        holder.remove(1);
        holder.add("XA");
        System.out.println(holder3);
        System.out.println(holder);
        List x = new Stack();
        x.add(1);
        x.add(0);
        x.add(2);
        x.remove(1);
        System.out.println(x);
        ArrayList n = new ArrayList();
        n.add(1);
        n.add("knvksdnv");
        ArrayList<Integer> nn = (ArrayList) n.clone();
        System.out.println(nn);
        Iterator <Integer>it = nn.iterator();
        int mmm = (Integer)it.next();
        System.out.println(mmm);

        Set m = new TreeSet();
        Collections.addAll(m, 1,2,3,4,5,6,7,8);
        it = m.iterator();
        it.next();
        it.remove();


    }

}

