//package is default,method overriding,encapsulation,Inheritance is used
public class Insect {
	//fields of Insect
	private int numberOfEyes;
	private int numberOfLegs;
	
	public Insect(int numberOfEyes, int numberOfLegs) {
		super();
		this.numberOfEyes = numberOfEyes;
		this.numberOfLegs = numberOfLegs;
	}
	public Insect()
	{
		
	}
	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	//method to move
	public String move()
	{
	 return "the insect move forword for every 3 seconds.";
	}

}
