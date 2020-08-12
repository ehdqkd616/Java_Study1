
public class AccountExample {

	public static void main(String[] args) {
		Account a1 = new Account("김연우", "0724", "우리");
		Account a2 = new Account("김루디", "0216", "국민");
		a1.deposit(1000000);
		a1.withdraw("6521", 50000);
		a1.withdraw("0724", 50000);
		a1.remittance("0724", 300000, a2);
		a2.checkBalance("0216");
		
		Account[] ac = new Account[5];
		ac[0] = a1;
		ac[1] = a2;
		
		for(int i=0; i<ac.length; i++) {
			if(ac[i].name.equals("김연우")) {
				System.out.println("김연우님의 계좌입니다.");
			}
		}
	}
}
