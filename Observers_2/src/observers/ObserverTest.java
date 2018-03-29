package observers;

import java.util.ArrayList;
import java.util.Observer;

public class ObserverTest
{

	public static void main(String[] args)
	{
		Product product = new Product(false, "small", "white");
		ArrayList<Observer> users = new ArrayList<>();
		System.out.println("Initial product config: " + product);
		User user1 = new User("user1", product);
		User user2 = new User("user2", product);
		User user3 = new User("user3", product);
		User user4 = new User("user4", product);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		for(Observer user : users){
			product.addObserver(user);
		}
		System.out.println("Num of observers: " + product.countObservers());
		product.setAvailable(true);
		product.setAvailable(false);


	}

}

