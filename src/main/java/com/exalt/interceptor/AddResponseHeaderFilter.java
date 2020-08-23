//package com.exalt.interceptor;
//
//
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//public class AddResponseHeaderFilter implements GatewayFilter {
//
//
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request;
//        if(request.getHeaders().get("x-mydata")!=null){
//            request= exchange.getRequest().mutate().header("my-new-header",request.getHeaders().get("x-mydata").get(0)).build();
//        }
//
//        return chain.filter(exchange.mutate().request(request).build());
//    }
//
//}
