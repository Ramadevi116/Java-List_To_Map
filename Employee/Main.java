package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		List<Emp> empl=new ArrayList<>();
		createEmp(empl);
		Map<String,List<Emp>> emps=empl.stream().collect(Collectors.groupingBy(Emp::getCity));
		emps.forEach((key,value)->System.out.println("city   "+key+"   Emps "+value));	
	}
		public static void createEmp(List<Emp> emp) {
			Emp e1=new Emp();
			e1.setName("Rama");
			e1.setId(1);
			e1.setCity("Banglore");
			Emp e2=new Emp();
			e2.setName("Jyothi");
			e2.setId(2);
			e2.setCity("Hydrabad");
			Emp e3=new Emp();
			e3.setName("Rupesh");
			e3.setId(3);
			e3.setCity("Kadapa");
			emp.add(e1);
			emp.add(e2);
			emp.add(e3);
		}

}
