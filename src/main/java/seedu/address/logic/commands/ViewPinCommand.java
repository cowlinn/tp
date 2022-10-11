
package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.PinnedPersonPredicate;


/**
 * Lists all persons pinned to the user.
 */
public class ViewPinCommand extends Command {

    public static final String COMMAND_WORD = "viewPin";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": pins the person to start of list\n"
            + "Parameters: INDEX...\n"
            + "Example: " + COMMAND_WORD + "Alice";

    private final PinnedPersonPredicate predicate;

    public ViewPinCommand(PinnedPersonPredicate p) {
        this.predicate = p;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.updateFilteredPersonList(predicate);
        return new CommandResult(
                String.format(Messages.MESSAGE_PERSONS_LISTED_OVERVIEW, model.getFilteredPersonList().size()));
    }
}
