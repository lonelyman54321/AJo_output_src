/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzp;

final class zzo
extends zzp {
    private final int zza;
    private final long zzb;

    public zzo(int n3, long l2) {
        this.zza = n3;
        this.zzb = l2;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof zzp;
        if (n4 != 0 && (n4 = this.zza) == (n3 = ((zzp)(object = (zzp)object)).zza()) && (l7 = (l4 = (l3 = this.zzb) - (l2 = ((zzp)object).zzb())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza;
        int n4 = 1000003;
        n3 ^= n4;
        long l2 = this.zzb;
        long l3 = l2 >>> 32;
        n3 *= n4;
        n4 = (int)(l2 ^= l3);
        return n3 ^ n4;
    }

    public final String toString() {
        int n3 = this.zza;
        long l2 = this.zzb;
        StringBuilder stringBuilder = new StringBuilder("EventRecord{eventType=");
        stringBuilder.append(n3);
        stringBuilder.append(", eventTimestamp=");
        stringBuilder.append(l2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }
}

