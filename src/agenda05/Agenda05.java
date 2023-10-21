package agenda05;

import javax.swing.JOptionPane;

public class Agenda05 {

    public static void main(String[] args) {
     
        String dado;
        int idade;
        
        dado = JOptionPane.showInputDialog("Digite a idade do paciente: ");
        idade = Integer.parseInt(dado);
        
        if(idade<60){
            JOptionPane.showMessageDialog(null,"Como o paciente tem " + idade + " anos, será encaminhado para a Fila Comum!");
        } else {
            if(idade>=60 && idade<81){
                JOptionPane.showMessageDialog(null,"Como o paciente tem " + idade + " anos, será encaminhado para a Fila Prioritária!");
            }else{
                JOptionPane.showMessageDialog(null, "Como o paciente tem " + idade + " anos, será encaminhado para a Fila 80+!");
            }
        }
    }
    
}
