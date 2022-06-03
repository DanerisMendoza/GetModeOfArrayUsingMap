package getarraymodeusingmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetArrayModeUsingMap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,};
        int higestCount = 1,higestMode=0,key=0;
        ArrayList<Integer> modes = new ArrayList<Integer>();
        HashMap<Integer, Integer> modeWithCount = new HashMap<>();
         for (int i = 0; i <= arr.length-1; i++) {
            if (modeWithCount.containsKey(arr[i])) {            
                int c = modeWithCount.get(arr[i]);
                modeWithCount.replace(arr[i], c + 1);
            }
            else  
                modeWithCount.put(arr[i], 1);
        }
        for (Map.Entry<Integer, Integer> i : modeWithCount.entrySet()) {
            if (i.getValue() > higestCount){
                higestMode = i.getKey();
                higestCount++;       
                key = i.getKey();
            }                  
        } 
         modeWithCount.remove(key); 
        for (Map.Entry<Integer, Integer> i : modeWithCount.entrySet()) {
            if (i.getValue() == higestCount)
              modes.add(i.getKey());
        } 
        if(!modes.isEmpty())
        modes.add(higestMode);
        System.out.println("array: "+Arrays.toString(arr));    
        if(modes.isEmpty())
        System.out.println("Mode: "+higestMode);
        else if(higestCount == 1)
        System.out.println("no modes");
        else
        System.out.println("modes: "+modes.toString()); 
    }
     /*code reserved        
      System.out.println("value: "+i.getKey() + " Count: "+ i.getValue());
      System.out.println("map: "+modeWithCount.toString());
    */
}
