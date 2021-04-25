package com.hps.bank.DAO;

import com.hps.bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDao extends JpaRepository<Bank,Long> {
}
