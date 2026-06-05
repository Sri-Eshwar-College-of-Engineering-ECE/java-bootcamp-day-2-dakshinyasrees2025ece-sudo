class Employee {
    int basicSalary;
    void calculateSalary() {
        int bonus = 5000;
        int totalSalary = basicSalary + bonus;
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.basicSalary = 30000;
        emp.calculateSalary();
    }
}
