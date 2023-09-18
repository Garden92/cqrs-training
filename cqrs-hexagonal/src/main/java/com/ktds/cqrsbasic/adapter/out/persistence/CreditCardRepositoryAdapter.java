package com.ktds.cqrsbasic.adapter.out.persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.ktds.cqrsbasic.command.repository.entity.CreditCard;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CreditCardRepositoryAdapter implements CreditCardRepository {

    private final CreditCardJdbcRepository creditCardJdbcRepository;

    @Override
    public Optional<CreditCard> load(UUID cardId) {
        return creditCardJdbcRepository.findById(cardId);
    }

    @Override
    public void save(CreditCard record) {
    	creditCardJdbcRepository.save(record);
    }
}

