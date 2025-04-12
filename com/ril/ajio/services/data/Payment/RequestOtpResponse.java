/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class RequestOtpResponse {
    private final Error error;
    private final String message;
    private final Boolean success;
    private final Boolean valid;

    public RequestOtpResponse(Boolean bl2, Error error, Boolean bl3, String string2) {
        this.success = bl2;
        this.error = error;
        this.valid = bl3;
        this.message = string2;
    }

    public static /* synthetic */ RequestOtpResponse copy$default(RequestOtpResponse requestOtpResponse, Boolean bl2, Error error, Boolean bl3, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = requestOtpResponse.success;
        }
        if ((n4 = n3 & 2) != 0) {
            error = requestOtpResponse.error;
        }
        if ((n4 = n3 & 4) != 0) {
            bl3 = requestOtpResponse.valid;
        }
        if ((n3 &= 8) != 0) {
            string2 = requestOtpResponse.message;
        }
        return requestOtpResponse.copy(bl2, error, bl3, string2);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final Error component2() {
        return this.error;
    }

    public final Boolean component3() {
        return this.valid;
    }

    public final String component4() {
        return this.message;
    }

    public final RequestOtpResponse copy(Boolean bl2, Error error, Boolean bl3, String string2) {
        RequestOtpResponse requestOtpResponse = new RequestOtpResponse(bl2, error, bl3, string2);
        return requestOtpResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RequestOtpResponse;
        if (!bl3) {
            return false;
        }
        object = (RequestOtpResponse)object;
        Object object2 = this.success;
        Serializable serializable = ((RequestOtpResponse)object).success;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        serializable = ((RequestOtpResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.valid;
        serializable = ((RequestOtpResponse)object).valid;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object = ((RequestOtpResponse)object).message;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.success;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.error;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Error)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.valid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.success;
        Error error = this.error;
        Boolean bl3 = this.valid;
        String string2 = this.message;
        StringBuilder stringBuilder = new StringBuilder("RequestOtpResponse(success=");
        stringBuilder.append(bl2);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(", valid=");
        stringBuilder.append(bl3);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

