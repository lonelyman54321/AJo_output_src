/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
package com.google.android.gms.vision;

import android.util.SparseIntArray;

public final class zzc {
    private static final Object zza;
    private static int zzb;
    private final SparseIntArray zzc;
    private final SparseIntArray zzd;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzc() {
        SparseIntArray sparseIntArray;
        this.zzc = sparseIntArray = new SparseIntArray();
        this.zzd = sparseIntArray = new SparseIntArray();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(int n3) {
        Object object = zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                int n4;
                int n7;
                try {
                    SparseIntArray sparseIntArray = this.zzc;
                    n7 = -1;
                    n4 = sparseIntArray.get(n3, n7);
                    if (n4 != n7) {
                        return n4;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                n4 = zzb;
                zzb = n7 = n4 + 1;
                SparseIntArray sparseIntArray = this.zzc;
                sparseIntArray.append(n3, n4);
                sparseIntArray = this.zzd;
                sparseIntArray.append(n4, n3);
                return n4;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzb(int n3) {
        Object object = zza;
        synchronized (object) {
            SparseIntArray sparseIntArray = this.zzd;
            return sparseIntArray.get(n3);
        }
    }
}

