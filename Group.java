public class Group
{
	private String name;
	private int customers;
	private Customer[] people;
	
	public Group(String n, int c, Customer[] p)
	{
		name = n;
		customers = c;
		people = p;
	}
	
	public int getNumOfPeople()
	{
		return customers;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public double getFullPrice()
	{
		double price = 0;
		for(Customer c : people) {
			price += c.getPrice();
		}
		
		return price;
	}
	
	public void getOrders()
	{
		for(Customer c : people)
		{
			c.takeOrder();
			System.out.println();
		}
	}
	
}