package lcw.model;

import java.math.BigDecimal;
import java.util.Date;

public class FinanceCommission {
    private Long commissionId;

    private Long businessId;

    private String orderSn;

    private Boolean orderSource;

    private Boolean sourceType;

    private Boolean orderType;

    private Boolean shopType;

    private String billNo;

    private Boolean storageType;

    private String supplierNo;

    private String supplierNm;

    private String storeNo;

    private String storeNm;

    private Date payTime;

    private Long contractId;

    private Date outWarehouseTime;

    private Date signTime;

    private BigDecimal goodsAmount;

    private BigDecimal transportAmount;

    private BigDecimal transportAmount4Store;

    private BigDecimal orderAmount;

    private BigDecimal activityAmount4Platform;

    private BigDecimal couponAmount4Platform;

    private BigDecimal activityAmount4Supplier;

    private BigDecimal couponAmount4Supplier;

    private BigDecimal cashOnDeliveryAmount;

    private BigDecimal thirdPaymentAmount;

    private BigDecimal prepaidCardPaymentAmount;

    private BigDecimal pointsPayAmount;

    private BigDecimal serverCharge;

    private BigDecimal needInvoice;

    private BigDecimal supplierSettlementAmount;

    private BigDecimal distributeCommissionAmount;

    private BigDecimal distributeRaisePriceAmount;

    private BigDecimal storeLedgerSettlementAmount;

    private Date settlementDate;

    private Boolean settlementStatus;

    private Date createTime;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Boolean getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Boolean orderSource) {
        this.orderSource = orderSource;
    }

    public Boolean getSourceType() {
        return sourceType;
    }

    public void setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
    }

    public Boolean getOrderType() {
        return orderType;
    }

    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    public Boolean getShopType() {
        return shopType;
    }

    public void setShopType(Boolean shopType) {
        this.shopType = shopType;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Boolean getStorageType() {
        return storageType;
    }

    public void setStorageType(Boolean storageType) {
        this.storageType = storageType;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm == null ? null : supplierNm.trim();
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo == null ? null : storeNo.trim();
    }

    public String getStoreNm() {
        return storeNm;
    }

    public void setStoreNm(String storeNm) {
        this.storeNm = storeNm == null ? null : storeNm.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Date getOutWarehouseTime() {
        return outWarehouseTime;
    }

    public void setOutWarehouseTime(Date outWarehouseTime) {
        this.outWarehouseTime = outWarehouseTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getTransportAmount() {
        return transportAmount;
    }

    public void setTransportAmount(BigDecimal transportAmount) {
        this.transportAmount = transportAmount;
    }

    public BigDecimal getTransportAmount4Store() {
        return transportAmount4Store;
    }

    public void setTransportAmount4Store(BigDecimal transportAmount4Store) {
        this.transportAmount4Store = transportAmount4Store;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getActivityAmount4Platform() {
        return activityAmount4Platform;
    }

    public void setActivityAmount4Platform(BigDecimal activityAmount4Platform) {
        this.activityAmount4Platform = activityAmount4Platform;
    }

    public BigDecimal getCouponAmount4Platform() {
        return couponAmount4Platform;
    }

    public void setCouponAmount4Platform(BigDecimal couponAmount4Platform) {
        this.couponAmount4Platform = couponAmount4Platform;
    }

    public BigDecimal getActivityAmount4Supplier() {
        return activityAmount4Supplier;
    }

    public void setActivityAmount4Supplier(BigDecimal activityAmount4Supplier) {
        this.activityAmount4Supplier = activityAmount4Supplier;
    }

    public BigDecimal getCouponAmount4Supplier() {
        return couponAmount4Supplier;
    }

    public void setCouponAmount4Supplier(BigDecimal couponAmount4Supplier) {
        this.couponAmount4Supplier = couponAmount4Supplier;
    }

    public BigDecimal getCashOnDeliveryAmount() {
        return cashOnDeliveryAmount;
    }

    public void setCashOnDeliveryAmount(BigDecimal cashOnDeliveryAmount) {
        this.cashOnDeliveryAmount = cashOnDeliveryAmount;
    }

    public BigDecimal getThirdPaymentAmount() {
        return thirdPaymentAmount;
    }

    public void setThirdPaymentAmount(BigDecimal thirdPaymentAmount) {
        this.thirdPaymentAmount = thirdPaymentAmount;
    }

    public BigDecimal getPrepaidCardPaymentAmount() {
        return prepaidCardPaymentAmount;
    }

    public void setPrepaidCardPaymentAmount(BigDecimal prepaidCardPaymentAmount) {
        this.prepaidCardPaymentAmount = prepaidCardPaymentAmount;
    }

    public BigDecimal getPointsPayAmount() {
        return pointsPayAmount;
    }

    public void setPointsPayAmount(BigDecimal pointsPayAmount) {
        this.pointsPayAmount = pointsPayAmount;
    }

    public BigDecimal getServerCharge() {
        return serverCharge;
    }

    public void setServerCharge(BigDecimal serverCharge) {
        this.serverCharge = serverCharge;
    }

    public BigDecimal getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(BigDecimal needInvoice) {
        this.needInvoice = needInvoice;
    }

    public BigDecimal getSupplierSettlementAmount() {
        return supplierSettlementAmount;
    }

    public void setSupplierSettlementAmount(BigDecimal supplierSettlementAmount) {
        this.supplierSettlementAmount = supplierSettlementAmount;
    }

    public BigDecimal getDistributeCommissionAmount() {
        return distributeCommissionAmount;
    }

    public void setDistributeCommissionAmount(BigDecimal distributeCommissionAmount) {
        this.distributeCommissionAmount = distributeCommissionAmount;
    }

    public BigDecimal getDistributeRaisePriceAmount() {
        return distributeRaisePriceAmount;
    }

    public void setDistributeRaisePriceAmount(BigDecimal distributeRaisePriceAmount) {
        this.distributeRaisePriceAmount = distributeRaisePriceAmount;
    }

    public BigDecimal getStoreLedgerSettlementAmount() {
        return storeLedgerSettlementAmount;
    }

    public void setStoreLedgerSettlementAmount(BigDecimal storeLedgerSettlementAmount) {
        this.storeLedgerSettlementAmount = storeLedgerSettlementAmount;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Boolean getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Boolean settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}