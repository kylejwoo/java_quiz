import jdk.nashorn.internal.parser.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kyle on 8/5/16.
 */
public class simple_quiz {

    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("src/main/resources/Words.txt")
            );
            String line = reader.readLine();
            line=reader.readLine();
            while(line!=null){
                String word = line.substring(0, line.indexOf(":"));
                String def = line.substring(line.indexOf(":") + 1);
                Scanner scan = new Scanner(System.in);
                line=reader.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
