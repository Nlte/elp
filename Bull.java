public class Bull{
	protected int bull_number;
	public Bull(){
		this.bull_number = 0;
	}
	public void increment(int increment){
		this.bull_number+=increment;
	}
	
	public int get(){
		return this.bull_number;
	}
	
	public String isOk(Cow a){
		if(this.bull_number==4){
			return "You won";
		}
		return (a.get()-this.get())+" Cow(s) and "+this.get()+ "Bulls(s).";
	}
}