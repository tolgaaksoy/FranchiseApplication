package com.tolgaaksoy.franchiseApplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity{
    @Column
    private String province;
    @Column
    private String district;
    @Column
    private String neighborhood;
    @Column
    private String description;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    @OneToOne(mappedBy = "address")
    private Appeal appeal;
}