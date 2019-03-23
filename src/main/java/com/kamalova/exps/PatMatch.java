package com.kamalova.exps;

// https://www.exlab.net/files/tools/sheets/regexp/regexp.pdf


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatMatch {

    public static void main(String[] args) {

        String text = "Scala is scalable and cool";
        String pattern = "(a).*(?:a).*(a)"; // same: "(S|s)cala" not same "[Ss]cala"
        // in scala it's the same...

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println("Flags: " + p.flags());

        if (m.find()) { // without find - no results!
            System.out.println(m.groupCount());
            int size = m.groupCount();
            for (int i = 0; i <= size; i++) {
                System.out.println(m.group(i) + ",");
            }
        }

    }
}
