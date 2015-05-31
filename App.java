public class App {
	public static void main(String[] args){
		Iterateur my_iterator = new Iterateur();
		Comparateur my_comparator = new Comparateur("1675");
		if(args.length>0){
			my_comparator.set(args[0]);
		}
		my_comparator.display();
		
		Bull bulls = new Bull();
		Cow cows = new Cow();
		
		while(my_iterator.get() < 4){
			bulls.increment(my_comparator.test(bulls, my_iterator));
			cows.increment(my_comparator.test(cows, my_iterator));
			my_iterator.increment();
		}
		System.out.println(bulls.isOk(cows));
	}	
} 
