package static1;

public class DataCountMain3 {

	public static void main(String[] args) {   
		//Ŭ���� ����(���� ����)�� ���� ����
		Data3 data1 = new Data3("A");
		System.out.println(Data3.count);
		
		Data3 data2 = new Data3("B");
		System.out.println(Data3.count);
		
		//�ν��Ͻ� ���� ���� �������� ���� -> �ٷ� ���� ������� ������ �ȵ��>>
		Data3 data4 = new Data3("D");
		System.out.println(data4.count);
		
		//Ŭ���� ���� ����
		System.out.println(Data3.count);
	}

}
