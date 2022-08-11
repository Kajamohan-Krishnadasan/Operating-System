
/*
* FIFO - First In First Out
* Author : ARSHATH J.M. (2018/E/012)
*/

package com.os.replacementalgorithm.Algorithms;
import java.util.ArrayList;

public class FIFO_function {
    int pageFault;
    ArrayList returnList;
    ArrayList tempList;
    public int functionFIFO(int frameSize, String pageOrder) {

        returnList = new ArrayList();
         tempList = new ArrayList();
        // Get input from gui and change input string
        String inputString = pageOrder;

        // Get input from GUI and change number of frames
        int numberOfFrames = frameSize;
        int temp = 0;

        int[] frame = new int[numberOfFrames];
        String [] frame2 = new String[numberOfFrames];
        int[] referenceNumber = new int[inputString.length()];
        int k = 0;
        int fault = 0;
        int i, j;

        for (i = 0; i < numberOfFrames; i++) {
            frame[i] = -1;
            frame2[i] = "X";
        }

        for (i = 0; i < inputString.length(); i++) {
            referenceNumber[i] = Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }

        // In this file i am printing results to console
        // you have to get output to GUI
//        System.out.print("\nReference\t Frames");
        for (i = 0; i < referenceNumber.length; i++) {
//            System.out.print("\n" + referenceNumber[i] + "\t\t\t");
            temp = 0;

            for (j = 0; j < numberOfFrames; j++) {
                if (frame[j] == referenceNumber[i]) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                
                frame[k] = referenceNumber[i];
                frame2[k] = String.valueOf(referenceNumber[i]);
                k = (k + 1) % numberOfFrames;
                fault++;
                for (j = 0; j < numberOfFrames; j++) {
                    if(frame2[j].contains("X"))
                        continue;
                    tempList.add(frame2[j]);
                    
                }
                returnList.add(tempList.toString());
                tempList.clear();
            }else{
                for (j = 0; j < numberOfFrames; j++) {
                    if(frame2[j].contains("X"))
                        continue;
                    tempList.add(frame2[j]);
                    
                }
                returnList.add(tempList.toString());
                tempList.clear();
            }
        }
        //System.out.println("\nPage fault id: " + fault);
        pageFault = fault;
        
        return pageFault;
    }
//    public static void main(String[] args) {
//        functionFIFO(4,"252156226");
//    }
//    
    public ArrayList<String> getReplaceOrder(){
        return this.returnList;
    }
}
