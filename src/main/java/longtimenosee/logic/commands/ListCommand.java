package longtimenosee.logic.commands;

import static java.util.Objects.requireNonNull;
import static longtimenosee.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import longtimenosee.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "listContacts";

    public static final String MESSAGE_SUCCESS = "Listed all contacts";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS, false, true, false);
    }
}
