/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystemnetbeans;

import java.awt.*;

/**
 *
 * @author Liam
 */
public class UserInput{
    
    protected String[] options;
    protected int size;
    protected int crust;
    protected int sauce;
    
    public UserInput()
    {
       options = new String[3];
    }
    public void setPizzaSize()
    {
        KeyboardInput in = new KeyboardInput();
        System.out.println("When selecting your options use the number assigned to your choice.");
        System.out.println("Select the size of pizza:\n(1)Small\n(2)Medium\n(3)Large");
        size = in.getInputInteger();
    }
    public String getPizzaSize()
    {
        return options[0];
    }
    public void setPizzaCrust()
    {
        KeyboardInput in = new KeyboardInput();
        System.out.println("When selecting your options use the number assigned to your choice.");
        System.out.println("Select base/crust:\n(1)Deep Pan\n(2)Thin Crust\n(3)Stuffed Crust");
        crust = in.getInputInteger();
    }
    public String getPizzaCrust()
    {
        return options[1];
    }
    public void setPizzaSauce()
    {
        KeyboardInput in = new KeyboardInput();
        System.out.println("When selecting your options use the number assigned to your choice.");
        System.out.println("Select sauce:\n(1)Tomato\n(2)BBQ");
        sauce = in.getInputInteger();
    }
    public String getPizzaSauce()
    {
        return options[2];
    }

    
 }
