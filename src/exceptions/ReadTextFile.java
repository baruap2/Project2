package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("C:\\Users\\barua\\Desktop\\test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            br = new BufferedReader(fr);
            String str = " ";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //NOW GOTTA CLOSE THE FILE W/ FINALLY
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e)  {
                    e.printStackTrace();
                }
            }


        }
    }}