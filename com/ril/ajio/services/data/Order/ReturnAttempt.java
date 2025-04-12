/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnAttempt
implements Serializable {
    private final String attempt;

    public ReturnAttempt() {
        this(null, 1, null);
    }

    public ReturnAttempt(String string2) {
        this.attempt = string2;
    }

    public /* synthetic */ ReturnAttempt(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = "";
        }
        this(string2);
    }

    public static /* synthetic */ ReturnAttempt copy$default(ReturnAttempt returnAttempt, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = returnAttempt.attempt;
        }
        return returnAttempt.copy(string2);
    }

    public final String component1() {
        return this.attempt;
    }

    public final ReturnAttempt copy(String string2) {
        ReturnAttempt returnAttempt = new ReturnAttempt(string2);
        return returnAttempt;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnAttempt;
        if (!bl3) {
            return false;
        }
        object = (ReturnAttempt)object;
        String string2 = this.attempt;
        object = ((ReturnAttempt)object).attempt;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAttempt() {
        return this.attempt;
    }

    public int hashCode() {
        int n3;
        String string2 = this.attempt;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.attempt;
        return cP.a("ReturnAttempt(attempt=", string2, ")");
    }
}

