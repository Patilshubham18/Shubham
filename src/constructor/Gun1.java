package constructor;

public class Gun1 {//
	String gunName;
	int noofbullets;//constructor
	public Gun1(String gunName,int noofbullets) {
		this.gunName=gunName;
		this.noofbullets=noofbullets; }//nonstatic method
	public void shoot() {
		for(int i=1;i<=noofbullets;i++) {
			System.out.println("deshkew");
		}
	}
	

}
