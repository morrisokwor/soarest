package com.example.restsoa.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Morris.Okworo on 20/03/2023
 */

public class Order {

    private Long userId;
    private String productName;
    private String milk;
    private String size;
    private String shots;
    private boolean whipedCream;
    private String teaType;

    private BigDecimal amount;

    private LocalDateTime orderReceivedTime;

    private String longitude;
    private String latitude;
    private String timeToWait;

    public Order() {
    }

    public Order(Long userId, String productName, String milk, String size, String shots, boolean whipedCream, String teaType) {
        this.userId = userId;
        this.productName = productName;
        this.milk = milk;
        this.size = size;
        this.shots = shots;
        this.whipedCream = whipedCream;
        this.teaType = teaType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShots() {
        return shots;
    }

    public void setShots(String shots) {
        this.shots = shots;
    }

    public boolean isWhipedCream() {
        return whipedCream;
    }

    public void setWhipedCream(boolean whipedCream) {
        this.whipedCream = whipedCream;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderReceivedTime() {
        return orderReceivedTime;
    }

    public void setOrderReceivedTime(LocalDateTime orderReceivedTime) {
        this.orderReceivedTime = orderReceivedTime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTimeToWait() {
        return timeToWait;
    }

    public void setTimeToWait(String timeToWait) {
        this.timeToWait = timeToWait;
    }
}
