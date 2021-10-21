public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //fazer os métodos gets e sets
//set
public void setcodigoSetor(String codigosetor){
    this.codigosetor=codigosetor;
}
//get
public String getcodigoSetor(){
    return this.codigosetor;
}
}
