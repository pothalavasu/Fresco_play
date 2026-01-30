package Collection;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMap_program {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<>();
	hm.put(1,"vasu");
	hm.put(2, "Aruna");
	hm.put(3, "kumari");
	hm.put(4, "raja");
	Set sn = hm.entrySet();
	Iterator it = sn.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("Second traverse methhod");
	System.out.println(hm);
	for(Entry < Integer, String> entry: hm.entrySet()) {
		System.out.println(entry.getkey());
		System.out.println(entry.getvalue());
	}	
	
}
}
s