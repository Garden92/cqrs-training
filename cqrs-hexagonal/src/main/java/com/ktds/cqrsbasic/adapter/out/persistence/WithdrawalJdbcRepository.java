package com.ktds.cqrsbasic.adapter.out.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ktds.cqrsbasic.command.repository.entity.Withdrawal;


public interface WithdrawalJdbcRepository extends CrudRepository<Withdrawal, UUID> {
    List<Withdrawal> findByCardId(UUID cardId);
}
