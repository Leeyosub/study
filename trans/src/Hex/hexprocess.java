package Hex;

import java.util.HashMap;

public class hexprocess extends abstracthex
{
    public int main(String sInputValue)
    {
        int iResult = 0;
        
        for (int iInputIndex = 0; iInputIndex < sInputValue.length(); iInputIndex++)
        {
            int iTransValue = transStringToInt(sInputValue.charAt(iInputIndex));
            int iStringPosition = getDisitPosition(sInputValue.length(), iInputIndex);
            
            iResult += caculateHex(iTransValue, iStringPosition);
        }
        
        return iResult;
        
    }
    /*
     * 
     */
    private int getDisitPosition(int iStringFullLength, int iCurrentPosition)
    {
        return iStringFullLength - iCurrentPosition - 1;
    }
    
    private int transStringToInt(char iChar)
    {
        HashMap <Character, Integer> oMapper = getMapperData();
        if (Character.isDigit(iChar) == true) {
            return Character.getNumericValue(iChar);
        }
        
        return oMapper.get(iChar).intValue();
        
    }

    private int caculateHex(int iTransLateValue, int iStringPosition)
    {
        return iTransLateValue * (int)Math.pow(hexdefine.NUMBERPOW, iStringPosition);
    }
    
    
    
}
