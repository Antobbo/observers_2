//User: these are the observers
package observers;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class User implements Observer
{

	private String name = "";
	private List<Product> products = new ArrayList<Product>();

	public User(String name, List<Product> products)
	{
		this.name = name;
		this.products = products;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("Username " + getName() + "'s update method called. " + o);



	}
	@Override
	public String toString(){
		return String.format("Username: %s", getName());
	}


}

