package com.softserve.code.quality;

import java.util.regex.Matcher;

public class Test1 {

    public static void main(String[] args) {
        Matcher matcher = headerPattern.matcher(line);
        if (matcher.find()) {
            headers.put(matcher.group(1).toLowerCase(), matcher.group(2));
        }
    }
}
