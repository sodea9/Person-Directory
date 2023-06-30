public class Employee extends Person{
  private String department;

  Employee(String newName){
    super(newName);
    this.department = "None";
  }

  Employee(String newName, String address, String phone, String department){
    super(newName, address, phone);
    this.department = department;
  }

  @Override
  public String toString(){
    return super.toString()+"\n"+department;
  }

  public String getDepartment(){
    return this.department;
  }

  public void setDepartment(String department){
    this.department = department;
  }
}