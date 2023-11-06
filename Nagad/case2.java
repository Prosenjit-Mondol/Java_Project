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
public class case2 extends polymorphism{

    public case2() {
    }
    @Override
    void cas(){
        number=JOptionPane.showInputDialog("Enter Received Account Number:");
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     ref=JOptionPane.showInputDialog("Enter Refferance:");
                     pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"Ref: "+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Send Money\n"+"To: "+number+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.");
                    else
                    {
                        chack();
                        
                    }
    }
}
