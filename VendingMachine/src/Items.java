import java.util.Scanner;
public class Items {
	public int ch,amount;
	public int[] price;
	public  void menu(){
	  Scanner sc=new Scanner(System.in);
	  int i,j;
	  System.out.println("******menu*****");
	  System.out.println("0.water Bottle:40rs");
	  System.out.println("1.Coca_Cola:60rs");
	  System.out.println("2.Thums up:50rs");
	  System.out.println("3.Water Bottle:40rs");
	  System.out.println("4.Coca_Cola:60rs");
	  System.out.println("5.Thums Up:50rs");
	  System.out.println("enter your choice");
	  price=new int[6];
		 price[0]=40;
		 price[1]=60;
		 price[2]=50;
	     price[3]=40;
	     price[4]=60;
	     price[5]=50;
	  ch=sc.nextInt();
 }
  public  void Amount_To_Pay(){
	  int pamount,pamount1;
	  if(ch==0||ch==1||ch==2||ch==3||ch==4||ch==5)
	  amount=amount+price[ch];
	  System.out.println("pay the amount:");
	  Scanner sc=new Scanner(System.in);
	  pamount=sc.nextInt();
	 while(pamount<amount) {
		  System.out.println("pay the remaining amount:" + (amount-pamount));
		  pamount1=sc.nextInt();
		  pamount=pamount+pamount1;
		  
	  } 
	  if(pamount>=amount){
		  System.out.println("please collect your item");
		  if(pamount>amount)
		  System.out.println(" collect your remaining amount:" +(pamount-amount));
		  System.out.println("thank you for buying the item");	  
	  }
   }

}
