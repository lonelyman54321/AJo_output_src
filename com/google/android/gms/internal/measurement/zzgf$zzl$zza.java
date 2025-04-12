/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgf$zzl$zza
extends Enum
implements zzki {
    private static final /* enum */ zzgf$zzl$zza zza;
    private static final /* enum */ zzgf$zzl$zza zzb;
    private static final /* synthetic */ zzgf$zzl$zza[] zzc;
    private final int zzd;

    static {
        zzgf$zzl$zza zzgf$zzl$zza;
        zzgf$zzl$zza zzgf$zzl$zza2;
        int n3 = 1;
        zza = zzgf$zzl$zza2 = new zzgf$zzl$zza("RADS", 0, n3);
        int n4 = 2;
        zzb = zzgf$zzl$zza = new zzgf$zzl$zza("PROVISIONING", n3, n4);
        zzgf$zzl$zza[] zzgf$zzl$zzaArray = new zzgf$zzl$zza[n4];
        zzgf$zzl$zzaArray[0] = zzgf$zzl$zza2;
        zzgf$zzl$zzaArray[n3] = zzgf$zzl$zza;
        zzc = zzgf$zzl$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgf$zzl$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzd = var3_2;
    }

    public static zzgf$zzl$zza[] values() {
        return (zzgf$zzl$zza[])zzc.clone();
    }

    public static zzgf$zzl$zza zza(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return null;
            }
            return zzb;
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzgl.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgf$zzl$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzd;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzd;
    }
}

