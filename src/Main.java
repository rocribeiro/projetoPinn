import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        Remedio remedio = new Remedio();

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite" +"\n 1- Consulta"+"\n 2 Cadastros"));

        if(opcao == 1){
            int consulta = Integer.parseInt(JOptionPane.showInputDialog("Consultar" +"\n 1- Medico"+"\n 2- Remedio"+"\n 3- Paciente"+"\n 4- Funcionario"));
            if(consulta==1){
                JOptionPane.showInternalMessageDialog(null,medico.toString());
            }else if(opcao==2){
                JOptionPane.showInternalMessageDialog(null,remedio.toString());
            }else if(opcao==3){
                JOptionPane.showInternalMessageDialog(null,paciente.toString());
            }else{
                JOptionPane.showInternalMessageDialog(null,funcionario.toString());
            }
        }else{

        }

    }
}
