package com.ktds.cqrsbasic.command.repository.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("CREDIT_CARD")
public class CreditCard {
    @Id
    private UUID id;
    private long initialLimit;
    private long usedLimit;

}
