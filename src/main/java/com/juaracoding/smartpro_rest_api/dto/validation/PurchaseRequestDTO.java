package com.juaracoding.smartpro_rest_api.dto.validation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PurchaseRequestDTO {

    @NotNull(message = "Purchase Request Number cannot be null")
    @Size(max = 15, message = "Purchase Request Number cannot exceed 15 characters")
    private String purchaseRequestNo;

//    @Pattern(regexp = "^(10000(\\.\\d+)?|[1-9]\\d{4,7}(\\.\\d+)?)$\n", message = "Only numeric are allowed, range of 10000 to 100000000")
    @Range(min = 10000, max = 100000000, message = "Only numeric are allowed, range of 10000 to 100000000")
    private BigDecimal estimatedPrice;

//    @Pattern(regexp = "^(1[0-4]\\d|150|[1-9]\\d?|)$", message = "Only numeric are allowed, range of 1 to 150")
    @Range(min = 1, max = 150, message = "Only numeric are allowed, range of 1 to 150")
    private Integer estimatedQuantity;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,10}$", message = "Only alphabets are allowed and length from 3 to 10 characters")
    private String unit;

    @Pattern(regexp = "^(https?:\\/\\/)?([\\w\\-]+\\.)+[\\w]{2,}(\\/\\S*)?$\n", message = "Format URL invalid!")
    private String linkSpecificationUrl;

    @Pattern(regexp = "^(https?:\\/\\/)?([\\w\\-]+\\.)+[\\w]{2,}(\\/\\S*)?$\n", message = "Format URL invalid!")
    private String linkReferenceUrl;

//    @Pattern(regexp = "^[0-3]{1}$", message = "Only numeric are allowed, range of 0 to 3")
    @Range(max = 3, message = "Only numeric are allowed, range of 0 to 3")
    private Integer status;

    @NotNull(message = "Created By cannot be null")
    private Long createdBy;

    @NotNull(message = "Created Date cannot be null")
    private LocalDateTime createdDate;

    private Long updatedBy;

    private LocalDateTime updatedDate;

    @NotNull(message = "Procurement Request cannot be null")
    private Long procurementRequestNo;

    // setters getters
    public String getPurchaseRequestNo() {
        return purchaseRequestNo;
    }

    public void setPurchaseRequestNo(String purchaseRequestNo) {
        this.purchaseRequestNo = purchaseRequestNo;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public Integer getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(Integer estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLinkSpecificationUrl() {
        return linkSpecificationUrl;
    }

    public void setLinkSpecificationUrl(String linkSpecificationUrl) {
        this.linkSpecificationUrl = linkSpecificationUrl;
    }

    public String getLinkReferenceUrl() {
        return linkReferenceUrl;
    }

    public void setLinkReferenceUrl(String linkReferenceUrl) {
        this.linkReferenceUrl = linkReferenceUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getProcurementRequestNo() {
        return procurementRequestNo;
    }

    public void setProcurementRequestNo(Long procurementRequestNo) {
        this.procurementRequestNo = procurementRequestNo;
    }
}
