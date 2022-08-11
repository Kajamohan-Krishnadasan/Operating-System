/*
* LRU - Least Recently Used
* Author : Ibrahim S. (2018/E/045)
*/

package com.os.replacementalgorithm.Algorithms;
import java.util.*;

public class LRU_Function{
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> flag = new ArrayList<>();
    ArrayList<String> order = new ArrayList<>();
    
    public  int functionLRU(int frameSize, String pagesOrder){
        
        int pageLength = pagesOrder.length();
        ArrayList<String> PagesArr = new ArrayList<>(pageLength);
        
        for (int i = 0; i < pageLength; i++) {
            PagesArr.add(String.valueOf(pagesOrder.charAt(i)));
        }
        
        int pageFault = 0;
        
        for(String i : PagesArr){
            if(list.size() < frameSize){
                if(!list.contains(i) ){
                    list.add(i);
                    flag.add(0);
                    for(int j = 0; j < list.size(); j++){
                        flag.set(j, flag.get(j) + 1);
                    }
                    pageFault++;
                    
                }else{
                    order.add(list.toString());
                    flag.set(PagesArr.indexOf(i), 0);
                }
                
                order.add(list.toString());
            }else{
                
                if(!list.contains(i)){
                    int max = Collections.max(flag);
                    list.set(flag.indexOf(max), i);
                    flag.set(flag.indexOf(max), 0 );
                    order.add(list.toString());
                    pageFault++;
                }else{
                    flag.set(list.indexOf(i),0);
                    
                }
            }
        }
        return pageFault;
    }
    
    public ArrayList<String> getReplaceOrder(){
        return order;
    }    
    
}