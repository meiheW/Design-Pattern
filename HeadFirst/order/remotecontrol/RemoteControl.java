package order.remotecontrol;

import order.command.Command;
import order.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    //将命令记录在开关数组中对应的插槽位置
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //开关按下后，调用对应命令对象的方法
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n------Remote Control------\n");
        for(int i=0; i<onCommands.length; i++){
            sb.append("slot "+i+": "+onCommands[i].getClass().getName()
                    + "   \t"+offCommands[i].getClass().getName()+"\n");
        }
        return sb.toString();
    }

}
