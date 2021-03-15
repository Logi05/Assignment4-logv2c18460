package demo2;

public class ExcepHandling2 {
	public static void main(String args[]) {
		int i=8,j=0,k;
		try {
			int a[]=new int[3];
			for(int l=0;l<=3;l++) {
				a[3]=l+1;
					System.out.println(a[3]);
				}
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of range");
		}
		catch(Exception e) {
			System.out.println("Arithmetic Exception Occurs");
		}
		try {
			k=i/j;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
			}
