package homework;

public class Student extends Person {

	long stNumber;

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(
				"�� �̸���" + this.getName() + "�̰�," + "�� ���̴�" + this.getAge() + "�̸�, " + "�� �й���" + this.stNumber + "�Դϴ�.");

	}

}
