package com.ktds.cqrsbasic.adapter.in.api;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawalCommand {
    private UUID card;
    private long amount;
}
