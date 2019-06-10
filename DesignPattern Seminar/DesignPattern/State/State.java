package com.DesignPattern.State;

interface State {
    public void on_button_pushed(final Light light);
    public void off_button_pushed(final Light light);
}
