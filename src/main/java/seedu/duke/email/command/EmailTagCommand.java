package seedu.duke.email.command;

import seedu.duke.common.command.Command;
import seedu.duke.common.model.Model;
import seedu.duke.email.EmailList;
import seedu.duke.ui.UI;

import java.util.ArrayList;

/**
 * Command to add tags to emails.
 */
public class EmailTagCommand extends Command {
    private int index;
    private ArrayList<String> tags;

    /**
     * Instantiates attributes for command.
     *
     * @param index specific email which tags should be added to
     * @param tags  tags to be added to the email
     */
    public EmailTagCommand(int index, ArrayList<String> tags) {
        this.index = index;
        this.tags = tags;
    }

    @Override
    public boolean execute(Model model) {
        EmailList emailList = model.getEmailList();
        responseMsg = emailList.addTags(index, tags);
        UI.getInstance().showResponse(responseMsg);
        return true;
    }
}
