package study;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = sum(4, 6); // sum�޼ҵ忡�� ������ ���� ���� ������ �����ؾ���
		System.out.println(result);
		hello(); //�޼ҵ带 �׳� ȣ���ϴ°�
		
	}

	public static int sum(int num1, int num2) { // 1) ���� Ÿ�Կ� ���� �Ķ������ ������ ���ƾ��Ѵ�.

		int a = num1 + num2;

		return a; // 2) ������ �� ���� �ִ� �޼ҵ�� �ݵ�� �����־�� �Ѵ�.

	}
	
	public static void hello() { //������ ���� ����, �����ֱ⸸ �Ҷ��� void�� ����Ѵ�.
		
		System.out.println("�ȳ��ϼ���");
		
	}
}
