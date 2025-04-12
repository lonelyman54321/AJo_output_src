/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.ump;

public class FormError {
    private final int zza;
    private final String zzb;

    public FormError(int n3, String string2) {
        this.zza = n3;
        this.zzb = string2;
    }

    public int getErrorCode() {
        return this.zza;
    }

    public String getMessage() {
        return this.zzb;
    }
}

