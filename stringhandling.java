import java.util.*;
class Str
 {
 String st,stt;
 void setData(String st,String stt)
  {
   this.st=st;
   this.stt=stt;
  }
  
  void display()
  {
   System.out.println("Original String1 ="+ this.st);
   System.out.println("Original String2 ="+ this.stt);
  }
  
  void stringOp()
  {
  if(this.st.startsWith("B")==true)
   {           
     System.out.println("YES");
   }
   else
   {
     System.out.println("NO");  
   }
   
   
   int p1=this.st.indexOf('m');
   System.out.println(p1);
   //indexOf return the position of character if present otherrwise returns -1. 
   int p2=this.st.indexOf('a',6);
   System.out.println(p2);
   //returns the position of character after the index pasesd as second character;
 
   System.out.println(this.st.trim());//removes whitespaces only before and after the string;
  
   this.stt=this.stt.replace('u','i');
   //replaces character in 1st parameter by character in 2nd parameter;
   System.out.println("String after replacing ="+ this.stt);
   
   
   System.out.println(this.st.substring(6,15));
   
  }
  
  public static void main(String ags[])
   {
   Scanner sc=new Scanner(System.in);
   String st=" Baatein ye kabhi na tu bhulna ";
   String stt="Compuler";
 /*System.out.println("Enter a string=");
   st=sc.nextLine();*/
   Str obj=new Str();
   obj.setData(st,stt);
   obj.display();
   obj.stringOp();
   }
  }
    v
