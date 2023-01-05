package com.ecommerce.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequestDto implements Serializable {
    private static final long serialVersionUID = -5507166450342426253L;

    private String email;
    private String password;
}