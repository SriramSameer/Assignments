package Generics;
import java.util.HashMap;

class employee {
	
private int id;
private String name;
private int salary;
private String department;

public employee(int id, String name, int salary,String department) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;
}
public void show() {
	System.out.println("ID:"+id+"\tName:"+name+"\tSalary:$"+salary+"\tDepartment:"+department);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

}
public class EmployeeGenerics {
	
	

	public static void main(String[] args) {
		
		employee e1 = new employee(1,"esr",15000,"D1");
		employee e2 = new employee(2,"drh",21000,"D2");
		employee e3 = new employee(3,"grew",11000,"D1");
		employee e4 = new employee(4,"ween",14420,"D4");
		employee e5 = new employee(5,"sebt",35000,"D3");
		
		HashMap<employee,String> map =new HashMap<>();
		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		map.put(e3, e3.getName());
		map.put(e4, e4.getName());
		map.put(e5, e5.getName());
		//System.out.println(map.get(e1));
		e1.show();
		e2.show();
		e3.show();
		e4.show();
		e5.show();

	}

}
