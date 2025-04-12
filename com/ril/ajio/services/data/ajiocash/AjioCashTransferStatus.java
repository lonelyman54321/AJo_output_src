/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import com.ril.ajio.services.data.ajiocash.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AjioCashTransferStatus {
    private Double amount;
    private String bankReferenceNumber;
    private Boolean bankTransferRetryPeriodOver;
    private String bankTransferTenantTransactionId;
    private final Error error;
    private String gatewayCode;
    private String message;
    private String orderId;
    private String paymentEngineTransactionId;
    private Boolean rcsRefundRetryPeriodOver;
    private Boolean refundToRCSSuccessful;
    private String requestedBy;
    private String requestedDate;
    private String returnOrderId;
    private String transactionStatus;
    private String transferType;
    private Boolean valid;

    public AjioCashTransferStatus() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public AjioCashTransferStatus(Double d2, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, Boolean bl3, Boolean bl4, String string8, String string9, String string10, String string11, String string12, Boolean bl5, Error error) {
        this.amount = d2;
        this.bankReferenceNumber = string2;
        this.bankTransferRetryPeriodOver = bl2;
        this.bankTransferTenantTransactionId = string3;
        this.gatewayCode = string4;
        this.message = string5;
        this.orderId = string6;
        this.paymentEngineTransactionId = string7;
        this.rcsRefundRetryPeriodOver = bl3;
        this.refundToRCSSuccessful = bl4;
        this.requestedBy = string8;
        this.requestedDate = string9;
        this.returnOrderId = string10;
        this.transactionStatus = string11;
        this.transferType = string12;
        this.valid = bl5;
        this.error = error;
    }

    public /* synthetic */ AjioCashTransferStatus(Double object, String object2, Boolean object3, String object4, String string2, String string3, String string4, String string5, Boolean object5, Boolean bl2, String object6, String string6, String string7, String string8, String string9, Boolean object7, Error object8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Error error;
        Boolean bl3;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        Boolean bl4;
        Boolean bl5;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        Boolean bl6;
        String string20;
        Double d2;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            d2 = null;
        } else {
            d2 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string20 = null;
        } else {
            string20 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            bl6 = null;
        } else {
            bl6 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string19 = null;
        } else {
            string19 = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string18 = null;
        } else {
            string18 = string2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string17 = null;
        } else {
            string17 = string3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string16 = null;
        } else {
            string16 = string4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            bl5 = null;
        } else {
            bl5 = object5;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            bl4 = null;
        } else {
            bl4 = bl2;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string14 = null;
        } else {
            string14 = object6;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string13 = null;
        } else {
            string13 = string6;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string12 = null;
        } else {
            string12 = string7;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string11 = null;
        } else {
            string11 = string8;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string10 = null;
        } else {
            string10 = string9;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            bl3 = null;
        } else {
            bl3 = object7;
        }
        int n28 = 65536;
        if ((n4 &= n28) != 0) {
            n4 = 0;
            error = null;
        } else {
            error = object8;
        }
        object = this;
        object2 = d2;
        object3 = string20;
        object4 = bl6;
        string2 = string19;
        string3 = string18;
        string4 = string17;
        string5 = string16;
        object5 = string15;
        bl2 = bl5;
        object6 = bl4;
        string6 = string14;
        string7 = string13;
        string8 = string12;
        string9 = string11;
        object7 = string10;
        object8 = bl3;
        this(d2, string20, bl6, string19, string18, string17, string16, string15, bl5, bl4, string14, string13, string12, string11, string10, bl3, error);
    }

    public static /* synthetic */ AjioCashTransferStatus copy$default(AjioCashTransferStatus ajioCashTransferStatus, Double d2, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, Boolean bl3, Boolean bl4, String string8, String string9, String string10, String string11, String string12, Boolean object, Error error, int n3, Object object2) {
        AjioCashTransferStatus ajioCashTransferStatus2 = ajioCashTransferStatus;
        int n4 = n3;
        int n7 = n3 & 1;
        Double d5 = n7 != 0 ? ajioCashTransferStatus.amount : d2;
        int n8 = n4 & 2;
        String string13 = n8 != 0 ? ajioCashTransferStatus2.bankReferenceNumber : string2;
        int n10 = n4 & 4;
        Boolean bl5 = n10 != 0 ? ajioCashTransferStatus2.bankTransferRetryPeriodOver : bl2;
        int n14 = n4 & 8;
        String string14 = n14 != 0 ? ajioCashTransferStatus2.bankTransferTenantTransactionId : string3;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? ajioCashTransferStatus2.gatewayCode : string4;
        int n16 = n4 & 0x20;
        String string16 = n16 != 0 ? ajioCashTransferStatus2.message : string5;
        int n17 = n4 & 0x40;
        String string17 = n17 != 0 ? ajioCashTransferStatus2.orderId : string6;
        int n18 = n4 & 0x80;
        String string18 = n18 != 0 ? ajioCashTransferStatus2.paymentEngineTransactionId : string7;
        int n19 = n4 & 0x100;
        Boolean bl6 = n19 != 0 ? ajioCashTransferStatus2.rcsRefundRetryPeriodOver : bl3;
        int n20 = n4 & 0x200;
        Boolean bl7 = n20 != 0 ? ajioCashTransferStatus2.refundToRCSSuccessful : bl4;
        int n21 = n4 & 0x400;
        String string19 = n21 != 0 ? ajioCashTransferStatus2.requestedBy : string8;
        int n22 = n4 & 0x800;
        String string20 = n22 != 0 ? ajioCashTransferStatus2.requestedDate : string9;
        int n24 = n4 & 0x1000;
        String string21 = n24 != 0 ? ajioCashTransferStatus2.returnOrderId : string10;
        int n25 = n4 & 0x2000;
        Object object3 = n25 != 0 ? ajioCashTransferStatus2.transactionStatus : string11;
        string11 = object3;
        n25 = n4 & 0x4000;
        object3 = n25 != 0 ? ajioCashTransferStatus2.transferType : string12;
        int n26 = n4 & 0x8000;
        string12 = object3;
        object3 = n26 != 0 ? ajioCashTransferStatus2.valid : object;
        n26 = 65536;
        Error error2 = (n4 &= n26) != 0 ? ajioCashTransferStatus2.error : error;
        d2 = d5;
        string2 = string13;
        bl2 = bl5;
        string3 = string14;
        string4 = string15;
        string5 = string16;
        string6 = string17;
        string7 = string18;
        bl3 = bl6;
        bl4 = bl7;
        string8 = string19;
        string9 = string20;
        string10 = string21;
        object = object3;
        error = error2;
        return ajioCashTransferStatus.copy(d5, string13, bl5, string14, string15, string16, string17, string18, bl6, bl7, string19, string20, string21, string11, string12, (Boolean)object3, error2);
    }

    public final Double component1() {
        return this.amount;
    }

    public final Boolean component10() {
        return this.refundToRCSSuccessful;
    }

    public final String component11() {
        return this.requestedBy;
    }

    public final String component12() {
        return this.requestedDate;
    }

    public final String component13() {
        return this.returnOrderId;
    }

    public final String component14() {
        return this.transactionStatus;
    }

    public final String component15() {
        return this.transferType;
    }

    public final Boolean component16() {
        return this.valid;
    }

    public final Error component17() {
        return this.error;
    }

    public final String component2() {
        return this.bankReferenceNumber;
    }

    public final Boolean component3() {
        return this.bankTransferRetryPeriodOver;
    }

    public final String component4() {
        return this.bankTransferTenantTransactionId;
    }

    public final String component5() {
        return this.gatewayCode;
    }

    public final String component6() {
        return this.message;
    }

    public final String component7() {
        return this.orderId;
    }

    public final String component8() {
        return this.paymentEngineTransactionId;
    }

    public final Boolean component9() {
        return this.rcsRefundRetryPeriodOver;
    }

    public final AjioCashTransferStatus copy(Double d2, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, Boolean bl3, Boolean bl4, String string8, String string9, String string10, String string11, String string12, Boolean bl5, Error error) {
        AjioCashTransferStatus ajioCashTransferStatus = new AjioCashTransferStatus(d2, string2, bl2, string3, string4, string5, string6, string7, bl3, bl4, string8, string9, string10, string11, string12, bl5, error);
        return ajioCashTransferStatus;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjioCashTransferStatus;
        if (!bl3) {
            return false;
        }
        object = (AjioCashTransferStatus)object;
        Object object2 = this.amount;
        Object object3 = ((AjioCashTransferStatus)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankReferenceNumber;
        object3 = ((AjioCashTransferStatus)object).bankReferenceNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankTransferRetryPeriodOver;
        object3 = ((AjioCashTransferStatus)object).bankTransferRetryPeriodOver;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankTransferTenantTransactionId;
        object3 = ((AjioCashTransferStatus)object).bankTransferTenantTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gatewayCode;
        object3 = ((AjioCashTransferStatus)object).gatewayCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((AjioCashTransferStatus)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((AjioCashTransferStatus)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((AjioCashTransferStatus)object).paymentEngineTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rcsRefundRetryPeriodOver;
        object3 = ((AjioCashTransferStatus)object).rcsRefundRetryPeriodOver;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundToRCSSuccessful;
        object3 = ((AjioCashTransferStatus)object).refundToRCSSuccessful;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestedBy;
        object3 = ((AjioCashTransferStatus)object).requestedBy;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestedDate;
        object3 = ((AjioCashTransferStatus)object).requestedDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnOrderId;
        object3 = ((AjioCashTransferStatus)object).returnOrderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((AjioCashTransferStatus)object).transactionStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transferType;
        object3 = ((AjioCashTransferStatus)object).transferType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.valid;
        object3 = ((AjioCashTransferStatus)object).valid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object = ((AjioCashTransferStatus)object).error;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getBankReferenceNumber() {
        return this.bankReferenceNumber;
    }

    public final Boolean getBankTransferRetryPeriodOver() {
        return this.bankTransferRetryPeriodOver;
    }

    public final String getBankTransferTenantTransactionId() {
        return this.bankTransferTenantTransactionId;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getGatewayCode() {
        return this.gatewayCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final Boolean getRcsRefundRetryPeriodOver() {
        return this.rcsRefundRetryPeriodOver;
    }

    public final Boolean getRefundToRCSSuccessful() {
        return this.refundToRCSSuccessful;
    }

    public final String getRequestedBy() {
        return this.requestedBy;
    }

    public final String getRequestedDate() {
        return this.requestedDate;
    }

    public final String getReturnOrderId() {
        return this.returnOrderId;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public final String getTransferType() {
        return this.transferType;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.amount;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Object object = this.bankReferenceNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankTransferRetryPeriodOver;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankTransferTenantTransactionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gatewayCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentEngineTransactionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rcsRefundRetryPeriodOver;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundToRCSSuccessful;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestedBy;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestedDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnOrderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transferType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.valid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.error;
        if (object != null) {
            n7 = ((Error)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Double d2) {
        this.amount = d2;
    }

    public final void setBankReferenceNumber(String string2) {
        this.bankReferenceNumber = string2;
    }

    public final void setBankTransferRetryPeriodOver(Boolean bl2) {
        this.bankTransferRetryPeriodOver = bl2;
    }

    public final void setBankTransferTenantTransactionId(String string2) {
        this.bankTransferTenantTransactionId = string2;
    }

    public final void setGatewayCode(String string2) {
        this.gatewayCode = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setOrderId(String string2) {
        this.orderId = string2;
    }

    public final void setPaymentEngineTransactionId(String string2) {
        this.paymentEngineTransactionId = string2;
    }

    public final void setRcsRefundRetryPeriodOver(Boolean bl2) {
        this.rcsRefundRetryPeriodOver = bl2;
    }

    public final void setRefundToRCSSuccessful(Boolean bl2) {
        this.refundToRCSSuccessful = bl2;
    }

    public final void setRequestedBy(String string2) {
        this.requestedBy = string2;
    }

    public final void setRequestedDate(String string2) {
        this.requestedDate = string2;
    }

    public final void setReturnOrderId(String string2) {
        this.returnOrderId = string2;
    }

    public final void setTransactionStatus(String string2) {
        this.transactionStatus = string2;
    }

    public final void setTransferType(String string2) {
        this.transferType = string2;
    }

    public final void setValid(Boolean bl2) {
        this.valid = bl2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.amount;
        String string2 = this.bankReferenceNumber;
        Object object3 = this.bankTransferRetryPeriodOver;
        Object object4 = this.bankTransferTenantTransactionId;
        String string3 = this.gatewayCode;
        String string4 = this.message;
        String string5 = this.orderId;
        String string6 = this.paymentEngineTransactionId;
        Boolean bl2 = this.rcsRefundRetryPeriodOver;
        Boolean bl3 = this.refundToRCSSuccessful;
        String string7 = this.requestedBy;
        String string8 = this.requestedDate;
        String string9 = this.returnOrderId;
        String string10 = this.transactionStatus;
        String string11 = this.transferType;
        Boolean bl4 = this.valid;
        Error error = this.error;
        object = new StringBuilder("AjioCashTransferStatus(amount=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", bankReferenceNumber=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", bankTransferRetryPeriodOver=");
        xi0_2.a((Boolean)object3, ", bankTransferTenantTransactionId=", (String)object4, ", gatewayCode=", (StringBuilder)object);
        X50.a((StringBuilder)object, string3, ", message=", string4, ", orderId=");
        X50.a((StringBuilder)object, string5, ", paymentEngineTransactionId=", string6, ", rcsRefundRetryPeriodOver=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", refundToRCSSuccessful=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", requestedBy=");
        X50.a((StringBuilder)object, string7, ", requestedDate=", string8, ", returnOrderId=");
        X50.a((StringBuilder)object, string9, ", transactionStatus=", string10, ", transferType=");
        object3 = string11;
        object4 = bl4;
        vw0_1.a(bl4, string11, ", valid=", ", error=", (StringBuilder)object);
        object2 = error;
        ((StringBuilder)object).append(error);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

