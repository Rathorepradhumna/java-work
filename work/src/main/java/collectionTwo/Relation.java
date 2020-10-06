package collectionTwo;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Relation {
	
	Map<Employee_Information,MMASaving> map ;
	Relation(){
			map	= new HashMap<Employee_Information,MMASaving>();
	}
	public void add(Employee_Information obj1 , MMASaving obj2 ) {
		map.put(obj1, obj2);
	}
	public Map<Employee_Information,MMASaving> getMap(){
		return map;
	}
	public int getSize() {
		return map.size();
	}
	public void display() {
		for(Entry<Employee_Information, MMASaving> m : map.entrySet()) {
			System.out.println(m.getKey().getEmpName() + " "  + m.getValue().getAccountBalance());
		}
	}
	
}
