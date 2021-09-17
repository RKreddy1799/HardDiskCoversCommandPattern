
package reddy.command.harddiskcover;


public class Plastics {
    String name;
    public Plastics( String name ) {
        this.name = name;
    }
    public void melting(){
        System.out.println( name + " melting plastics");
    }
    public void molding(){
        System.out.println( name + " molding plastics");
    }
    public void cooling(){
        System.out.println( name + " cooling plastic");
    }
}
