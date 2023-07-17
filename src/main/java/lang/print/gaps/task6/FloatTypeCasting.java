package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNumber;
        if (numberToBeRounded - (int) numberToBeRounded >= 0.5) {
            roundedNumber = (int) numberToBeRounded + 1;
        } else {
            roundedNumber = (int) numberToBeRounded;
        }
        System.out.println(roundedNumber);

    }
}
