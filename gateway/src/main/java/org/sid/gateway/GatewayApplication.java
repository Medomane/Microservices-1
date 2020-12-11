package org.sid.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
    }
}

    /*public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/customers/**").uri("lb://CUSTOMER-SERVICE"))
                .route(p -> p.path("/products/**").uri("lb://INVENTORY-SERVICE"))
                .build();
    }
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
    }
    final ReactiveDiscoveryClient reactiveDiscoveryClient;
    final DiscoveryLocatorProperties discoveryLocatorProperties;
    public GatewayApplication(ReactiveDiscoveryClient discoveryClient, DiscoveryLocatorProperties properties, ReactiveDiscoveryClient reactiveDiscoveryClient, DiscoveryLocatorProperties discoveryLocatorProperties) {
        super(discoveryClient, properties);
        this.reactiveDiscoveryClient = reactiveDiscoveryClient;
        this.discoveryLocatorProperties = discoveryLocatorProperties;
    }*/
