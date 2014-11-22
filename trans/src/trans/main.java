package trans;

import Hex.hexInputor;
import Hex.hexdefine;
import Hex.hexprocess;
import Hex.hexvalidator;

public class main {
    
    public static void main(String[] args) {
        
        hexInputor oHexInputor = new hexInputor();
        String sInputString = oHexInputor.getInPutString();
        
        hexvalidator oHexValidator = new hexvalidator();
        
        if (oHexValidator.isHex(sInputString) == false) {
            return;
        }
        
        hexprocess oHex = new hexprocess();
        int iResult = oHex.main(sInputString);
        
        System.out.println(String.format("결과 : %d", iResult));
        
    }
    
}
