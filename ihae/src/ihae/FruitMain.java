package ihae;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitSeller seller = new FruitSeller(); // Ŭ������ Ʋ�̸�, �޸𸮿� �Ҵ�Ƿ���(��, ��üȭ) �� ������ ����Ͽ����Ѵ�
		// �������� ���� 		   = �ν��Ͻ��� ����
		FruitBuyer buyer = new FruitBuyer(); // �Ǹ��ڿ� �������� Ŭ������ �����ϰڴ�.
		
		buyer.buyApple(seller, 2000); //������ Ŭ������ �ִ�, buyApple �޼ҵ带 ȣ�� -> �޼����� ���� : seller���� 2000����ġ ����� ����
		
		System.out.println("���� �Ǹ����� ���� ��Ȳ");
		seller.showSaleResult();
		
		System.out.println("���� �������� �����Ȳ");
		buyer.showBuyResult();

	}

}
