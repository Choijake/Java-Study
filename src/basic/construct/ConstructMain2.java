package construct;

public class ConstructMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberConstruct mc = new MemberConstruct("choi", 26, 4);
		MemberConstruct mc2 = new MemberConstruct("kim", 22);//�����ε�
		
		MemberConstruct[] ma = {mc, mc2};
		
		for(MemberConstruct m : ma) {
			System.out.println(m.name);
		}
	}

}
