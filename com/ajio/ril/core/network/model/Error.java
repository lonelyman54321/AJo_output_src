/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.model;

import kotlin.jvm.internal.Intrinsics;

public final class Error {
    private final String message;
    private final String type;
    private final String value;

    public Error(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(string3, "type");
        Intrinsics.checkNotNullParameter(string4, "value");
        this.message = string2;
        this.type = string3;
        this.value = string4;
    }

    public static /* synthetic */ Error copy$default(Error error, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = error.message;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = error.type;
        }
        if ((n3 &= 4) != 0) {
            string4 = error.value;
        }
        return error.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.value;
    }

    public final Error copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(string3, "type");
        Intrinsics.checkNotNullParameter(string4, "value");
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
        String string2 = this.message;
        String string3 = ((Error)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        string3 = ((Error)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((Error)object).value;
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

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.message.hashCode() * 31;
        String string2 = this.type;
        n3 = zy_2.b(n3, 31, string2);
        return this.value.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.message;
        String string3 = this.type;
        String string4 = this.value;
        return h30_0.a(og_1.a("Error(message=", string2, ", type=", string3, ", value="), string4, ")");
    }
}

