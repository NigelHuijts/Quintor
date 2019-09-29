package com.example.Week3.Controllers;

import com.example.Week3.Models.Account;
import com.example.Week3.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/{account}", produces = {"application/json"})
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable(value = "id") Long userId)
            throws RuntimeException {
        Account account =
                accountRepository
                        .findById(userId)
                        .orElseThrow(() -> new RuntimeException("User not found on :: " + userId));
        return ResponseEntity.ok().body(account);
    }

    @PostMapping("/accounts")
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
    }

    @PutMapping("/accounts/{id}")
    public ResponseEntity<Account> updateAccount(
            @PathVariable(value = "id") Long accountId, @Valid @RequestBody Account accountDetails)
            throws RuntimeException {
        Account account =
                accountRepository
                        .findById(accountId)
                        .orElseThrow(() -> new RuntimeException("User not found on :: " + accountId));
        account.setId(accountDetails.getId());
        account.setIBAN(accountDetails.getIBAN());
        account.setSaldo(accountDetails.getSaldo());
        account.setStatus(accountDetails.isStatus());
        final Account updatedAccount = accountRepository.save(account);
        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/user/{id}")
    public Map<String, Boolean> deleteAccount(@PathVariable(value = "id") Long accountId) throws Exception {
        Account account =
                accountRepository
                        .findById(accountId)
                        .orElseThrow(() -> new RuntimeException("User not found on :: " + accountId));
        accountRepository.delete(account);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
