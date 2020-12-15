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
public class AppealAddress extends BaseAddressEntity {
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,targetEntity = Appeal.class)
    private Appeal appeal;
}
