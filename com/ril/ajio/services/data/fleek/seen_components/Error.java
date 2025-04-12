/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Error {
    private String message;
    private String reason;
    private String type;

    public Error() {
        this(null, null, null, 7, null);
    }

    public Error(String string2, String string3, String string4) {
        this.type = string2;
        this.message = string3;
        this.reason = string4;
    }

    public /* synthetic */ Error(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ Error copy$default(Error error, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = error.type;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = error.message;
        }
        if ((n3 &= 4) != 0) {
            string4 = error.reason;
        }
        return error.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.reason;
    }

    public final Error copy(String string2, String string3, String string4) {
        Error error = new Error(string2, string3, string4);
        return error;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Error;
        if (!bl3) {
            return false;
        }
        object = (Error)object;
        String string2 = this.type;
        String string3 = ((Error)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.message;
        string3 = ((Error)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.reason;
        object = ((Error)object).reason;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
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
        String string2 = this.type;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.message;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.reason;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setReason(String string2) {
        this.reason = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        String string2 = this.type;
        String string3 = this.message;
        String string4 = this.reason;
        return h30_0.a(og_1.a("Error(type=", string2, ", message=", string3, ", reason="), string4, ")");
    }
}

