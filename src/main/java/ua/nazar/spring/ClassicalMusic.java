package ua.nazar.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    ArrayList<String> songs = new ArrayList<>(Arrays.asList("CM_S1", "CM_S2", "CM_S3"));

    private ClassicalMusic(){}

    @Override
    public String getSong(){
        Random random = new Random();
        int i = random.nextInt(3);
        return songs.get(i);
    }
}
