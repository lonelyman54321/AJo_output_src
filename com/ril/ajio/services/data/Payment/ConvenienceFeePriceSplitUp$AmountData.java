/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ConvenienceFeePriceSplitUp$AmountData
implements Serializable {
    private float amount;
    private boolean isAjioFault;
    private Boolean isFeeCharged;
    private float netAmount;

    public ConvenienceFeePriceSplitUp$AmountData() {
        this(0.0f, 0.0f, null, false, 15, null);
    }

    public ConvenienceFeePriceSplitUp$AmountData(float f5, float f6, Boolean bl2, boolean bl3) {
        this.amount = f5;
        this.netAmount = f6;
        this.isFeeCharged = bl2;
        this.isAjioFault = bl3;
    }

    public /* synthetic */ ConvenienceFeePriceSplitUp$AmountData(float f5, float f6, Boolean bl2, boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = null;
        }
        if ((n3 &= 8) != 0) {
            bl3 = false;
        }
        this(f5, f6, bl2, bl3);
    }

    public static /* synthetic */ ConvenienceFeePriceSplitUp$AmountData copy$default(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData, float f5, float f6, Boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = convenienceFeePriceSplitUp$AmountData.amount;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = convenienceFeePriceSplitUp$AmountData.netAmount;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = convenienceFeePriceSplitUp$AmountData.isFeeCharged;
        }
        if ((n3 &= 8) != 0) {
            bl3 = convenienceFeePriceSplitUp$AmountData.isAjioFault;
        }
        return convenienceFeePriceSplitUp$AmountData.copy(f5, f6, bl2, bl3);
    }

    public final float component1() {
        return this.amount;
    }

    public final float component2() {
        return this.netAmount;
    }

    public final Boolean component3() {
        return this.isFeeCharged;
    }

    public final boolean component4() {
        return this.isAjioFault;
    }

    public final ConvenienceFeePriceSplitUp$AmountData copy(float f5, float f6, Boolean bl2, boolean bl3) {
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = new ConvenienceFeePriceSplitUp$AmountData(f5, f6, bl2, bl3);
        return convenienceFeePriceSplitUp$AmountData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ConvenienceFeePriceSplitUp$AmountData;
        if (n3 == 0) {
            return false;
        }
        object = (ConvenienceFeePriceSplitUp$AmountData)object;
        float f5 = this.amount;
        float f6 = ((ConvenienceFeePriceSplitUp$AmountData)object).amount;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.netAmount;
        f6 = ((ConvenienceFeePriceSplitUp$AmountData)object).netAmount;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        Boolean bl3 = this.isFeeCharged;
        Boolean bl4 = ((ConvenienceFeePriceSplitUp$AmountData)object).isFeeCharged;
        n3 = (int)(Intrinsics.areEqual(bl3, bl4) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isAjioFault ? 1 : 0);
        int n4 = ((ConvenienceFeePriceSplitUp$AmountData)object).isAjioFault;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final float getNetAmount() {
        return this.netAmount;
    }

    public int hashCode() {
        int n3;
        float f5 = this.amount;
        int n4 = Float.floatToIntBits(f5);
        int n7 = 31;
        n4 *= 31;
        float f6 = this.netAmount;
        n4 = UR0.a(f6, n4, n7);
        Boolean bl2 = this.isFeeCharged;
        if (bl2 == null) {
            n3 = 0;
            f6 = 0.0f;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n7 = (int)(this.isAjioFault ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isAjioFault() {
        return this.isAjioFault;
    }

    public final Boolean isFeeCharged() {
        return this.isFeeCharged;
    }

    public final void setAjioFault(boolean bl2) {
        this.isAjioFault = bl2;
    }

    public final void setAmount(float f5) {
        this.amount = f5;
    }

    public final void setFeeCharged(Boolean bl2) {
        this.isFeeCharged = bl2;
    }

    public final void setNetAmount(float f5) {
        this.netAmount = f5;
    }

    public String toString() {
        float f5 = this.amount;
        float f6 = this.netAmount;
        Boolean bl2 = this.isFeeCharged;
        boolean bl3 = this.isAjioFault;
        StringBuilder stringBuilder = new StringBuilder("AmountData(amount=");
        stringBuilder.append(f5);
        stringBuilder.append(", netAmount=");
        stringBuilder.append(f6);
        stringBuilder.append(", isFeeCharged=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isAjioFault=");
        stringBuilder.append(bl3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

