package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    
    @Test
    public void isSimilar() throws IllegalValueException {
        
        // the other name is null
        Name testName = new Name("Robin Loh");
        assertFalse(testName.isSimilar(null));
    }
}
