import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest{
    palindrome palindrome1;
    @Before
    public void setUp() throws Exception {
        palindrome1 = new palindrome();
    }

    @After    @Test

    public void checkForValidInput(){

        //arrange

        boolean expected = true;

        //act

        boolean result = palindrome1.isPalindrome("nitin");

        //assert

        assertEquals(expected,result);

    }

    public void tearDown() throws Exception {
        palindrome1 = new palindrome();
    }

    @Test
    public void checkForEmptyString(){

        //arrange

        boolean expected = true;

        //act

        boolean result = palindrome1.isPalindrome("");

        //assert

        assertEquals(expected,result);

    }



    @Test

    public void checkForNull() {

        //arrange

        Boolean expected = null;

        //act

        Boolean result = palindrome1.isPalindrome(null);

        //assert

        assertEquals(expected, result);

    }


}