package com.ktds.cqrsbasic.command.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ktds.cqrsbasic.command.repository.entity.CreditCard;

public interface CreditCardCommandRepository extends CrudRepository<CreditCard, UUID> {
    
}
