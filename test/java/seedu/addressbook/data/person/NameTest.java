package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    
    @Test
    public void isSimilar() throws IllegalValueException {
        
        Name testName = new Name("Robin Hood Loh");
        
        // the other name is null
        assertFalse(testName.isSimilar(null));
        
        // the other name is different by upper/lower case.
        assertTrue(testName.isSimilar(new Name("RoBIn HooD LOh")));
        
        // the other name is different in ordering of the words.
        assertTrue(testName.isSimilar(new Name("Loh Hood Robin")));
        
        // the other name is a subset
        assertTrue(testName.isSimilar(new Name("Robin Loh")));
        
        // the other name is a superset
        assertTrue(testName.isSimilar(new Name("Loh Zi Bin Robin Hood")));
    }
}
