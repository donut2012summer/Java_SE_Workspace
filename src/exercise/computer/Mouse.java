package exercise.computer;

public class Mouse implements USB{

    private final String words;

    public Mouse(String words){
        this.words = words;
    }

    @Override
    public void workWithUSB(){
        System.out.println("Click" + words);
    }
}
