package com.neirous.project.cupnum;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        int nums = runtime.availableProcessors();
        System.out.println(nums);
    }
}
