package com.hps.bank.RestController;

import com.hps.bank.Service.BankService;
import com.hps.bank.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankRestController {

    private BankService bankService;

    @Autowired
    public BankRestController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/")
    public List<Bank> getList() {
        return bankService.getBanks();
    }

    @GetMapping("/bank")
    public Bank getBank(@RequestParam("id") Long id) {
        return bankService.getBank(id);
    }

    @PostMapping("/bank")
    public Bank addBank(@RequestBody Bank bank) {
        return bankService.addBank(bank);
    }

    @DeleteMapping("/bank")
    public void deleteBank(@RequestBody Bank bank) {
        bankService.deleteBank(bank);
    }

    @PutMapping("/bank")
    public Bank updateBank(@RequestBody Bank bank) {
        return bankService.updateBank(bank);
    }


}
