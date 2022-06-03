public class MobilePhone {
    
    String phoneNumber;
    String phoneMemory;
    String processorSpeed;
    String numberOfCores;

   public MobilePhone(){
      
   }
 

   public void menu(){
       System.out.println("A. Call friend");
       System.out.println("B. Surf Web");
       System.out.println("C. Top up Minutes");
       System.out.println("D. Top up Data");
       System.out.println("E. Display Phone Details");
       System.out.println("Q. Quit");

   }

   public String getNumber(){
       return this.phoneNumber;
   }
   public void setNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
   }

   public String getPhoneMemory(){
        return this.phoneMemory;
   }

   public void setPhoneMemory(String phoneMemory){
        this.phoneMemory = phoneMemory;
   }
   public String getProcessorSpeed(){
       return this.processorSpeed;
   }
   public void setProcessorSpeed(String processorSpeed){
        this.processorSpeed = processorSpeed;
   }
   
   public String getNumberOfCores(){
       return this.numberOfCores;
   }
   public void setNumberOfCores(String numberOfCores){
        this.numberOfCores = numberOfCores;
   }
   


}
