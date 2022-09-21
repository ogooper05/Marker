public class Marker {
  private boolean capStatus;
  private String markerColor;
  private String markerBrand;
  private Sanatizer sanatizer1;

  public Marker() {
    capStatus = true;
    markerColor = "Black";
    markerBrand = "Expo";
  }
  public Marker(boolean capStatus) {
    this();
    this.capStatus = capStatus;
  }
  public Marker(boolean capStatus, String color, String brand) {
    this.capStatus = capStatus;
    markerColor = color;
    markerBrand = brand;
    
  }
  public Marker(Sanatizer Purell) {
    this();
    sanatizer1 = Purell; 
  }

  @Override
  public String toString() {
    return "The cap is: " + capStatus + " The marker color is: " + markerColor + " The marker brand is: " + markerBrand;
  }

  public boolean tellCap() {
   return capStatus;
  }
  public String tellColor() {
    return markerColor;
  }

  public String tellBrand() {
    return markerBrand;
  }

  public void setColor(String color) {
    color = markerColor;
  }
  public void setBrand(String brand) {
    brand = markerBrand;
  }
  public void setCap(boolean capStatus) {
    this.capStatus = capStatus;
  }
  public void sanitaryMarker() {
    System.out.println("This marker is oozing out " + sanatizer1.getT());
  }
}
