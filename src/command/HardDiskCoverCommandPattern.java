
package command;


public class HardDiskCoverCommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FactoryInvoker factoryInvoker = new FactoryInvoker();
        
        Metallic metallic = new Metallic("Metallic Cover");
        Plastics plastic = new Plastics("Plastic Cover");
        PolyCarbonate polycarbonate = new PolyCarbonate("PolyCarbonate Cover");
        
        Command makeMetallicCovers = () -> {
            metallic.melting();
            metallic.forging();
            metallic.drawing();
            metallic.molding();
        };
        factoryInvoker.setCommand(0, makeMetallicCovers);
        
        Command makePlasticCovers = () -> {
            plastic.melting();
            plastic.molding();
            plastic.cooling();
        };
        factoryInvoker.setCommand(1, makePlasticCovers);
        
        Command makePolyCarbonateCovers = () -> {
            polycarbonate.melting();
            polycarbonate.molding();
            polycarbonate.highPressure();
        };
        factoryInvoker.setCommand(2, makePolyCarbonateCovers);
        
        System.out.println(factoryInvoker);
        
        factoryInvoker.onCreate(0);
        System.out.println("\n");

        factoryInvoker.onCreate(1);
        System.out.println("\n");

        factoryInvoker.onCreate(2);
        System.out.println("\n");        
    }
}
