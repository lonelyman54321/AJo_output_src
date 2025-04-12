/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.user.AffiliateData;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OrderSummary
implements Serializable {
    private Float additionalTax;
    private AffiliateData affiliateData;
    private Float bagDiscount;
    private Float bagSaving;
    private Float bagTotal;
    private Float bankOfferAmt;
    private Float couponDiscount;
    private Float deliveryCost;
    private Float discount;
    private Float giftCharge;
    private ArrayList internalWalletAmountList;
    private Float loyaltyPoint;
    private Float orderTotal;
    private Float payable;
    private final Float priorityDeliveryCharges;
    private Float promoDiscount;
    private Float shippingCharges;

    public OrderSummary(Float f5, Float f6, Float f7, Float f8, Float f11, Float f12, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f22, ArrayList arrayList, AffiliateData affiliateData, Float f23) {
        this.bagTotal = f5;
        this.shippingCharges = f6;
        this.orderTotal = f7;
        this.payable = f8;
        this.bagSaving = f11;
        this.deliveryCost = f12;
        this.loyaltyPoint = f14;
        this.bankOfferAmt = f15;
        this.giftCharge = f16;
        this.promoDiscount = f17;
        this.bagDiscount = f18;
        this.couponDiscount = f19;
        this.additionalTax = f20;
        this.discount = f22;
        this.internalWalletAmountList = arrayList;
        this.affiliateData = affiliateData;
        this.priorityDeliveryCharges = f23;
    }

    public /* synthetic */ OrderSummary(Float f5, Float f6, Float f7, Float f8, Float f11, Float f12, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f22, ArrayList arrayList, AffiliateData affiliateData, Float f23, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3;
        int n7 = n3 & 1;
        Float f24 = Float.valueOf(0.0f);
        Float f25 = n7 != 0 ? f24 : f5;
        n7 = n4 & 2;
        Float f26 = n7 != 0 ? f24 : f6;
        n7 = n4 & 4;
        Float f27 = n7 != 0 ? f24 : f7;
        n7 = n4 & 8;
        Float f28 = n7 != 0 ? f24 : f8;
        n7 = n4 & 0x10;
        Float f29 = n7 != 0 ? f24 : f11;
        n7 = n4 & 0x20;
        Float f30 = n7 != 0 ? f24 : f12;
        n7 = n4 & 0x40;
        Float f31 = n7 != 0 ? f24 : f14;
        n7 = n4 & 0x80;
        Float f34 = n7 != 0 ? f24 : f15;
        n7 = n4 & 0x100;
        Float f35 = n7 != 0 ? f24 : f16;
        n7 = n4 & 0x200;
        Float f36 = n7 != 0 ? f24 : f17;
        n7 = n4 & 0x400;
        Float f37 = n7 != 0 ? f24 : f18;
        n7 = n4 & 0x800;
        Float f38 = n7 != 0 ? f24 : f19;
        n7 = n4 & 0x1000;
        Float f39 = n7 != 0 ? f24 : f20;
        n7 = n4 & 0x2000;
        Float f41 = n7 != 0 ? f24 : f22;
        n7 = n4 & 0x4000;
        f24 = null;
        ArrayList arrayList2 = n7 != 0 ? null : arrayList;
        n7 = 32768;
        AffiliateData affiliateData2 = (n4 &= n7) != 0 ? null : affiliateData;
        this(f25, f26, f27, f28, f29, f30, f31, f34, f35, f36, f37, f38, f39, f41, arrayList2, affiliateData2, f23);
    }

    public static /* synthetic */ OrderSummary copy$default(OrderSummary orderSummary, Float f5, Float f6, Float f7, Float f8, Float f11, Float f12, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f22, ArrayList serializable, AffiliateData serializable2, Float f23, int n3, Object object) {
        OrderSummary orderSummary2 = orderSummary;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f24 = n7 != 0 ? orderSummary.bagTotal : f5;
        int n8 = n4 & 2;
        Float f25 = n8 != 0 ? orderSummary2.shippingCharges : f6;
        int n10 = n4 & 4;
        Float f26 = n10 != 0 ? orderSummary2.orderTotal : f7;
        int n14 = n4 & 8;
        Float f27 = n14 != 0 ? orderSummary2.payable : f8;
        int n15 = n4 & 0x10;
        Float f28 = n15 != 0 ? orderSummary2.bagSaving : f11;
        int n16 = n4 & 0x20;
        Float f29 = n16 != 0 ? orderSummary2.deliveryCost : f12;
        int n17 = n4 & 0x40;
        Float f30 = n17 != 0 ? orderSummary2.loyaltyPoint : f14;
        int n18 = n4 & 0x80;
        Float f31 = n18 != 0 ? orderSummary2.bankOfferAmt : f15;
        int n19 = n4 & 0x100;
        Float f34 = n19 != 0 ? orderSummary2.giftCharge : f16;
        int n20 = n4 & 0x200;
        Float f35 = n20 != 0 ? orderSummary2.promoDiscount : f17;
        int n21 = n4 & 0x400;
        Float f36 = n21 != 0 ? orderSummary2.bagDiscount : f18;
        int n22 = n4 & 0x800;
        Float f37 = n22 != 0 ? orderSummary2.couponDiscount : f19;
        int n24 = n4 & 0x1000;
        Float f38 = n24 != 0 ? orderSummary2.additionalTax : f20;
        int n25 = n4 & 0x2000;
        Serializable serializable3 = n25 != 0 ? orderSummary2.discount : f22;
        f22 = serializable3;
        n25 = n4 & 0x4000;
        serializable3 = n25 != 0 ? orderSummary2.internalWalletAmountList : serializable;
        int n26 = n4 & 0x8000;
        serializable = serializable3;
        serializable3 = n26 != 0 ? orderSummary2.affiliateData : serializable2;
        n26 = 65536;
        Float f39 = (n4 &= n26) != 0 ? orderSummary2.priorityDeliveryCharges : f23;
        f5 = f24;
        f6 = f25;
        f7 = f26;
        f8 = f27;
        f11 = f28;
        f12 = f29;
        f14 = f30;
        f15 = f31;
        f16 = f34;
        f17 = f35;
        f18 = f36;
        f19 = f37;
        f20 = f38;
        serializable2 = serializable3;
        f23 = f39;
        return orderSummary.copy(f24, f25, f26, f27, f28, f29, f30, f31, f34, f35, f36, f37, f38, f22, (ArrayList)serializable, (AffiliateData)serializable3, f39);
    }

    public final Float component1() {
        return this.bagTotal;
    }

    public final Float component10() {
        return this.promoDiscount;
    }

    public final Float component11() {
        return this.bagDiscount;
    }

    public final Float component12() {
        return this.couponDiscount;
    }

    public final Float component13() {
        return this.additionalTax;
    }

    public final Float component14() {
        return this.discount;
    }

    public final ArrayList component15() {
        return this.internalWalletAmountList;
    }

    public final AffiliateData component16() {
        return this.affiliateData;
    }

    public final Float component17() {
        return this.priorityDeliveryCharges;
    }

    public final Float component2() {
        return this.shippingCharges;
    }

    public final Float component3() {
        return this.orderTotal;
    }

    public final Float component4() {
        return this.payable;
    }

    public final Float component5() {
        return this.bagSaving;
    }

    public final Float component6() {
        return this.deliveryCost;
    }

    public final Float component7() {
        return this.loyaltyPoint;
    }

    public final Float component8() {
        return this.bankOfferAmt;
    }

    public final Float component9() {
        return this.giftCharge;
    }

    public final OrderSummary copy(Float f5, Float f6, Float f7, Float f8, Float f11, Float f12, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f22, ArrayList arrayList, AffiliateData affiliateData, Float f23) {
        OrderSummary orderSummary = new OrderSummary(f5, f6, f7, f8, f11, f12, f14, f15, f16, f17, f18, f19, f20, f22, arrayList, affiliateData, f23);
        return orderSummary;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OrderSummary;
        if (!bl3) {
            return false;
        }
        object = (OrderSummary)object;
        Serializable serializable = this.bagTotal;
        Serializable serializable2 = ((OrderSummary)object).bagTotal;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.shippingCharges;
        serializable2 = ((OrderSummary)object).shippingCharges;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.orderTotal;
        serializable2 = ((OrderSummary)object).orderTotal;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.payable;
        serializable2 = ((OrderSummary)object).payable;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.bagSaving;
        serializable2 = ((OrderSummary)object).bagSaving;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.deliveryCost;
        serializable2 = ((OrderSummary)object).deliveryCost;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.loyaltyPoint;
        serializable2 = ((OrderSummary)object).loyaltyPoint;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.bankOfferAmt;
        serializable2 = ((OrderSummary)object).bankOfferAmt;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.giftCharge;
        serializable2 = ((OrderSummary)object).giftCharge;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.promoDiscount;
        serializable2 = ((OrderSummary)object).promoDiscount;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.bagDiscount;
        serializable2 = ((OrderSummary)object).bagDiscount;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.couponDiscount;
        serializable2 = ((OrderSummary)object).couponDiscount;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.additionalTax;
        serializable2 = ((OrderSummary)object).additionalTax;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.discount;
        serializable2 = ((OrderSummary)object).discount;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.internalWalletAmountList;
        serializable2 = ((OrderSummary)object).internalWalletAmountList;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.affiliateData;
        serializable2 = ((OrderSummary)object).affiliateData;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.priorityDeliveryCharges;
        object = ((OrderSummary)object).priorityDeliveryCharges;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAdditionalTax() {
        return this.additionalTax;
    }

    public final AffiliateData getAffiliateData() {
        return this.affiliateData;
    }

    public final Float getBagDiscount() {
        return this.bagDiscount;
    }

    public final Float getBagSaving() {
        return this.bagSaving;
    }

    public final Float getBagTotal() {
        return this.bagTotal;
    }

    public final Float getBankOfferAmt() {
        return this.bankOfferAmt;
    }

    public final Float getCouponDiscount() {
        return this.couponDiscount;
    }

    public final Float getDeliveryCost() {
        return this.deliveryCost;
    }

    public final Float getDiscount() {
        return this.discount;
    }

    public final Float getGiftCharge() {
        return this.giftCharge;
    }

    public final ArrayList getInternalWalletAmountList() {
        return this.internalWalletAmountList;
    }

    public final Float getLoyaltyPoint() {
        return this.loyaltyPoint;
    }

    public final Float getOrderTotal() {
        return this.orderTotal;
    }

    public final Float getPayable() {
        return this.payable;
    }

    public final Float getPriorityDeliveryCharges() {
        return this.priorityDeliveryCharges;
    }

    public final Float getPromoDiscount() {
        return this.promoDiscount;
    }

    public final Float getShippingCharges() {
        return this.shippingCharges;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.bagTotal;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.shippingCharges;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.orderTotal;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.payable;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.bagSaving;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.deliveryCost;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.loyaltyPoint;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.bankOfferAmt;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.giftCharge;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.promoDiscount;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.bagDiscount;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.couponDiscount;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.additionalTax;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.discount;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.internalWalletAmountList;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ArrayList)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.affiliateData;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((AffiliateData)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.priorityDeliveryCharges;
        if (serializable != null) {
            n7 = serializable.hashCode();
        }
        return n4 + n7;
    }

    public final void setAdditionalTax(Float f5) {
        this.additionalTax = f5;
    }

    public final void setAffiliateData(AffiliateData affiliateData) {
        this.affiliateData = affiliateData;
    }

    public final void setBagDiscount(Float f5) {
        this.bagDiscount = f5;
    }

    public final void setBagSaving(Float f5) {
        this.bagSaving = f5;
    }

    public final void setBagTotal(Float f5) {
        this.bagTotal = f5;
    }

    public final void setBankOfferAmt(Float f5) {
        this.bankOfferAmt = f5;
    }

    public final void setCouponDiscount(Float f5) {
        this.couponDiscount = f5;
    }

    public final void setDeliveryCost(Float f5) {
        this.deliveryCost = f5;
    }

    public final void setDiscount(Float f5) {
        this.discount = f5;
    }

    public final void setGiftCharge(Float f5) {
        this.giftCharge = f5;
    }

    public final void setInternalWalletAmountList(ArrayList arrayList) {
        this.internalWalletAmountList = arrayList;
    }

    public final void setLoyaltyPoint(Float f5) {
        this.loyaltyPoint = f5;
    }

    public final void setOrderTotal(Float f5) {
        this.orderTotal = f5;
    }

    public final void setPayable(Float f5) {
        this.payable = f5;
    }

    public final void setPromoDiscount(Float f5) {
        this.promoDiscount = f5;
    }

    public final void setShippingCharges(Float f5) {
        this.shippingCharges = f5;
    }

    public String toString() {
        Serializable serializable = this;
        Serializable serializable2 = this.bagTotal;
        Float f5 = this.shippingCharges;
        Float f6 = this.orderTotal;
        Float f7 = this.payable;
        Float f8 = this.bagSaving;
        Float f11 = this.deliveryCost;
        Float f12 = this.loyaltyPoint;
        Float f14 = this.bankOfferAmt;
        Float f15 = this.giftCharge;
        Float f16 = this.promoDiscount;
        Float f17 = this.bagDiscount;
        Float f18 = this.couponDiscount;
        Float f19 = this.additionalTax;
        Float f20 = this.discount;
        ArrayList arrayList = this.internalWalletAmountList;
        AffiliateData affiliateData = this.affiliateData;
        Float f22 = this.priorityDeliveryCharges;
        serializable = new StringBuilder("OrderSummary(bagTotal=");
        ((StringBuilder)serializable).append(serializable2);
        ((StringBuilder)serializable).append(", shippingCharges=");
        ((StringBuilder)serializable).append(f5);
        ((StringBuilder)serializable).append(", orderTotal=");
        ((StringBuilder)serializable).append(f6);
        ((StringBuilder)serializable).append(", payable=");
        ((StringBuilder)serializable).append(f7);
        ((StringBuilder)serializable).append(", bagSaving=");
        ((StringBuilder)serializable).append(f8);
        ((StringBuilder)serializable).append(", deliveryCost=");
        ((StringBuilder)serializable).append(f11);
        ((StringBuilder)serializable).append(", loyaltyPoint=");
        ((StringBuilder)serializable).append(f12);
        ((StringBuilder)serializable).append(", bankOfferAmt=");
        ((StringBuilder)serializable).append(f14);
        ((StringBuilder)serializable).append(", giftCharge=");
        ((StringBuilder)serializable).append(f15);
        ((StringBuilder)serializable).append(", promoDiscount=");
        ((StringBuilder)serializable).append(f16);
        ((StringBuilder)serializable).append(", bagDiscount=");
        ((StringBuilder)serializable).append(f17);
        ((StringBuilder)serializable).append(", couponDiscount=");
        ((StringBuilder)serializable).append(f18);
        ((StringBuilder)serializable).append(", additionalTax=");
        ((StringBuilder)serializable).append(f19);
        ((StringBuilder)serializable).append(", discount=");
        ((StringBuilder)serializable).append(f20);
        ((StringBuilder)serializable).append(", internalWalletAmountList=");
        serializable2 = arrayList;
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append(", affiliateData=");
        serializable2 = affiliateData;
        ((StringBuilder)serializable).append(affiliateData);
        ((StringBuilder)serializable).append(", priorityDeliveryCharges=");
        serializable2 = f22;
        ((StringBuilder)serializable).append(f22);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }
}

