package demojava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> s=new TreeSet<>();
s.add("Abhishek");
s.add("push");
s.add("Abhishek");
System.out.println(s);
for (String string : s) {
	System.out.println(string);
}
	}

}
