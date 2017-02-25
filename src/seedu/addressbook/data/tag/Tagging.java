package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents the adding/deleting of a tag for a person that happened during the session.
 * An ArrayList of Tagging objects will be stored in AddressBook.
 */
public class Tagging {
    
    private static final String SPACE = " ";
    private Tag tag;
    private Person person;
    private Operation operation;
    
    private enum Operation {
        Add("+"), Delete("-");
        
        private String operator;
        
        private Operation(String operator) {
            this.operator = operator;
        }

        public String getOperator() {
            return this.operator;
        }       
    }

    public Tagging(Tag tag, Person person, Operation operation) {
        this.tag = tag;
        this.person = person;
        this.operation = operation;
    }

    /**
     * Returns the string in the format:
     * <operator> <name> [<tag>]
     * i.e. Robin Tan [ugly]
     */
    @Override
    public String toString() {
        return this.operation.getOperator() + SPACE + this.person.toString() + SPACE + tag.toString();
    }
}
