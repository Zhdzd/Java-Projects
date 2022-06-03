import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        MobilePhone userPhone = new MobilePhone();
        SimCard userSimcard = new SimCard();

        System.out.print("Mobile number? ");
        String number = scanner.nextLine();

        System.out.print("Data Size per Month? ");
        int data = scanner.nextInt();

        System.out.print("Number of minutes Per Month? ");
        int minutes = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Service Provider? ");
        String serviceProvider = scanner.nextLine();

        System.out.print("Phone Memory (GB)? ");
        String memory = scanner.nextLine();

        System.out.print("Processor Speed (GHz)? ");
        String processor = scanner.nextLine();

        System.out.print("Number of Cores? ");
        String core = scanner.nextLine();

        userPhone.setNumber(number);
        userSimcard.setDataSize(data);
        userSimcard.setMinutes(minutes);
        userSimcard.setServiceProvider(serviceProvider);
        userPhone.setPhoneMemory(memory);
        userPhone.setProcessorSpeed(processor);
        userPhone.setNumberOfCores(core);

        System.out.println("");
        char input;
        do{ 
            userPhone.menu();
             char option = scanner.next().charAt(0);
             input = Character.toUpperCase(option);
            System.out.println("");
                
            switch(input){
                case 'A':   System.out.print("Call for how many minutes? ");
                            int minutesofCall = scanner.nextInt();
                            userSimcard.callFriend(minutesofCall);
                            break;

                case 'B':  System.out.print("Surf using how much data? ");
                            double dataUsed = scanner.nextDouble();
                            userSimcard.surfWeb(dataUsed);
                            break;
                case 'C': System.out.println("Top Up how many minutes? ");
                            int addMinutes = scanner.nextInt();
                            userSimcard.topUpMinutes(addMinutes);
                            break;
                case 'D': System.out.println("Top up how much data? ");
                            double addData = scanner.nextDouble();
                            userSimcard.topUpData(addData);
                            break;

                case 'E':   System.out.println("Mobile Phone Details:");
                            System.out.println("=== SIM Card Details ===");
                            System.out.println("Mobile Number: " + "'" + userPhone.getNumber() + "'");
                            System.out.println("Amount of Data: " + userSimcard.getDataSize());
                            System.out.println("Minutes Left: " + userSimcard.getMinutes());
                            System.out.println("Service Provider: " + "'" + userSimcard.getServiceProvider() + "'");
                            System.out.println("================");
                            System.out.println("Memory: " + userPhone.getPhoneMemory() + " GB");
                            System.out.println("Processor Speed: " + userPhone.getProcessorSpeed() + " GHz");
                            System.out.println("Cores: " + userPhone.getNumberOfCores() + "\n");
                            break;

                case 'Q':   break;

                default: System.out.println("Invalid input, try again");
                         break;   

                    

            }
        } while(input != 'Q');

        System.out.println("Thank you for using the system! Bye bye");
       

    

  


    }
   
}
