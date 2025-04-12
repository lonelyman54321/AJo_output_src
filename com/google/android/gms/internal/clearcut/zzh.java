/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.clearcut.zzfz;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzi;
import com.google.android.gms.internal.clearcut.zzj;
import com.google.android.gms.internal.clearcut.zzn;

final class zzh
extends BaseImplementation$ApiMethodImpl {
    private final zze zzao;

    public zzh(zze zze2, GoogleApiClient googleApiClient) {
        Api api = ClearcutLogger.API;
        super(api, googleApiClient);
        this.zzao = zze2;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void doExecute(Api$AnyClient object) {
        zze zze2;
        object = (zzj)object;
        zzi zzi2 = new zzi(this);
        try {
            int n3;
            byte[] byArray;
            zzha zzha2;
            zze2 = this.zzao;
            Object object2 = zze2.zzt;
            if (object2 != null) {
                zzha2 = zze2.zzaa;
                byArray = zzha2.zzbjp;
                n3 = byArray.length;
                if (n3 == 0) {
                    object2 = object2.zza();
                    zzha2.zzbjp = (byte[])object2;
                }
            }
            if ((object2 = zze2.zzan) != null) {
                zzha2 = zze2.zzaa;
                byArray = zzha2.zzbjw;
                n3 = byArray.length;
                if (n3 == 0) {
                    object2 = object2.zza();
                    zzha2.zzbjw = (byte[])object2;
                }
            }
            object2 = zze2.zzaa;
            int n4 = ((zzfz)object2).zzas();
            byArray = new byte[n4];
            zzfz.zza((zzfz)object2, byArray, 0, n4);
            zze2.zzah = byArray;
        }
        catch (RuntimeException runtimeException) {
            object = new Status(10, "MessageProducer");
            this.setFailedResult((Status)object);
            return;
        }
        object = (zzn)((BaseGmsClient)object).getService();
        zze2 = this.zzao;
        object.zza(zzi2, zze2);
    }
}

