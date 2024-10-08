package exercise_4;

public interface UsdRubConverter {
    void setRate(double rate);
    double convertRubToUsd(double rubValue);
    double convertUsdToRub(double usdValue);
}
