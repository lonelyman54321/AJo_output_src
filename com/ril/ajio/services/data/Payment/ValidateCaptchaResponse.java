/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ValidateCaptchaResponse {
    private Error error;
    private String message;
    private Boolean valid;

    public ValidateCaptchaResponse() {
        this(null, null, null, 7, null);
    }

    public ValidateCaptchaResponse(Error error, String string2, Boolean bl2) {
        this.error = error;
        this.message = string2;
        this.valid = bl2;
    }

    public /* synthetic */ ValidateCaptchaResponse(Error error, String string2, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = Boolean.FALSE;
        }
        this(error, string2, bl2);
    }

    public static /* synthetic */ ValidateCaptchaResponse copy$default(ValidateCaptchaResponse validateCaptchaResponse, Error error, String string2, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = validateCaptchaResponse.error;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = validateCaptchaResponse.message;
        }
        if ((n3 &= 4) != 0) {
            bl2 = validateCaptchaResponse.valid;
        }
        return validateCaptchaResponse.copy(error, string2, bl2);
    }

    public final Error component1() {
        return this.error;
    }

    public final String component2() {
        return this.message;
    }

    public final Boolean component3() {
        return this.valid;
    }

    public final ValidateCaptchaResponse copy(Error error, String string2, Boolean bl2) {
        ValidateCaptchaResponse validateCaptchaResponse = new ValidateCaptchaResponse(error, string2, bl2);
        return validateCaptchaResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ValidateCaptchaResponse;
        if (!bl3) {
            return false;
        }
        object = (ValidateCaptchaResponse)object;
        Object object2 = this.error;
        Object object3 = ((ValidateCaptchaResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((ValidateCaptchaResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.valid;
        object = ((ValidateCaptchaResponse)object).valid;
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

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Error error = this.error;
        int n7 = 0;
        if (error == null) {
            n4 = 0;
            error = null;
        } else {
            n4 = error.hashCode();
        }
        n4 *= 31;
        Object object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.valid;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setValid(Boolean bl2) {
        this.valid = bl2;
    }

    public String toString() {
        Error error = this.error;
        String string2 = this.message;
        Boolean bl2 = this.valid;
        StringBuilder stringBuilder = new StringBuilder("ValidateCaptchaResponse(error=");
        stringBuilder.append(error);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", valid=");
        return nx3_0.a(stringBuilder, bl2, ")");
    }
}

