package com.hps.bank.Service;

import com.hps.bank.DAO.BankDao;
import com.hps.bank.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceDefaultImpl implements BankService {
    private BankDao dao;

    @Autowired
    public BankServiceDefaultImpl(BankDao dao) {
        this.dao = dao;
    }

    public List<Bank> getBanks() {
        return dao.findAll();
    }

    public Bank getBank(Long id) {
        Optional<Bank> bank = dao.findById(id);
        return bank.isPresent() ? bank.get() : null;
    }

    public Bank addBank(Bank bank) {
        return dao.save(bank);
    }

    public Bank updateBank(Bank bank) {
        return dao.save(bank);
    }

    public void deleteBank(Bank bank) {
        dao.delete(bank);
    }
}
