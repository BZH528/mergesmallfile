package com.run;

import com.runone.MergeFile;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class TestMerge {
    MergeFile mergeFile;

    @Before
//    public void setup() {
//        mergeFile = new MergeFile();
//    }


    @Test
    public void testList() {
        mergeFile.run();
    }

    @Test
    public void testRandom(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(900)+10011);
        }
    }
}
