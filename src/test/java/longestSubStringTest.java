/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LeetCode.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wa1
 */
public class longestSubStringTest {

    public longestSubStringTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void longestSubString() {
        assertEquals(3, Main.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, Main.lengthOfLongestSubstring("bbbbb"));
        assertEquals(0, Main.lengthOfLongestSubstring(""));
        assertEquals(1, Main.lengthOfLongestSubstring("a"));
        assertEquals(2, Main.lengthOfLongestSubstring("aab"));
    }

    @Test
    public void caseWhensubsequence() {
        assertEquals(3, Main.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, Main.lengthOfLongestSubstring("dvdf"));
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
