/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.SparseArray
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzog;
import com.google.common.util.concurrent.FutureCallback;
import java.util.PriorityQueue;

final class zzkk
implements FutureCallback {
    private final /* synthetic */ zzog zza;
    private final /* synthetic */ zzju zzb;

    public zzkk(zzju zzju2, zzog zzog2) {
        this.zza = zzog2;
        this.zzb = zzju2;
    }

    private final void zza() {
        int n3;
        SparseArray sparseArray = this.zzb.zzk().zzm();
        Object object = this.zza;
        int n4 = ((zzog)object).zzc;
        long l2 = ((zzog)object).zzb;
        object = l2;
        sparseArray.put(n4, object);
        object = this.zzb.zzk();
        n4 = sparseArray.size();
        int[] nArray = new int[n4];
        int n7 = sparseArray.size();
        long[] lArray = new long[n7];
        for (int i3 = 0; i3 < (n3 = sparseArray.size()); ++i3) {
            long l3;
            nArray[i3] = n3 = sparseArray.keyAt(i3);
            Long l4 = (Long)sparseArray.valueAt(i3);
            lArray[i3] = l3 = l4.longValue();
        }
        sparseArray = new Bundle();
        sparseArray.putIntArray("uriSources", nArray);
        sparseArray.putLongArray("uriTimestamps", lArray);
        ((zzha)object).zzi.zza((Bundle)sparseArray);
    }

    /*
     * WARNING - void declaration
     */
    public final void onFailure(Throwable object) {
        void var4_7;
        this.zzb.zzv();
        zzju.zza(this.zzb, false);
        Object object2 = this.zzb.zze();
        Object object3 = zzbn.zzct;
        boolean n3 = ((zzai)object2).zza((zzfx)object3);
        int n4 = 2;
        if (n3) {
            object2 = this.zzb;
            int n7 = zzju.zza((zzju)object2, (Throwable)object);
        } else {
            int n8 = 2;
        }
        int n10 = 1;
        void var4_8 = var4_7 - n10;
        if (var4_8 != false) {
            if (var4_8 != n10) {
                if (var4_8 == n4) {
                    object2 = this.zzb.zzj().zzg();
                    object3 = zzgo.zza(this.zzb.zzg().zzaf());
                    String string2 = "registerTriggerAsync failed. Dropping URI. App ID, Throwable";
                    ((zzgq)object2).zza(string2, object3, object);
                    this.zza();
                    zzju.zza(this.zzb, n10);
                    object = this.zzb;
                    ((zzju)object).zzav();
                }
                return;
            }
            object2 = this.zzb.zzan();
            object3 = this.zza;
            ((PriorityQueue)object2).add(object3);
            object2 = this.zzb;
            int n14 = zzju.zza((zzju)object2);
            object3 = zzbn.zzbq;
            Object object4 = null;
            object3 = (Integer)((zzfx)object3).zza(null);
            n4 = (Integer)object3;
            if (n14 > n4) {
                zzju.zza(this.zzb, n10);
                object2 = this.zzb.zzj().zzr();
                object3 = zzgo.zza(this.zzb.zzg().zzaf());
                object = zzgo.zza(((Throwable)object).toString());
                ((zzgq)object2).zza("registerTriggerAsync failed. May try later. App ID, throwable", object3, object);
                return;
            }
            object2 = this.zzb.zzj().zzr();
            object3 = zzgo.zza(this.zzb.zzg().zzaf());
            object4 = zzgo.zza(String.valueOf(zzju.zza(this.zzb)));
            object = zzgo.zza(((Throwable)object).toString());
            ((zzgq)object2).zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", object3, object4, object);
            object = this.zzb;
            int n15 = zzju.zza((zzju)object);
            zzju.zzb((zzju)object, n15);
            object = this.zzb;
            int n16 = zzju.zza((zzju)object) << n10;
            zzju.zza((zzju)object, n16);
            return;
        }
        object2 = this.zzb.zzj().zzr();
        object3 = zzgo.zza(this.zzb.zzg().zzaf());
        object = zzgo.zza(((Throwable)object).toString());
        ((zzgq)object2).zza("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", object3, object);
        zzju.zza(this.zzb, n10);
        object = this.zzb.zzan();
        object2 = this.zza;
        ((PriorityQueue)object).add(object2);
    }

    public final void onSuccess(Object object) {
        this.zzb.zzv();
        this.zza();
        zzju.zza(this.zzb, false);
        zzju.zza(this.zzb, 1);
        object = this.zzb.zzj().zzc();
        String string2 = this.zza.zza;
        ((zzgq)object).zza("Successfully registered trigger URI", string2);
        this.zzb.zzav();
    }
}

