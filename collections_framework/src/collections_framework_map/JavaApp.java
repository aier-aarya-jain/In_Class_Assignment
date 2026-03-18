/**
 * 
 */
package collections_framework_map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
/**
 * 
 */
public class JavaApp {
	public static void execution() {
		HashMap<Integer , Double> hm1 = new HashMap<Integer , Double>();
		hm1.put(1,11.11);hm1.put(-2,-22.22);hm1.put(3,33.33);
		hm1.put(-4,-44.44);hm1.put(5,55.55);hm1.put(-6,-66.66);
		
		System.out.println(hm1);
		HashMap<Integer , Double> hm2 = (HashMap<Integer,Double>) hm1.clone();
		System.out.println();
		
		System.out.println(hm2);
		System.out.println();
		
		System.out.println(hm1.equals(hm2));
		System.out.println();
		
		System.out.println(hm1.hashCode());
		System.out.println(hm2.hashCode());
		System.out.println();
		
		Set<Integer> keys = hm1.keySet();
		System.out.println("Keys:: ");
		System.out.println(keys);
		System.out.println();
		
		Collection<Double> values = hm1.values();
		System.out.println("Values:: ");
		System.out.println(values);
		System.out.println();
		
		hm1.replace(3,30.30);
		hm1.remove(-4);
		System.out.println(hm1);
		System.out.println();
		
		HashMap hm = new HashMap();
		hm.put(1,12.34);hm.put('j',"java");hm.put(10,12.34);
		System.out.println(hm);
	}
}
