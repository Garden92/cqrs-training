package com.ktds.cqrsbasic.query.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.cqrsbasic.query.payload.WithdrawalDto;
import com.ktds.cqrsbasic.query.service.WithdrawalQueryService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/withdrawal")
@RequiredArgsConstructor
public class WithdrawalQueryController {
    private final WithdrawalQueryService withdrawalQueryService;

    @GetMapping
    ResponseEntity<List<WithdrawalDto>> withdrawals(@PathParam("cardId") String cardId) {
        return ResponseEntity.ok().body(withdrawalQueryService.withdraw(UUID.fromString(cardId)));
    }


}
