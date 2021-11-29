package Arrays;

import java.util.TreeSet;

public class DuyetTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Java");
		treeSet.add("Python");
		treeSet.add("C++");
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
