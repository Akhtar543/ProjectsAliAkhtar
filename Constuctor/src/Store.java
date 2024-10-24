import java.util.Scanner;

public class Store {
	int itemnameamount;
	String itemchoice;
	double totalamount, price;
	public Store(){
	int item, itemamount;
	String itemchosen;
	double itemprice,total;
	Scanner scan = new Scanner(System.in);
	System.out.print("-----------------------");
	System.out.print("\nRetail Store\n1)Plates (1 for $0.75)\n2)Pans(1 for $5.75)\n3)Cups (1 for $0.50)\n4)Utensils(1 for $1.25)\n----------------------");
	item= scan.nextInt();
	System.out.println("How many Items: ");
	itemamount=scan.nextInt();
	switch (item) {
	case 1:
		itemchosen = "Plates";
		itemprice = (0.75*100)/100;
		break;
	case 2:
		itemchosen = "Pans";
		itemprice = (5.75*100)/100;
		break;
	case 3:
		itemchosen = "Cups";
		itemprice = (0.50*100)/100;
		break;
	case 4:
		itemchosen = "Utensils";
		itemprice = (1.25*100)/100;
		break;
	default:
		itemchosen = " ";
		itemprice = 0;
	}
	
	total= (itemprice*itemamount);
	this.itemchoice = itemchosen;
	this.itemnameamount=itemamount;
	this.totalamount=total;
	this.price=itemprice;
	}
}
