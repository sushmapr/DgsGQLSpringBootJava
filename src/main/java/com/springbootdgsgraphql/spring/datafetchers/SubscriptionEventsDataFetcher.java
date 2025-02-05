package com.springbootdgsgraphql.spring.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsSubscription;
import com.springbootdgsgraphql.spring.services.Event;
import com.springbootdgsgraphql.spring.services.IEventService;

import reactor.core.publisher.Flux;

@DgsComponent
public class SubscriptionEventsDataFetcher {
	private final IEventService eventService;
	
	public SubscriptionEventsDataFetcher(IEventService eventService) {
		this.eventService = eventService;
	}
	
	@DgsSubscription
	public Flux<Event> events() {
		return this.eventService.getEventFlux();
	}
}
