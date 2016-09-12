
public  abstract class Person {
	
		   private String name;
		   private String address;
		 //  private int number;
		  public Person() {
			  
		  }
		   public Person(String name, String address)
		   {
		      System.out.println("Constructing Person");
		      this.name = name;
		      this.address = address;
		    //  this.number = number;
		   }
		   
		   public String getName() {
			   return name;
		   }
		   
		  public String getaddress() {
			  return address;
		  }
}
