// Marycruz Maciel 
//Sept 08 2022
//Description: explain static variables
// File Name: Employee.java
// To Compile in terminal type: javac Employee.java
// To Run the program in terminal type: java Employee
class Employee
{
	//static variable shared between all instances,
	//it changes fro all if changed by one 
	static int numberEmployees;
	//instnace variable - each instance has it's own 
	int idNumber;

	Employee(int newID)
	{
		//chnaging instance variable changes it for one instance 
		idNumber = newID;
		//changing static variable changes it for all instances 
		numberEmployees++;
	}

	public String toString()
	{
		return "idNumber = " + idNumber +
				", number Employees = " + numberEmployees;
	}

	public static void main(String[] args)
	{
		System.out.println("The value of numberEmployees = "
			+ Employee.numberEmployees);

		//static variable numberEmployees ^^ can be "used" 
		//before we have created any instances below:

		Employee employee_one = new Employee(123);
		Employee employee_two = new Employee(456);
		Employee employee_three = new Employee(789);
		//		^^ INSTANCES of the EMployee CLASS


		System.out.println("employee_one = " + employee_one);
		System.out.println("employee_two = " + employee_two);
		System.out.println("employee_three = " + employee_three);

		//See the rest run below 
		//Both employee_one and employee_two ...
		//.. Have the same value for numberEmployees

		//This is because numberEmployees is a static ..
		//.. variable and is "shared" between all instances

		//If one instnace changes the static variable ..
		//.. the variable changes for all instances
	}
}
/* Output/ Test Run:
Marycruzs-Air:Week 2A.1 marycruzmaciel$ javac employee.java
Marycruzs-Air:Week 2A.1 marycruzmaciel$ java Employee
The value of numberEmployees = 0
employee_one = idNumber = 123, number Employees = 3
employee_two = idNumber = 456, number Employees = 3
employee_three = idNumber = 789, number Employees = 3
*/