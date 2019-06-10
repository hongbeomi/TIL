package com.DesignPattern.Command;

public class PowerCommand implements Command {
        private TV tv;

        public PowerCommand(final TV tv){
            this.tv = tv;
        }

        public void excute(){
            tv.power();
        }
}
