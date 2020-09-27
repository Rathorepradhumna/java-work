package objectManupulation;

public class Distance {
	private int feet;
	private float inches;
	public void set(int feet,float inches) {
		this.feet = feet;
		this.inches = inches;
	}
	public int getFeet() {
		return feet;
	}
	public float getInches() {
		return inches;
	}
	public void display() {
		System.out.println(feet + " " +  inches);
	}
	public Distance add(Distance d) {
		Distance x = new Distance();
		x.inches = this.inches + d.inches;
		//x.feet = this.feet + d.feet;
		x.feet=0;
        if(x.inches>=12.0) {
        //	x.feet++;
        	x.inches = x.inches - 12.0f  ;
        	x.feet = this.feet + d.feet+1;
        	
        }
        else {
        	x.feet = this.feet + d.feet;
        }
        
        
        
        return x;
	}
}
