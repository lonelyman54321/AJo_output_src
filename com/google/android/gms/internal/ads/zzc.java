/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzb;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzn;
import java.util.Arrays;

public final class zzc {
    static final String zza;
    public static final zzn zzb;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;
    private static final String zzr;
    public final long zzc;
    public final int zzd;
    public final Uri[] zze;
    public final zzbu[] zzf;
    public final int[] zzg;
    public final long[] zzh;
    public final long zzi;
    public final boolean zzj;

    static {
        int n3 = 36;
        zzk = Integer.toString(0, n3);
        zzl = Integer.toString(1, n3);
        zzm = Integer.toString(2, n3);
        zzn = Integer.toString(3, n3);
        zzo = Integer.toString(4, n3);
        zzp = Integer.toString(5, n3);
        zzq = Integer.toString(6, n3);
        zzr = Integer.toString(7, n3);
        zza = Integer.toString(8, n3);
        zzb zzb2 = new zzb();
        zzb = zzb2;
    }

    public zzc(long l2) {
        int[] nArray = new int[]{};
        zzbu[] zzbuArray = new zzbu[]{};
        long[] lArray = new long[]{};
        this(0L, -1, -1, nArray, zzbuArray, lArray, 0L, false);
    }

    private zzc(long l2, int n3, int n4, int[] nArray, zzbu[] zzbuArray, long[] lArray, long l3, boolean bl2) {
        Uri[] uriArray;
        int n7 = nArray.length;
        int n8 = zzbuArray.length;
        n4 = 0;
        if (n7 == n8) {
            n7 = 1;
        } else {
            n7 = 0;
            uriArray = null;
        }
        zzeq.zzd(n7 != 0);
        this.zzc = l3 = 0L;
        this.zzd = n3;
        this.zzg = nArray;
        this.zzf = zzbuArray;
        this.zzh = lArray;
        this.zzi = l3;
        this.zzj = false;
        uriArray = new Uri[n8];
        this.zze = uriArray;
        while (n4 < (n8 = (uriArray = this.zze).length)) {
            Object object = zzbuArray[n4];
            if (object == null) {
                n8 = 0;
                object = null;
            } else {
                object = ((zzbu)object).zzd;
                object.getClass();
                object = ((zzbn)object).zzb;
            }
            uriArray[n4] = object;
            ++n4;
        }
    }

    public final boolean equals(Object object) {
        Object[] objectArray;
        Object[] objectArray2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (objectArray2 = zzc.class) == (objectArray = object.getClass())) {
            boolean bl3;
            object = (zzc)object;
            int n3 = this.zzd;
            int n4 = ((zzc)object).zzd;
            if (n3 == n4 && (n3 = (int)(Arrays.equals(objectArray = this.zzf, objectArray2 = ((zzc)object).zzf) ? 1 : 0)) != 0 && (n3 = (int)(Arrays.equals((int[])(objectArray = (Object[])this.zzg), (int[])(objectArray2 = (Object[])((zzc)object).zzg)) ? 1 : 0)) != 0 && (bl3 = Arrays.equals((long[])(objectArray = (Object[])this.zzh), (long[])(object = (Object)((zzc)object).zzh)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzd * 31 + -1;
        Object[] objectArray = this.zzf;
        int n4 = Arrays.hashCode(objectArray) + (n3 *= 961);
        int[] nArray = this.zzg;
        n3 = Arrays.hashCode(nArray) + (n4 *= 31);
        objectArray = this.zzh;
        return (Arrays.hashCode((long[])objectArray) + (n3 *= 31)) * 961;
    }

    public final int zza(int n3) {
        int n4;
        int[] nArray;
        int n7;
        int n8 = 1;
        n3 += n8;
        while (n3 < (n7 = (nArray = this.zzg).length) && (n4 = nArray[n3]) != 0 && n4 != n8) {
            ++n3;
        }
        return n3;
    }

    public final zzc zzb(int n3) {
        Object object = this.zzg;
        int n4 = ((int[])object).length;
        int n7 = Math.max(0, n4);
        int[] nArray = Arrays.copyOf(object, n7);
        Arrays.fill(nArray, n4, n7, 0);
        object = this.zzh;
        n4 = ((int[])object).length;
        n7 = Math.max(0, n4);
        long[] lArray = Arrays.copyOf((long[])object, n7);
        Arrays.fill(lArray, n4, n7, -9223372036854775807L);
        Object[] objectArray = object = (Object)Arrays.copyOf(this.zzf, 0);
        objectArray = (zzbu[])object;
        object = new zzc;
        object(0L, 0, -1, nArray, (zzbu[])objectArray, lArray, 0L, false);
        return object;
    }
}

