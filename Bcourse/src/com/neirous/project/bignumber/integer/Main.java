package com.neirous.project.bignumber.integer;

import java.math.BigInteger;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("546902348590689034586934");
        BigInteger bigInteger1 = new BigInteger("1546348590689034586934");
        //加减乘除需要使用相应的方法，不能直接计算
        System.out.println(bigInteger.divide(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.add(bigInteger1));
    }
}
