/*
* MFU - Most Frequently Used
* Author : NAIF M.N.M (2018/E/082)
*/

package com.os.replacementalgorithm.Algorithms;
import java.util.ArrayList;
import java.util.HashMap;

public class MFU_function {
    ArrayList<String> buffer = new ArrayList<>();
    ArrayList<Integer> bufferTime = new ArrayList<>();
    HashMap<String, Integer> pageCount = new HashMap<>();
    ArrayList<String> order = new ArrayList<>();
        
    public int functionMFU(int frameSize, String pagesOrder){
        
//        String[]  arrayOfPages = pagesOrder.split(" ");
        int pageLength = pagesOrder.length();
        String arrayOfPages[] = new String[pageLength];
        
        for (int i = 0; i < pageLength; i++) {
            arrayOfPages[i] = String.valueOf(pagesOrder.charAt(i));
        }
        
        int pageFault = 0;
        
        for (String e:arrayOfPages) {
            if(pageCount.containsKey(e)){
                pageCount.replace(e, pageCount.get(e)+1);
            }
            else{
                pageCount.put(e,1);
            }
            if(buffer.size()<frameSize){
                if(buffer.contains(e)){
                    for (int j=0;j<bufferTime.size();j++) {
                        bufferTime.set(j,bufferTime.get(j)+1);
                    }
                    order.add(buffer.toString());
                    continue;
                }
                else{
                    buffer.add(e);
                    bufferTime.add(0);
                    for (int j=0;j<bufferTime.size();j++) {
                        bufferTime.set(j,bufferTime.get(j)+1);
                    }
                    pageFault++;
                }
            }
            else {
                if(buffer.contains(e)){
                    for (int j=0;j<bufferTime.size();j++) {
                        bufferTime.set(j,bufferTime.get(j)+1);
                    }
                    order.add(buffer.toString());
                    continue;
                }
                else{
                    String temp=new String();
                    int tempCount=0;
                    for (String f:buffer) {
                        if(pageCount.get(f)>tempCount){
                            temp=f;
                            tempCount=pageCount.get(f);
                        }
                        else if(pageCount.get(f)==tempCount){
                            if(bufferTime.get(buffer.indexOf(temp))<bufferTime.get(buffer.indexOf(f))){
                                temp=f;
                            }
                        }
                    }
                    bufferTime.set(buffer.indexOf(temp),0);
                    buffer.set(buffer.indexOf(temp),e);
                    pageCount.replace(temp,0);
                    for (int j=0;j<bufferTime.size();j++) {
                        bufferTime.set(j,bufferTime.get(j)+1);
                    }
                    pageFault++;
                }
            }
            order.add(buffer.toString());
        }

        return pageFault;
    }
    
    public ArrayList<String> getReplaceOrder(){
        return order;
    }
    
}
