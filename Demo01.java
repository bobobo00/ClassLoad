package ClassLoad;

public class Demo01 {
	static {
		System.out.println("静态初始化Demo01");
	}
	
	public static void main(String[] args) {
		System.out.println("main方法");
		//主动引用
		//A a=new A();
		//Sysem.out.println(A.width);
		//被动引用
		//System.out.println(A.high);
		A[] a=new A[10];
	}

}
class A extends A_Father{
	public static int width=100;
	public static final int high=100;
	static {
		System.out.println("静态初始化类A");
		width=300;
	}
	public A() {
		System.out.println("创建A类的对象");
	}
}
class A_Father {
	static {
		System.out.println("静态初识化类A_Father");
	}
}
