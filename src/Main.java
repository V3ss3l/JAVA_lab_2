import exercise_1.Cat;
import exercise_1.Cow;
import exercise_1.Dog;
import exercise_1.Voice;
import exercise_3.ExtendedClass;
import exercise_4.UsdRubConverter;
import exercise_4.UsdRubConverterImpl;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
        exercise4();
    }

    private static void exercise1(){
        Voice animal = new Cat();
        animal.voice();
        animal = new Dog();
        animal.voice();
        animal = new Cow();
        animal.voice();
    }

    private static void exercise3(){
        ExtendedClass example = new ExtendedClass((byte) 0B10, 11, 11.11, "Eleven");
        ExtendedClass example_1 = new ExtendedClass((byte) 0B11, 22, 11.21, "Twelve");
        System.out.println(example);
        System.out.println(example.hashCode());
        System.out.println(example.equals(example_1));
    }

    private static void exercise4(){
        UsdRubConverter converter = new UsdRubConverterImpl(60);
        System.out.println("Курс 60 рублей - "+converter.convertRubToUsd(5699.99)+"$");
        System.out.println("Курс 60 рублей - "+converter.convertUsdToRub(24.99)+"РУБ");
        converter.setRate(102);
        System.out.println("Курс 102 рубля - "+converter.convertRubToUsd(5699.99)+"$");
        System.out.println("Курс 102 рубля - "+converter.convertUsdToRub(24.99)+"РУБ");
    }
}