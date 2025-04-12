/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RefundDetailsObj {
    private Double amount;
    private String logo;
    private String maskedDigits;
    private String mop;
    private Integer qty;

    public RefundDetailsObj() {
        this(null, null, null, null, null, 31, null);
    }

    public RefundDetailsObj(String string2, Integer n3, Double d2, String string3, String string4) {
        this.mop = string2;
        this.qty = n3;
        this.amount = d2;
        this.logo = string3;
        this.maskedDigits = string4;
    }

    public /* synthetic */ RefundDetailsObj(String object, Integer object2, Double number, String object3, String string2, int n3, DefaultConstructorMarker object4) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Double d2 = n7 != 0 ? null : number;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        object = this;
        object2 = object4;
        number = object5;
        object3 = d2;
        string2 = object6;
        this((String)object4, (Integer)object5, d2, (String)object6, string3);
    }

    public static /* synthetic */ RefundDetailsObj copy$default(RefundDetailsObj refundDetailsObj, String string2, Integer object, Double object2, String object3, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = refundDetailsObj.mop;
        }
        if ((n4 = n3 & 2) != 0) {
            object = refundDetailsObj.qty;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = refundDetailsObj.amount;
        }
        Double d2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = refundDetailsObj.logo;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = refundDetailsObj.maskedDigits;
        }
        String string4 = object4;
        object = refundDetailsObj;
        object2 = string2;
        object3 = object5;
        object4 = d2;
        object5 = string4;
        return refundDetailsObj.copy(string2, (Integer)object3, d2, string3, string4);
    }

    public final String component1() {
        return this.mop;
    }

    public final Integer component2() {
        return this.qty;
    }

    public final Double component3() {
        return this.amount;
    }

    public final String component4() {
        return this.logo;
    }

    public final String component5() {
        return this.maskedDigits;
    }

    public final RefundDetailsObj copy(String string2, Integer n3, Double d2, String string3, String string4) {
        RefundDetailsObj refundDetailsObj = new RefundDetailsObj(string2, n3, d2, string3, string4);
        return refundDetailsObj;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefundDetailsObj;
        if (!bl3) {
            return false;
        }
        object = (RefundDetailsObj)object;
        Object object2 = this.mop;
        Object object3 = ((RefundDetailsObj)object).mop;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.qty;
        object3 = ((RefundDetailsObj)object).qty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((RefundDetailsObj)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((RefundDetailsObj)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.maskedDigits;
        object = ((RefundDetailsObj)object).maskedDigits;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getAmount() {
        return this.amount;
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

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.mop;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.qty;
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
        object = this.logo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maskedDigits;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Double d2) {
        this.amount = d2;
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

    public String toString() {
        String string2 = this.mop;
        Integer n3 = this.qty;
        Double d2 = this.amount;
        String string3 = this.logo;
        String string4 = this.maskedDigits;
        StringBuilder stringBuilder = new StringBuilder("RefundDetailsObj(mop=");
        stringBuilder.append(string2);
        stringBuilder.append(", qty=");
        stringBuilder.append(n3);
        stringBuilder.append(", amount=");
        stringBuilder.append(d2);
        stringBuilder.append(", logo=");
        stringBuilder.append(string3);
        stringBuilder.append(", maskedDigits=");
        return h30_0.a(stringBuilder, string4, ")");
    }
}

