package com.ktds.cqrsbasic.domain.port;

import java.util.Optional;
import java.util.UUID;

public interface CreditCardRepository {

    Optional<CreditCard> load(UUID cardId);

    void save(CreditCard record);
}

