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
public class polymorphism extends parent{
    void chack(){
        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
    }
   void cas(){
        number=JOptionPane.showInputDialog("Enter Uddokta a/c Number:");
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        chack();
                        
                    }
   }
   
}
