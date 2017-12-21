package design;

public abstract class EmpAbstarct implements Employee{

    //Abstract methods don't need a body
    public abstract void employeeService();

    //Non abstract needs a body
    public void employeeBreakRm(){
        System.out.println("Employees Break Room");
    }

    public void employeeGaming(){
        System.out.println("Employees can play video games in this room");
    }
}