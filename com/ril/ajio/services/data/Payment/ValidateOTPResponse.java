/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import kotlin.jvm.internal.Intrinsics;

public final class ValidateOTPResponse {
    private final Error error;
    private final String expiresIn;
    private final String message;
    private final Integer statusCode;
    private final Boolean valid;

    public ValidateOTPResponse(Integer n3, Error error, Boolean bl2, String string2, String string3) {
        this.statusCode = n3;
        this.error = error;
        this.valid = bl2;
        this.message = string2;
        this.expiresIn = string3;
    }

    public static /* synthetic */ ValidateOTPResponse copy$default(ValidateOTPResponse validateOTPResponse, Integer n3, Error object, Boolean comparable, String object2, String object3, int n4, Object object4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = validateOTPResponse.statusCode;
        }
        if ((n7 = n4 & 2) != 0) {
            object = validateOTPResponse.error;
        }
        object4 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            comparable = validateOTPResponse.valid;
        }
        Boolean bl2 = comparable;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = validateOTPResponse.message;
        }
        String string2 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            object3 = validateOTPResponse.expiresIn;
        }
        String string3 = object3;
        object = validateOTPResponse;
        comparable = n3;
        object2 = object4;
        object3 = bl2;
        object4 = string3;
        return validateOTPResponse.copy(n3, (Error)object2, bl2, string2, string3);
    }

    public final Integer component1() {
        return this.statusCode;
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

    public final String component5() {
        return this.expiresIn;
    }

    public final ValidateOTPResponse copy(Integer n3, Error error, Boolean bl2, String string2, String string3) {
        ValidateOTPResponse validateOTPResponse = new ValidateOTPResponse(n3, error, bl2, string2, string3);
        return validateOTPResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ValidateOTPResponse;
        if (!bl3) {
            return false;
        }
        object = (ValidateOTPResponse)object;
        Object object2 = this.statusCode;
        Object object3 = ((ValidateOTPResponse)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object3 = ((ValidateOTPResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.valid;
        object3 = ((ValidateOTPResponse)object).valid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((ValidateOTPResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiresIn;
        object = ((ValidateOTPResponse)object).expiresIn;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getExpiresIn() {
        return this.expiresIn;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.statusCode;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
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
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiresIn;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        Integer n3 = this.statusCode;
        Error error = this.error;
        Boolean bl2 = this.valid;
        String string2 = this.message;
        String string3 = this.expiresIn;
        StringBuilder stringBuilder = new StringBuilder("ValidateOTPResponse(statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(", valid=");
        xi0_2.a(bl2, ", message=", string2, ", expiresIn=", stringBuilder);
        return h30_0.a(stringBuilder, string3, ")");
    }
}

