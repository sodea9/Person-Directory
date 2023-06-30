import java.util.LinkedList;

public class Persons{
  LinkedList<Person> personList;

  Persons(){
    this.personList = new LinkedList<Person>();
  }

  public Persons search(String name){
    Persons matches = new Persons();
    for (Person currentPerson : personList){
      if (currentPerson.getName().toLowerCase().equals(name.toLowerCase())){
        matches.add(currentPerson);
      }
    }
    return matches;
  }

  public void add(Person p){
    personList.add(p);
  }
  
  public int getSize(){
    return this.personList.size();
  }

  public void delete(int i){
    personList.remove(i);
  }

  public LinkedList<Person> getInternalList(){
    return personList;
  }

  public String toString(){
    String returnString = "";
    for (Person currentPerson : personList){
      returnString += currentPerson.toString() + "\n---------------\n";
    }
    return returnString;
  }

  public Person get(int i){
    return personList.get(i);
  }

  public static void main(String[] args) {
    // Test for add
    Persons people = new Persons();
    Person person1 = new Person("Sean");
    Employee person2 = new Employee("sean");
    Student person3 = new Student("Jaime");
    people.add(person1);
    people.add(person2);
    people.add(person3);
    System.out.println(people); // --------> should print the 3 person objects
    
    // Test for delete
    people.delete(1);
    System.out.println(people); // --------> should print the list without the "sean" object
    people.delete(0);
    System.out.println(people); // --------> should print only the "Jaime" object
  }
}