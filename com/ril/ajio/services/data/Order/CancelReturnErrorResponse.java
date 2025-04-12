/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.Intrinsics;

public final class CancelReturnErrorResponse {
    private final String message;
    private final String type;

    public CancelReturnErrorResponse(String string2, String string3) {
        this.message = string2;
        this.type = string3;
    }

    public static /* synthetic */ CancelReturnErrorResponse copy$default(CancelReturnErrorResponse cancelReturnErrorResponse, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cancelReturnErrorResponse.message;
        }
        if ((n3 &= 2) != 0) {
            string3 = cancelReturnErrorResponse.type;
        }
        return cancelReturnErrorResponse.copy(string2, string3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.type;
    }

    public final CancelReturnErrorResponse copy(String string2, String string3) {
        CancelReturnErrorResponse cancelReturnErrorResponse = new CancelReturnErrorResponse(string2, string3);
        return cancelReturnErrorResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CancelReturnErrorResponse;
        if (!bl3) {
            return false;
        }
        object = (CancelReturnErrorResponse)object;
        String string2 = this.message;
        String string3 = ((CancelReturnErrorResponse)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((CancelReturnErrorResponse)object).type;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        String string2 = this.message;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.type;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.message;
        String string3 = this.type;
        return uc0_0.a("CancelReturnErrorResponse(message=", string2, ", type=", string3, ")");
    }
}

