package world;

public class Oak extends Plant {
  public Oak() {
	  //Won't work....type is private
	 // type="tree";
	  
	  //Works because size is protected and Oak is a subclass of plant
	  this.size="medium";
	  
	  //No access specifier, works because Oak and Plant in same package
	  this.height=10;
  }
}
