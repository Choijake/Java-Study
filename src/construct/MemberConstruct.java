package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	MemberConstruct(String name, int age){
		//���� �����ڿ� grade�� 50���� �ؼ� ������ ���� -> �ߺ� �ڵ� ����
		this(name, age, 50);
	}
	
	MemberConstruct(String name, int age, int grede){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
