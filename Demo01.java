package ClassLoad;

public class Demo01 {
	static {
		System.out.println("��̬��ʼ��Demo01");
	}
	
	public static void main(String[] args) {
		System.out.println("main����");
		//��������
		//A a=new A();
		//Sysem.out.println(A.width);
		//��������
		//System.out.println(A.high);
		A[] a=new A[10];
	}

}
class A extends A_Father{
	public static int width=100;
	public static final int high=100;
	static {
		System.out.println("��̬��ʼ����A");
		width=300;
	}
	public A() {
		System.out.println("����A��Ķ���");
	}
}
class A_Father {
	static {
		System.out.println("��̬��ʶ����A_Father");
	}
}
