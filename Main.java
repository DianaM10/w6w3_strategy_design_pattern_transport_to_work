public class Main {
  public static void main(String args[]){
    Bike bike = new Bike();
    Bus bus = new Bus();
 
    
    Situation s1 = new Situation(bike);
    Situation s2 = new Situation(bus);
 
    
    s1.checkWeather();
    s2.checkWeather();        
  }
}