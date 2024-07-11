package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
