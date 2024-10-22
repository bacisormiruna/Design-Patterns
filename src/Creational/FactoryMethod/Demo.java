package Creational.FactoryMethod;

import Creational.FactoryMethod.factory.HtmlDialog;
import Creational.FactoryMethod.factory.WindowsDialog;
import Creational.FactoryMethod.factory.Dialog;

import java.awt.*;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("MAC OS X")) {
            dialog = new HtmlDialog();
        } else {
            dialog = new  WindowsDialog();
        }
    }

        static void runBusinessLogic() {
            dialog.renderWindow();
        }
}


