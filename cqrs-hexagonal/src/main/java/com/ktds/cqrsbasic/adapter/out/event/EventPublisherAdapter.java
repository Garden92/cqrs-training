package com.ktds.cqrsbasic.adapter.out.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EventPublisherAdapter implements EventPublisher  {
    private final ApplicationEventPublisher applicationEventPublisher;
  	
  	@Override
  	public void publishEvent(DomainEvent event) {
  		applicationEventPublisher.publishEvent(event);
  		
  	}

}
