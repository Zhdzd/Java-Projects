import java.util.Scanner;

public class SimCard {
    Scanner scanner = new Scanner(System.in);

    
    double dataSize;
    int minutesPerMonth;
    String serviceProvider;
    
    
    public SimCard(){ }

    public void callFriend(int minutes){
        
        if(minutes < this.minutesPerMonth){
            this.minutesPerMonth -= minutes;
            System.out.println("You tried to call " + minutes + " minutes and managed to use " + minutes + " minutes.\n" );
        } else {
            
            System.out.println("You tried to call for " + minutes + " minutes and managed to use " + this.minutesPerMonth + " minutes.\n");
            this.minutesPerMonth = 0;
        }
      
     }
    public void surfWeb(double data){
        if(data< this.dataSize){
            this.dataSize -= data;
            System.out.println("You tried to use " + data +  " GB and managed to use " + data + "GB.\n");
        } else {
            System.out.println("You tried to use " + data +  " GB and managed to use " + this.dataSize + "GB.\n");
            this.dataSize = 0;
        }
    }
    public void topUpMinutes(int addMinutes){
        this.minutesPerMonth += addMinutes;
        System.out.println(addMinutes + " minutes is topped up to your card! ");

    }

    public void topUpData(double addData){
        this.dataSize += addData;
        System.out.println(addData + " GB is topped to your card! ");
    }

    public double getDataSize(){
        return this.dataSize;
    }
    public void setDataSize(double dataSize){
        this.dataSize = dataSize;
    }

    public int getMinutes(){
        return this.minutesPerMonth;
    }
    public void setMinutes(int minutesPerMonth){
        this.minutesPerMonth = minutesPerMonth;
    }

    public String getServiceProvider(){
        return this.serviceProvider;
    }

    public void setServiceProvider(String serviceProvider){
        this.serviceProvider = serviceProvider;
    }


   
}
