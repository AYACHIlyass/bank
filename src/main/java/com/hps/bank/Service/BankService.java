package com.hps.bank.Service;

import com.hps.bank.model.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BankService {
    List<Bank> getBanks();

    Bank getBank(Long id);

    Bank addBank(Bank bank);

    Bank updateBank(Bank bank);

    void deleteBank(Bank bank);

}
