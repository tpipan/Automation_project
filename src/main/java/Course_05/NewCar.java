package Course_05;

import javax.swing.plaf.PanelUI;

abstract public class NewCar implements Engine {
    public void start(){
        System.out.println("Car start Engine");
    }

    abstract public void stop(String time);
}
