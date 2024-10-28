 package inheritance;

public class MenuSystemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuSystem menu = new MenuSystem();
		menu.printMenu();
		int choice =menu.readCustomerChoice();
		if(choice ==1) {
			System.out.println("chosen item poori");
		}else if(choice ==2) {
			System.out.println("Chosen item Dosa");
		}else if (choice ==30) {
			System.out.println("Chosen item edly");
		}else {
			System.out.println("chosen item coffee");
		}
	}

}
