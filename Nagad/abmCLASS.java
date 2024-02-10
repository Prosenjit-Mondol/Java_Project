
package Nagad;

import javax.swing.JOptionPane;



public class abmCLASS extends abstractMe{

    int newpin,conpin;
    void ca(){
        while (newpin!=conpin) 
            {
            int conpin1=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN\nEnter Confirm Pin:"));
            if(newpin==conpin1)
                {
                    JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                    break;
                }
            }
    }
    @Override
    void ABM7() {
        int reset=Integer.parseInt(JOptionPane.showInputDialog("1.Forgot PIN\n2.Change PIN"));
                switch (reset)
                {
                    case 1 -> {
                        int nid=Integer.parseInt(JOptionPane.showInputDialog("Enter NID Number:"));
                         newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                         conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
                                ca();
                            }

                        }
                    case 2 -> {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter Old Pin:"));
                       if(pin==1111)
                       {
                         newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                         conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
                                ca();
                            }
                       }
                    
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111)
                            {
                               newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                               conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                              if(newpin==conpin)
                              JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                              else
                              {
                                ca();
                              }
                              break;
                            }
                        }
                        
                     }
                    }
                    default -> {
                }
                }
    }
}
