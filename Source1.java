
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;
 
/**
 *
 * @author clarklv
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Source1{
 
public static void main(String[] args) {
String  input;
int quantity = 0;
double retailPrice = 99;
double discountPerc = 0.0, purchaseCost = 0.0, totalDiscount = 0.0, totalCost = 0.0; 
 
 
 
purchaseCost = quantity * 99;
totalDiscount = purchaseCost * discountPerc;
totalCost = purchaseCost - totalDiscount;
 
 
//Ask user for inputs
 
input = JOptionPane.showInputDialog("Enter the quantity purchased: ");
score = double(input);
 
//if/else statements
 
if (quantity >= 10 && quantity <= 19)
{ 
 
 
discountPerc = 0.8;
 
System.out.println("Discount is 20%");
}
 
else if (quantity >= 20 && quantity <=49)
{
 
discountPerc = 0.7;
 
System.out.println ("Discount is 30%");
}
 
else if (quantity >= 50 && quantity <= 99)
{
 
discountPerc = 0.6;
 
System.out.println ("Discount is 40%");
}
 
else if (quantity >= 100)
{
 
discountPerc = 0.5;
 
System.out.println ("Discount is 50%");
}
 
else if (quantity >0 && quantity <= 9)
{
 
discountPerc = 0.0; 
 
System.out.println ("No discount for purchases");
}
 
else if (quantity <0)
{
System.out.println ("You entered an invalid number"); 
 
 
System.out.println ("The total discount amount is: $" + totalDiscount +
"\nThe purchase amount after the discount is: $" + totalCost);
 
}
 
}
 
} 
