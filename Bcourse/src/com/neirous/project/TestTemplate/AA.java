package com.neirous.project.TestTemplate;

public class AA extends Template{

    @Override
    public void job(){

        int num = 0;
        for (int i = 0; i < 1000000000; i++) {
            num += i;
        }

    }
}
