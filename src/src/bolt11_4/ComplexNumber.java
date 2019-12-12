package bolt11_4;

/**
 *
 * @author agonzalezacevedo
 */
public class ComplexNumber {

    private double imaginario;
    private double real;
    public static ComplexNumber ZERO = new ComplexNumber(0, 0);

    public ComplexNumber(double imaginario, double real) {
        this.imaginario = imaginario;
        this.real = real;
    }

    public ComplexNumber getZERO() {
        return ZERO;
    }

    public double getImaginario() {
        return imaginario;
    }

    public double getReal() {
        return real;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber resultado = new ComplexNumber(this.real + c.getReal(), this.imaginario + c.getImaginario());
        return resultado;
    }

    public String toString() {
        return "imaginario=" + imaginario + ", real=" + real;
    }
}
