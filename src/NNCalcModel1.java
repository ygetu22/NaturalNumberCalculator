import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Model class. Handles the core data for a natural number calculator.
 *
 * @author Yakob Getu
 */
public final class NNCalcModel1 implements NNCalcModel {

    /**
     * Model variables. Holds the top and bottom operands for calculations.
     */
    private final NaturalNumber top, bottom;

    /**
     * No argument constructor. Initializes top and bottom numbers with new
     * instances.
     */
    public NNCalcModel1() {
        this.top = new NaturalNumber2();
        this.bottom = new NaturalNumber2();
    }

    /**
     * Gets the top operand.
     *
     * @return the top natural number
     */
    @Override
    public NaturalNumber top() {
        return this.top;
    }

    /**
     * Gets the bottom operand.
     *
     * @return the bottom natural number
     */
    @Override
    public NaturalNumber bottom() {
        return this.bottom;
    }

}
