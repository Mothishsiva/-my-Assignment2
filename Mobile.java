package week1.day2;

public class Mobile {
     public void mobliebrand () {
    	 String mobliebrand =("Apple");
        System.out.println("mobliebrand=" +mobliebrand);
     }
     public void mobilelogo () {
    	 char mobilelogo ='A';
    	 System.out.println("mobilelogo="+ mobilelogo);
     }
     public void mobilepiece () {
    	 short mobilepiece =1;
    	 System.out.println("mobileprice=" + mobilepiece);
     } 
     public void mobilemodelNO () {
    	 int mobilemodelNO =13;
    	 System.out.println("mobilemodelNO="+ mobilemodelNO);
     }
     public void mobileNO () {
    	 long mobileNO =9092043363l;
    	 System.out.println("mobileNO="+ mobileNO);
    	  
     }
     public void mblprice () {
    	 float mblprice =199999.9f;
    	 System.out.println("mblprice="+mblprice);
    	 
     }
     public void isdamaged () {
    	 boolean isdamaged =false;
    	 System.out.println("isdamaged="+ isdamaged);
    	 
     }
     public static void main(String[] args) {
    	 Mobile obj=new  Mobile ();
    	 obj.isdamaged();
    	 obj.mblprice();
    	 obj.mobilelogo();
    	 obj.mobilemodelNO();
    	 obj.mobileNO();
    	 obj.mobilepiece();
    	 obj.mobliebrand();
	}
     
    	 
     
    	 
    	 
     }

