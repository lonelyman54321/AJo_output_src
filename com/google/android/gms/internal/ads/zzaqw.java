/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzaqw {
    private final String zza;
    private final String zzb;

    public zzaqw(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzaqw.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzaqw)object;
            object2 = this.zza;
            object3 = ((zzaqw)object).zza;
            boolean bl4 = TextUtils.equals((CharSequence)object2, (CharSequence)object3);
            if (bl4 && (bl3 = TextUtils.equals((CharSequence)(object2 = this.zzb), (CharSequence)(object = ((zzaqw)object).zzb)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() * 31;
        return this.zzb.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Header[name=");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(",value=");
        string2 = this.zzb;
        return h30_0.a(stringBuilder, string2, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

