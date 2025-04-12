/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartServiceError
implements Serializable {
    private String messageDescription;
    private String messageHeader;

    public CartServiceError() {
        this(null, null, 3, null);
    }

    public CartServiceError(String string2, String string3) {
        this.messageHeader = string2;
        this.messageDescription = string3;
    }

    public /* synthetic */ CartServiceError(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ CartServiceError copy$default(CartServiceError cartServiceError, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cartServiceError.messageHeader;
        }
        if ((n3 &= 2) != 0) {
            string3 = cartServiceError.messageDescription;
        }
        return cartServiceError.copy(string2, string3);
    }

    public final String component1() {
        return this.messageHeader;
    }

    public final String component2() {
        return this.messageDescription;
    }

    public final CartServiceError copy(String string2, String string3) {
        CartServiceError cartServiceError = new CartServiceError(string2, string3);
        return cartServiceError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartServiceError;
        if (!bl3) {
            return false;
        }
        object = (CartServiceError)object;
        String string2 = this.messageHeader;
        String string3 = ((CartServiceError)object).messageHeader;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.messageDescription;
        object = ((CartServiceError)object).messageDescription;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final String getMessageHeader() {
        return this.messageHeader;
    }

    public int hashCode() {
        int n3;
        String string2 = this.messageHeader;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.messageDescription;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setMessageDescription(String string2) {
        this.messageDescription = string2;
    }

    public final void setMessageHeader(String string2) {
        this.messageHeader = string2;
    }

    public String toString() {
        String string2 = this.messageHeader;
        String string3 = this.messageDescription;
        return uc0_0.a("CartServiceError(messageHeader=", string2, ", messageDescription=", string3, ")");
    }
}

