/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaez {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaez(int n3, byte[] byArray, int n4, int n7) {
        this.zza = n3;
        this.zzb = byArray;
        this.zzc = n4;
        this.zzd = n7;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<zzaez> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = zzaez.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzaez)object;
            int n3 = this.zza;
            int n4 = ((zzaez)object).zza;
            if (n3 == n4 && (n3 = this.zzc) == (n4 = ((zzaez)object).zzc) && (n3 = this.zzd) == (n4 = ((zzaez)object).zzd) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzb), (byte[])(object = (Object)((zzaez)object).zzb)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza;
        byte[] byArray = this.zzb;
        int n4 = (Arrays.hashCode(byArray) + (n3 *= 31)) * 31;
        n3 = this.zzc;
        n4 = (n4 + n3) * 31;
        n3 = this.zzd;
        return n4 + n3;
    }
}

