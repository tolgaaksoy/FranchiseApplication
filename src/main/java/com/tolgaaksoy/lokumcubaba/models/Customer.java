package com.tolgaaksoy.lokumcubaba.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String idNumber;
    @Column
    private String birthday;

    @OneToMany(targetEntity = CustomerAddress.class, mappedBy = "customer")
    private List<CustomerAddress> customerAddresses = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Appeal.class, mappedBy = "customer")
    private List<Appeal> appealList = new ArrayList<>();



}
