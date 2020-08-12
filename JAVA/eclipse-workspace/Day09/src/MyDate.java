
public class MyDate {

	private int year;
	private int month;
	private int day;
	
	@Override
	public String toString() {
		return "현재시각은 " + year + "년" + month + "월" + day +"일 입니다.";
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		}else {
			this.month = 1;
			System.out.println("잘못된 값이 입력되어 기본값 1을 할당합니다.");
		}
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>0 && day<32) {
			this.day = day;
		}else {
			this.day = 1;
			System.out.println("잘못된 값이 입력되어 기본값 1을 할당합니다.");
		}
	
	}
	
}

