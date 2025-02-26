package az.tarlan.corerdbms.domain;

import az.tarlan.corerdbms.enums.AccountType;
import az.tarlan.corerdbms.enums.CbarAccountStatuses;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class CbarAccount {

    @Id
    private String cbarAccountNumber;
    @NotNull
    @Size(max = 255)
    private String accountDescription;
    @NotNull
    private AccountType accountType;
    @NotNull
    private CbarAccountStatuses accountStatus;

    public CbarAccount() {
    }

    public CbarAccount(String cbarAccountNumber, String accountDescription, AccountType accountType, CbarAccountStatuses accountStatus) {
        this.cbarAccountNumber = cbarAccountNumber;
        this.accountDescription = accountDescription;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
    }

    public String getCbarAccountNumber() {
        return cbarAccountNumber;
    }

    public void setCbarAccountNumber(String cbarAccountNumber) {
        this.cbarAccountNumber = cbarAccountNumber;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public CbarAccountStatuses getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(CbarAccountStatuses accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CbarAccount that = (CbarAccount) o;
        return Objects.equals(cbarAccountNumber, that.cbarAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cbarAccountNumber);
    }
}
