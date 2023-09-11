package exercise.computer;

public class Printer implements USB{

    private String words;

    public Printer(String words){
        this.words = words;
    }

    @Override
    public void workWithUSB(){
        System.out.println("print" + words);
    }
}
