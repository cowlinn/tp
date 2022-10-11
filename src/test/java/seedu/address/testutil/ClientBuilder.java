package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.client.Birthday;
import seedu.address.model.client.Client;
import seedu.address.model.client.Income;
import seedu.address.model.client.RiskAppetite;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Client objects.
 */
public class ClientBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_BIRTHDAY = "2016-06-06";
    public static final String DEFAULT_INCOME = "1000.00";
    public static final String DEFAULT_RISK_APPETITE = "M";



    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Set<Tag> tags;
    private Birthday birthday;
    private Income income;
    private RiskAppetite riskAppetite;

    /**
     * Creates a {@code ClientBuilder} with the default details.
     */
    public ClientBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();
        birthday = new Birthday(DEFAULT_BIRTHDAY);
        income = new Income(DEFAULT_INCOME);
        riskAppetite = new RiskAppetite(DEFAULT_RISK_APPETITE);

    }

    /**
     * Initializes the ClientBuilder with the data of {@code clientToCopy}.
     */
    public ClientBuilder(Client clientToCopy) {
        name = clientToCopy.getName();
        phone = clientToCopy.getPhone();
        email = clientToCopy.getEmail();
        address = clientToCopy.getAddress();
        tags = new HashSet<>(clientToCopy.getTags());
        birthday = clientToCopy.getBirthday();
        income = clientToCopy.getIncome();
        riskAppetite = clientToCopy.getRiskAppetite();
    }

    /**
     * Sets the {@code Name} of the {@code Client} that we are building.
     */
    public ClientBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Client} that we are building.
     */
    public ClientBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Client} that we are building.
     */
    public ClientBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Client} that we are building.
     */
    public ClientBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Client} that we are building.
     */
    public ClientBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Birthday} of the {@code Client} that we are building.
     */

    public ClientBuilder withBirthday(String birthday) {
        this.birthday = new Birthday(birthday);
        return this;
    }

    /**
     * Sets the {@code Birthday} of the {@code Client} that we are building.
     */

    public ClientBuilder withIncome(String income) {
        this.income = new Income(income);
        return this;
    }

    /**
     * Sets the {@code RiskAppetite} of the {@code Client} that we are building.
     */

    public ClientBuilder withRiskAppetite(String ra) {
        this.riskAppetite = new RiskAppetite(ra);
        return this;
    }

    /**
     * Main builds a copy of the current client stored.
     * @return
     */

    public Client build() {
        return new Client(name, phone, email, address, tags, birthday,
        income, riskAppetite);
    }

}
