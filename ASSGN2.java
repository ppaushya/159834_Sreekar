package day5demo.cap.org.demo;

public class ASSGN2 implements Assg2{
	
	 public void division() {
		System.out.println(" This overridden division");
	}
  
	public void modules() {
		System.out.println("This overridden modules");
	}
	
	  public static void main( String[] args )
	    {
		  ASSGN2 obj = new ASSGN2();
		  obj.modules();
		  obj.division();
	    }
}

 