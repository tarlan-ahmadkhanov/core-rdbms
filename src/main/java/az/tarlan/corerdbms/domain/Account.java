package az.tarlan.corerdbms.domain;

import az.tarlan.corerdbms.enums.Currency;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Account {

    @Id
    private String accountNumber;
    @NotNull
    @Size(min = 10, max = 10)
    private String customerId;
    @NotNull
    private Currency currency;
    @NotNull
    private BigDecimal balance;

    @NotNull
    private String cbarAccount;

    @NotNull
    private long tagId;
    @NotNull
    private LocalDate openingDate;

    public Account() {
    }


    public Account(String accountNumber, String customerId, Currency currency, BigDecimal balance, String cbarAccount, long tagId, LocalDate openingDate) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.currency = currency;
        this.balance = balance;
        this.cbarAccount = cbarAccount;
        this.tagId = tagId;
        this.openingDate = openingDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountNumber);
    }
}
