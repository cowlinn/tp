package seedu.address.logic.parser;

import seedu.address.logic.commands.ViewPinCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.PinnedPersonPredicate;

/**
 * parses the command to view pinned clients.
 */
public class ViewPinCommandParser {
    /**
     * Parses the viewPin in the context of the ViewPin Command
     * and returns a ViewPinCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public ViewPinCommand parse(String args) throws ParseException {
        return new ViewPinCommand(new PinnedPersonPredicate());
    }
}
