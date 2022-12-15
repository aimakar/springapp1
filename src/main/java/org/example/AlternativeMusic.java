package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternativeMusic implements Music{
    @Override
    public String getSong() {
        return "Иди за второй!";
    }

    @Override
    public List getList() {
        return new ArrayList(Arrays.asList("","",""));
    }
}
