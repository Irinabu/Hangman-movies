import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MovieName {
    private static String getRandomLine(String path){
        List<String> lines;
        try
        {
            lines = Files.readAllLines(Paths.get(path));
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }

        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));

    }

    public static void main(String[] args){
        String path =  "src/movies.txt";
        String randomLine = getRandomLine(path);
        System.out.println("Random line :" + randomLine);


    }
}
