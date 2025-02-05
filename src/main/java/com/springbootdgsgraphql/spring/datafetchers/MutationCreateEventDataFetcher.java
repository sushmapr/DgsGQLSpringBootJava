package com.springbootdgsgraphql.spring.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.springbootdgsgraphql.spring.services.Event;
import com.springbootdgsgraphql.spring.services.IEventService;

import reactor.core.publisher.Mono;

@DgsComponent
public class MutationCreateEventDataFetcher {
	private final IEventService eventService;
	
	public MutationCreateEventDataFetcher(IEventService eventService) {
		this.eventService = eventService;
	}

	@DgsMutation
	public Mono<Event> createEvent(@InputArgument String name) {
		return this.eventService.createEvent(name);
	}
}
