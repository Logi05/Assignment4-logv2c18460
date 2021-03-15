package demo2;

public class ExcepHandling3 {
	public static void main(String args[]) {
		A a=new A();
		a.show2();
	}
}
		class A{
			public void show() {
				String s="abc";
				if(s.equals("abc")) {
					System.out.println("Same String");
				}
				else {
					System.out.println("Not a Same String");
				}
			}
			public void show1() {
				String s1="Number";
				int n=Integer.parseInt(s1);
			}
		public void show2() {
		try{
			show();
			System.out.println("No Exception in show() method");
			try {
				show1();
				System.out.println("No Exception in show1() method");
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
			catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		}

