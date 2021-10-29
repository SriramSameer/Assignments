
class Employee{
	float salary = 40000;
	void totalSalary()
	{
		System.out.println("The Employee incremented salary is : " +(salary));	
	}
}
	
	class Manager extends Employee{
		float incentive = 15000;
		void totalsalary()
		{
			System.out.println("The salary of the manager is : " +((salary+incentive)));
		}		
	}
	
	class Labour extends Manager{
		double overtime = 6500;
		void totalsalary()
		{
			System.out.println("The salary of the labour is : " +((salary+overtime)));
		}
	}
	
	public class EmpolyeeClass {

	public static void main(String[] args) {
		Labour t = new Labour();
		Manager m = new Manager();
		System.out.println("Total Salary of Employees in the Organization is " +(m.salary)+(((m.incentive)+t.overtime))+t.salary);

	}

}
