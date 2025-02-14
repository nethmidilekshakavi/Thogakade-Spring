package org.example.i3_springboot.Dto;

public class ItemDto {
    private String code;
    private String name;
    private double price;
    private int qty;

    public ItemDto(String code, String name, double price, int qty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }


}
