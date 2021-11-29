package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuyetHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("C##");
		set.add("Python");
		set.add("Java");
		System.out.println("Số phần tử trong set: " + set.size());
		System.out.println("Các phần tử trong set");
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println("Kiểm tra set có trống hay không: " + set.isEmpty());
		// chuyển đổi thành list 
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		System.out.println(list);
	}

}
