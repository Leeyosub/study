package Hex;

import java.util.HashMap;

abstract class abstracthex {
    private HashMap<Character, Integer> oMapper = new HashMap();
    
    private void setgetMapperData()
    {
        oMapper.put('A', 10);
        oMapper.put('B', 11);
        oMapper.put('C', 12);
        oMapper.put('D', 13);
        oMapper.put('E', 14);
        oMapper.put('F', 15);
    }
    
    protected HashMap<Character, Integer> getMapperData()
    {
        
        if (oMapper.isEmpty() == true) {
            setgetMapperData();
        }
        
        return oMapper;
    }
}
