package bolt11_1;
//@author agonzalezacevedo

public class Bol11_1 {

    public static void main(String[] args) {
        Clase a = new Clase();
        Clase b = new Clase(20);
        Clase c = new Clase(20, 40);
        System.out.println("El objeto _a: _contiene:" + a.getPrimari() + "," + a.getSecundari());
        System.out.println("El objeto _B: _contiene:" + b.getPrimari() + "," + b.getSecundari());
        System.out.println("El objeto _c: _contiene:" + c.getPrimari() + "," + c.getSecundari());
    }

}
