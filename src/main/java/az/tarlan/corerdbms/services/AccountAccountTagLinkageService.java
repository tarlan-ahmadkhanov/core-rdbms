package az.tarlan.corerdbms.services;

import az.tarlan.corerdbms.domain.AccountAccountTagLinkage;
import az.tarlan.corerdbms.enums.AccountAccountTagLinkageStatus;
import az.tarlan.corerdbms.repositories.AccountAccountTagLinkageRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountAccountTagLinkageService {

    private final AccountAccountTagLinkageRepo accountAccountTagLinkageRepo;

    public AccountAccountTagLinkageService(AccountAccountTagLinkageRepo accountAccountTagLinkageRepo) {
        this.accountAccountTagLinkageRepo = accountAccountTagLinkageRepo;
    }

    public boolean link(String accountNumber, long tagId) {

        Optional<AccountAccountTagLinkage> linkage = accountAccountTagLinkageRepo.findByAccountNumberAndTagId(accountNumber,  tagId);

        if (linkage.isPresent()) {
            return false;
        } else {
            accountAccountTagLinkageRepo.save(new AccountAccountTagLinkage(accountNumber, tagId, AccountAccountTagLinkageStatus.ACTIVE));
        }
        return true;
    }

    public boolean changeStatus(long tagId, AccountAccountTagLinkageStatus status) {
        Optional<AccountAccountTagLinkage> linkage = accountAccountTagLinkageRepo.findById(tagId);
        if (linkage.isPresent()) {
            AccountAccountTagLinkage link = linkage.get();
            link.setStatus(status);
            accountAccountTagLinkageRepo.save(link);
            return true;
        } else {
            return false;
        }
    }

    public List<AccountAccountTagLinkage> findAll() {
        return accountAccountTagLinkageRepo.findAll();
    }

}
