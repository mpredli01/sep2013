package org.javasig.sep2013.charmatcher;

/**
 * Created with IntelliJ IDEA.
 * User: mpredli01
 * Date: 9/7/13
 * Time: 6:53 PM
 * To change this template use File | Settings | File Templates.
 */

import com.google.common.base.CharMatcher;

public class DemoCharMatcher {

    public DemoCharMatcher() {
        }

    public String getString01(String input) {
        CharMatcher charMatcher = CharMatcher.DIGIT.or(CharMatcher.is('/'));
        return charMatcher.retainFrom(input);
        }

    public String getString02(String input) {
        CharMatcher charMatcher = CharMatcher.JAVA_LOWER_CASE.or(CharMatcher.WHITESPACE).negate();
        return charMatcher.retainFrom(input);
        }

    public String getString03(String input) {
        CharMatcher charMatcher = CharMatcher.inRange('m','s').or(CharMatcher.is('!').or(CharMatcher.WHITESPACE));
        return charMatcher.retainFrom(input);
    }

    public static void main(String[] args) {
        final String input01 = "Mike's birthday is 11/01/1961";
        final String input02 = "DO NOT pass on the right!";

        DemoCharMatcher demoCharMatcher = new DemoCharMatcher();
        System.out.println(demoCharMatcher.getString01(input01));
        System.out.println(demoCharMatcher.getString02(input02));
        System.out.println(demoCharMatcher.getString03(input02));
        }
    }
