package final1;

public class FinalFieldMain {

	public static void main(String[] args) {
		//������ �ʱ�ȭ
		System.out.println("������ �ʱ�ȭ");
		ConstructInit construct1 = new ConstructInit(10);
		System.out.println(construct1.value);
		
		//�ʵ� �ʱ�ȭ
		FieldInit fieldInit1 = new FieldInit();
		System.out.println(fieldInit1.value);
		
		//��� 
		System.out.println(FieldInit.CONST_VALUE);
	}
}
