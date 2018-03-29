package observers;

import java.util.Observable;

public class Product extends Observable
{

	private boolean isAvailable = false;
	private String size = "";
	private String colour = "";

	public Product(boolean isAvailable, String size, String colour)
	{
		this.isAvailable = isAvailable;
		this.size = size;
		this.colour = colour;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
		//if(isAvailable()){
			setChanged();//set the flag to indicate that this observable has changed
		    notifyObservers();//notify everyone
		//}
	}
	public String getSize()
	{
		return size;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	@Override
	public String toString(){
		return String.format("Product is: %s; Size: %s; Colour: %s. ", this.isAvailable() ? "available" : "not available",  this.getSize(), this.getColour());
	}

}
