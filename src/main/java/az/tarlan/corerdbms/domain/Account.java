package az.tarlan.corerdbms.domain;

import az.tarlan.corerdbms.enums.Currency;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Account {

    @Id
    private String account_number;
    @NotNull
    private long customer_id;
    @NotNull
    private Currency currency;
    @NotNull
    private BigDecimal balance;

    @NotNull
    private String cbarAccount;

    @NotNull
    private long tag_id;
    @NotNull
    private LocalDate opening_date;

    public Account() {
    }


    public Account(String account_number, long customer_id, Currency currency, BigDecimal balance, String cbarAccount, long tag_id, LocalDate opening_date) {
        this.account_number = account_number;
        this.customer_id = customer_id;
        this.currency = currency;
        this.balance = balance;
        this.cbarAccount = cbarAccount;
        this.tag_id = tag_id;
        this.opening_date = opening_date;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCbarAccount() {
        return cbarAccount;
    }

    public void setCbarAccount(String cbarAccount) {
        this.cbarAccount = cbarAccount;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    public LocalDate getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(LocalDate opening_date) {
        this.opening_date = opening_date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;
        return Objects.equals(account_number, account.account_number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(account_number);
    }
}
