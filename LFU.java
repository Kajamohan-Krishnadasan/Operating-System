package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class LFU {
    public static int functionLFU(int frameSize, String pagesOrder){
        String[]  arrayOfPages= pagesOrder.split(" "); //split and add all pages
        ArrayList<String> buffer = new ArrayList<>(); //create
        ArrayList<Integer> bufferTime=new ArrayList<>();
        HashMap<String, Integer> pageCount = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();
        int pageFault=0;
        for (String e:arrayOfPages) { //passing all pages
            if(pageCount.containsKey(e)){
                pageCount.replace(e,pageCount.get(e)+1);
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
                    int tempCount=Integer.MAX_VALUE;
                    for (String f:buffer) {
                        if(pageCount.get(f)< tempCount){
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
        for (String k:order) {
            System.out.println(k);
        }
        return pageFault;
    }
    public static void main(String[]args){
        String t="5 0 1 2 0 3 2 0 3 4 1 0 5 0 4 3 2 1 2 0 1";
        System.out.println(functionLFU(3,t));
    }
}
