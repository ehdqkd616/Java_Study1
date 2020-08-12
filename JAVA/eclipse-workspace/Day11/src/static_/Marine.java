package static_;

public class Marine {

	public int hp = 40;
	public static int attack = 3;
	
	public void underAttack(int damage) {
		this.hp -= damage;
		if(this.hp<=0) {
			System.out.println("사망했습니다.");
		}
	}

	public static void upgradeAttack() {
		attack += 3;
	}
	
}
