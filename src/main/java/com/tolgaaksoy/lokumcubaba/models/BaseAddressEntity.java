package com.tolgaaksoy.lokumcubaba.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@MappedSuperclass
@AllArgsConstructor
public abstract class BaseAddressEntity extends BaseEntity{
    @Column
    private String province;
    @Column
    private String district;
    @Column
    private String neighborhood;
    @Column
    private String description;
}
