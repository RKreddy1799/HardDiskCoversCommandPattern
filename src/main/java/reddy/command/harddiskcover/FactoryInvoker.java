
package reddy.command.harddiskcover;

public class FactoryInvoker {
    Command[] createCommands;
    public FactoryInvoker(){
        createCommands = new Command[7];
        for( int z = 0; z < 7; z++) {
            createCommands[z] = () -> {};
        }
    }
    public void setCommand(int slot, Command createCommand ){
        createCommands[slot] = createCommand;
    }
    public void onCreate( int slot ){
        createCommands[slot].execute();
    }
    
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n ------- Creation process --------\n");
        for( int i = 0; i < createCommands.length; i++ ){
            stringBuff.append("[slot " + i + "]" + createCommands[i].getClass().getName() + "\n ");
        }
        
        
        return stringBuff.toString();
    }
}
