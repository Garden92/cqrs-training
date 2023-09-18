package com.ktds.cqrsbasic.command.service;

import java.util.UUID;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(UUID cardNo, long wanted, long availableBalance) {
        super(String.format("Card %s not able to withdraw %s. Balance is %s", cardNo, wanted, availableBalance));
    }
}
