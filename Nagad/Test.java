
package Nagad;

public class Test {
    public static void main(String args[]){
        
        inherite in=new inherite();//object create of inheritance
        in.display();
        in.display1();
        
        polymorphism po=new polymorphism();//object create of polymorphism

        encapsulation e=new encapsulation();//object create of encapsulation
        e.setBalance(100000);
        
        abstractMe ab;
        ab=new absCase7();
        
        switch(in.num){
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
            case 6 -> {
                e.en();
            }
            case 7 -> {
                ab.case7();
            }
        }
    }
}
