package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<String> {
    @Override
    public boolean add(String s) {
        if (!this.contains(s)) {
            return super.add(s);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }
}
