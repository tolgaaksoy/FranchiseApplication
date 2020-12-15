package com.tolgaaksoy.lokumcubaba.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddress extends BaseAddressEntity {
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,targetEntity = Customer.class)
    private Customer customer;
}
