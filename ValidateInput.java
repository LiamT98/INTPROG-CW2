/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystemnetbeans;

/**
 *
 * @author Liam
 */
public class ValidateInput extends UserInput{
    
    public ValidateInput()
        {
            
        }

    @Override
    public void setPizzaSize()
    {
        OUTER:
        while (true) {
            super.setPizzaSize();
            if (size == 1 || size == 2 || size == 3) {
                switch (size) {
                    case 1:
                        options[0] = "Small";
                        break OUTER;
                    case 2:
                        options[0] = "Medium";
                        break OUTER;
                    case 3:
                        options[0] = "Large";
                        break OUTER;
                    default:
                        break;
                }
            } 
            else {
                System.out.println("Invalid input, please enter 1, 2, or 3 for selection.");
            }
        }
    }
    public void setPizzaCrust()
    {
        OUTER:
        while (true) {
            super.setPizzaCrust();
            if (crust == 1 || crust == 2 || crust == 3) {
                switch (size) {
                    case 1:
                        options[1] = "Deep Pan";
                        break OUTER;
                    case 2:
                        options[1] = "Thin Crust";
                        break OUTER;
                    case 3:
                        options[1] = "Stuffed Crust";
                        break OUTER;
                    default:
                        break;
                }
            } else {
                System.out.println("Invalid input, please enter 1, 2, or 3 for selection.");
            }
        }
    }
    public void setPizzaSauce()
    {
        OUTER:
        while (true) {
            super.setPizzaSauce();
            if (sauce == 1 || sauce == 2) {
                switch (sauce) {
                    case 1:
                        options[2] = "Tomato";
                        break OUTER;
                    case 2:
                        options[2] = "BBQ";
                        break OUTER;
                    default:
                        break;
                }
            } else {
                System.out.println("Invalid input, please enter 1 or 2 for selection.");
            }
        }
    }

}
