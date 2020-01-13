package ihae;

public class FruitBuyer { //구매자 클래스 정의
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	
	public void buyApple(FruitSeller seller, int money) { //구매자가 구매하는 행위
		numOfApple+=seller.SaleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult() {
		
		System.out.println("현재잔액:"+ myMoney);
		System.out.println("사과개수:"+ numOfApple);
	}

}
