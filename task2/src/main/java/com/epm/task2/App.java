package com.epm.task2;
 class App 
{
    public static void main( String[] args )
    {
     int a=3;
      FlavouredCandies f=new FlavouredCandies();
      f.weight();
      f.candy(a);
      Sweets s;
      Done d= new Done();
      s=d;
      s.print();
      
    }
}
 class Chacolates 
{
	 void weight()
	 {
		 System.out.println("chacolates");
	 }
	
}
 interface Sweets{
	 void print();
 }
 class Candies extends Chacolates
 {
	 void weight() {
		 super.weight();
		 System.out.println("Candies");
	 }
 }
 class FlavouredCandies extends Candies
 {
	 int candy(int x)
	 {
		 switch(x) {
		 case 1:int l=30;
		 System.out.println("Lemonweight  "+l+"gms");
		 break;
		 case 2:
			 int b=30;
			 System.out.println("Bananaweight  "+b+"gms");
		 break;
			 case 3:int d=25;
			 System.out.println("Flavoured "+d+"gms");
				 break;
			 case 4:int h=30;
			 System.out.println("Appleweight "+h+"gms");
		    break;
			 default:
				 System.out.println("Option not avaialable");
				 
		 }
		 return 0;
	 }
 }
 class Done implements Sweets{
	 public void print() {
		 System.out.println("Sweets");
	 }
 }