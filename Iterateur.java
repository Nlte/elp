public class Iterateur{
	protected int compteur;
	
	public Iterateur(){
		this.compteur = 0;
	}
	public int get(){
		int result = this.compteur;
		return result;
	}
	public void increment(){
		++this.compteur;
	}
}