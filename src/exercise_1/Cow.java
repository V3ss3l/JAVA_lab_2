package exercise_1;

public class Cow implements Voice{
    @Override
    public void voice() {
        System.out.printf("This voice from - %s\n", Cow.class);
    }
}
