public class WageUC1 {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int attendance =  (int) (Math.floor(Math.random()*10)%2);
		if (attendance == IS_PRESENT) {
			System.out.println("employee is present");
		}
		else {
			System.out.println("employee is absent");
		}
	}
}