package com.pragma.powerup.adapters.driven.mongo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "traceOrders")
@Getter
@Setter
@AllArgsConstructor
public class TraceabilityEntity {

    private Long id;
}
