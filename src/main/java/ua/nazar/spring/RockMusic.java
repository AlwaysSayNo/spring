package ua.nazar.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component()
public class RockMusic implements Music {
    ArrayList<String> songs = new ArrayList<>(Arrays.asList("RM_S1", "RM_S2", "RM_S3"));

/*    @Override
    public String getSong() {
        return "Wind cries Mary";
    }*/

    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        return songs.get(i);
    }
}
