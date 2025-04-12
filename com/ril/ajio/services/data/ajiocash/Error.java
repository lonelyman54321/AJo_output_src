/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Error {
    private final String code;
    private final String description;

    public Error() {
        this(null, null, 3, null);
    }

    public Error(String string2, String string3) {
        this.code = string2;
        this.description = string3;
    }

    public /* synthetic */ Error(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ Error copy$default(Error error, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = error.code;
        }
        if ((n3 &= 2) != 0) {
            string3 = error.description;
        }
        return error.copy(string2, string3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.description;
    }

    public final Error copy(String string2, String string3) {
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
        String string2 = this.code;
        String string3 = ((Error)object).code;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.description;
        object = ((Error)object).description;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.description;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.code;
        String string3 = this.description;
        return uc0_0.a("Error(code=", string2, ", description=", string3, ")");
    }
}

