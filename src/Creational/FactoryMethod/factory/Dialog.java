package Creational.FactoryMethod.factory;

import Creational.FactoryMethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton=createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
