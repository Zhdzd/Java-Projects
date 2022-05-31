import java.util.Scanner;

public class StampDuty {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double propertyPrice,  D1 = 180000, D2 = 360000, D3 = 640000, R1, R2, R3, sum=0;
        double stampDuty = 0;
        int count = 0; 
        char upperCasepropertyType;
   
        do{
            menu();
            char propertyType = scanner.next().charAt(0);
            upperCasepropertyType = Character.toUpperCase(propertyType);
            
            switch (upperCasepropertyType)
            {
                case 'R':
                    System.out.print("What is Purchase Price of your Residential Property? ");
                    propertyPrice = scanner.nextInt(); //declare property price

                    if (propertyPrice <= D1)
                    { stampDuty = propertyPrice * 0.01; }

                    else if (propertyPrice <= D2)
                    {   R1 = propertyPrice - D1;
                    stampDuty = ((D1 * 0.01) + (R1 * 0.02)); }

                    else if (propertyPrice <= (D3+D2))
                    {   R2 = propertyPrice - D2;
                    stampDuty = ((D1 * 0.01) + (D1 * 0.02) + (R2 * 0.03)); }

                    else
                    {   R3 = propertyPrice - D3 - D2;
                    stampDuty = ((D1 * 0.01) + (D1 * 0.02) + (D3 * 0.03) + (R3 * 0.04)); }

                    System.out.printf("You have to pay $%.2f for this property.\n", stampDuty);
                    System.out.println("");
                    System.out.println("Add another property?");
                    count++;
                    sum += stampDuty;


                    break;

                case 'N':
                    System.out.print("What is Purchase Price of your Non Residential Property? ");
                    propertyPrice = scanner.nextDouble();  //declare property price

                    if (propertyPrice <= D1)
                    { stampDuty = propertyPrice * 0.01; }

                    else if (propertyPrice <= D2)
                    {       R1 = propertyPrice - D1;
                    stampDuty = (D1 * 0.01) + (R1 * 0.02); }

                    else
                    {   R2 = propertyPrice - D2;
                    stampDuty = (D1 * 0.01) + (D1 * 0.02) + (R2 * 0.03); }

                    System.out.printf("You have to pay $%.2f for this property.\n", stampDuty);
                    System.out.println("");
                    System.out.println("Add another property?");
                    count++;
                    sum += stampDuty;

                    break;
                
                case 'Q':
                    break;

                default:
                    System.out.println("No such option available\n");

                    break;
                }

        } while(upperCasepropertyType != 'Q');
            System.out.printf("\nTotal BSD for your %d properties is $%.2f\n ", count, sum);
       
    }
    public static void menu(){
        System.out.println("R. Residential");
        System.out.println("N. Non-Residential");
        System.out.println("Q. Quit");
        System.out.println("Option? [R/N/Q]");
        
    }
 
}
