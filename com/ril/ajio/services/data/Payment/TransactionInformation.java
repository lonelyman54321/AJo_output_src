/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInformation;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TransactionInformation
implements Serializable {
    private List internalWallets;
    private OfferDetails offerDetails;
    private String paymentEngineTransactionId;
    private String paymentGatewayCandidateTransactionId1;
    private String paymentGatewayCandidateTransactionId2;
    private PaymentInformation paymentInformation;
    private Long pollingTime;
    private boolean statusUnknown;
    private String tenantTransactionId;
    private Float totalAmount;
    private Boolean transactionManipulated;
    private String transactionStatus;

    public TransactionInformation() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public TransactionInformation(boolean bl2, String string2, String string3, String string4, String string5, String string6, Float f5, Boolean bl3, PaymentInformation paymentInformation, OfferDetails offerDetails, Long l2, List list) {
        this.statusUnknown = bl2;
        this.tenantTransactionId = string2;
        this.paymentEngineTransactionId = string3;
        this.transactionStatus = string4;
        this.paymentGatewayCandidateTransactionId1 = string5;
        this.paymentGatewayCandidateTransactionId2 = string6;
        this.totalAmount = f5;
        this.transactionManipulated = bl3;
        this.paymentInformation = paymentInformation;
        this.offerDetails = offerDetails;
        this.pollingTime = l2;
        this.internalWallets = list;
    }

    public /* synthetic */ TransactionInformation(boolean bl2, String string2, String string3, String string4, String string5, String string6, Float object, Boolean comparable, PaymentInformation serializable, OfferDetails serializable2, Long serializable3, List object2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        OfferDetails offerDetails;
        PaymentInformation paymentInformation;
        Float f5;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        int n4 = n3;
        int n7 = n3 & 1;
        n7 = n7 != 0 ? 0 : (int)(bl2 ? 1 : 0);
        int n8 = n4 & 2;
        List list = null;
        if (n8 != 0) {
            n8 = 0;
            string11 = null;
        } else {
            string11 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string10 = null;
        } else {
            string10 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string8 = null;
        } else {
            string8 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object;
        }
        int n18 = n4 & 0x80;
        Boolean bl3 = n18 != 0 ? Boolean.FALSE : comparable;
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            paymentInformation = null;
        } else {
            paymentInformation = serializable;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            offerDetails = null;
        } else {
            offerDetails = serializable2;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            long l3 = 0L;
            l2 = l3;
        } else {
            l2 = serializable3;
        }
        if ((n4 &= 0x800) == 0) {
            list = object2;
        }
        string3 = string11;
        string4 = string10;
        string5 = string9;
        string6 = string8;
        object = string7;
        comparable = f5;
        serializable = bl3;
        serializable2 = paymentInformation;
        serializable3 = offerDetails;
        object2 = l2;
        this(n7 != 0, string11, string10, string9, string8, string7, f5, bl3, paymentInformation, offerDetails, l2, list);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ TransactionInformation copy$default(TransactionInformation transactionInformation, boolean bl2, String string2, String string3, String string4, String string5, String string6, Float f5, Boolean bl3, PaymentInformation paymentInformation, OfferDetails offerDetails, Long l2, List list, int n3, Object object) {
        List list2;
        Long l3;
        OfferDetails offerDetails2;
        PaymentInformation paymentInformation2;
        Boolean bl4;
        Float f6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        void var13_14;
        TransactionInformation transactionInformation2 = transactionInformation;
        int n4 = var13_14;
        int n7 = var13_14 & 1;
        n7 = n7 != 0 ? (int)(transactionInformation.statusUnknown ? 1 : 0) : (int)(bl2 ? 1 : 0);
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? transactionInformation2.tenantTransactionId : string11;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? transactionInformation2.paymentEngineTransactionId : string10;
        int n14 = n4 & 8;
        String string14 = n14 != 0 ? transactionInformation2.transactionStatus : string9;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? transactionInformation2.paymentGatewayCandidateTransactionId1 : string8;
        int n16 = n4 & 0x20;
        String string16 = n16 != 0 ? transactionInformation2.paymentGatewayCandidateTransactionId2 : string7;
        int n17 = n4 & 0x40;
        Float f7 = n17 != 0 ? transactionInformation2.totalAmount : f6;
        int n18 = n4 & 0x80;
        Boolean bl5 = n18 != 0 ? transactionInformation2.transactionManipulated : bl4;
        int n19 = n4 & 0x100;
        PaymentInformation paymentInformation3 = n19 != 0 ? transactionInformation2.paymentInformation : paymentInformation2;
        int n20 = n4 & 0x200;
        OfferDetails offerDetails3 = n20 != 0 ? transactionInformation2.offerDetails : offerDetails2;
        int n21 = n4 & 0x400;
        Long l4 = n21 != 0 ? transactionInformation2.pollingTime : l3;
        List list3 = (n4 &= 0x800) != 0 ? transactionInformation2.internalWallets : list2;
        int n22 = n7;
        string11 = string12;
        string10 = string13;
        string9 = string14;
        string8 = string15;
        string7 = string16;
        f6 = f7;
        bl4 = bl5;
        paymentInformation2 = paymentInformation3;
        offerDetails2 = offerDetails3;
        l3 = l4;
        list2 = list3;
        return transactionInformation.copy(n7 != 0, string12, string13, string14, string15, string16, f7, bl5, paymentInformation3, offerDetails3, l4, list3);
    }

    public final boolean component1() {
        return this.statusUnknown;
    }

    public final OfferDetails component10() {
        return this.offerDetails;
    }

    public final Long component11() {
        return this.pollingTime;
    }

    public final List component12() {
        return this.internalWallets;
    }

    public final String component2() {
        return this.tenantTransactionId;
    }

    public final String component3() {
        return this.paymentEngineTransactionId;
    }

    public final String component4() {
        return this.transactionStatus;
    }

    public final String component5() {
        return this.paymentGatewayCandidateTransactionId1;
    }

    public final String component6() {
        return this.paymentGatewayCandidateTransactionId2;
    }

    public final Float component7() {
        return this.totalAmount;
    }

    public final Boolean component8() {
        return this.transactionManipulated;
    }

    public final PaymentInformation component9() {
        return this.paymentInformation;
    }

    public final TransactionInformation copy(boolean bl2, String string2, String string3, String string4, String string5, String string6, Float f5, Boolean bl3, PaymentInformation paymentInformation, OfferDetails offerDetails, Long l2, List list) {
        TransactionInformation transactionInformation = new TransactionInformation(bl2, string2, string3, string4, string5, string6, f5, bl3, paymentInformation, offerDetails, l2, list);
        return transactionInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TransactionInformation;
        if (!bl3) {
            return false;
        }
        object = (TransactionInformation)object;
        bl3 = this.statusUnknown;
        boolean bl4 = ((TransactionInformation)object).statusUnknown;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.tenantTransactionId;
        Object object3 = ((TransactionInformation)object).tenantTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((TransactionInformation)object).paymentEngineTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((TransactionInformation)object).transactionStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentGatewayCandidateTransactionId1;
        object3 = ((TransactionInformation)object).paymentGatewayCandidateTransactionId1;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentGatewayCandidateTransactionId2;
        object3 = ((TransactionInformation)object).paymentGatewayCandidateTransactionId2;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalAmount;
        object3 = ((TransactionInformation)object).totalAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionManipulated;
        object3 = ((TransactionInformation)object).transactionManipulated;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInformation;
        object3 = ((TransactionInformation)object).paymentInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((TransactionInformation)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pollingTime;
        object3 = ((TransactionInformation)object).pollingTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.internalWallets;
        object = ((TransactionInformation)object).internalWallets;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final List getInternalWallets() {
        return this.internalWallets;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final String getPaymentGatewayCandidateTransactionId1() {
        return this.paymentGatewayCandidateTransactionId1;
    }

    public final String getPaymentGatewayCandidateTransactionId2() {
        return this.paymentGatewayCandidateTransactionId2;
    }

    public final PaymentInformation getPaymentInformation() {
        return this.paymentInformation;
    }

    public final Long getPollingTime() {
        return this.pollingTime;
    }

    public final boolean getStatusUnknown() {
        return this.statusUnknown;
    }

    public final String getTenantTransactionId() {
        return this.tenantTransactionId;
    }

    public final Float getTotalAmount() {
        return this.totalAmount;
    }

    public final Boolean getTransactionManipulated() {
        return this.transactionManipulated;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public int hashCode() {
        int n3;
        int n4 = this.statusUnknown;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        Object object = this.tenantTransactionId;
        int n7 = 0;
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
        object = this.transactionStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentGatewayCandidateTransactionId1;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentGatewayCandidateTransactionId2;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionManipulated;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((OfferDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pollingTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.internalWallets;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setInternalWallets(List list) {
        this.internalWallets = list;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setPaymentEngineTransactionId(String string2) {
        this.paymentEngineTransactionId = string2;
    }

    public final void setPaymentGatewayCandidateTransactionId1(String string2) {
        this.paymentGatewayCandidateTransactionId1 = string2;
    }

    public final void setPaymentGatewayCandidateTransactionId2(String string2) {
        this.paymentGatewayCandidateTransactionId2 = string2;
    }

    public final void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    public final void setPollingTime(Long l2) {
        this.pollingTime = l2;
    }

    public final void setStatusUnknown(boolean bl2) {
        this.statusUnknown = bl2;
    }

    public final void setTenantTransactionId(String string2) {
        this.tenantTransactionId = string2;
    }

    public final void setTotalAmount(Float f5) {
        this.totalAmount = f5;
    }

    public final void setTransactionManipulated(Boolean bl2) {
        this.transactionManipulated = bl2;
    }

    public final void setTransactionStatus(String string2) {
        this.transactionStatus = string2;
    }

    public String toString() {
        boolean bl2 = this.statusUnknown;
        String string2 = this.tenantTransactionId;
        String string3 = this.paymentEngineTransactionId;
        String string4 = this.transactionStatus;
        String string5 = this.paymentGatewayCandidateTransactionId1;
        String string6 = this.paymentGatewayCandidateTransactionId2;
        Float f5 = this.totalAmount;
        Boolean bl3 = this.transactionManipulated;
        PaymentInformation paymentInformation = this.paymentInformation;
        OfferDetails offerDetails = this.offerDetails;
        Long l2 = this.pollingTime;
        List list = this.internalWallets;
        StringBuilder stringBuilder = new StringBuilder("TransactionInformation(statusUnknown=");
        stringBuilder.append(bl2);
        stringBuilder.append(", tenantTransactionId=");
        stringBuilder.append(string2);
        stringBuilder.append(", paymentEngineTransactionId=");
        X50.a(stringBuilder, string3, ", transactionStatus=", string4, ", paymentGatewayCandidateTransactionId1=");
        X50.a(stringBuilder, string5, ", paymentGatewayCandidateTransactionId2=", string6, ", totalAmount=");
        stringBuilder.append(f5);
        stringBuilder.append(", transactionManipulated=");
        stringBuilder.append(bl3);
        stringBuilder.append(", paymentInformation=");
        stringBuilder.append(paymentInformation);
        stringBuilder.append(", offerDetails=");
        stringBuilder.append(offerDetails);
        stringBuilder.append(", pollingTime=");
        stringBuilder.append(l2);
        stringBuilder.append(", internalWallets=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

