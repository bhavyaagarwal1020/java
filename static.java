import java.util.*;
class account{
	static{
		System.out.println("hi....");
	}
	String name;
	String acountNUmber; 
	static int total;
	account(String name,String acountNUmber){
		this.name=name;
		this.acountNUmber=acountNUmber;
		total++;
	}
	void get(){
		System.out.println(this.name);
		System.out.println(this.acountNUmber);
		System.out.println(total);
	}
	public static void main(String args[]){
		String name;
		String sec,univName;
		int roll;
		Scanner in =new Scanner (System.in);
		System.out.println("enter the name of student");
		name=in.nextLine();
		System.out.println("enter the name of student");
		String aco=in.nextLine();
		account obj=new account(name,aco);
		account obj1=new account(name,aco);
		obj.get();
		obj1.get();
	}
}
