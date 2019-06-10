package com.DesignPattern.Command;

public class MuteCommand implements Command {
    private TV tv;

    public MuteCommand(final TV tv){
        this.tv = tv;
    }

    public void excute(){
        tv.mute();
    }
}
