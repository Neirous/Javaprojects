package com.neirous.project.homework1.homework3;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Person person = new Person("tangseng",new Boat());
        person.common();
        person.river();
    }
}
