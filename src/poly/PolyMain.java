package poly;

public class PolyMain {
	public static void main(String[] args) {
		//�θ� ������ �θ� �ν��Ͻ� ����
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		//�ڽ� ������ �ڽ� �ν��Ͻ� ����
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod();
		
		//�θ� ������ �ڽ� �ν��Ͻ��� ������ �� ����
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.parentMethod();
		
		//Child child = new Parent(); //�ڽ��� �θ� ���� �� ����
		
		//poly.childMethod(); //�ڽ��� ����� ����� �� ����
		
		//������ ���� -> �θ� Ÿ���� �ڽ��� ������ ��� �ڽ� Ÿ���� ������ �� �ִ�
	}
}
