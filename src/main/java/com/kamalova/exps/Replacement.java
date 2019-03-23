package com.kamalova.exps;

public class Replacement {

    public static void main(String[] args) {
        String phone = "+77777777777";

        String result = phone.replaceFirst("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5");

        System.out.println(result);
    }

}
