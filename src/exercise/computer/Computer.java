package exercise.computer;

public class Computer {

    USB[] usbs;

    /*
    * Constructor to receive devices by variable length arguments and set USB
    * */
    public Computer(USB... usbs){
        this.usbs = usbs;
    }

    /*
    * Use the functions of the USB
    * */
    public void workWithUSBs(){
        for(USB usb : usbs){
            usb.workWithUSB();
        }
    }

    public static void main(String[] args){

        /*
         * Computer 1 assembled by mouse1 and keyboard1
         * */
        USB[] usbs = { new Mouse("mouse1"), new Keyboard("keyboard1")};

        Computer computer = new Computer(usbs);
        computer.workWithUSBs();

        /*
        * Computer 2 assembled by mouse2, keyboard2 and printer2
        * */
        USB[] usbs1 = { new Mouse("mouse2"), new Keyboard("keyboard2"), new Printer("printer2")};
        Computer computer1 = new Computer(usbs1);
        computer1.workWithUSBs();

    }


}
