package com.msprogramming.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.filter.factory.SpringCloudCircuitBreakerFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RouteConfiguration {

//    @Bean
//    public RouteLocator inventoryService(RouteLocatorBuilder builder){
//
//        return builder.routes()
//                .route("Inventory-service",r->r.path("/inventory/**")
//                    .filters(
//                            f->f
//                            .circuitBreaker(c->c.setFallbackUri("/inCaseOfFailureUseThis").setName("myCircuitBreaker"))
//                            .prefixPath("/api")
//                    )
//                    .uri("http://localhost:8082")
//                ).build();
//
//    }
    @Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just("1");
        //exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
}
