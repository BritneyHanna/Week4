import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Exercises {

	public static void main(String[] args) {

//			1.	Create an instance of an ArrayList of String called employeeNames 
//			4.Add at least five entries to the employeeNames and ids 

		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Bob");
		employeeNames.add("Josh");
		employeeNames.add("Maximo");
		employeeNames.add("Amanda");
		employeeNames.add("Lee");

//			2.	Create an instance of a HashSet of Integer called ids

		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);

//			3.	Create an instance of a HashMap of Integer, String called employeeMap

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		int index = 0;

		for (Integer id : ids) {
			String name = employeeNames.get((index++));
			employeeMap.put(id, name);

		}
		System.out.println(employeeMap);
		for (Integer id : employeeMap.keySet()) {
			System.out.println(id + " " + employeeMap.get(id));
		}

	}

}
