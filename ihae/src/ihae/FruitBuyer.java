package ihae;

public class FruitBuyer { //������ Ŭ���� ����
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	
	public void buyApple(FruitSeller seller, int money) { //�����ڰ� �����ϴ� ����
		numOfApple+=seller.SaleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult() {
		
		System.out.println("�����ܾ�:"+ myMoney);
		System.out.println("�������:"+ numOfApple);
	}

}
