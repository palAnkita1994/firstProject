import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();//Creating arraylist
	list.add("abc");//Adding object in arraylist
	list.add("hello");
	list.add("java");
	list.add("sdf");
//Traversing list through Iterator
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}
}