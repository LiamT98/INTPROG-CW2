package pizzaorderingsystemnetbeans;

import java.awt.*;
import java.util.*;

/**
 * Class to manage the pizza order.
 * @author yourStudentNumber
 */
public class OrderingSystem 
{
    private Canvas canvas;
    
    private ArrayList<Pizza> order = new ArrayList<>();
    
    /**
     * Constructor for the ordering system.
     */
    public OrderingSystem()
    {
        canvas = new Canvas("Pizza Ordering", 900, 650);         
    }
    
    /**
     * Method to draw the outline of the order screen.
     */
    public void drawOrderScreen()
    {
        canvas.setForegroundColor(Color.BLACK);
        // vertical dividers
        canvas.drawLine(300, 0, 300, 600);
        canvas.drawLine(600, 0, 600, 600);
        
        // halfway divider
        canvas.drawLine(0, 300, 900, 300);
        
        // total price line
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        canvas.drawString("Total Price of the Order: £0.00", 10, 640);
        
    }
    
    /**
     * Method to manage the ordering of the pizzas (once completed).
     */
    public void startOrdering()
    {
        int xPos = 0;
        int yPos = 0;
        int index = 0;
        
        System.out.println("Pizza Order:");

        while (true)
        {
            ValidateInput validate = new ValidateInput();
            UserInput input = validate;
            
            input.setPizzaSize();
            input.setPizzaCrust();
            input.setPizzaSauce();
            
            Pizza pizza = new Pizza(canvas, xPos, yPos, input.getPizzaSize(), input.getPizzaCrust(), input.getPizzaSauce());
            order.add(pizza); 
            
            KeyboardInput in = new KeyboardInput();
            System.out.println("Would you like to order another pizza?");
            String orderComplete = in.getInputString();
            if (orderComplete.equals("No") || orderComplete.equals("no") || orderComplete.equals("N") || orderComplete.equals("n"))
            {
                pizza.displayPizza();
                break;                
            }
            else
            {
                pizza.displayPizza();
                index++;
                xPos += 300;
                if (xPos > 600)
                {
                    xPos = 0;
                    yPos += 300;
                }
            }
        }      
    }
    
}
