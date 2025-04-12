/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import kotlin.jvm.internal.Intrinsics;

public final class Error {
    private final String message;
    private final String type;

    public Error(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(string3, "type");
        this.message = string2;
        this.type = string3;
    }

    public static /* synthetic */ Error copy$default(Error error, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = error.message;
        }
        if ((n3 &= 2) != 0) {
            string3 = error.type;
        }
        return error.copy(string2, string3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.type;
    }

    public final Error copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(string3, "type");
        Error error = new Error(string2, string3);
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
        String string2 = this.message;
        String string3 = ((Error)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((Error)object).type;
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
        int n3 = this.message.hashCode() * 31;
        return this.type.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.message;
        String string3 = this.type;
        return uc0_0.a("Error(message=", string2, ", type=", string3, ")");
    }
}

