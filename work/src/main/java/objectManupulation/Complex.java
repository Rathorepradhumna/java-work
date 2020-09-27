package objectManupulation;

public class Complex {
	private float real;
	private float img;
	public void set(float real,float img) {
		this.real = real;
		this.img = img;
	}
	public float getReal() {
		return real;
	}
	public float getImg() {
		return img;
	}
	public void display() {
		System.out.println(real+"+ i"+img);
	}
	public Complex sum(Complex c) {
		Complex x = new Complex();
		x.img = this.img + c.img;
		x.real = this.real + c.real;
		
		return x;
	}
}
