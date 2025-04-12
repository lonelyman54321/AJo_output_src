/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzub {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzub(String string2, boolean bl2, boolean bl3) {
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = bl3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = object.getClass()) == (object2 = zzub.class)) {
            boolean bl3;
            boolean bl4;
            object = (zzub)object;
            object3 = this.zza;
            object2 = ((zzub)object).zza;
            boolean bl5 = TextUtils.equals((CharSequence)object3, (CharSequence)object2);
            if (bl5 && (bl5 = this.zzb) == (bl4 = ((zzub)object).zzb) && (bl5 = this.zzc) == (bl3 = ((zzub)object).zzc)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zza;
        int n3 = string2.hashCode() + 31;
        int n4 = this.zzb;
        int n7 = 1231;
        int n8 = 1;
        n4 = n8 != n4 ? 1237 : 1231;
        n3 = (n3 * 31 + n4) * 31;
        n4 = (int)(this.zzc ? 1 : 0);
        if (n8 != n4) {
            n7 = 1237;
        }
        return n3 + n7;
    }
}

