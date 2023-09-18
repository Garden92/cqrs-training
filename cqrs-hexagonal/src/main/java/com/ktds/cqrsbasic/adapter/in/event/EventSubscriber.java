package com.ktds.cqrsbasic.adapter.in.event;

import java.util.UUID;

import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.ktds.cqrsbasic.command.event.CardWithdraw;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventSubscriber {
    private final JdbcTemplate jdbcTemplate;

    @Async
    @EventListener
    public void addWithdrawalOnCardWithdrawn(CardWithdraw event) {
        jdbcTemplate.update("INSERT INTO WITHDRAWAL(ID, CARD_ID, AMOUNT) VALUES (?,?,?)", UUID.randomUUID(), event.getCardNo(), event.getAmount());
    }
}
