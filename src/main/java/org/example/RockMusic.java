package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "We Will Remember";
    }

    @Override
    public List getList() {
        return new ArrayList(Arrays.asList("Hightway to Hell","Smoke on water","Yesterday"));
    }
}
