package com.ktds.cqrsbasic.query.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ktds.cqrsbasic.query.repository.entity.Withdrawal;

public interface WithdrawalQueryRepository extends CrudRepository<Withdrawal, UUID> {
    List<Withdrawal> findByCardId(UUID cardId);
}
