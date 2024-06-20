package com.neirous.project.bignumber.decimal;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        //高精度浮点数
        BigDecimal bigDecimal = new BigDecimal("2.35673657356634563456");
        BigDecimal bigDecimal1 = new BigDecimal("2.3356634563456");
        //除法可能抛出异常，因为除不尽会无限循环，在调用方法时指定精度就行，BigDecimal.ROUND_CEILING表示保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));
    }
}
