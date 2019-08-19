import java.util.Comparator;

public class PersonAgeSortComparator
implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int num = 0;  // -1
		if(o1.getAge() > o2.getAge()) {
			num= -1;  //0
		}
		return num ;
	}

}
