package collectionOne;
import java.util.HashSet;
import java.util.Set;
public class GeneralSet<T> {
	//Set<T> = new HashSet<>();
	Set<T> genSet=new HashSet<T>();
	public void addObjects(T object) {
		genSet.add(object);
	}
	public Set<T> getObjects(){
		return this.genSet;
	}

}
