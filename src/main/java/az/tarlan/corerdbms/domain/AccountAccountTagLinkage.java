package az.tarlan.corerdbms.domain;

import az.tarlan.corerdbms.enums.AccountAccountTagLinkageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.Optional;

@Entity
public class AccountAccountTagLinkage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String accountNumber;
    @NotNull
    private long tagId;
    @NotNull
    private AccountAccountTagLinkageStatus status;

    public AccountAccountTagLinkage() {
    }

    public AccountAccountTagLinkage(String accountNumber, long tagId, AccountAccountTagLinkageStatus status) {
        this.accountNumber = accountNumber;
        this.tagId = tagId;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getTagId() {
        return tagId;
    }

    public AccountAccountTagLinkageStatus getStatus() {
        return status;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public void setStatus(AccountAccountTagLinkageStatus status) {
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }


}
