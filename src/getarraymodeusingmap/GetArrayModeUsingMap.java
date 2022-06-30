package getarraymodeusingmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetArrayModeUsingMap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int higestCount = 1;     
        Map<Integer, Integer> modeWithCount = new HashMap<Integer, Integer>();
        ArrayList<Integer> arrList = new ArrayList<>();
        
         for (int i = 0; i < arr.length; i++) {
            if (modeWithCount.containsKey(arr[i]))                
                modeWithCount.replace(arr[i], modeWithCount.get(arr[i]) + 1);
            else  
                modeWithCount.put(arr[i], 1);
        }
         
        Integer higestMode =  null;
        for (Map.Entry<Integer, Integer> currentKey : modeWithCount.entrySet()) {
            if (currentKey.getValue() > higestCount){
                higestMode = currentKey.getKey();
                higestCount++;
            }
        } 
        
        if(higestCount!=1)    
        for(Map.Entry<Integer, Integer> currentKey : modeWithCount.entrySet()){
             if (currentKey.getValue() == higestCount)
                arrList.add(currentKey.getKey());
        }
      
        System.out.println("array: "+Arrays.toString(arr));  
        if(higestCount==1)
            System.out.println("no modes");
        else if(arrList.size() == 1)
            System.out.println("mode: "+higestMode);
        else
            System.out.println("modes: "+Arrays.toString(arrList.toArray()));
        
    }
     /*code reserved 
        map.keySet().toArray()[index]
        System.out.println("value: "+i.getKey() + " Count: "+ i.getValue());
        System.out.println("map: "+modeWithCount.toString());
    */
}
