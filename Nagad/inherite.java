
package Nagad;

import javax.swing.JOptionPane;
public class inherite extends parent {
    
    void display(){
        s=Integer.parseInt(JOptionPane.showInputDialog("Choses Your Account:\n1.Bikash\n2.Nagad\n3.Rocket\n4.Upai"));
        switch (s) {
            case 1 -> {name="Bikash"; break;}
            case 2 -> {name="Nagad"; break;}
            case 3 -> {name="Rocket"; break;}
            case 4 -> {name="Upai"; break;}
            default -> {{ break;}
            }
        }
        
        
        JOptionPane.showMessageDialog(null, "Welllcome to your "+name+" account");
    }
    
     void display1(){
         num=Integer.parseInt(JOptionPane.showInputDialog(name+"\n"+"1.Cash Out\n2.Send Money\n3.Mobile Recharge\n4.Payment\n5.Bill Pay\n6.My "+name+"\n7.PIN Reset")); 
    }
}
