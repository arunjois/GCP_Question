import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.FileWrite;
import com.FileWrite.*;
public class Main {
    public static void main(String args[]) throws IOException  {
        ArrayList<Integer> cache = new ArrayList<Integer>();
        Random randomNumGenerator = new Random();
        while(cache.size()<120) {
            int randomInt = randomNumGenerator.nextInt(341);
            if (!cache.contains(randomInt)) {
                cache.add(randomInt);
            }
        }
        //cache.add(0);
        //cache.add(1);
        //cache.add(2);

        //System.out.println(cache.size());
        FileWrite f = new FileWrite();
        f.writeFile(cache);
        f.generateText();
        f.writeFileAns(cache);
    }
}
