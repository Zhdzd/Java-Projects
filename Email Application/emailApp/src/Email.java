import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String email;
   private int mailboxCapacity = 500;;
   private String personalEmail;
   private String department;
   private int defaultPasswordLength = 10;
   private String companySuffix = "swiftairlines.com";

   //constructor to receive first and last name
   public Email(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      System.out.println("==============================");
      System.out.println("New Employee Email Creation");
      System.out.println("==============================");
      System.out.println("Name of Employee: " + this.firstName + " "+ this.lastName);

      //call a method asking for department
      this.department = setDepartment();
      //System.out.println("Department: " + this.department);

      //call a method to return random password
      this.password = randomPassword(defaultPasswordLength);
      System.out.println("Your password is: " + this.password);

      //combine elements to generate email
      email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
      System.out.println("Your new company email is: " + email);

   }
   //to ask for department
   private String setDepartment(){
        System.out.print("Enter your department code:\n1 Flight Operations \n2 Tech Crew \n3 Cabin Crew \n");
        
        Scanner scanner = new Scanner(System.in);
        int dpt = scanner.nextInt();
        if(dpt == 1){ return "fltops";} 
        else if ( dpt == 2){return "techcrew"; } 
        else if ( dpt == 3){ return "cabincrew";
        }else { return "";}
   }

   private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
          int rand = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
          
        }
        return new String(password);
   }

   //set mailbox capacity
   public void setMailboxCapacity(int capacity){
      this.mailboxCapacity = capacity;
   }

   //set alternate email
   public void setPersonalEmail(String persEmail){
    this.personalEmail = persEmail;
   }

   //change password
   public void changePassword(String password){
    this.password = password;
   }

   public int getMailboxCapacity(){
    return mailboxCapacity;
   }
   public String getPersonalEmail(){
    return personalEmail;
   }
   public String getPassword(){
    return password;
   }
}
