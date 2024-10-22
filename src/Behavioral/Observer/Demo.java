package Behavioral.Observer;

import Behavioral.Observer.editor.Editor;
import Behavioral.Observer.listeners.EmailNotificationListener;
import Behavioral.Observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args){
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/Users/Miruna/IS/homework3.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
