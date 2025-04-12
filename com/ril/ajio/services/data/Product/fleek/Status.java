/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Status
implements Serializable {
    private Integer statusCode;

    public Status() {
        this(null, 1, null);
    }

    public Status(Integer n3) {
        this.statusCode = n3;
    }

    public /* synthetic */ Status(Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 1) != 0) {
            n3 = null;
        }
        this(n3);
    }

    public static /* synthetic */ Status copy$default(Status status, Integer n3, int n4, Object object) {
        if ((n4 &= 1) != 0) {
            n3 = status.statusCode;
        }
        return status.copy(n3);
    }

    public final Integer component1() {
        return this.statusCode;
    }

    public final Status copy(Integer n3) {
        Status status = new Status(n3);
        return status;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Status;
        if (!bl3) {
            return false;
        }
        object = (Status)object;
        Integer n3 = this.statusCode;
        object = ((Status)object).statusCode;
        boolean bl4 = Intrinsics.areEqual(n3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.statusCode;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = ((Object)n4).hashCode();
        }
        return n3;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }

    public String toString() {
        Integer n3 = this.statusCode;
        StringBuilder stringBuilder = new StringBuilder("Status(statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

