package objectManupulation;

public class Time {
	private int hours;
	private int minute;
	public void setTime(int hours,int minute) {
		this.hours = hours;
		this.minute = minute;
	}
	public int getHours() {
		return hours;
	}
	public int getMinute() {
		return minute;
	}
	public void showTime() {
		System.out.println("Time is  - " + hours+" : "+minute);
	}
	public Time sum(Time t) {
		Time x = new Time();
		x.minute = this.minute + t.minute;
		x.hours = x.minute/60;
		x.minute = x.minute%60;
		x.hours = x.hours + this.hours  +t.hours;
		return x;
	}
}
