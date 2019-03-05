public class Dashboard implements Comparable
{

    private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard() {
      odometer = 0;
      speedometer = 0;
    }

    public Dashboard(int milesTravelled, int speed) {
      if(milesTravelled >= 0 && milesTravelled <= 99999)
       odometer = milesTravelled;
      else {
       odometer = 0;
       checkEngine = true;
      }
      if(speed >= 0 && speed <= 100)
       speedometer = speed;
      else{
       speedometer = 0;
       checkEngine = true;
      }
    }

    public String toString() {
      String speed = "Speedometer: " + speedometer + " MPH";
      
      String distance = "Odometer: " + String.format("%05d", odometer);;
      String check = "";
      if(checkEngine == true)
        check = "Check Engine: On";
      if(checkEngine == false)
        check = "Check Engine: Off";
        return speed + "\n" + distance + "\n" + check;
    }

    public void accelerate() {
      if(speedometer < 100)
       speedometer++;
      else{
       speedometer = 0;
       checkEngine = true;
      }
      }

    public void drive(int numMinutes) {
      double numHours = ((double)numMinutes)/60;
      double numMiles = numHours * (double)speedometer;
        odometer += numMiles;
      if(odometer > 99999) {
        odometer = 0;
        checkEngine = true;
      }
    }
    
    public int compareTo (Object other){
     Dashboard temp = (Dashboard) other;
     int x = -1;
     if(odometer < temp.odometer){
      x = -1; 
     }
     if(odometer == temp.odometer){
      x = 0;
      if(speedometer < temp.speedometer){
       x = -1; 
      }
      
     if(speedometer > temp.speedometer){
       
       if(checkEngine == false && temp.checkEngine == true){
        x = -1; 
       }
       
       
      } 
     }
     if(odometer > temp.odometer){
      x = 1;
      if(speedometer < temp.speedometer){
       x = -1; 
      }
      
     if(speedometer > temp.speedometer){
       
       if(checkEngine == false && temp.checkEngine == true){
        x = -1; 
       }
       
       
      } 
     }
     
     
     return x;
    }
    public String race(Dashboard other, int acc1, int acc2){
      String ret = "";
      boolean stall1 = false;
      boolean stall2 = false;
      for(int i = 0; i < acc1; i++){
        if(speedometer <= 99){
      this.accelerate();
        }
        else{
          ret = ret + "First car stalled out!";
          stall1 = true;
          break;
        }
      }
      for(int i = 0; i < acc2; i++){
       if(speedometer <= 99){
      other.accelerate();
        }
        else{
          ret = ret + "Second car stalled out!";
          stall2 = true;
          break;
        }
      }
      ret = ret + "\n\n" + this.toString() + "\n\n" + other.toString();
      if(stall1 == false && stall2 == false){
        if(this.speedometer < other.speedometer){
       ret = ret + "\n\n" + "Car 1 has won the race!"; 
        }
        else if(this.speedometer > other.speedometer){
          ret = ret + "\n\n" + "Car 2 has won the race!"; 
        }
        else if(this.speedometer == other.speedometer) {
          ret = ret + "\n\n" + "It's a tie!";
        }
      }
      if(stall1 != stall2){
        if(stall1 == false){
          ret = ret + "\n\n" + "Car 1 has won the race!"; 
        }
        else{
         ret = ret + "\n\n" + "Car 2 has won the race!";  
        }
      }
      if(stall1 == true && stall2 == true){
       ret = ret + "\n\n" + "It's a tie!";  
      }
      
      return ret;
    }
    
    public String difference(Dashboard other){
      if(this.odometer < other.odometer){
        
      }
      else{
        
      }
    }
                           

}