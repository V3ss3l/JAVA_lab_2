package exercise_1;

public class Dog implements Voice{
    @Override
    public void voice() {
        System.out.printf("This voice from - %s\n", Dog.class);
    }
}
