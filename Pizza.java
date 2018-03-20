package pizzaorderingsystemnetbeans;

import java.awt.*;

/**
 * Class to represent a single pizza.
 * @author yourStudentNumber
 */
public class Pizza extends UserInput
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;
    
    protected String[] pizza_Info = new String[3];
    
    /**
     * Constructor for pizza.
     * @param win the window to draw the pizza on
     * @param startX the top-left x coordinate for the section of screen to draw pizza on
     * @param startY the top-left y coordinate for the section of screen to draw pizza on
     */
    public Pizza(Canvas win, double startX, double startY, String pizza_Size, String pizza_Crust, String pizza_Sauce)
    {    
        canvas = win;
        topLeftX = startX;
        topLeftY = startY;
        
        pizza_Info[0] = pizza_Size;
        pizza_Info[1] = pizza_Crust;
        pizza_Info[2] = pizza_Sauce;
    }
    
    /**
     * Method to display the pizza information on the screen.
     */
    public void displayPizza()
    {
        drawPizza();
        drawTopLine();
        drawBottomLine();
    }
    
    /**
     * Method to display the pizza on the screen.
     */
    private void drawPizza()
    {
        canvas.setForegroundColor(Color.YELLOW);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 200);
        
        Color col = null;
        if (pizza_Info[2].equals("Tomato"))
            col = Color.RED;
        else
            col = Color.ORANGE;
           
        canvas.setForegroundColor(col);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 170);
        
        canvas.setForegroundColor(Color.WHITE);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 150);
        
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen. 
     * This method will display the pizza number and size at the top of the 
     * screen (once completed)
     */
    private void drawTopLine()
    {
        String topLine = "Pizza";
                
        double stringX = topLeftX+10;
        double stringY = topLeftY + 25;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(topLine, stringX, stringY);
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen.  
     * This method will display the type of crust and sauce ordered (once 
     * completed)
     */
    private void drawBottomLine()
    {
        String bottomLine = "Crust: ";
                
        double stringX = topLeftX+10;
        double stringY = topLeftY + 290;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(bottomLine, stringX, stringY);
    }
        
}
