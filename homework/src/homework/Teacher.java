package homework;

public class Teacher extends Person {

	String subject;

	@Override
	public void print() {

		System.out.println("�� �̸���" + this.getName() + "�̰�," + "�� ���̴�" + this.getAge() + "�̸�, " + "����ġ�� ������"
				+ this.subject + "�Դϴ�.");
	}

}
