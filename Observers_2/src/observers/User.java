package observers;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer
{

	private String name = "";
	private Product product = null;

	public User(String name, Product product)
	{
		this.name = name;
		this.product = product;
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
		System.out.println("Username " + getName() + "'s update method called. " + product);

	}
	@Override
	public String toString(){
		return String.format("Username: %s", getName());
	}


}

