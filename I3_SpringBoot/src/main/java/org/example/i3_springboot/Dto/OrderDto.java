package org.example.i3_springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Long orderId;
    private Long customerId;
    private List<String> itemCodes; // List of item codes instead of full ItemEntity objects
    private double totalPrice;

}
