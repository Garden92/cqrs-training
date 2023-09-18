package com.ktds.cqrsbasic.domain.port;

public interface EventPublisher {
    void publishEvent(DomainEvent event);
}
