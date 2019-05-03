
public class Funcionario {

    private String nome; private int iden; private String cargo;

    public Funcionario(String nome, int iden, String cargo) {this.nome = nome;this.iden = iden;this.cargo = cargo;}

    public Funcionario() {}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {this.cargo = cargo;}

    public int getIden() {return iden;}

    public void setIden(int iden) {
        if (iden > 0) {this.iden = iden;}
        else {System.out.println("Identificação Inválida.");}
    }

    @Override
    public String toString(){
        String retorno ="Nome: "+getNome()+"\n Cargo: "+getCargo()+"\n Iden: "+getIden();
        return retorno;
    }
}


