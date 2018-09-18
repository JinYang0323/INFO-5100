/**
 * Assignment for lecture 2
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {    		
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.salary = salary;
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    	return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    	this.name = name;
    }
    
    public void raiseSalary(double byPercent)
    {
    	salary *= (byPercent / 100);
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment_2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary <= 8900, the Social Security Tax = 6.2% * salary.
     * If the salary > 8900, the Social Security Tax = 6.2% * 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
        if(employee.salary <= 8900)
        	return (0.062 * employee.salary);
        else return (0.062 * 106800);
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; 
     * if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; 
     * If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
    	if(employee.age < 35)
        	return (0.03 * employee.salary);
    	else if(employee.age >= 35 && employee.age <= 50)
        	return (0.04 * employee.salary);
    	else if(employee.age > 50 && employee.age < 60)
        	return (0.05 * employee.salary);
    	else return (0.06 * employee.salary);
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        if(e1.salary <= e2.salary)
        {
        	if(e3.salary > e2.salary)
        		System.out.println(e1.name + " " + e2.name + " " + e3.name);
        	else if(e3.salary < e1.salary)
        		System.out.println(e3.name + " " + e1.name + " " + e2.name);
        	else
        		System.out.println(e1.name + " " + e3.name + " " + e2.name);
        }
        else if(e3.salary < e2.salary)
        	System.out.println(e3.name + " " + e2.name + " " + e1.name);
        else if(e3.salary > e1.salary)
    		System.out.println(e2.name + " " + e1.name + " " + e3.name);
        else System.out.println(e2.name + " " + e3.name + " " + e1.name);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        employee.raiseSalary(300);
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a = Jenny
     * Before: b = John
     * After: a = Jenny
     * After: b = John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     The reason why two objects are not changed is that when the 'swap' function is called, java duplicate the two objects.
     So what have been swapped is the two duplicated objects, not the original ones. 
     In other words, Java is pass by value, not by reference.
     To swap the two objects, you may refer to the 'swapNames' function:
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        System.out.println(socialSecurityTax(a));
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a, b);
        swapNames(a, b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;        
    }
    public static void swapNames(Employee x, Employee y) {
        String temp = x.name;
        x.name = y.name;
        y.name = temp;
        
    }
}
