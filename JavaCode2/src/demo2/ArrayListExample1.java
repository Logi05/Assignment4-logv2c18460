package demo2;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	
	public static void main(String args[]) {
		ArrayList<String> EmpName=new ArrayList<String>();
		EmpName.add("Logi");
		EmpName.add("Ravi");
		EmpName.add("Gayathri");
		EmpName.add("Sankari");
		EmpName.add("Kartik");	
		
		ArrayList<Integer> EmpId=new ArrayList<Integer>();
		EmpId.add(1);
		EmpId.add(2);
		EmpId.add(3);
		EmpId.add(4);
		EmpId.add(5);
		
		System.out.println("Before Leaving");
		Iterator<String> I1=EmpName.iterator();
		while(I1.hasNext()) {
			System.out.println("Employee Name: "+I1.next());
		}
		System.out.println();
		
		Iterator<Integer> I2=EmpId.iterator();
		while(I2.hasNext()) {
			System.out.println("Employee Id: "+I2.next());
		}
		/*System.out.println(EmpName);
		System.out.println(EmpId);*/
		System.out.println();

		System.out.println("After Leaving");
		
		System.out.println("Newly added");
		EmpName.set(4, "priya");
		EmpId.set(4,6);
		
		System.out.println(EmpName);
		System.out.println(EmpId);
		
		System.out.println();
		System.out.println("I want to see ID of 3rd Employee: "+EmpId.get(2));
		
		ArrayList<Object> Company=new ArrayList<Object>();
		
		Company.addAll(EmpName);
		Company.addAll(EmpId);
		
		System.out.println();
		System.out.println("In company");
		System.out.println(Company);
		
		System.out.println();
		System.out.println("Delete All Employee Id");
		Company.removeAll(EmpId);	
		System.out.println(Company);
		
		System.out.println();	
		System.out.println("Newly generated Id");
		Company.add(5,11);
		Company.add(6,22);
		Company.add(7,33);
		Company.add(8,44);
		Company.add(9,55);


		/*ArrayList<Integer> EmpId1=new ArrayList<Integer>();
		EmpId1.add(11);
		EmpId1.add(22);
		EmpId1.add(33);
		EmpId1.add(44);
		EmpId1.add(55);*/

		System.out.println(Company);	
	}
	}


