import java.util.Random;

public class Account {

	public int accountNumber;
	public String password;
	public long balance;
	public String bankName;
	public String name;
	
	public void deposit(long money) {
		balance += money;
		System.out.printf("%s님의 계좌로 %d이 입금되었습니다.\n", name, money);
		System.out.println("현재 잔액 : "+balance);
	}
	
	public boolean checkPassword(String password) {
		return this.password.contentEquals(password);
	}
	
	public void withdraw(String password, long money) {
		if(checkPassword(password)) {
			if(this.balance-money>=0) {
				this.balance -= money;
				System.out.printf("%s님의 계좌에서 %d가 출금되었습니다.\n", name, money);
				System.out.println("현재 잔액 : "+balance);
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
	}
	
	public void remittance(String password, long money, Account account) {
		if(this.balance-money>=0) {
			if(checkPassword(password)) {
				this.balance-=money;
				account.balance+=money;
				System.out.printf("%s님의 계좌에서 %s님의 계좌로 %d원이 출금되었습니다.", this.name, account.name, money);
				System.out.println(" 현재 잔액 : "+this.balance);
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void checkBalance(String password) {
		if(checkPassword(password)) {
			System.out.println("안녕하세요. "+this.name+"님.");
			System.out.println("현재 잔액은 "+this.balance+"원 입니다.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	
	
	public Account(String name, String password, String bankName) {
		this.accountNumber = new Random().nextInt();
		this.name = name;
		this.password = password;
		this.bankName = bankName;
		this.balance = 0;
	}
	
}
