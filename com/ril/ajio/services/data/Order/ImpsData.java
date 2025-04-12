/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.Intrinsics;

public final class ImpsData {
    private final String message;
    private final String statusCode;

    public ImpsData(String string2, String string3) {
        this.message = string2;
        this.statusCode = string3;
    }

    public static /* synthetic */ ImpsData copy$default(ImpsData impsData, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = impsData.message;
        }
        if ((n3 &= 2) != 0) {
            string3 = impsData.statusCode;
        }
        return impsData.copy(string2, string3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final ImpsData copy(String string2, String string3) {
        ImpsData impsData = new ImpsData(string2, string3);
        return impsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImpsData;
        if (!bl3) {
            return false;
        }
        object = (ImpsData)object;
        String string2 = this.message;
        String string3 = ((ImpsData)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.statusCode;
        object = ((ImpsData)object).statusCode;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatusCode() {
        return this.statusCode;
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
        String string3 = this.statusCode;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.message;
        String string3 = this.statusCode;
        return uc0_0.a("ImpsData(message=", string2, ", statusCode=", string3, ")");
    }
}

