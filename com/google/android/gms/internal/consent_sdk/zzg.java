/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.FormError;

public final class zzg
extends Exception {
    private final int zza;

    public zzg(int n3, String string2) {
        super(string2);
        this.zza = n3;
    }

    public zzg(int n3, String string2, Throwable throwable) {
        super(string2, throwable);
        this.zza = n3;
    }

    public final FormError zza() {
        Throwable throwable = this.getCause();
        if (throwable == null) {
            this.getMessage();
        } else {
            this.getMessage();
            this.getCause();
        }
        int n3 = this.zza;
        String string2 = this.getMessage();
        FormError formError = new FormError(n3, string2);
        return formError;
    }
}

