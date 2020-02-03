//java program using collections
import java.util.*;
public class DemoCollection {

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
        list.add("pune");
        list.add("Hyderabad");
        list.add("chennai");
        list.add("madras");
        list.add("Delhi");
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
		}
	}
