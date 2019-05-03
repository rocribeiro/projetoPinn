public class Medico extends Funcionario{
    private int crm;


    public Medico(String nome, int iden, String cargo, int crm) {
        super(nome, iden, cargo ="médico"); this.crm = crm;
    }

    public Medico() {super();}

    public int getCrm() {return crm;}

    public void setCrm(int crm) {
        if (crm>0) {this.crm = crm;}
        else {System.out.println("CRM Inválido.");}
    }
    @Override
    public String toString(){
        String retorno = super.toString()+"\n CRM: "+getCrm();
        return retorno;
    }
}
