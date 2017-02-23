package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
/**
 * Represents a particular contact element from a person.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Contact {
    
    public String value;
    protected boolean isPrivate;

    public Contact(String value, boolean isPrivate, String messageConstraints, String validationRegex)
            throws IllegalValueException {
        String trimmedValue = value.trim();
        this.isPrivate = isPrivate;
        if (!isValidValue(trimmedValue, validationRegex)) {
            throw new IllegalValueException(messageConstraints);
        }
        this.value = trimmedValue;
    }
    
    /**
     * Returns true if a given string is a valid contact information.
     */
    public static boolean isValidValue(String test, String regex) {
        return test.matches(regex);
    }

    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    /*
     * Returns if the contact element is private.
     */
    public boolean isPrivate() {
        return isPrivate;
    }

}
