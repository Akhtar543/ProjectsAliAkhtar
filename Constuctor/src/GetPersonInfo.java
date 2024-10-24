public class GetPersonInfo {

	public static void main(String[] args) {
		MainDisplay();
	}
	static void MainDisplay() {
		Store storeinfo = new Store();
		System.out.println("----------------------------\nItem: " + storeinfo.itemchoice + "\nItem price: $" + storeinfo.price + "\n"
				+ "Item amount: " + storeinfo.itemnameamount + "\nTotal: " + storeinfo.totalamount + "\n---------------------------");
	}

}
