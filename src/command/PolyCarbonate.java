
package command;

public class PolyCarbonate {
    String name;
    
    public PolyCarbonate( String name ) {
        this.name = name;
    }
    public void melting(){
        System.out.println(name + " melting polycarbonates");
    }
    public void molding(){
        System.out.println( name + " molding polycarbonates");
    }
    public void highPressure(){
        System.out.println( name + " applying high pressure to polycarbonate");
    }
}
