package org.example.Java_Test.util;

import net.bytebuddy.matcher.ElementMatcher;
import org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import static org.junit.Assert.*;

public class DateUtilLeapYearShould {
    /*
    All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
    All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
    All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)
    */


}