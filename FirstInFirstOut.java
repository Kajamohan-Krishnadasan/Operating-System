package com.os.replacementalgorithm;

public class FirstInFirstOut {
    public static void main(String[] args) {

        // Get input from gui and change input string
        String inputString = "70120304230321";

        // Get input from GUI and change number of frames
        int numberOfFrames = 3;
        int temp = 0;

        int[] frame = new int[numberOfFrames];
        int[] referenceNumber = new int[inputString.length()];
        int k = 0;
        int fault = 0;
        int i, j;

        for (i = 0; i < numberOfFrames; i++) {
            frame[i] = -1;
        }

        for (i = 0; i < inputString.length(); i++) {
            referenceNumber[i] = Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }

        // In this file i am printing results to console
        // you have to get output to GUI
        System.out.print("\nReference\t Frames");
        for (i = 0; i < referenceNumber.length; i++) {
            System.out.print("\n" + referenceNumber[i] + "\t\t\t");
            temp = 0;

            for (j = 0; j < numberOfFrames; j++) {
                if (frame[j] == referenceNumber[i]) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                frame[k] = referenceNumber[i];
                k = (k + 1) % numberOfFrames;
                fault++;
                for (j = 0; j < numberOfFrames; j++) {
                    System.out.print(frame[j] + "\t\t");
                }
            }
        }
        System.out.println("\nPage fault id: " + fault);
    }
}
