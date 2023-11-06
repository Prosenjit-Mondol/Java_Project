/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;
public class inherite extends encapsulation {
    
    void display(){
        name=JOptionPane.showInputDialog("Enter your account name:");
        JOptionPane.showMessageDialog(null, "Welllcome to your "+name+" account");
    }
    
     void display1(){
         num=Integer.parseInt(JOptionPane.showInputDialog(name+"\n"+"1.Case Out\n2.Send Money\n3.Mobile Recharge\n4.Payment\n5.Bill Pay\n6.My Nagad\n7.PIN Reset"));
         
     }
    
}
