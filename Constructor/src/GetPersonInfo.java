import java.util.Scanner;
public class GetPersonInfo {
	static double total = 0;
	static Scanner scan = new Scanner(System.in);
	static String items = "Items : ";
	
	public static void main(String[] args) {
		MainDisplay();
	}
	
	static void MainDisplay() {
		String ans;
		Store storeinfo = new Store();
		total += storeinfo.totalamount;
		items += "\n" + storeinfo.itemnameamount + " " + storeinfo.itemchoice;
		System.out.println("----------------------------\nItem: " + storeinfo.itemchoice + "\nItem price: $" + storeinfo.price + "\n"
				+ "Item amount: " + storeinfo.itemnameamount + "\nTotal: " + storeinfo.totalamount + "\n---------------------------");
		System.out.println("Do you want to purchase another item? Y/N");
		ans = (scan.nextLine()).toUpperCase();
		if (ans.equals("N")) {
			Reciept();
		}
		else {
			MainDisplay();
		}
	}
	
	static void Reciept() {
		String t = total+"";
		String output = "----------------------------\n" + items + "\n" + "----------------------------\n" + "Total amount: " + t;
		System.out.println(output);;
	}

}
