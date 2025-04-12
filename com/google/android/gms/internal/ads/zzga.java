/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import java.util.Arrays;

public final class zzga {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzga() {
        throw null;
    }

    public zzga(int n3) {
        n3 = 10;
        long[] lArray = new long[n3];
        this.zza = lArray;
        Object[] objectArray = new Object[n3];
        this.zzb = objectArray;
    }

    private final Object zzf() {
        Object[] objectArray;
        int n3 = this.zzd;
        int n4 = 1;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray = null;
        }
        zzeq.zzf(n3 != 0);
        objectArray = this.zzb;
        int n7 = this.zzc;
        Object object = objectArray[n7];
        objectArray[n7] = null;
        n7 += n4;
        n3 = objectArray.length;
        this.zzc = n7 %= n3;
        this.zzd = n3 = this.zzd + -1;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        synchronized (this) {
            return this.zzd;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzb() {
        synchronized (this) {
            int n3 = this.zzd;
            if (n3 != 0) return this.zzf();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzc(long l2) {
        synchronized (this) {
            Object object = null;
            try {
                int n3 = this.zzd;
                if (n3 <= 0) return object;
                long[] lArray = this.zza;
                int n4 = this.zzc;
                long l3 = lArray[n4];
                long l4 = l2 - l3;
                long l7 = 0L;
                long l8 = l4 - l7;
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 >= 0) return this.zzf();
            }
            catch (Throwable throwable) {}
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(long l2, Object object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object[] objectArray;
                int n3;
                Object[] objectArray2;
                Object[] objectArray3;
                int n4;
                int n7;
                block6: {
                    try {
                        n7 = this.zzd;
                        if (n7 <= 0) break block6;
                        n4 = this.zzc + n7;
                        objectArray3 = this.zzb;
                        n4 += -1;
                        n7 = objectArray3.length;
                        objectArray3 = this.zza;
                        Object object2 = objectArray3[n4 %= n7];
                        long l3 = l2 - object2;
                        if ((n7 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1))) > 0) break block6;
                        this.zze();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if ((n4 = this.zzd) >= (n7 = (objectArray3 = this.zzb).length)) {
                    n4 = n7 + n7;
                    objectArray2 = new long[n4];
                    Object[] objectArray4 = new Object[n4];
                    n3 = this.zzc;
                    long[] lArray = this.zza;
                    System.arraycopy(lArray, n3, objectArray2, 0, n7 -= n3);
                    objectArray = this.zzb;
                    int n8 = this.zzc;
                    System.arraycopy(objectArray, n8, objectArray4, 0, n7);
                    n3 = this.zzc;
                    if (n3 > 0) {
                        lArray = this.zza;
                        System.arraycopy(lArray, 0, objectArray2, n7, n3);
                        objectArray = this.zzb;
                        n8 = this.zzc;
                        System.arraycopy(objectArray, 0, objectArray4, n7, n8);
                    }
                    this.zza = objectArray2;
                    this.zzb = objectArray4;
                    this.zzc = 0;
                }
                n7 = this.zzc;
                n4 = this.zzd;
                n7 += n4;
                objectArray2 = this.zzb;
                n3 = objectArray2.length;
                objectArray = this.zza;
                objectArray[n7 %= n3] = l2;
                objectArray2[n7] = (long)object;
                this.zzd = ++n4;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        synchronized (this) {
            Object[] objectArray = null;
            this.zzc = 0;
            this.zzd = 0;
            objectArray = this.zzb;
            Arrays.fill(objectArray, null);
            return;
        }
    }
}

