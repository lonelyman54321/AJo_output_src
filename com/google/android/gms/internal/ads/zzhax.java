/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzhax {
    private final Object zza;
    private final int zzb;

    public zzhax(Object object, int n3) {
        this.zza = object;
        this.zzb = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4 = object instanceof zzhax;
        if (n4 == 0) {
            return false;
        }
        object = (zzhax)object;
        Object object2 = this.zza;
        Object object3 = ((zzhax)object).zza;
        return object2 == object3 && (n4 = this.zzb) == (n3 = ((zzhax)object).zzb);
    }

    public final int hashCode() {
        int n3 = System.identityHashCode(this.zza) * (char)-1;
        int n4 = this.zzb;
        return n3 + n4;
    }
}

