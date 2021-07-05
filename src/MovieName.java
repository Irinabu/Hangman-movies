import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class MovieName{
    public static String realName;
    public static String hiddenName;

    public static String setRealName(){
        String path = "src/movies.txt";
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

    public static String setHiddenName(String name) {

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                name = name.replace(ch, '_');

        }
        return name;
    }

    public MovieName()
    {
        realName = setRealName();
        hiddenName = setHiddenName(realName);

    }

    public static void main(String[] args) {

    }
}
