
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insect x = new Insect(3,4);
		
      BumbleBee buzz = new BumbleBee();
      
      
      buzz.setNumberOfEyes(2);
      buzz.setNumberOfLegs(4);
      System.out.println("our bee has " +buzz.getNumberOfEyes() + "eyes and " +buzz.getNumberOfLegs() +" legs.");
      System.out.println(buzz.move());
      System.out.println("our insect has " +x.getNumberOfEyes() + "eyes and " +x.getNumberOfLegs() +" legs.");
      System.out.println(x.move());

	}

}
