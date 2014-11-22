package Hex;

import java.util.Scanner;

public class hexInputor extends abstracthex{
    
    public String getInPutString()
    {
        getIntroMsg();
        return new Scanner(System.in).next();
    }
    
    private void getIntroMsg()
    {
        System.out.println("문자열을 임력해주세요");
    }
    
}
