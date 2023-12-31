package com.ktds.cqrsbasic.adapter.in.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.cqrsbasic.command.repository.entity.Withdrawal;
import com.ktds.cqrsbasic.command.service.WithdrawalCommandService;
import com.ktds.cqrsbasic.query.service.WithdrawalQueryService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/withdrawal")
@RequiredArgsConstructor
public class WithdrawalController {
    private final WithdrawalCommandService withdrawalCommandService;
    private final WithdrawalQueryService withdrawalQueryService;

    @PostMapping
    ResponseEntity<?> withdraw(@RequestBody WithdrawalCommand withdrawalCommand) {
    	withdrawalCommandService.withdraw(withdrawalCommand.getCard(), withdrawalCommand.getAmount());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    ResponseEntity<List<WithdrawalQuery>> withdrawals(@PathParam("cardId") String cardId) {
    	List<Withdrawal> withdrawalRecords = withdrawalQueryService.withdrawal(UUID.fromString(cardId));
        List<WithdrawalQuery> result = new ArrayList<>();
        withdrawalRecords.forEach(v -> result.add(new ModelMapper().map(v, WithdrawalQuery.class)));
        return ResponseEntity.ok().body(result);
    }
}
