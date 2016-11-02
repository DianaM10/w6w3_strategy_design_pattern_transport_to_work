public class Main {
  public static void main(String args[]){
    Bike bike = new Bike();
    Bus bus = new Bus();
 
    
    Situation s1 = new Situation(bike);
    Situation s2 = new Situation(bus);
 
    //the result based on the kind of police officer.
    s1.checkWeather();
    s2.checkWeather();        
  }
}