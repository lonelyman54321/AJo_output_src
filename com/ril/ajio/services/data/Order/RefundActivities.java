/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RefundActivities
implements Serializable {
    private Double amount;
    private String cardNetwork;
    private String createdDate;
    private String itemId;
    private String logo;
    private String maskedDigits;
    private String mop;
    private Integer qty;
    private String refundActivity;
    private String refundStatus;
    private String updatedDate;

    public RefundActivities() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public RefundActivities(String string2, String string3, Integer n3, Double d2, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        this.refundActivity = string2;
        this.itemId = string3;
        this.qty = n3;
        this.amount = d2;
        this.mop = string4;
        this.refundStatus = string5;
        this.createdDate = string6;
        this.updatedDate = string7;
        this.logo = string8;
        this.maskedDigits = string9;
        this.cardNetwork = string10;
    }

    public /* synthetic */ RefundActivities(String object, String string2, Integer object2, Double number, String object3, String string3, String string4, String string5, String string6, String string7, String string8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        Double d2;
        Integer n4;
        String string15;
        String string16;
        int n7 = n3;
        int n8 = n3 & 1;
        String string17 = null;
        if (n8 != 0) {
            n8 = 0;
            string16 = null;
        } else {
            string16 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string15 = null;
        } else {
            string15 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            n4 = null;
        } else {
            n4 = object2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            d2 = null;
        } else {
            d2 = number;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string14 = null;
        } else {
            string14 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string11 = null;
        } else {
            string11 = string5;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string10 = null;
        } else {
            string10 = string6;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string9 = null;
        } else {
            string9 = string7;
        }
        if ((n7 &= 0x400) == 0) {
            string17 = string8;
        }
        object = this;
        string2 = string16;
        object2 = string15;
        number = n4;
        object3 = d2;
        string3 = string14;
        string4 = string13;
        string5 = string12;
        string6 = string11;
        string7 = string10;
        string8 = string9;
        this(string16, string15, n4, d2, string14, string13, string12, string11, string10, string9, string17);
    }

    public static /* synthetic */ RefundActivities copy$default(RefundActivities refundActivities, String string2, String string3, Integer n3, Double d2, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n4, Object object) {
        RefundActivities refundActivities2 = refundActivities;
        int n7 = n4;
        int n8 = n4 & 1;
        String string11 = n8 != 0 ? refundActivities.refundActivity : string2;
        int n10 = n7 & 2;
        String string12 = n10 != 0 ? refundActivities2.itemId : string3;
        int n14 = n7 & 4;
        Integer n15 = n14 != 0 ? refundActivities2.qty : n3;
        int n16 = n7 & 8;
        Double d5 = n16 != 0 ? refundActivities2.amount : d2;
        int n17 = n7 & 0x10;
        String string13 = n17 != 0 ? refundActivities2.mop : string4;
        int n18 = n7 & 0x20;
        String string14 = n18 != 0 ? refundActivities2.refundStatus : string5;
        int n19 = n7 & 0x40;
        String string15 = n19 != 0 ? refundActivities2.createdDate : string6;
        int n20 = n7 & 0x80;
        String string16 = n20 != 0 ? refundActivities2.updatedDate : string7;
        int n21 = n7 & 0x100;
        String string17 = n21 != 0 ? refundActivities2.logo : string8;
        int n22 = n7 & 0x200;
        String string18 = n22 != 0 ? refundActivities2.maskedDigits : string9;
        String string19 = (n7 &= 0x400) != 0 ? refundActivities2.cardNetwork : string10;
        string2 = string11;
        string3 = string12;
        n3 = n15;
        d2 = d5;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        return refundActivities.copy(string11, string12, n15, d5, string13, string14, string15, string16, string17, string18, string19);
    }

    public final String component1() {
        return this.refundActivity;
    }

    public final String component10() {
        return this.maskedDigits;
    }

    public final String component11() {
        return this.cardNetwork;
    }

    public final String component2() {
        return this.itemId;
    }

    public final Integer component3() {
        return this.qty;
    }

    public final Double component4() {
        return this.amount;
    }

    public final String component5() {
        return this.mop;
    }

    public final String component6() {
        return this.refundStatus;
    }

    public final String component7() {
        return this.createdDate;
    }

    public final String component8() {
        return this.updatedDate;
    }

    public final String component9() {
        return this.logo;
    }

    public final RefundActivities copy(String string2, String string3, Integer n3, Double d2, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        RefundActivities refundActivities = new RefundActivities(string2, string3, n3, d2, string4, string5, string6, string7, string8, string9, string10);
        return refundActivities;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefundActivities;
        if (!bl3) {
            return false;
        }
        object = (RefundActivities)object;
        Object object2 = this.refundActivity;
        Object object3 = ((RefundActivities)object).refundActivity;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.itemId;
        object3 = ((RefundActivities)object).itemId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.qty;
        object3 = ((RefundActivities)object).qty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((RefundActivities)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mop;
        object3 = ((RefundActivities)object).mop;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundStatus;
        object3 = ((RefundActivities)object).refundStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.createdDate;
        object3 = ((RefundActivities)object).createdDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.updatedDate;
        object3 = ((RefundActivities)object).updatedDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((RefundActivities)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.maskedDigits;
        object3 = ((RefundActivities)object).maskedDigits;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardNetwork;
        object = ((RefundActivities)object).cardNetwork;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getMaskedDigits() {
        return this.maskedDigits;
    }

    public final String getMop() {
        return this.mop;
    }

    public final Integer getQty() {
        return this.qty;
    }

    public final String getRefundActivity() {
        return this.refundActivity;
    }

    public final String getRefundStatus() {
        return this.refundStatus;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.refundActivity;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.itemId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.qty;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.amount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mop;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.createdDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.updatedDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.logo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maskedDigits;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardNetwork;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Double d2) {
        this.amount = d2;
    }

    public final void setCardNetwork(String string2) {
        this.cardNetwork = string2;
    }

    public final void setCreatedDate(String string2) {
        this.createdDate = string2;
    }

    public final void setItemId(String string2) {
        this.itemId = string2;
    }

    public final void setLogo(String string2) {
        this.logo = string2;
    }

    public final void setMaskedDigits(String string2) {
        this.maskedDigits = string2;
    }

    public final void setMop(String string2) {
        this.mop = string2;
    }

    public final void setQty(Integer n3) {
        this.qty = n3;
    }

    public final void setRefundActivity(String string2) {
        this.refundActivity = string2;
    }

    public final void setRefundStatus(String string2) {
        this.refundStatus = string2;
    }

    public final void setUpdatedDate(String string2) {
        this.updatedDate = string2;
    }

    public String toString() {
        CharSequence charSequence = this.refundActivity;
        String string2 = this.itemId;
        Integer n3 = this.qty;
        Double d2 = this.amount;
        String string3 = this.mop;
        String string4 = this.refundStatus;
        String string5 = this.createdDate;
        String string6 = this.updatedDate;
        String string7 = this.logo;
        String string8 = this.maskedDigits;
        String string9 = this.cardNetwork;
        charSequence = og_1.a("RefundActivities(refundActivity=", (String)charSequence, ", itemId=", string2, ", qty=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", amount=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(", mop=");
        X50.a((StringBuilder)charSequence, string3, ", refundStatus=", string4, ", createdDate=");
        X50.a((StringBuilder)charSequence, string5, ", updatedDate=", string6, ", logo=");
        X50.a((StringBuilder)charSequence, string7, ", maskedDigits=", string8, ", cardNetwork=");
        return h30_0.a((StringBuilder)charSequence, string9, ")");
    }
}

