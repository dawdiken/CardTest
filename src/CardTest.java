import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {
    private Card c1;

    @Before
    public void setUp(){
        c1 = new Card(1,0);
    }

    @Test
    public void testGetSuitAsNumber(){
        Card c1 = new Card(1,0);
        c1.getSuit();
        System.out.println(c1.getSuit());
        //assertTrue("Suit is spades", c1.getSuit());
        assertTrue(c1.getSuit() == 0);
    }

    @Test
    public void testGetSuitAsString(){
        Card c1 = new Card(1,0);
        Card c2 = new Card(1,1);
        Card c3 = new Card(1,2);
        Card c4 = new Card(1,3);
        Card c5 = new Card(1,4);

        assertTrue(c1.getSuitAsString().equals("Spades"));
        assertTrue(c2.getSuitAsString().equals("Hearts"));
        assertTrue(c3.getSuitAsString().equals("Diamonds"));
        assertTrue(c4.getSuitAsString().equals("Clubs"));
        assertTrue(c5.getSuitAsString().equals("??"));
    }

    @Test
    public void testGetValue(){
        Card c1 = new Card(2,0);
        //assertTrue("Suit is spades", c1.getSuit());
        assertTrue(c1.getValue() == 2);
    }

    @Test
    public void testAllGetValueAsString(){
        Card c1 = new Card(1,0);
        Card c2 = new Card(2,0);
        Card c3 = new Card(3,0);
        Card c4 = new Card(4,0);
        Card c5 = new Card(5,0);
        Card c6 = new Card(6,0);
        Card c7 = new Card(7,0);
        Card c8 = new Card(8,0);
        Card c9 = new Card(9,0);
        Card c10 = new Card(10,0);
        Card c11 = new Card(11,0);
        Card c12 = new Card(12,0);
        Card c13 = new Card(13,0);
        Card c14 = new Card(14,0);

        assertTrue(c1.getValueAsString().equals("Ace"));
        assertTrue(c2.getValueAsString().equals("2"));
        assertTrue(c3.getValueAsString().equals("3"));
        assertTrue(c4.getValueAsString().equals("4"));
        assertTrue(c5.getValueAsString().equals("5"));
        assertTrue(c6.getValueAsString().equals("6"));
        assertTrue(c7.getValueAsString().equals("7"));
        assertTrue(c8.getValueAsString().equals("8"));
        assertTrue(c9.getValueAsString().equals("9"));
        assertTrue(c10.getValueAsString().equals("10"));
        assertTrue(c11.getValueAsString().equals("Jack"));
        assertTrue(c12.getValueAsString().equals("Queen"));
        assertTrue(c13.getValueAsString().equals("King"));
        assertTrue(c14.getValueAsString().equals("??"));
    }

    @Test
    public void testCardToString(){
        Card c1 = new Card(2,0);
        //assertTrue("Suit is spades", c1.getSuit());
        assertTrue(c1.toString().equals("2 of Spades"));
    }
}

