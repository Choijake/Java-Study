package final1;

public class ConstantMain {

	public static void main(String[] args) {
		//���� �ľǰ�, �� �Һ��� ������
		int currentUserCount = Constant.MAX_USERS;
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++); 
	}
	
	private static void process(int currentUserCount) {
		if(currentUserCount > Constant.MAX_USERS) {
			System.out.print("����ڷ� ����մϴ�");
		}else {
			System.out.print("���ӿ� �����մϴ�");
		}
	}
}
