package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;
	
	public static  void staticCall() {
		//instanceValue++; //static�� �ν��Ͻ� ������ �޼��� ���� �Ұ�
		staticValue++; //���� ���� ����
		staticMethod(); //���� �޼��� ����
	}
	
	public void instanceCall() {
		instanceValue++; //�ν��Ͻ� ���� ����
		instanceMethod(); //�ν��Ͻ� �޼��� ����
		
		//�ν��Ͻ�, ���� ������ �޼��� ��� ���� ����
		staticValue++;
		staticMethod();
	}
	
	private void instanceMethod() {
		System.out.println(instanceValue);
	}
	
	private static void staticMethod() {
		System.out.println(staticValue);
	}
	
}
