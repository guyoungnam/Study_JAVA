import java.util.ArrayList;
import java.util.Collections;


public class ListTest6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(9);
		set.add(6);
		set.add(1);
		set.add(3);
		set.add(4);
		
		System.out.println("정렬전:"+set);
		Collections.sort(set);
		System.out.println("정렬후:"+set);
		
		
		
		
		
		ArrayList<Person> set2 = new ArrayList<Person>();
		set2.add(new Person("홍길동", 20, "서울"));
		set2.add(new Person("이순신", 44, "전라"));
		set2.add(new Person("유관순", 33, "전라"));
		
		System.out.println("정렬전:"+set2);
		Collections.sort(set2, new PersonAgeSortComparator());
		System.out.println("정렬후:"+set2);
		

	}//end main

}
