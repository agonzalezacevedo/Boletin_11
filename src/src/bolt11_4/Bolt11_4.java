package bolt11_4;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt11_4 {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(2.0, -3.0);
        ComplexNumber cero = ComplexNumber.ZERO;
        c1.getReal();
        c1.getImaginario();
        c1.add(c2);
        c1.toString();       
    }
    
}
