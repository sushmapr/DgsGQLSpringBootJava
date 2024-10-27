package com.springbootdgsgraphql.spring.datafetchers;

import java.util.List;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.springbootdgsgraphql.spring.services.Event;
import com.springbootdgsgraphql.spring.services.IEventService;

import reactor.core.publisher.Mono;

@DgsComponent
public class QueryEventsDataFetcher {
	private final IEventService eventService;
	
	public QueryEventsDataFetcher(IEventService eventService) {
		this.eventService = eventService;
	}
	
	@DgsQuery
	public Mono<List<Event>> events() {
		return this.eventService.getEvents();
	}
}
