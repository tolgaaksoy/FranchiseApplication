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
@AllArgsConstructor
@NoArgsConstructor
public class Appeal extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,targetEntity = AppealAddress.class)
    private AppealAddress appealAddress;

    @Column
    private int investmentAmount;
    @Column
    private String appealDescription;
    @Column
    private String extraDescription;

}
