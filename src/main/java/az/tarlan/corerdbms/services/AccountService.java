package az.tarlan.corerdbms.services;

import az.tarlan.corerdbms.domain.Account;
import az.tarlan.corerdbms.enums.AccountStatus;
import az.tarlan.corerdbms.enums.Currency;
import az.tarlan.corerdbms.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Optional<Account> create(String customerId, Currency currency, String cbarAccount, AccountStatus accountStatus) {

        Account account = new Account(
                cbarAccount+customerId+currency,
                customerId,
                currency,
                BigDecimal.valueOf(0.0),
                cbarAccount,
                accountStatus,
                LocalDate.now()
        );

        try {
            return Optional.of(accountRepository.save(account));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public boolean closeAccount(String accountNumber) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (account.isPresent()) {
            Account newAccount = account.get();
            newAccount.setAccountStatus(AccountStatus.CLOSE);
            return true;
        } else {
            return false;
        }
    }

    public boolean blockAccount(String accountNumber) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (account.isPresent()) {
            Account newAccount = account.get();
            newAccount.setAccountStatus(AccountStatus.BLOCKED);
            return true;
        } else {
            return false;
        }
    }
}
