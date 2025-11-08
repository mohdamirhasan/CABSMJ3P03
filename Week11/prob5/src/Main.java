//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.powerOn();
        s.connectWifi();
    }
}

//Create an interface Device with a method powerOn(). Create another
//interface SmartDevice that extends Device and adds a method
//        connectWiFi(). Create a class SmartPhone that implements SmartDevice.
//Demonstrate calling both powerOn() and connectWiFi() using a
//SmartPhone object in the main() method.