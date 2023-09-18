package com.ktds.cqrsbasic.adapter.out.persistence;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ktds.cqrsbasic.command.repository.entity.CreditCard;

public interface CreditCardJdbcRepository extends CrudRepository<CreditCard, UUID> {
    
}
