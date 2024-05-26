

package com.ian.divide_by_zero;

/**
 *
 * @author Ian Tagano
 */
public class Divide_by_Zero 
{

    public static void main(String[] args) 
    {
        try
        {
            //this block will might throw an exception
            int result = 10/0;
        }
        catch (ArithmeticException sample)
        {
            //handling the exception
            System.out.println("An error occured: " + sample.getMessage());
        }
        finally
        {
            //this block will run regardless whether there is an exception or not
            System.out.println("This is the finally block");
        }
    }
}
