public class Student extends Person{

  private int year;

  Student(String newName){
    super(newName);
    this.year = 9999;
  }

  Student(String newName, String address, String phone, int year){
    super(newName, address, phone);
    this.year = year;
  }  

  @Override
  public String toString(){
    return super.toString()+"\n"+year;
  }  

  public int getGraduationYear(){
    return year;
  }  

  public void setGraduationYear(int year){
    this.year = year;
  }
}