package observers;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ObserverTest
{

	public static void main(String[] args)
	{
		List<Product> products = new ArrayList<>();
		List<Observer> users = new ArrayList<>();

		Product product = new Product(false, "small", "white", "jumper");
		Product product1 = new Product(false, "medium", "yellow", "shorts");
		Product product2 = new Product(false, "large", "red", "trousers");
		products.add(product);
		products.add(product1);
		products.add(product2);

		User user1 = new User("user1", products);
		User user2 = new User("user2", products);
		User user3 = new User("user3", products);
		User user4 = new User("user4", products);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		/*for(Observer user : users){
			for(Product currentProduct : products){
				currentProduct.addObserver(user);
				//System.out.println(user + " " + currentProduct);
			}
		}
		for(Product currentProduct : products){
			currentProduct.setAvailable(true);
		}*/
		//adds all the users to the first product, then notifies them
		for(Product currentProduct : products){
            for(Observer user : users){
                currentProduct.addObserver(user);
            }
            currentProduct.setAvailable(true);
        }


		System.out.println("Num of observers: " + product.countObservers());
	}

}

