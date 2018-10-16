package order.command;

import order.device.Stereo;

public class StereoOnCommand implements Command{
    Stereo stereo;
    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
