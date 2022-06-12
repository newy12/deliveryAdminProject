package com.delivery.deliveryAdminProject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Accusation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accusationContent;
    private String member;
    private String reportedId;
}
