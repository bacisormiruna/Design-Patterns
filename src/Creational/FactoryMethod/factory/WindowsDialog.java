package Creational.FactoryMethod.factory;

import Creational.FactoryMethod.buttons.Button;
import Creational.FactoryMethod.buttons.WindowsButton;

import java.awt.event.WindowStateListener;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
