/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OfferDetails
implements Serializable {
    private Float amountConsideredForOffer;
    private Float amountPayableByGatewayPostOffer;
    private String bankOfferPk;
    private String cardToken;
    private String instantDiscountMsg;
    private Float maximumOfferAmount;
    private Float netPayableAmount;
    private Float offerAmountApplied;
    private Boolean offerCapExceeded;
    private String offerDescription;
    private List offerExcludedProducts;
    private Float offerInPercentageApplied;
    private Float totalAmount;

    public OfferDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public OfferDetails(Float f5, Float f6, Float f7, Float f8, String string2, String string3, Boolean bl2, String string4, String string5, Float f11, Float f12, Float f14, List list) {
        this.totalAmount = f5;
        this.amountConsideredForOffer = f6;
        this.offerAmountApplied = f7;
        this.maximumOfferAmount = f8;
        this.instantDiscountMsg = string2;
        this.offerDescription = string3;
        this.offerCapExceeded = bl2;
        this.cardToken = string4;
        this.bankOfferPk = string5;
        this.offerInPercentageApplied = f11;
        this.amountPayableByGatewayPostOffer = f12;
        this.netPayableAmount = f14;
        this.offerExcludedProducts = list;
    }

    public /* synthetic */ OfferDetails(Float serializable, Float f5, Float f6, Float f7, String object, String string2, Boolean object2, String object3, String string3, Float object4, Float f8, Float f11, List object5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string4;
        String string5;
        String string6;
        String string7;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f12 = Float.valueOf(0.0f);
        Float f14 = n7 != 0 ? f12 : serializable;
        int n8 = n4 & 2;
        Float f15 = n8 != 0 ? f12 : f5;
        int n10 = n4 & 4;
        Float f16 = n10 != 0 ? f12 : f6;
        int n14 = n4 & 8;
        Float f17 = n14 != 0 ? f12 : f7;
        int n15 = n4 & 0x10;
        List list = null;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n17 = n4 & 0x40;
        Object object6 = n17 != 0 ? Boolean.FALSE : object2;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string5 = null;
        } else {
            string5 = object3;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n20 = n4 & 0x200;
        Object object7 = n20 != 0 ? f12 : object4;
        int n21 = n4 & 0x400;
        Float f18 = n21 != 0 ? f12 : f8;
        int n22 = n4 & 0x800;
        if (n22 == 0) {
            f12 = f11;
        }
        if ((n4 &= 0x1000) == 0) {
            list = object5;
        }
        serializable = this;
        f5 = f14;
        f6 = f15;
        f7 = f16;
        object = f17;
        string2 = string7;
        object2 = string6;
        object3 = object6;
        string3 = string5;
        object4 = string4;
        f8 = object7;
        f11 = f18;
        object5 = f12;
        this(f14, f15, f16, f17, string7, string6, (Boolean)object6, string5, string4, (Float)object7, f18, f12, list);
    }

    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, Float f5, Float f6, Float f7, Float f8, String string2, String string3, Boolean bl2, String string4, String string5, Float f11, Float f12, Float f14, List list, int n3, Object object) {
        OfferDetails offerDetails2 = offerDetails;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f15 = n7 != 0 ? offerDetails.totalAmount : f5;
        int n8 = n4 & 2;
        Float f16 = n8 != 0 ? offerDetails2.amountConsideredForOffer : f6;
        int n10 = n4 & 4;
        Float f17 = n10 != 0 ? offerDetails2.offerAmountApplied : f7;
        int n14 = n4 & 8;
        Float f18 = n14 != 0 ? offerDetails2.maximumOfferAmount : f8;
        int n15 = n4 & 0x10;
        String string6 = n15 != 0 ? offerDetails2.instantDiscountMsg : string2;
        int n16 = n4 & 0x20;
        String string7 = n16 != 0 ? offerDetails2.offerDescription : string3;
        int n17 = n4 & 0x40;
        Boolean bl3 = n17 != 0 ? offerDetails2.offerCapExceeded : bl2;
        int n18 = n4 & 0x80;
        String string8 = n18 != 0 ? offerDetails2.cardToken : string4;
        int n19 = n4 & 0x100;
        String string9 = n19 != 0 ? offerDetails2.bankOfferPk : string5;
        int n20 = n4 & 0x200;
        Float f19 = n20 != 0 ? offerDetails2.offerInPercentageApplied : f11;
        int n21 = n4 & 0x400;
        Float f20 = n21 != 0 ? offerDetails2.amountPayableByGatewayPostOffer : f12;
        int n22 = n4 & 0x800;
        Float f22 = n22 != 0 ? offerDetails2.netPayableAmount : f14;
        List list2 = (n4 &= 0x1000) != 0 ? offerDetails2.offerExcludedProducts : list;
        f5 = f15;
        f6 = f16;
        f7 = f17;
        f8 = f18;
        string2 = string6;
        string3 = string7;
        bl2 = bl3;
        string4 = string8;
        string5 = string9;
        f11 = f19;
        f12 = f20;
        f14 = f22;
        list = list2;
        return offerDetails.copy(f15, f16, f17, f18, string6, string7, bl3, string8, string9, f19, f20, f22, list2);
    }

    public final Float component1() {
        return this.totalAmount;
    }

    public final Float component10() {
        return this.offerInPercentageApplied;
    }

    public final Float component11() {
        return this.amountPayableByGatewayPostOffer;
    }

    public final Float component12() {
        return this.netPayableAmount;
    }

    public final List component13() {
        return this.offerExcludedProducts;
    }

    public final Float component2() {
        return this.amountConsideredForOffer;
    }

    public final Float component3() {
        return this.offerAmountApplied;
    }

    public final Float component4() {
        return this.maximumOfferAmount;
    }

    public final String component5() {
        return this.instantDiscountMsg;
    }

    public final String component6() {
        return this.offerDescription;
    }

    public final Boolean component7() {
        return this.offerCapExceeded;
    }

    public final String component8() {
        return this.cardToken;
    }

    public final String component9() {
        return this.bankOfferPk;
    }

    public final OfferDetails copy(Float f5, Float f6, Float f7, Float f8, String string2, String string3, Boolean bl2, String string4, String string5, Float f11, Float f12, Float f14, List list) {
        OfferDetails offerDetails = new OfferDetails(f5, f6, f7, f8, string2, string3, bl2, string4, string5, f11, f12, f14, list);
        return offerDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OfferDetails;
        if (!bl3) {
            return false;
        }
        object = (OfferDetails)object;
        Object object2 = this.totalAmount;
        Object object3 = ((OfferDetails)object).totalAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amountConsideredForOffer;
        object3 = ((OfferDetails)object).amountConsideredForOffer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerAmountApplied;
        object3 = ((OfferDetails)object).offerAmountApplied;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.maximumOfferAmount;
        object3 = ((OfferDetails)object).maximumOfferAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instantDiscountMsg;
        object3 = ((OfferDetails)object).instantDiscountMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerDescription;
        object3 = ((OfferDetails)object).offerDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerCapExceeded;
        object3 = ((OfferDetails)object).offerCapExceeded;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardToken;
        object3 = ((OfferDetails)object).cardToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankOfferPk;
        object3 = ((OfferDetails)object).bankOfferPk;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerInPercentageApplied;
        object3 = ((OfferDetails)object).offerInPercentageApplied;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amountPayableByGatewayPostOffer;
        object3 = ((OfferDetails)object).amountPayableByGatewayPostOffer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object3 = ((OfferDetails)object).netPayableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerExcludedProducts;
        object = ((OfferDetails)object).offerExcludedProducts;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAmountConsideredForOffer() {
        return this.amountConsideredForOffer;
    }

    public final Float getAmountPayableByGatewayPostOffer() {
        return this.amountPayableByGatewayPostOffer;
    }

    public final String getBankOfferPk() {
        return this.bankOfferPk;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final String getInstantDiscountMsg() {
        return this.instantDiscountMsg;
    }

    public final Float getMaximumOfferAmount() {
        return this.maximumOfferAmount;
    }

    public final Float getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final Float getOfferAmountApplied() {
        return this.offerAmountApplied;
    }

    public final Boolean getOfferCapExceeded() {
        return this.offerCapExceeded;
    }

    public final String getOfferDescription() {
        return this.offerDescription;
    }

    public final List getOfferExcludedProducts() {
        return this.offerExcludedProducts;
    }

    public final Float getOfferInPercentageApplied() {
        return this.offerInPercentageApplied;
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
        Object object = this.amountConsideredForOffer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerAmountApplied;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maximumOfferAmount;
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
        object = this.offerDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerCapExceeded;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankOfferPk;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerInPercentageApplied;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.amountPayableByGatewayPostOffer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.offerExcludedProducts;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setAmountConsideredForOffer(Float f5) {
        this.amountConsideredForOffer = f5;
    }

    public final void setAmountPayableByGatewayPostOffer(Float f5) {
        this.amountPayableByGatewayPostOffer = f5;
    }

    public final void setBankOfferPk(String string2) {
        this.bankOfferPk = string2;
    }

    public final void setCardToken(String string2) {
        this.cardToken = string2;
    }

    public final void setInstantDiscountMsg(String string2) {
        this.instantDiscountMsg = string2;
    }

    public final void setMaximumOfferAmount(Float f5) {
        this.maximumOfferAmount = f5;
    }

    public final void setNetPayableAmount(Float f5) {
        this.netPayableAmount = f5;
    }

    public final void setOfferAmountApplied(Float f5) {
        this.offerAmountApplied = f5;
    }

    public final void setOfferCapExceeded(Boolean bl2) {
        this.offerCapExceeded = bl2;
    }

    public final void setOfferDescription(String string2) {
        this.offerDescription = string2;
    }

    public final void setOfferExcludedProducts(List list) {
        this.offerExcludedProducts = list;
    }

    public final void setOfferInPercentageApplied(Float f5) {
        this.offerInPercentageApplied = f5;
    }

    public final void setTotalAmount(Float f5) {
        this.totalAmount = f5;
    }

    public String toString() {
        Float f5 = this.totalAmount;
        Float f6 = this.amountConsideredForOffer;
        Float f7 = this.offerAmountApplied;
        Float f8 = this.maximumOfferAmount;
        String string2 = this.instantDiscountMsg;
        String string3 = this.offerDescription;
        Boolean bl2 = this.offerCapExceeded;
        String string4 = this.cardToken;
        String string5 = this.bankOfferPk;
        Float f11 = this.offerInPercentageApplied;
        Float f12 = this.amountPayableByGatewayPostOffer;
        Float f14 = this.netPayableAmount;
        List list = this.offerExcludedProducts;
        StringBuilder stringBuilder = new StringBuilder("OfferDetails(totalAmount=");
        stringBuilder.append(f5);
        stringBuilder.append(", amountConsideredForOffer=");
        stringBuilder.append(f6);
        stringBuilder.append(", offerAmountApplied=");
        stringBuilder.append(f7);
        stringBuilder.append(", maximumOfferAmount=");
        stringBuilder.append(f8);
        stringBuilder.append(", instantDiscountMsg=");
        X50.a(stringBuilder, string2, ", offerDescription=", string3, ", offerCapExceeded=");
        xi0_2.a(bl2, ", cardToken=", string4, ", bankOfferPk=", stringBuilder);
        stringBuilder.append(string5);
        stringBuilder.append(", offerInPercentageApplied=");
        stringBuilder.append(f11);
        stringBuilder.append(", amountPayableByGatewayPostOffer=");
        stringBuilder.append(f12);
        stringBuilder.append(", netPayableAmount=");
        stringBuilder.append(f14);
        stringBuilder.append(", offerExcludedProducts=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

