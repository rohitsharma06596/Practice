import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import javafx.util.Pair;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class CollectionsList {
    public static void main(String[] args){
        List list;
        ArrayList <Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(3);
        list = new LinkedList<Integer>(l);
        list.add(1);
        list.add(2);
        Iterator it =  list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(list);
        list.removeAll(l);
        System.out.println(list);
        UnaryOperator<Integer> op = a-> a * 3;
        Function<Integer, Integer> func  = op;
        func.compose(op);
        System.out.println(func.apply(3));
        ListIterator it2  = list.listIterator();
        it2.next();
        it2.remove();
        System.out.println(list);
        List<Integer> vec = new Vector<Integer>();
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,2);
        mp.put(2,3);
        System.out.println(mp.entrySet());
        Map<Integer, Integer> mp1 = new LinkedHashMap<>();
        Function <Integer, Double> f = a -> a / 2.0;
        Function <Integer, Double> f1= f.andThen(a->a*2.0);
        UnaryOperator<Double> d = a->a-99;
        Integer i  = 99;
        Double j = f.apply(i);
        System.out.println(j);
        System.out.println(f1.apply(i));
        j = d.apply(j);
        System.out.println(j);
        Map<Integer, Character> tmp = new TreeMap<>();
        tmp.put(1, 'N');
        tmp.put(2, 'K');
        tmp.put(3, 'J');
        tmp.put(4, 'M');
        mp1.put(1, 100);
        mp1.put(2, 101);
        mp1.put(3, 102);
//        System.out.println(((List)mp1.values()).indexOf(101));
//        System.out.println(((List)mp1.keySet()).indexOf(2));
        it = mp1.entrySet().iterator();
        System.out.println((it.next().getClass().getName()));
        it = tmp.entrySet().iterator();
        String key  = it.next().toString();
        System.out.println(key);
        System.out.println(key.substring(0, key.indexOf("=")));
        ListIterator<Integer> itt = l.listIterator();
        



}
}
