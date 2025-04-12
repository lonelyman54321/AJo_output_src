/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InternalWalletDataHolder {
    private boolean isDisable;
    private PaymentInstrumentInfo paymentInstrumentInfo;
    private String zeroViewInfo;
    private String zeroViewTitle;

    public InternalWalletDataHolder(boolean bl2, PaymentInstrumentInfo paymentInstrumentInfo, String string2, String string3) {
        this.isDisable = bl2;
        this.paymentInstrumentInfo = paymentInstrumentInfo;
        this.zeroViewTitle = string2;
        this.zeroViewInfo = string3;
    }

    public /* synthetic */ InternalWalletDataHolder(boolean bl2, PaymentInstrumentInfo paymentInstrumentInfo, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            paymentInstrumentInfo = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            string3 = null;
        }
        this(bl2, paymentInstrumentInfo, string2, string3);
    }

    public static /* synthetic */ InternalWalletDataHolder copy$default(InternalWalletDataHolder internalWalletDataHolder, boolean bl2, PaymentInstrumentInfo paymentInstrumentInfo, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = internalWalletDataHolder.isDisable;
        }
        if ((n4 = n3 & 2) != 0) {
            paymentInstrumentInfo = internalWalletDataHolder.paymentInstrumentInfo;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = internalWalletDataHolder.zeroViewTitle;
        }
        if ((n3 &= 8) != 0) {
            string3 = internalWalletDataHolder.zeroViewInfo;
        }
        return internalWalletDataHolder.copy(bl2, paymentInstrumentInfo, string2, string3);
    }

    public final boolean component1() {
        return this.isDisable;
    }

    public final PaymentInstrumentInfo component2() {
        return this.paymentInstrumentInfo;
    }

    public final String component3() {
        return this.zeroViewTitle;
    }

    public final String component4() {
        return this.zeroViewInfo;
    }

    public final InternalWalletDataHolder copy(boolean bl2, PaymentInstrumentInfo paymentInstrumentInfo, String string2, String string3) {
        InternalWalletDataHolder internalWalletDataHolder = new InternalWalletDataHolder(bl2, paymentInstrumentInfo, string2, string3);
        return internalWalletDataHolder;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InternalWalletDataHolder;
        if (!bl3) {
            return false;
        }
        object = (InternalWalletDataHolder)object;
        bl3 = this.isDisable;
        boolean bl4 = ((InternalWalletDataHolder)object).isDisable;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.paymentInstrumentInfo;
        Object object3 = ((InternalWalletDataHolder)object).paymentInstrumentInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zeroViewTitle;
        object3 = ((InternalWalletDataHolder)object).zeroViewTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zeroViewInfo;
        object = ((InternalWalletDataHolder)object).zeroViewInfo;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final PaymentInstrumentInfo getPaymentInstrumentInfo() {
        return this.paymentInstrumentInfo;
    }

    public final String getZeroViewInfo() {
        return this.zeroViewInfo;
    }

    public final String getZeroViewTitle() {
        return this.zeroViewTitle;
    }

    public int hashCode() {
        int n3;
        int n4 = this.isDisable;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        Object object = this.paymentInstrumentInfo;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentInstrumentInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.zeroViewTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.zeroViewInfo;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isDisable() {
        return this.isDisable;
    }

    public final void setDisable(boolean bl2) {
        this.isDisable = bl2;
    }

    public final void setPaymentInstrumentInfo(PaymentInstrumentInfo paymentInstrumentInfo) {
        this.paymentInstrumentInfo = paymentInstrumentInfo;
    }

    public final void setZeroViewInfo(String string2) {
        this.zeroViewInfo = string2;
    }

    public final void setZeroViewTitle(String string2) {
        this.zeroViewTitle = string2;
    }

    public String toString() {
        boolean bl2 = this.isDisable;
        PaymentInstrumentInfo paymentInstrumentInfo = this.paymentInstrumentInfo;
        String string2 = this.zeroViewTitle;
        String string3 = this.zeroViewInfo;
        StringBuilder stringBuilder = new StringBuilder("InternalWalletDataHolder(isDisable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", paymentInstrumentInfo=");
        stringBuilder.append(paymentInstrumentInfo);
        stringBuilder.append(", zeroViewTitle=");
        return ko_0.a(stringBuilder, string2, ", zeroViewInfo=", string3, ")");
    }
}

