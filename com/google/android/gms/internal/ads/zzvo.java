/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzvo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzvo(Object object, int n3, int n4, long l2) {
        this(object, n3, n4, l2, -1);
    }

    private zzvo(Object object, int n3, int n4, long l2, int n7) {
        this.zza = object;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = l2;
        this.zze = n7;
    }

    public zzvo(Object object, long l2) {
        this(object, -1, -1, l2, -1);
    }

    public zzvo(Object object, long l2, int n3) {
        this(object, -1, -1, l2, n3);
    }

    public final boolean equals(Object object) {
        int n3;
        long l2;
        long l3;
        long l4;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof zzvo;
        if (n7 == 0) {
            return false;
        }
        object = (zzvo)object;
        Object object2 = this.zza;
        Object object3 = ((zzvo)object).zza;
        n7 = object2.equals(object3);
        if (n7 != 0 && (n7 = this.zzb) == (n4 = ((zzvo)object).zzb) && (n7 = this.zzc) == (n4 = ((zzvo)object).zzc) && (n7 = (int)((l4 = (l3 = this.zzd) - (l2 = ((zzvo)object).zzd)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0 && (n7 = this.zze) == (n3 = ((zzvo)object).zze)) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() + 527;
        long l2 = this.zzd;
        n3 *= 31;
        int n4 = this.zzb;
        n3 = (n3 + n4) * 31;
        n4 = this.zzc;
        n3 = (n3 + n4) * 31;
        int n7 = (int)l2;
        n3 = (n3 + n7) * 31;
        int n8 = this.zze;
        return n3 + n8;
    }

    public final zzvo zza(Object object) {
        Object object2 = this.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return this;
        }
        int n3 = this.zzb;
        int n4 = this.zzc;
        long l2 = this.zzd;
        int n7 = this.zze;
        object2 = new zzvo(object, n3, n4, l2, n7);
        return object2;
    }

    public final boolean zzb() {
        int n3 = this.zzb;
        int n4 = -1;
        return n3 != n4;
    }
}

