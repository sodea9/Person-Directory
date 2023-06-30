public class Person{  
  protected String name;
  protected String address;
  protected String phone;  

  Person(String newName){
    this.name = newName;
    this.address = "Nowhere";
    this.phone = "999-999-9999";
  }

  Person(String newName, String address, String phone){
    this.name = newName;
    this.address = address;
    this.phone = phone;
  }  

  public void setName(String name){
    this.name = name;
  }  

  public String getName(){
    return this.name;
  }  

  public void setAddress(String address){
    this.address = address;
  }  

  public String getAddress(){
    return this.address;
  }  

  public void setPhone(String phone){
    this.phone = phone;
  }  

  public String getPhone(){
    return this.phone;
  }  

  public String toString(){  
    return String.format("%s\n%s\n%s", name, address, phone);
  }
}