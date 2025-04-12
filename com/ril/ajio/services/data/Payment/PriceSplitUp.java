/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceSplitUp
implements Serializable {
    private ConvenienceFeePriceSplitUp convenienceFee;
    private String instantDiscountMsg;
    private List internalWallets;
    private Float itemTotal;
    private Loyalty loyalty;
    private Float netPayableAmount;
    private OfferDetails offerDetails;
    private String onepTotalPrice;
    private PaymentInstrumentInfo paymentInstrumentInfo;
    private Boolean refreshCart;
    private String threepTotalPrice;
    private Float totalAmount;

    public PriceSplitUp() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public PriceSplitUp(Float f5, Loyalty loyalty, Float f6, Float f7, String string2, OfferDetails offerDetails, Boolean bl2, List list, PaymentInstrumentInfo paymentInstrumentInfo, ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, String string3, String string4) {
        this.totalAmount = f5;
        this.loyalty = loyalty;
        this.netPayableAmount = f6;
        this.itemTotal = f7;
        this.instantDiscountMsg = string2;
        this.offerDetails = offerDetails;
        this.refreshCart = bl2;
        this.internalWallets = list;
        this.paymentInstrumentInfo = paymentInstrumentInfo;
        this.convenienceFee = convenienceFeePriceSplitUp;
        this.onepTotalPrice = string3;
        this.threepTotalPrice = string4;
    }

    public /* synthetic */ PriceSplitUp(Float serializable, Loyalty serializable2, Float serializable3, Float f5, String object, OfferDetails object2, Boolean serializable4, List object3, PaymentInstrumentInfo object4, ConvenienceFeePriceSplitUp serializable5, String object5, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string3;
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp;
        PaymentInstrumentInfo paymentInstrumentInfo;
        List list;
        OfferDetails offerDetails;
        String string4;
        Loyalty loyalty;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f6 = Float.valueOf(0.0f);
        Float f7 = n7 != 0 ? f6 : serializable;
        int n8 = n4 & 2;
        String string5 = null;
        if (n8 != 0) {
            n8 = 0;
            loyalty = null;
        } else {
            loyalty = serializable2;
        }
        int n10 = n4 & 4;
        Float f8 = n10 != 0 ? f6 : serializable3;
        int n14 = n4 & 8;
        if (n14 == 0) {
            f6 = f5;
        }
        n14 = n4 & 0x10;
        if (n14 != 0) {
            n14 = 0;
            string4 = null;
        } else {
            string4 = object;
        }
        int n15 = n4 & 0x20;
        if (n15 != 0) {
            n15 = 0;
            offerDetails = null;
        } else {
            offerDetails = object2;
        }
        int n16 = n4 & 0x40;
        Boolean bl2 = n16 != 0 ? Boolean.FALSE : serializable4;
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            n17 = 0;
            list = null;
        } else {
            list = object3;
        }
        int n18 = n4 & 0x100;
        if (n18 != 0) {
            n18 = 0;
            paymentInstrumentInfo = null;
        } else {
            paymentInstrumentInfo = object4;
        }
        int n19 = n4 & 0x200;
        if (n19 != 0) {
            n19 = 0;
            convenienceFeePriceSplitUp = null;
        } else {
            convenienceFeePriceSplitUp = serializable5;
        }
        int n20 = n4 & 0x400;
        if (n20 != 0) {
            n20 = 0;
            string3 = null;
        } else {
            string3 = object5;
        }
        if ((n4 &= 0x800) == 0) {
            string5 = string2;
        }
        serializable = this;
        serializable2 = f7;
        serializable3 = loyalty;
        f5 = f8;
        object = f6;
        object2 = string4;
        serializable4 = offerDetails;
        object3 = bl2;
        object4 = list;
        serializable5 = paymentInstrumentInfo;
        object5 = convenienceFeePriceSplitUp;
        string2 = string3;
        this(f7, loyalty, f8, f6, string4, offerDetails, bl2, list, paymentInstrumentInfo, convenienceFeePriceSplitUp, string3, string5);
    }

    public static /* synthetic */ PriceSplitUp copy$default(PriceSplitUp priceSplitUp, Float f5, Loyalty loyalty, Float f6, Float f7, String string2, OfferDetails offerDetails, Boolean bl2, List list, PaymentInstrumentInfo paymentInstrumentInfo, ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, String string3, String string4, int n3, Object object) {
        PriceSplitUp priceSplitUp2 = priceSplitUp;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f8 = n7 != 0 ? priceSplitUp.totalAmount : f5;
        int n8 = n4 & 2;
        Loyalty loyalty2 = n8 != 0 ? priceSplitUp2.loyalty : loyalty;
        int n10 = n4 & 4;
        Float f11 = n10 != 0 ? priceSplitUp2.netPayableAmount : f6;
        int n14 = n4 & 8;
        Float f12 = n14 != 0 ? priceSplitUp2.itemTotal : f7;
        int n15 = n4 & 0x10;
        String string5 = n15 != 0 ? priceSplitUp2.instantDiscountMsg : string2;
        int n16 = n4 & 0x20;
        OfferDetails offerDetails2 = n16 != 0 ? priceSplitUp2.offerDetails : offerDetails;
        int n17 = n4 & 0x40;
        Boolean bl3 = n17 != 0 ? priceSplitUp2.refreshCart : bl2;
        int n18 = n4 & 0x80;
        List list2 = n18 != 0 ? priceSplitUp2.internalWallets : list;
        int n19 = n4 & 0x100;
        PaymentInstrumentInfo paymentInstrumentInfo2 = n19 != 0 ? priceSplitUp2.paymentInstrumentInfo : paymentInstrumentInfo;
        int n20 = n4 & 0x200;
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp2 = n20 != 0 ? priceSplitUp2.convenienceFee : convenienceFeePriceSplitUp;
        int n21 = n4 & 0x400;
        String string6 = n21 != 0 ? priceSplitUp2.onepTotalPrice : string3;
        String string7 = (n4 &= 0x800) != 0 ? priceSplitUp2.threepTotalPrice : string4;
        f5 = f8;
        loyalty = loyalty2;
        f6 = f11;
        f7 = f12;
        string2 = string5;
        offerDetails = offerDetails2;
        bl2 = bl3;
        list = list2;
        paymentInstrumentInfo = paymentInstrumentInfo2;
        convenienceFeePriceSplitUp = convenienceFeePriceSplitUp2;
        string3 = string6;
        string4 = string7;
        return priceSplitUp.copy(f8, loyalty2, f11, f12, string5, offerDetails2, bl3, list2, paymentInstrumentInfo2, convenienceFeePriceSplitUp2, string6, string7);
    }

    public final Float component1() {
        return this.totalAmount;
    }

    public final ConvenienceFeePriceSplitUp component10() {
        return this.convenienceFee;
    }

    public final String component11() {
        return this.onepTotalPrice;
    }

    public final String component12() {
        return this.threepTotalPrice;
    }

    public final Loyalty component2() {
        return this.loyalty;
    }

    public final Float component3() {
        return this.netPayableAmount;
    }

    public final Float component4() {
        return this.itemTotal;
    }

    public final String component5() {
        return this.instantDiscountMsg;
    }

    public final OfferDetails component6() {
        return this.offerDetails;
    }

    public final Boolean component7() {
        return this.refreshCart;
    }

    public final List component8() {
        return this.internalWallets;
    }

    public final PaymentInstrumentInfo component9() {
        return this.paymentInstrumentInfo;
    }

    public final PriceSplitUp copy(Float f5, Loyalty loyalty, Float f6, Float f7, String string2, OfferDetails offerDetails, Boolean bl2, List list, PaymentInstrumentInfo paymentInstrumentInfo, ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, String string3, String string4) {
        PriceSplitUp priceSplitUp = new PriceSplitUp(f5, loyalty, f6, f7, string2, offerDetails, bl2, list, paymentInstrumentInfo, convenienceFeePriceSplitUp, string3, string4);
        return priceSplitUp;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceSplitUp;
        if (!bl3) {
            return false;
        }
        object = (PriceSplitUp)object;
        Object object2 = this.totalAmount;
        Object object3 = ((PriceSplitUp)object).totalAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loyalty;
        object3 = ((PriceSplitUp)object).loyalty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object3 = ((PriceSplitUp)object).netPayableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.itemTotal;
        object3 = ((PriceSplitUp)object).itemTotal;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instantDiscountMsg;
        object3 = ((PriceSplitUp)object).instantDiscountMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((PriceSplitUp)object).offerDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refreshCart;
        object3 = ((PriceSplitUp)object).refreshCart;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.internalWallets;
        object3 = ((PriceSplitUp)object).internalWallets;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentInfo;
        object3 = ((PriceSplitUp)object).paymentInstrumentInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.convenienceFee;
        object3 = ((PriceSplitUp)object).convenienceFee;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.onepTotalPrice;
        object3 = ((PriceSplitUp)object).onepTotalPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.threepTotalPrice;
        object = ((PriceSplitUp)object).threepTotalPrice;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ConvenienceFeePriceSplitUp getConvenienceFee() {
        return this.convenienceFee;
    }

    public final String getInstantDiscountMsg() {
        return this.instantDiscountMsg;
    }

    public final List getInternalWallets() {
        return this.internalWallets;
    }

    public final Float getItemTotal() {
        return this.itemTotal;
    }

    public final Loyalty getLoyalty() {
        return this.loyalty;
    }

    public final Float getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final String getOnepTotalPrice() {
        return this.onepTotalPrice;
    }

    public final PaymentInstrumentInfo getPaymentInstrumentInfo() {
        return this.paymentInstrumentInfo;
    }

    public final Boolean getRefreshCart() {
        return this.refreshCart;
    }

    public final String getThreepTotalPrice() {
        return this.threepTotalPrice;
    }

    public final Float getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.totalAmount;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Object object = this.loyalty;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Loyalty)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.netPayableAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.itemTotal;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instantDiscountMsg;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.refreshCart;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.internalWallets;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentInstrumentInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.convenienceFee;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ConvenienceFeePriceSplitUp)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.onepTotalPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.threepTotalPrice;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setConvenienceFee(ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp) {
        this.convenienceFee = convenienceFeePriceSplitUp;
    }

    public final void setInstantDiscountMsg(String string2) {
        this.instantDiscountMsg = string2;
    }

    public final void setInternalWallets(List list) {
        this.internalWallets = list;
    }

    public final void setItemTotal(Float f5) {
        this.itemTotal = f5;
    }

    public final void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public final void setNetPayableAmount(Float f5) {
        this.netPayableAmount = f5;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setOnepTotalPrice(String string2) {
        this.onepTotalPrice = string2;
    }

    public final void setPaymentInstrumentInfo(PaymentInstrumentInfo paymentInstrumentInfo) {
        this.paymentInstrumentInfo = paymentInstrumentInfo;
    }

    public final void setRefreshCart(Boolean bl2) {
        this.refreshCart = bl2;
    }

    public final void setThreepTotalPrice(String string2) {
        this.threepTotalPrice = string2;
    }

    public final void setTotalAmount(Float f5) {
        this.totalAmount = f5;
    }

    public String toString() {
        Float f5 = this.totalAmount;
        Loyalty loyalty = this.loyalty;
        Float f6 = this.netPayableAmount;
        Float f7 = this.itemTotal;
        String string2 = this.instantDiscountMsg;
        OfferDetails offerDetails = this.offerDetails;
        Boolean bl2 = this.refreshCart;
        List list = this.internalWallets;
        PaymentInstrumentInfo paymentInstrumentInfo = this.paymentInstrumentInfo;
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp = this.convenienceFee;
        String string3 = this.onepTotalPrice;
        String string4 = this.threepTotalPrice;
        StringBuilder stringBuilder = new StringBuilder("PriceSplitUp(totalAmount=");
        stringBuilder.append(f5);
        stringBuilder.append(", loyalty=");
        stringBuilder.append(loyalty);
        stringBuilder.append(", netPayableAmount=");
        stringBuilder.append(f6);
        stringBuilder.append(", itemTotal=");
        stringBuilder.append(f7);
        stringBuilder.append(", instantDiscountMsg=");
        stringBuilder.append(string2);
        stringBuilder.append(", offerDetails=");
        stringBuilder.append(offerDetails);
        stringBuilder.append(", refreshCart=");
        stringBuilder.append(bl2);
        stringBuilder.append(", internalWallets=");
        stringBuilder.append(list);
        stringBuilder.append(", paymentInstrumentInfo=");
        stringBuilder.append(paymentInstrumentInfo);
        stringBuilder.append(", convenienceFee=");
        stringBuilder.append(convenienceFeePriceSplitUp);
        stringBuilder.append(", onepTotalPrice=");
        return ko_0.a(stringBuilder, string3, ", threepTotalPrice=", string4, ")");
    }
}

