package OOPsConcepts.Association._01;

public class Client {
	public static void main(String[] args) {
		Bank bank = new Bank("ACB");
		Employee empl = new Employee("Duy");
		System.out.println(bank.getName() + " " + empl.getName());
	}
}
