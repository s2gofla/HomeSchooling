package ihae;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Number nInst = new Number(); // NumberŬ������ �����ϰڴ�.
			System.out.println("�޼ҵ� ȣ�� ��:"  + nInst.getNumber());
			
			simpleMethod(nInst);
			System.out.println("�޼ҵ� ȣ�� ��:" + nInst.getNumber());
			
			
		
	}
	public static void simpleMethod(Number numb) { //�޼ҵ� �Ķ���Ϳ��� ���������� �ü��ִ�
		
		numb.addNum(6); //Number Ŭ�������ִ� addNum�� ȣ���Ͽ� �޼��� ����
		
	}
}
