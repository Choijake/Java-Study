package poly;

public class PolyMain {
	public static void main(String[] args) {
		//부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		//자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod();
		
		//부모 변수가 자식 인스턴스를 참조할 수 있음
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.parentMethod();
		
		//Child child = new Parent(); //자식은 부모를 담을 수 없다
		
		//poly.childMethod(); //자식의 기능은 사용할 수 없다
		
		//다형적 참조 -> 부모 타입은 자신을 포함한 모든 자식 타입을 참조할 수 있다
	}
}
