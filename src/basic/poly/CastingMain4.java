package poly;

//�ٿ�ĳ������ �ڵ����� ���� �ʴ� ����
public class CastingMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1 = new Child(); 
		Child child1 = (Child)parent1; //�ٿ�ĳ����
		
		Parent parent2 = new Parent();
		Child child2 = (Child)parent2;
		child2.childMethod(); //Child ��ü�� �������� �ʱ� ������ �޼��带 ����� �� ��� ��Ÿ�� ������ �߻���
	}

}
