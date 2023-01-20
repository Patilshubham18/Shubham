package nonstatic;

public class sameclass1 {//class body open
	public static void main(String[] args) {//main method body open
		sameclass1 s=new sameclass1();
		s.students();
		s.classmates();
		
		}//main method body close
	 
  public void students() {//students method body open
		System.out.println("all are present");
		}//students method body close
	public void classmates() {//classmates method body open
		System.out.println("there are many classmates");
	}// classmates method body close

}//class body close
