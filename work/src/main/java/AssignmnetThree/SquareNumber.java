package AssignmnetThree;
import java.lang.Math;
public class SquareNumber {
	public boolean isSquare(int num) {
		if(num<0) {
			return false;
		}
		else if(num==0) {
			return true;
		}
		else {
			  double n = Math.floor(Math.sqrt(num));
			  return (0==(n-Math.sqrt(num)));
		}
	}
}
