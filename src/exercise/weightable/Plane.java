package exercise.weightable;

public class Plane implements Weightable {
    @Override
    public void printWeightTool() {
        System.out.println("print by 地秤");
    }

    /* main */
    public static void main(String[] args){
        Weightable[] weightables = { new Dog(), new Plane() };
        
        for(Weightable weightable : weightables){
            weightable.printWeightTool();
        }
    }
}
