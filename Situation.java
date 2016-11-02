public class Situation {
  private Transportdecider transportdecider;
 
  public Situation(Transportdecider transportdecider){
    this.transportdecider= transportdecider;
  }
 
  public void checkWeather(){
    this.transportdecider.takeTransport();
  }

}