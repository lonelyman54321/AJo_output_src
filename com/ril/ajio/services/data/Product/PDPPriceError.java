/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PDPPriceError
implements Serializable {
    private String errorMsg;
    private boolean showError;

    public PDPPriceError(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorMsg");
        this.showError = bl2;
        this.errorMsg = string2;
    }

    public /* synthetic */ PDPPriceError(boolean bl2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            bl2 = false;
        }
        this(bl2, string2);
    }

    public static /* synthetic */ PDPPriceError copy$default(PDPPriceError pDPPriceError, boolean bl2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = pDPPriceError.showError;
        }
        if ((n3 &= 2) != 0) {
            string2 = pDPPriceError.errorMsg;
        }
        return pDPPriceError.copy(bl2, string2);
    }

    public final boolean component1() {
        return this.showError;
    }

    public final String component2() {
        return this.errorMsg;
    }

    public final PDPPriceError copy(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorMsg");
        PDPPriceError pDPPriceError = new PDPPriceError(bl2, string2);
        return pDPPriceError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PDPPriceError;
        if (!bl3) {
            return false;
        }
        object = (PDPPriceError)object;
        bl3 = this.showError;
        boolean bl4 = ((PDPPriceError)object).showError;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.errorMsg;
        object = ((PDPPriceError)object).errorMsg;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        int n3 = this.showError;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.errorMsg.hashCode() + (n3 *= 31);
    }

    public final void setErrorMsg(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.errorMsg = string2;
    }

    public final void setShowError(boolean bl2) {
        this.showError = bl2;
    }

    public String toString() {
        boolean bl2 = this.showError;
        String string2 = this.errorMsg;
        StringBuilder stringBuilder = new StringBuilder("PDPPriceError(showError=");
        stringBuilder.append(bl2);
        stringBuilder.append(", errorMsg=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

