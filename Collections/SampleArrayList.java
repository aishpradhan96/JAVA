package utils;
import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(567);
		list.add(34.99);
		list.add("Deloitte");
		list.add(547);
		list.add(null);
		System.out.println(list+" "+list.size());
		list.add("hyd");
		list.add(2, "aloo");
		System.out.println(list+" "+list.size());
		//list.remove(new Integer(567));
		//System.out.println(list+" "+list.size());
		Iterator itr= list.listIterator();
		while(itr.hasNext()){
			Object obj = itr.next();
			if(obj instanceof Integer)
				System.out.println(itr.next());
		}
	}
}
