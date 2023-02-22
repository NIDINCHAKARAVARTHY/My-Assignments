package week1.day1;

public class Mobile {
	
  public void makeCalls() {
	  System.out.println("MAKE THE CALLS");
   }
  public void sendMsg() {
	  System.out.println("SEND THE MESSAGE");
   }
  public static void main(String[] args) {
	Mobile obj =  new Mobile();
	obj.makeCalls();
	obj.sendMsg();
	
   }
}
