import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Persons directory = new Persons();

      String userChoice = "";
      while (!userChoice.equals("q")){
        printMenu();
        System.out.print("Enter your option: ");
        userChoice = keyboard.next().toLowerCase();

        if (userChoice.equals("1")){               // display
          System.out.println(directory);

        } else if (userChoice.equals("2")){        // add person
          enterNewPerson(directory, keyboard);

        } else if (userChoice.equals("3")){        // search
          System.out.print("Name of person to search: ");
          String nameToSearch = keyboard.next();
          Persons matches = directory.search(nameToSearch);
          if (matches.getSize() == 0){
            System.out.println("Entry not found");
          } else{
            System.out.println(matches);
          }

        } else if (userChoice.equals("4")){        // modify
          System.out.print("Name of person to modify: ");
          String nameToSearch = keyboard.next();
          Persons matches = directory.search(nameToSearch);

          if (matches.getSize() == 0){
            System.out.println("Entry not found");
          } else{
            for (Person currentPerson : matches.getInternalList()){
              System.out.println(currentPerson);
              System.out.print("Do you want to modify this entry (y/n): ");
              String choice = keyboard.next().toLowerCase();
  
              if (choice.equals("y")){
                System.out.print("Enter new name: ");
                String newName = keyboard.next();
                System.out.print("Enter new address: ");
                String newAddress = keyboard.next();
                System.out.print("Enter new phone: ");
                String newPhone = keyboard.next();
  
                currentPerson.setName(newName);
                currentPerson.setAddress(newAddress);
                currentPerson.setPhone(newPhone);
              }}}

        } else if (userChoice.equals("5")){        // delete
          System.out.print("Index of person to delete: ");
          int index = keyboard.nextInt();
          if (index < 0 | index >= directory.getSize()){
            System.out.println("Invalid index");
          } else{
            System.out.println(directory.get(index));
            System.out.print("Do you want to delete this entry (y/n): ");
            String choice = keyboard.next().toLowerCase();
            if (choice.equals("y")){
              directory.delete(index);
            }}
          System.out.println(directory);

        } else if (!userChoice.equals("q")){
          System.out.println("Invalid choice. Please try again.");
        }}

      keyboard.close();
    }

    public static void enterNewPerson(Persons P, Scanner k){
      System.out.print("Enter name: ");
      String newName = k.next();
      System.out.print("Enter address: ");
      String newAddress = k.next();
      System.out.print("Enter phone: ");
      String newPhone = k.next();

      System.out.println("Is this person a:");
      System.out.println("S) Student");
      System.out.println("E) Employee");
      System.out.print("Enter your choice or anything else for neither: ");
      String personType = k.next().toLowerCase();
      
      if (personType.equals("s")){
        System.out.print("Enter graduation year: ");
        int newYear = k.nextInt();
        Student personToAdd = new Student(newName, newAddress, newPhone, newYear);
        P.add(personToAdd);

      } else if (personType.equals("e")){
        System.out.print("Enter department: ");
        String newDepartment = k.next();
        Employee personToAdd = new Employee(newName, newAddress, newPhone, newDepartment);
        P.add(personToAdd);

      } else {
        Person personToAdd = new Person(newName, newAddress, newPhone);
        P.add(personToAdd);
      }}

    public static void printMenu(){
      System.out.println("Enter option from list below:");
      System.out.println("   1) Display complete directory");
      System.out.println("   2) Enter new Person");
      System.out.println("   3) Search for Person");
      System.out.println("   4) Modify Person information");
      System.out.println("   5) Delete a record");
      System.out.println("   Q) Quit");
    }}
  