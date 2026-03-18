/**
 * 
 */
package collections_framework_list;
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
*/
import java.util.HashSet;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		
		//ArrayList
/*
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);al1.add(-2);al1.add(3);
		al1.add(-4);al1.add(5);al1.add(-6);
		System.out.println(al1);
		
		ArrayList<Integer> al2 = (ArrayList<Integer>)al1.clone();
		System.out.println(al2);
		
		System.out.println(al1.equals(al2));
		
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());
		
		
		
		ArrayList al = new ArrayList();
        al.add(null); 
        al.add(null); 
        al.add(null);

		al.add(10); 
		al.add(10); 
		al.add(10);

		al.add(true); 
		al.add('j');
        al.add(12.34); 
        al.add("java");

        al.add(new Product(1, "Apsara", "Pencil", 29.99));

        System.out.println(al);
        System.out.println("\nForward:");
        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        	
        }
        
        System.out.println("\nBackward:");
        ListIterator<Integer> listIterator = al.listIterator(5);
        while(listIterator.hasPrevious()) {
        	System.out.println(listIterator.previous());
        	
        }
        
        System.out.println("\n");
        System.out.println(al);
        al.set(2, 33);
        al.remove(3);
        System.out.println(al);*/
        
        
        //HashSet
        HashSet<Character> hs1 = new HashSet<Character>();
        hs1.add('a'); 
        hs1.add('I'); 
        hs1.add('*'); 
        hs1.add('5'); 
        hs1.add('W'); 
        hs1.add('e');

        System.out.println(hs1);

        HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
        System.out.println(hs2);

        System.out.println(hs1.equals(hs2));

        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());
        
        System.out.println();
        HashSet hs = new HashSet();
        hs.add(10);hs.add(true);hs.add('j');hs.add(null);hs.add(null);
        hs.add(12.34);hs.add("java");hs.add(new Product(1, "Apsara", "Pencil", 29.99));
        System.out.println(hs);
        System.out.println();
	}
}
