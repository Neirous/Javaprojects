package com.neirous.project.homework1.homework5;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //switch的括号中放入枚举对象，case放枚举值
        switch (green) {
            case RED:
                System.out.println("RED");
                break;
            case BLACK:
                break;
            case BLUE:
                break;
            case GREEN:
                break;
            case YELLOW:
                break;
        }
    }
}

enum Color implements Interface {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("Attribution:" + redValue + ',' + greenValue + ',' + blueValue);
    }
}