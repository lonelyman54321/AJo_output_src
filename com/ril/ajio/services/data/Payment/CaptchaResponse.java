/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Captcha;
import com.ril.ajio.services.data.Payment.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CaptchaResponse {
    private Captcha captcha;
    private Error error;
    private String message;
    private Boolean valid;

    public CaptchaResponse() {
        this(null, null, null, null, 15, null);
    }

    public CaptchaResponse(Captcha captcha, Boolean bl2, String string2, Error error) {
        this.captcha = captcha;
        this.valid = bl2;
        this.message = string2;
        this.error = error;
    }

    public /* synthetic */ CaptchaResponse(Captcha captcha, Boolean bl2, String string2, Error error, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            captcha = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            error = null;
        }
        this(captcha, bl2, string2, error);
    }

    public static /* synthetic */ CaptchaResponse copy$default(CaptchaResponse captchaResponse, Captcha captcha, Boolean bl2, String string2, Error error, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            captcha = captchaResponse.captcha;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = captchaResponse.valid;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = captchaResponse.message;
        }
        if ((n3 &= 8) != 0) {
            error = captchaResponse.error;
        }
        return captchaResponse.copy(captcha, bl2, string2, error);
    }

    public final Captcha component1() {
        return this.captcha;
    }

    public final Boolean component2() {
        return this.valid;
    }

    public final String component3() {
        return this.message;
    }

    public final Error component4() {
        return this.error;
    }

    public final CaptchaResponse copy(Captcha captcha, Boolean bl2, String string2, Error error) {
        CaptchaResponse captchaResponse = new CaptchaResponse(captcha, bl2, string2, error);
        return captchaResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CaptchaResponse;
        if (!bl3) {
            return false;
        }
        object = (CaptchaResponse)object;
        Object object2 = this.captcha;
        Object object3 = ((CaptchaResponse)object).captcha;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.valid;
        object3 = ((CaptchaResponse)object).valid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((CaptchaResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object = ((CaptchaResponse)object).error;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Captcha getCaptcha() {
        return this.captcha;
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
        Captcha captcha = this.captcha;
        int n7 = 0;
        if (captcha == null) {
            n4 = 0;
            captcha = null;
        } else {
            n4 = captcha.hashCode();
        }
        n4 *= 31;
        Object object = this.valid;
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
        object = this.error;
        if (object != null) {
            n7 = ((Error)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCaptcha(Captcha captcha) {
        this.captcha = captcha;
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
        Captcha captcha = this.captcha;
        Boolean bl2 = this.valid;
        String string2 = this.message;
        Error error = this.error;
        StringBuilder stringBuilder = new StringBuilder("CaptchaResponse(captcha=");
        stringBuilder.append(captcha);
        stringBuilder.append(", valid=");
        stringBuilder.append(bl2);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

