package Hex;

public class hexvalidator extends abstracthex
{
    
    public Boolean isHex(String sInputValue)
    {
        if (sInputValue.matches("^([0-9]|[A-F])+$") == false)
        {
            System.out.println("NotValid String");
            return false;
        }
        
        return true;
    }
    
}
