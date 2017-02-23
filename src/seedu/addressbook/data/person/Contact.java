package seedu.addressbook.data.person;

/**
 * Represents a particular contact element from a person.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Contact {
    
    public String value;
    protected boolean isPrivate;
    
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
