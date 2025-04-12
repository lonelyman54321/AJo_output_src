/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class CartLimitError
implements Serializable {
    private String errorMessage;
    private String reason;
    private String type;

    public CartLimitError(String string2, String string3, String string4) {
        this.errorMessage = string2;
        this.reason = string3;
        this.type = string4;
    }

    public static /* synthetic */ CartLimitError copy$default(CartLimitError cartLimitError, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cartLimitError.errorMessage;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = cartLimitError.reason;
        }
        if ((n3 &= 4) != 0) {
            string4 = cartLimitError.type;
        }
        return cartLimitError.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.type;
    }

    public final CartLimitError copy(String string2, String string3, String string4) {
        CartLimitError cartLimitError = new CartLimitError(string2, string3, string4);
        return cartLimitError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartLimitError;
        if (!bl3) {
            return false;
        }
        object = (CartLimitError)object;
        String string2 = this.errorMessage;
        String string3 = ((CartLimitError)object).errorMessage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.reason;
        string3 = ((CartLimitError)object).reason;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((CartLimitError)object).type;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.errorMessage;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.reason;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.type;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setErrorMessage(String string2) {
        this.errorMessage = string2;
    }

    public final void setReason(String string2) {
        this.reason = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        String string2 = this.errorMessage;
        String string3 = this.reason;
        String string4 = this.type;
        return h30_0.a(og_1.a("CartLimitError(errorMessage=", string2, ", reason=", string3, ", type="), string4, ")");
    }
}

