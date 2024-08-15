import com.sun.source.tree.BreakTree;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Scanner;

public class pizza {
    private int Price;
    String addOn;
    int Total;
    private String SpecialPizza ="SpecialPizza";
    private String Veg;
    String beans="Beans";
    String corn="Corn";
    String Pine="Pineapple";
    private String NonVeg;
    private int extra=2;
    Scanner sc=new Scanner(System.in);
    LinkedList<String> topping=new LinkedList<>();

    public pizza(){

        System.out.println("You have selected a: "+SetPizza());
        toppings();
        System.out.println("This is the price for the pizza: $"+getPrice());
        System.out.println("This is the total balance: $"+setPayment());


    }
    private String SetPizza(){
        System.out.print("Select the pizza:\n1 SpecialPizza\n2 Vegetarian\n3 Non-Vegetarian\n4 Exit\nENTER:");
        int input=sc.nextInt();
        if(input==1){
            this.Price=20;
            return this.SpecialPizza;
        } else if (input==2) {
            this.Price=10;
            return "Vegetarian";
        }else if (input==3){
            this.Price=15;
            return "Non-Vegetarian";
        } else if (input==4) {
            return "Thank you!";
        }else{
            return "INVALID";
        }
    }
    private int getPrice(){

         return this.Price;
    }
    public void toppings(){


        System.out.print("Each topping costs $2 extra\nSelect the toppings: \n1 Beans\n2 Corn\n3 Pineapple\n4 No toppings: ");

        do{
            System.out.println("Enter the topping: ");
            int input=sc.nextInt();
            if(input==1){
//                this.Price=this.Price+2;
                addOn=this.beans;
                System.out.println(addOn);
                topping.add(this.beans);
            }else if (input==2){
//                this.Price=this.Price+2;
                 addOn=this.corn;
                System.out.println(addOn);
                topping.add(this.corn);
            } else if (input==3) {
                topping.add(this.Pine);
                addOn=this.Pine;
            } else if (input==0)  {
                System.out.println("EXIT!");
                break;
            } else{
                System.out.println("No toppings");
                break;
            }
            System.out.println(topping);
            this.Price=this.Price+2;
        }while(1!=0);
    }
    public int setPayment(){
        System.out.print("Enter the amount: ");
        int Pay=sc.nextInt();
        this.Total=this.Price-Pay;
        return this.Total;
    }
    public String getOrder(){
        return "This is the pizza you have ordered: "+SetPizza()+"These are the toppings you have selected: "+ topping+"This is the total balance amount: $"+Total;
    }
}
