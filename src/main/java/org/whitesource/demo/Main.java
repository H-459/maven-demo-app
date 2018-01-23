package org.whitesource.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author tom.shapira
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        String input = args[0];
        System.out.println(StringUtils.swapCase(input));
    }
}
