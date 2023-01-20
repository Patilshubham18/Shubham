package nonstatic;

public class sameclass {//class body open
	public static void main(String[] args) {//main method body open
		sameclass s=new sameclass();
		s.m1();
		s.m2();
		
	}//main method body close
	
	public void m1() {//m1 method body open
		System.out.println("hey");
	}//m1 method body close
	public void m2() {//m2 method body open
		System.out.println("hello");
	}//m2 method body close

}//class body close
