//: io/BasicFileOutput.java
package com.wsn.chapter18javaio;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        LineNumberReader in = new LineNumberReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
        System.out.println("begin:"+ System.currentTimeMillis());
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(lineCount++ + ": " + s);
            out.println(in.getLineNumber() + ": " + s);
        }
        out.close();
        System.out.println("end  :"+ System.currentTimeMillis());
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
} /* (Execute to see output) *///:~
