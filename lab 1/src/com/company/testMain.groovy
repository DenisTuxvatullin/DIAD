package com.company
import com.company.Distance
import org.junit.Test


/**
 * Created by Денис on 13.11.2018.
 */
class testMain {
    @Test
    void testMax_And_Min_Distance_Between_Words_Five() {
        String text = "Today is very good a sunny day"
        String word1 = "day"
        String word2 = "Today"
        Distance distance = Main.FindDistance(text, word1, word2)
        assert (distance.getMin() == 5)
        assert (distance.getMax() == 5)
    }

    @Test
    void Max_Distance_Equal_Twelve_And_Min_Distance_Equal_Five() {
        String text = "Today is very good a sunny day and tomorrow will be very good day too."
        String word1 = "day"
        String word2 = "Today"
        Distance distance = Main.FindDistance(text, word1, word2)
        assert (distance.getMin() == 5)
        assert (distance.getMax() == 12)
    }

    @Test
    void Max_Distance_Equal_Eleven_And_Min_Distance_Equal_Five() {
        String text = "Today is very good a sunny day and tomorrow will be very day too."
        String word1 = "day"
        String word2 = "Today"
        Distance distance = Main.FindDistance(text, word1, word2);
        assert (distance.getMin() == 5)
        assert (distance.getMax() == 11)
    }

    @Test
    void Max_Distance_Equal_Thirteen_And_Min_Distance_Equal_Five() {
        String text = "Today is very good a sunny day and tomorrow will be very good day day too."
        String word1 = "day"
        String word2 = "Today"
        Distance distance = Main.FindDistance(text, word1, word2)
        assert (distance.getMin() == 5)
        assert (distance.getMax() == 13)
    }
}
