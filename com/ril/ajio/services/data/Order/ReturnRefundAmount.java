/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRefundAmount
implements Serializable {
    private final ArrayList bodyContent;
    private final ArrayList bottomLinkContent;
    private final String errorMessage;
    private final Boolean isReturnCancelled;
    private final Boolean isWindowAvailable;
    private final String paymentModeOfRefundMsg;
    private final Float refundAmount;
    private final String refundDescription;
    private final String topDescription;
    private final Boolean viewRefundBreakSection;

    public ReturnRefundAmount(Float f5, String string2, Boolean bl2, String string3, String string4, String string5, ArrayList arrayList, ArrayList arrayList2, Boolean bl3, Boolean bl4) {
        this.refundAmount = f5;
        this.refundDescription = string2;
        this.isReturnCancelled = bl2;
        this.paymentModeOfRefundMsg = string3;
        this.topDescription = string4;
        this.errorMessage = string5;
        this.bodyContent = arrayList;
        this.bottomLinkContent = arrayList2;
        this.viewRefundBreakSection = bl3;
        this.isWindowAvailable = bl4;
    }

    public /* synthetic */ ReturnRefundAmount(Float f5, String string2, Boolean bl2, String string3, String string4, String string5, ArrayList arrayList, ArrayList arrayList2, Boolean bl3, Boolean bl4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl5;
        Boolean bl6;
        int n4 = n3;
        int n7 = n3 & 4;
        Boolean bl7 = n7 != 0 ? (bl6 = Boolean.FALSE) : bl2;
        n7 = n4 & 0x100;
        Boolean bl8 = n7 != 0 ? (bl6 = Boolean.FALSE) : bl3;
        Boolean bl9 = (n4 &= 0x200) != 0 ? (bl5 = Boolean.FALSE) : bl4;
        this(f5, string2, bl7, string3, string4, string5, arrayList, arrayList2, bl8, bl9);
    }

    public static /* synthetic */ ReturnRefundAmount copy$default(ReturnRefundAmount returnRefundAmount, Float f5, String string2, Boolean bl2, String string3, String string4, String string5, ArrayList arrayList, ArrayList arrayList2, Boolean bl3, Boolean bl4, int n3, Object object) {
        ReturnRefundAmount returnRefundAmount2 = returnRefundAmount;
        int n4 = n3;
        int n7 = n3 & 1;
        Float f6 = n7 != 0 ? returnRefundAmount.refundAmount : f5;
        int n8 = n4 & 2;
        String string6 = n8 != 0 ? returnRefundAmount2.refundDescription : string2;
        int n10 = n4 & 4;
        Boolean bl5 = n10 != 0 ? returnRefundAmount2.isReturnCancelled : bl2;
        int n14 = n4 & 8;
        String string7 = n14 != 0 ? returnRefundAmount2.paymentModeOfRefundMsg : string3;
        int n15 = n4 & 0x10;
        String string8 = n15 != 0 ? returnRefundAmount2.topDescription : string4;
        int n16 = n4 & 0x20;
        String string9 = n16 != 0 ? returnRefundAmount2.errorMessage : string5;
        int n17 = n4 & 0x40;
        ArrayList arrayList3 = n17 != 0 ? returnRefundAmount2.bodyContent : arrayList;
        int n18 = n4 & 0x80;
        ArrayList arrayList4 = n18 != 0 ? returnRefundAmount2.bottomLinkContent : arrayList2;
        int n19 = n4 & 0x100;
        Boolean bl6 = n19 != 0 ? returnRefundAmount2.viewRefundBreakSection : bl3;
        Boolean bl7 = (n4 &= 0x200) != 0 ? returnRefundAmount2.isWindowAvailable : bl4;
        f5 = f6;
        string2 = string6;
        bl2 = bl5;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        arrayList = arrayList3;
        arrayList2 = arrayList4;
        bl3 = bl6;
        bl4 = bl7;
        return returnRefundAmount.copy(f6, string6, bl5, string7, string8, string9, arrayList3, arrayList4, bl6, bl7);
    }

    public final Float component1() {
        return this.refundAmount;
    }

    public final Boolean component10() {
        return this.isWindowAvailable;
    }

    public final String component2() {
        return this.refundDescription;
    }

    public final Boolean component3() {
        return this.isReturnCancelled;
    }

    public final String component4() {
        return this.paymentModeOfRefundMsg;
    }

    public final String component5() {
        return this.topDescription;
    }

    public final String component6() {
        return this.errorMessage;
    }

    public final ArrayList component7() {
        return this.bodyContent;
    }

    public final ArrayList component8() {
        return this.bottomLinkContent;
    }

    public final Boolean component9() {
        return this.viewRefundBreakSection;
    }

    public final ReturnRefundAmount copy(Float f5, String string2, Boolean bl2, String string3, String string4, String string5, ArrayList arrayList, ArrayList arrayList2, Boolean bl3, Boolean bl4) {
        ReturnRefundAmount returnRefundAmount = new ReturnRefundAmount(f5, string2, bl2, string3, string4, string5, arrayList, arrayList2, bl3, bl4);
        return returnRefundAmount;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRefundAmount;
        if (!bl3) {
            return false;
        }
        object = (ReturnRefundAmount)object;
        Object object2 = this.refundAmount;
        Object object3 = ((ReturnRefundAmount)object).refundAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundDescription;
        object3 = ((ReturnRefundAmount)object).refundDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isReturnCancelled;
        object3 = ((ReturnRefundAmount)object).isReturnCancelled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentModeOfRefundMsg;
        object3 = ((ReturnRefundAmount)object).paymentModeOfRefundMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.topDescription;
        object3 = ((ReturnRefundAmount)object).topDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.errorMessage;
        object3 = ((ReturnRefundAmount)object).errorMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bodyContent;
        object3 = ((ReturnRefundAmount)object).bodyContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkContent;
        object3 = ((ReturnRefundAmount)object).bottomLinkContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.viewRefundBreakSection;
        object3 = ((ReturnRefundAmount)object).viewRefundBreakSection;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isWindowAvailable;
        object = ((ReturnRefundAmount)object).isWindowAvailable;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBodyContent() {
        return this.bodyContent;
    }

    public final ArrayList getBottomLinkContent() {
        return this.bottomLinkContent;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getPaymentModeOfRefundMsg() {
        return this.paymentModeOfRefundMsg;
    }

    public final Float getRefundAmount() {
        return this.refundAmount;
    }

    public final String getRefundDescription() {
        return this.refundDescription;
    }

    public final String getTopDescription() {
        return this.topDescription;
    }

    public final Boolean getViewRefundBreakSection() {
        return this.viewRefundBreakSection;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.refundAmount;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Object object = this.refundDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isReturnCancelled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentModeOfRefundMsg;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.topDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errorMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bodyContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bottomLinkContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewRefundBreakSection;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isWindowAvailable;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isReturnCancelled() {
        return this.isReturnCancelled;
    }

    public final Boolean isWindowAvailable() {
        return this.isWindowAvailable;
    }

    public String toString() {
        Float f5 = this.refundAmount;
        String string2 = this.refundDescription;
        Boolean bl2 = this.isReturnCancelled;
        String string3 = this.paymentModeOfRefundMsg;
        String string4 = this.topDescription;
        String string5 = this.errorMessage;
        ArrayList arrayList = this.bodyContent;
        ArrayList arrayList2 = this.bottomLinkContent;
        Boolean bl3 = this.viewRefundBreakSection;
        Boolean bl4 = this.isWindowAvailable;
        StringBuilder stringBuilder = new StringBuilder("ReturnRefundAmount(refundAmount=");
        stringBuilder.append(f5);
        stringBuilder.append(", refundDescription=");
        stringBuilder.append(string2);
        stringBuilder.append(", isReturnCancelled=");
        xi0_2.a(bl2, ", paymentModeOfRefundMsg=", string3, ", topDescription=", stringBuilder);
        X50.a(stringBuilder, string4, ", errorMessage=", string5, ", bodyContent=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", bottomLinkContent=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", viewRefundBreakSection=");
        stringBuilder.append(bl3);
        stringBuilder.append(", isWindowAvailable=");
        stringBuilder.append(bl4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

