/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import java.util.Arrays;

public final class zzfe {
    private static final zzfe zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;

    static {
        zzfe zzfe2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzfe2 = new zzfe(0, nArray, objectArray, false);
    }

    private zzfe() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzfe(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = nArray;
        this.zzd = objectArray;
    }

    public static zzfe zza() {
        return zza;
    }

    public static zzfe zzb(zzfe objectArray, zzfe zzfe2) {
        int cfr_ignored_0 = objectArray.zzb;
        int cfr_ignored_1 = zzfe2.zzb;
        int[] nArray = Arrays.copyOf(objectArray.zzc, 0);
        System.arraycopy(zzfe2.zzc, 0, nArray, 0, 0);
        objectArray = Arrays.copyOf(objectArray.zzd, 0);
        System.arraycopy(zzfe2.zzd, 0, objectArray, 0, 0);
        zzfe2 = new zzfe(0, nArray, objectArray, true);
        return zzfe2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        boolean bl3 = object instanceof zzfe;
        if (!bl3) {
            return false;
        }
        object = (zzfe)object;
        return bl2;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zzc() {
        int n3 = this.zze;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
            this.zze = 0;
        }
        return n3;
    }

    public final int zzd() {
        int n3 = this.zze;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
            this.zze = 0;
        }
        return n3;
    }

    public final void zze(StringBuilder stringBuilder, int n3) {
    }
}

