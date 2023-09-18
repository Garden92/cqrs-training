package com.ktds.cqrsbasic.command.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.cqrsbasic.command.payload.WithdrawalCommand;
import com.ktds.cqrsbasic.command.service.WithdrawalCommandService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/withdrawal")
@RequiredArgsConstructor
public class WithdrawalCommandController {
    private final WithdrawalCommandService withdrawalService;

    @PostMapping
    ResponseEntity<?> withdraw(@RequestBody WithdrawalCommand withdrawalCommand) {
        withdrawalService.withdraw(withdrawalCommand.getCard(), withdrawalCommand.getAmount());
        return ResponseEntity.ok().build();
    }
}
