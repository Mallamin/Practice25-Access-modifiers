import world.Plant;

/*private ------only within same class
 * public-------from anywhere
 * protected----same class,subclass, and same package
 * no modifier--same package only
  */

public class Application {

	public static void main(String[] args) {
      Plant plant=new Plant();
      System.out.println(plant.name);
      System.out.println(plant.ID);
      
      //Won't work...type is private
     // System.out.println(plant.type);
      
      //Won't work size is protected and Application is not in the same package as plant.
     // System.out.println(plant.size);
      
      // Won't work; Application and height in different packages;height has package level visibility
      //System.out.println(plant.height);
	}

}
