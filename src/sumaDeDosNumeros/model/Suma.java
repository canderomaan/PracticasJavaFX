package sumaDeDosNumeros.model;

public class Suma {
    int op1, op2;

    public Suma(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    public int sumar(){
        return op1+op2;
    }
}
