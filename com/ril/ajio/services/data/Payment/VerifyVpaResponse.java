/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class VerifyVpaResponse {
    private Error error;
    private Boolean valid;

    public VerifyVpaResponse() {
        this(null, null, 3, null);
    }

    public VerifyVpaResponse(Boolean bl2, Error error) {
        this.valid = bl2;
        this.error = error;
    }

    public /* synthetic */ VerifyVpaResponse(Boolean bl2, Error error, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            error = null;
        }
        this(bl2, error);
    }

    public static /* synthetic */ VerifyVpaResponse copy$default(VerifyVpaResponse verifyVpaResponse, Boolean bl2, Error error, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = verifyVpaResponse.valid;
        }
        if ((n3 &= 2) != 0) {
            error = verifyVpaResponse.error;
        }
        return verifyVpaResponse.copy(bl2, error);
    }

    public final Boolean component1() {
        return this.valid;
    }

    public final Error component2() {
        return this.error;
    }

    public final VerifyVpaResponse copy(Boolean bl2, Error error) {
        VerifyVpaResponse verifyVpaResponse = new VerifyVpaResponse(bl2, error);
        return verifyVpaResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VerifyVpaResponse;
        if (!bl3) {
            return false;
        }
        object = (VerifyVpaResponse)object;
        Serializable serializable = this.valid;
        Boolean bl4 = ((VerifyVpaResponse)object).valid;
        bl3 = Intrinsics.areEqual(serializable, bl4);
        if (!bl3) {
            return false;
        }
        serializable = this.error;
        object = ((VerifyVpaResponse)object).error;
        boolean bl5 = Intrinsics.areEqual(serializable, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.valid;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        Error error = this.error;
        if (error != null) {
            n4 = error.hashCode();
        }
        return n3 + n4;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setValid(Boolean bl2) {
        this.valid = bl2;
    }

    public String toString() {
        Boolean bl2 = this.valid;
        Error error = this.error;
        StringBuilder stringBuilder = new StringBuilder("VerifyVpaResponse(valid=");
        stringBuilder.append(bl2);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

