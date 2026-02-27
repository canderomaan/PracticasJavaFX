package practica2_modificada.model;

public class Operacion{
    int op1,op2;

    public Operacion(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }
    public void setOp1(int op1) {
        this.op1 = op1;
    }
    public int getOp2() {
        return op2;
    }
    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int sumar(){
        return op1 + op2;
    }

    public int restar(){
        return op1 - op2;
    }

    public double dividir(){
        return op1 / (double)op2;
    }

    public int multiplicar(){
        return op1 * op2;
    }
}
