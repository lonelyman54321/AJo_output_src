/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.signin.zaf;

public final class SignInOptions
implements Api$ApiOptions$Optional {
    public static final SignInOptions zaa;
    private final boolean zab;
    private final boolean zac;
    private final String zad;
    private final boolean zae;
    private final String zaf;
    private final String zag;
    private final boolean zah;
    private final Long zai = null;
    private final Long zaj = null;

    static {
        SignInOptions signInOptions;
        zaa = signInOptions = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    }

    public /* synthetic */ SignInOptions(boolean bl2, boolean bl3, String string2, boolean bl4, String string3, String string4, boolean bl5, Long l2, Long l3, zaf zaf2) {
        this.zab = false;
        this.zac = false;
        this.zad = null;
        this.zae = false;
        this.zah = false;
        this.zaf = null;
        this.zag = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof SignInOptions;
        if (!bl3) {
            return false;
        }
        boolean bl4 = ((SignInOptions)object).zab;
        bl4 = false;
        object = null;
        bl3 = Objects.equal(null, null);
        if (bl3 && (bl3 = Objects.equal(null, null)) && (bl3 = Objects.equal(null, null)) && (bl3 = Objects.equal(null, null)) && (bl4 = Objects.equal(null, null))) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objectArray = new Object[9];
        Boolean bl2 = Boolean.FALSE;
        objectArray[0] = bl2;
        objectArray[1] = bl2;
        objectArray[2] = null;
        objectArray[3] = bl2;
        objectArray[4] = bl2;
        objectArray[5] = null;
        objectArray[6] = null;
        objectArray[7] = null;
        objectArray[8] = null;
        return Objects.hashCode(objectArray);
    }
}

