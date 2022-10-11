package seedu.address.model.client;

import java.util.Objects;
import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;

//import statement for policies?



/**
 * Main client class.
 */

public class Client extends Person {

    //private ArrayList<Policy> policies;
    private Birthday birthday; //TODO: Birthday class
    //private ArrayList<Event> events; // TODO: EventList class
    //private PersonNotes notes; //TODO: Just a string
    private Income income; //TODO: Just a float
    private RiskAppetite ra; //TODO Enum
    //The age is obtained from birthday


    /**
     * Encapsulation of a Client class
     * @param name
     * @param phone
     * @param email
     * @param address
     * @param tag
     * @param birthday
     * @param income
     * @param ra
     */
    public Client(Name name, Phone phone, Email email, Address address, Set<Tag> tag,
                  Birthday birthday, Income income, RiskAppetite ra) {
        super(name, phone, email, address, tag);
        this.birthday = birthday;
        this.income = income;
        this.ra = ra;
    }



    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Client)) {
            return false;
        }

        Client otherClient = (Client) other;
        return otherClient.getName().equals(getName())
                && otherClient.getPhone().equals(getPhone())
                && otherClient.getEmail().equals(getEmail())
                && otherClient.getAddress().equals(getAddress())
                && otherClient.getTags().equals(getTags())
                && otherClient.getBirthday().equals(getBirthday())
                && otherClient.getRiskAppetite().equals(getRiskAppetite())
                && otherClient.getIncome().equals(getIncome());
        //TODO: Add the remaining equals!
    }

    public Birthday getBirthday() {
        return this.birthday;
    }

    public RiskAppetite getRiskAppetite() {
        return this.ra;
    }

    public Income getIncome() {
        return this.income;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()) //tag on previous stuff
                .append(", Birthday: ")
                .append(getBirthday())
                .append(", Income: ")
                .append(getIncome())
                .append(", RiskLevel: ")
                .append(getRiskAppetite());
        return sb.toString();
    }

    /**
     * Returns true if both clients have the same name.
     * This defines a weaker notion of equality between two clients.
     */
    public boolean isSameClient(Client otherClient) {
        if (otherClient == this) {
            return true;
        }

        return otherClient != null
                && otherClient.getName().equals(getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhone(), this.getEmail(), this.getAddress(), this.getTags(),
                this.getBirthday(), this.getIncome(), this.getRiskAppetite());
    }
}
