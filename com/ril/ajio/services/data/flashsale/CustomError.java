/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.flashsale;

import kotlin.jvm.internal.Intrinsics;

public final class CustomError {
    private final String errorMessage;
    private final String subText;

    public CustomError(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "errorMessage");
        this.errorMessage = string2;
        this.subText = string3;
    }

    public static /* synthetic */ CustomError copy$default(CustomError customError, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = customError.errorMessage;
        }
        if ((n3 &= 2) != 0) {
            string3 = customError.subText;
        }
        return customError.copy(string2, string3);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final String component2() {
        return this.subText;
    }

    public final CustomError copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "errorMessage");
        CustomError customError = new CustomError(string2, string3);
        return customError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CustomError;
        if (!bl3) {
            return false;
        }
        object = (CustomError)object;
        String string2 = this.errorMessage;
        String string3 = ((CustomError)object).errorMessage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subText;
        object = ((CustomError)object).subText;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getSubText() {
        return this.subText;
    }

    public int hashCode() {
        int n3;
        String string2 = this.errorMessage;
        int n4 = string2.hashCode() * 31;
        String string3 = this.subText;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        String string2 = this.errorMessage;
        String string3 = this.subText;
        return uc0_0.a("CustomError(errorMessage=", string2, ", subText=", string3, ")");
    }
}

