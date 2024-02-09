
package Nagad;

import Nagad.DialPadGUI.DialPadListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Test {
    static int res;
    public static void main(String args[]){
        
        
        
        
        DialPadListener listener;
        listener = (String number) -> {
            //System.out.println("String dialed in the main class: " + number);
            
            if (number.equals("*167#")) {
                
                polymorphism po=new polymorphism();//object create of polymorphism
                
                encapsulation e=new encapsulation();//object create of encapsulation
                e.setBalance(100000);
                
                
                abstractMe ab;
                ab=new absCase7();
                
                inherite in=new inherite();//object create of inheritance
                
                res = in.display();
                
                switch(res){
                    case 1 -> {po.cas();
                    }
                    case 2 -> {po=new case2();
                    po.cas();
                    }
                    case 3 -> {po=new case3();
                    po.cas();
                    }
                    case 4 -> {po=new case4();
                    po.cas();
                    }
                    case 5 -> {po=new case4();
                    po.cas();
                    }
                    case 6 ->{
                        e.EMI();
                    }
                    case 7 -> {
                        e.en();
                    }
                    case 8 -> {
                        ab.case7();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid try again");
            }
        };
        
        SwingUtilities.invokeLater(() -> {
            DialPadGUI dialPad = new DialPadGUI(listener);
            dialPad.setVisible(true);
        });
        
    }
}
