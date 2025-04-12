/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzxk;

final class zzxl {
    private int zza;
    private final SparseArray zzb;
    private final zzev zzc;

    public zzxl() {
        zzxk zzxk2 = new zzxk();
        this(zzxk2);
    }

    public zzxl(zzev zzev2) {
        SparseArray sparseArray;
        this.zzb = sparseArray = new SparseArray();
        this.zzc = zzev2;
        this.zza = -1;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final Object zza(int n3) {
        int n4;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int n7;
        int n8;
        boolean bl2 = true;
        while (true) {
            block4: {
                block3: {
                    if (!bl2 || (bl2 = false)) break block3;
                    n8 = this.zza;
                    n7 = -1;
                    if (n8 != n7) break block4;
                    n8 = 0;
                    sparseArray2 = null;
                }
                this.zza = n8;
            }
            n8 = this.zza;
            if (n8 <= 0 || n3 >= (n8 = (sparseArray = this.zzb).keyAt(n8))) break;
            n8 = this.zza + n7;
        }
        while ((n8 = this.zza) < (n4 = (sparseArray = this.zzb).size() + n7) && n3 >= (n8 = (sparseArray2 = this.zzb).keyAt(n4 = this.zza + 1))) {
            this.zza = n8 = this.zza + 1;
        }
        SparseArray sparseArray3 = this.zzb;
        n8 = this.zza;
        return sparseArray3.valueAt(n8);
    }

    public final Object zzb() {
        int n3 = this.zzb.size() + -1;
        return this.zzb.valueAt(n3);
    }

    public final void zzc(int n3, Object object) {
        Object object2;
        int n4 = this.zza;
        boolean bl2 = true;
        int n7 = 0;
        int n8 = -1;
        if (n4 == n8) {
            object2 = this.zzb;
            n4 = object2.size();
            if (n4 == 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            zzeq.zzf(n4 != 0);
            this.zza = 0;
        }
        if ((n4 = (object2 = this.zzb).size()) > 0) {
            Object object3;
            object2 = this.zzb;
            int n10 = object2.size() + n8;
            n4 = object2.keyAt(n10);
            if (n3 < n4) {
                bl2 = false;
                object3 = null;
            }
            zzeq.zzd(bl2);
            if (n4 == n3) {
                object2 = this.zzc;
                object3 = this.zzb;
                n7 = object3.size() + n8;
                object3 = object3.valueAt(n7);
                object2.zza(object3);
            }
        }
        this.zzb.append(n3, object);
    }

    public final void zzd() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.zzb).size()); ++i3) {
            object = this.zzc;
            Object object2 = this.zzb.valueAt(i3);
            object.zza(object2);
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int n3) {
        int n4;
        Object object;
        int n7;
        int n8 = 0;
        while (n8 < (n7 = (object = this.zzb).size() + -1) && n3 >= (n7 = (object = this.zzb).keyAt(n4 = n8 + 1))) {
            object = this.zzc;
            Object object2 = this.zzb.valueAt(n8);
            object.zza(object2);
            object = this.zzb;
            object.removeAt(n8);
            n8 = this.zza;
            if (n8 > 0) {
                this.zza = n8 += -1;
            }
            n8 = n4;
        }
    }

    public final boolean zzf() {
        SparseArray sparseArray = this.zzb;
        int n3 = sparseArray.size();
        return n3 == 0;
    }
}

