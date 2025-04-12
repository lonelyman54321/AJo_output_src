/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Captcha {
    private String captchaId;
    private String imageUrl;

    public Captcha() {
        this(null, null, 3, null);
    }

    public Captcha(String string2, String string3) {
        this.captchaId = string2;
        this.imageUrl = string3;
    }

    public /* synthetic */ Captcha(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ Captcha copy$default(Captcha captcha, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = captcha.captchaId;
        }
        if ((n3 &= 2) != 0) {
            string3 = captcha.imageUrl;
        }
        return captcha.copy(string2, string3);
    }

    public final String component1() {
        return this.captchaId;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Captcha copy(String string2, String string3) {
        Captcha captcha = new Captcha(string2, string3);
        return captcha;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Captcha;
        if (!bl3) {
            return false;
        }
        object = (Captcha)object;
        String string2 = this.captchaId;
        String string3 = ((Captcha)object).captchaId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageUrl;
        object = ((Captcha)object).imageUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCaptchaId() {
        return this.captchaId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int n3;
        String string2 = this.captchaId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.imageUrl;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setCaptchaId(String string2) {
        this.captchaId = string2;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public String toString() {
        String string2 = this.captchaId;
        String string3 = this.imageUrl;
        return uc0_0.a("Captcha(captchaId=", string2, ", imageUrl=", string3, ")");
    }
}

