package exercise_4;

public class UsdRubConverterImpl implements UsdRubConverter {
    private double rate;

    public UsdRubConverterImpl(double rate) {
        this.rate = rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate >= 0.0 ? rate : this.rate;
    }

    @Override
    public double convertRubToUsd(double rubValue) {
        return rubValue / rate;
    }

    @Override
    public double convertUsdToRub(double usdValue) {
        return usdValue * rate;
    }
}
