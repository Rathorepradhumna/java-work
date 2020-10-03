package streams;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListOfIntergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Stream<Integer> list  = Stream.iterate(1, element->element+1).limit(70);
		 Supplier<Stream<Integer>> streamSupplier = () -> Stream.iterate(1, e->e+1).limit(70);
		//display all integer
		System.out.println("\ndisplay all integer");
		streamSupplier.get().forEach(i->System.out.print(i+" "));
		//display all even integers
		System.out.println("\ndisplay all even integer");
		streamSupplier.get().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		//display all odd integers
		System.out.println("\ndisplay all odd integer");
		streamSupplier.get().filter(i->i%2!=0).forEach(i->System.out.print(i+" "));
		//display all divisible by 6
		System.out.println("\ndisplay all integer divisible by 6");
		streamSupplier.get().filter(i->i%6==0).forEach(i->System.out.print(i+" "));
		//display all divisible less than 12
		System.out.println("\ndisplay all integer less than 12");
		streamSupplier.get().filter(i->i<12).forEach(i->System.out.print(i+" "));
	  //display all divisible less than 12
		System.out.println("\ndisplay all integer greater than 50");
		streamSupplier.get().filter(i->i>50).forEach(i->System.out.print(i+" "));
	}

}
