package Arrays;

import java.util.ArrayList;

public class DuyetArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("PHP");
		list.add("Python");
		System.out.println("Các phần tử có trong ArrayList");
		for( String str : list ) {
			System.out.println(str);
		}
		list.set(1, "C++");
		System.out.println("list sau khi cập nhập: ");
		System.out.println(list);
		list.remove(1);	
		System.out.println("List sau khi đã xóa 1 phần tử");
		System.out.println(list);
		// Kiểm tra xem PHP có tồn tại trong chuỗi hay không
		System.out.println(list.contains("PHP"));
		System.out.println(list.indexOf("PHP"));
	}

}
