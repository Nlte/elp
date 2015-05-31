public class Cow{
	protected int cow_number;
	
	public Cow(){
		this.cow_number = 0;
	}
	
	public int get(){
		return this.cow_number;
	}
	
	public void increment(int increment){
		this.cow_number+=increment;
	}
}