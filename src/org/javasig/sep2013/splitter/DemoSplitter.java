package org.javasig.sep2013.splitter;

/**
 * Created with IntelliJ IDEA.
 * User: mpredli01
 * Date: 9/9/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class DemoSplitter {

    public DemoSplitter() {
        }

    public Iterable<String> splitString01(String input) {
        Iterable<String> splitted = Splitter.on(' ').split(input);
        return splitted;
        }

    public Iterable<String> splitString02(String input) {
        Iterable<String> splitted = Splitter.fixedLength(3).split(input);
        return splitted;
        }

    public Iterable<String> splitString03(String input) {
        Iterable<String> splitted = Splitter.on(CharMatcher.DIGIT.negate())
            .trimResults()
            .omitEmptyStrings()
            .split(input);
        return splitted;
        }

    public static void main(String[] args) {
        String input01 = "Some very stupid data with ids of invoices like 121432, 3436534 and 8989898 inside";
        String input02 =
            "A  1  1  1  1\n" +
            "B  1  2  2  2\n" +
            "C  1  2  3  3\n" +
            "D  1  2  5  3\n" +
            "E  3  2  5  4\n" +
            "F  3  3  7  5\n" +
            "G  3  3  7  5\n" +
            "H  3  3  9  7";
        String input03 = "Some very stupid data with ids of invoices like 123231/fv/10/2010, 123231/fv/10/2010 and 123231/fv/10/2010";
        DemoSplitter demoSplitter = new DemoSplitter();
        System.out.println(demoSplitter.splitString01(input01));
        final Iterable<String> x = demoSplitter.splitString02(input02);
        System.out.println(x);
        System.out.println(demoSplitter.splitString03(input03));

        for(String s : x) {
            System.out.println("'" + s + "'");
            }
        }
    }
