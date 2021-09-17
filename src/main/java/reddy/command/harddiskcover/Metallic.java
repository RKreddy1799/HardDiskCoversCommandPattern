
package reddy.command.harddiskcover;


public class Metallic {
    //property
    String name;
    public Metallic( String name ) {
        this.name = name;
    }
    public void melting(){
        System.out.println(name + " melting materials");
    }
    public void forging(){
        System.out.println(name + " forging materials");
    }
    public void drawing(){
        System.out.println(name + " drawing materials");
    }
    public void molding(){
        System.out.println(name + " molding materials");
    }
}
