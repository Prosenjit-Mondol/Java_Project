/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class absCase7 extends abstractMe{

    
    @Override
    void case7() {
        int reset=Integer.parseInt(JOptionPane.showInputDialog("1.Forgot PIN\n2.Change PIN"));
                switch (reset)
                {
                    case 1 -> {
                        int nid=Integer.parseInt(JOptionPane.showInputDialog("Enter NID Number:"));
                        int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                        int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
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

                        }
                    case 2 -> {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter Old Pin:"));
                       if(pin==1111)
                       {
                        int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                        int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
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
                       }
                    
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111)
                            {
                              int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                              int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                              if(newpin==conpin)
                              JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                              else
                              {
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
