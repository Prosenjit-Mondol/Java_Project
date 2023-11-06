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
public class case3 extends polymorphism{
    @Override
    void cas(){
        ope=Integer.parseInt(JOptionPane.showInputDialog("Select Operator\n"+"1.Teletalk\n2.Airtel\n3.GP\n4.Robi\n5.Banglalink\n"));
                 type=Integer.parseInt(JOptionPane.showInputDialog("Select Account type\n"+"1.Prepaid\n2.Postpaid\n"));
                 number=JOptionPane.showInputDialog("Enter mobile Number:");
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                   
                     pin=Integer.parseInt(JOptionPane.showInputDialog("Mobile Recharge\n"+"To:"+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Mobile Recharge \n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        chack();
                        
                    }
    }
}
