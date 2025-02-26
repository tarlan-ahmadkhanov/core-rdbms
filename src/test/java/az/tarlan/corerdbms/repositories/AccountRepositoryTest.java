package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.Account;
import az.tarlan.corerdbms.enums.Currency;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void testCreateAccount() {
        Random random = new Random();
        String accountNUmber = "ACCOUNT_NUMBER_" + random.nextInt(10);
        Account account = new Account(
                accountNUmber,
                "0000000001",
                Currency.AZN,
                BigDecimal.valueOf(0.0),
                "1001",
                1,
                LocalDate.now()
        );

        Account newAccount = accountRepository.save(account);
        assertNotNull(newAccount);
    }

}