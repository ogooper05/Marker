public class Main {
   public static void main(String[] a) {
     
      Marker m1 = new Marker();
      Marker m2 = new Marker(true);
      Marker m3 = new Marker(true, "black", "Expo");
      Sanatizer s1 = new Sanatizer(); 
      Marker m4 = new Marker(s1);


     System.out.println(m1);
     System.out.println(m2);
     System.out.println(m3);
     m4.sanitaryMarker();


  }
}
