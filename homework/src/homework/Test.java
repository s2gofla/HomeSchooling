package homework;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("�����");
		student.setAge(27);
		student.stNumber = 20202394111L;
		
		
		teacher.setName("�ݵ���");
		teacher.setAge(50);
		teacher.subject = "����";
		
		
		student.print();
		teacher.print();
		
	}

}
