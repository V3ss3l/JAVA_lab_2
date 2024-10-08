package exercise_1;

public class Cat implements Voice{
    @Override
    public void voice() {
        System.out.printf("This voice from - %s\n", Cat.class);
    }
}
