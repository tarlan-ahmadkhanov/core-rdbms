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
    private String cbar_account_number;
    @NotNull
    @Size(max = 255)
    private String account_description;
    @NotNull
    private AccountType account_type;
    @NotNull
    private CbarAccountStatuses account_status;

    public CbarAccount() {
    }

    public CbarAccount(String cbar_account_number, String account_description, AccountType account_type, CbarAccountStatuses account_status) {
        this.cbar_account_number = cbar_account_number;
        this.account_description = account_description;
        this.account_type = account_type;
        this.account_status = account_status;
    }

    public String getCbar_account_number() {
        return cbar_account_number;
    }

    public void setCbar_account_number(String cbar_account_number) {
        this.cbar_account_number = cbar_account_number;
    }

    public String getAccount_description() {
        return account_description;
    }

    public void setAccount_description(String account_description) {
        this.account_description = account_description;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }

    public CbarAccountStatuses getAccount_status() {
        return account_status;
    }

    public void setAccount_status(CbarAccountStatuses account_status) {
        this.account_status = account_status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CbarAccount that = (CbarAccount) o;
        return Objects.equals(cbar_account_number, that.cbar_account_number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cbar_account_number);
    }
}
