package com.vityur;

import java.util.Collection;
import java.util.Random;

public class Utils {
    public static Object popRandomObject(Collection from) {
        Random rnd = new Random();
        int i = rnd.nextInt(from.size());

        Object temp = from.toArray()[i];
        from.remove(temp);

        return temp;
    }
}
