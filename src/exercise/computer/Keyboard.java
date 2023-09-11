package exercise.computer;

public class Keyboard implements USB{

    private String words;

    public Keyboard(String words){
        this.words = words;
    }
    @Override
    public void workWithUSB(){
        System.out.println("type" + words);
    }
}
