public class Comparateur{
	protected String proposition;
	protected String reponse;
	
	public Comparateur(String proposition){
		this.proposition = proposition;
		this.reponse = "4681";
	}
	
	public void set(String proposition){
		this.proposition = proposition;
	}
	
	public void display(){
		System.out.println("guess :"+this.proposition+", truth: "+this.reponse);
	}
	
	
	//on utilise la REDEFINITION et non le POLYMORPHISME
	public int test(Cow a, Iterateur i){
		return Boolean.valueOf(this.reponse.contains(Character.toString(this.proposition.charAt(i.get())))).compareTo( Boolean.FALSE );
	}
	
	public int test(Bull a, Iterateur i){
		return Boolean.valueOf(this.reponse.charAt(i.get()) == this.proposition.charAt(i.get())).compareTo( Boolean.FALSE );
	}
}