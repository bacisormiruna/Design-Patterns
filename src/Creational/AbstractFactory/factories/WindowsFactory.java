package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.buttons.Button;
import Creational.AbstractFactory.checkboxes.Checkbox;
import Creational.AbstractFactory.checkboxes.WindowsCheckbox;
import Creational.AbstractFactory.buttons.WindowsButton;


public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
