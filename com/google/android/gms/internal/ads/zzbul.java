/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbun;
import java.util.ArrayList;
import java.util.List;

public final class zzbul
extends NativeAd$AdChoicesInfo {
    private final List zza;
    private String zzb;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbul(zzbho var1_1) {
        block9: {
            block8: {
                var2_3 = "";
                super();
                var3_4 = new ArrayList();
                this.zza = var3_4;
                try {
                    this.zzb = var3_4 = var1_1.zzg();
                }
                catch (RemoteException var3_5) {
                    zzm.zzh(var2_3, var3_5);
                    this.zzb = var2_3;
                }
                try {
                    var1_1 = var1_1.zzh();
                    var1_1 = var1_1.iterator();
lbl14:
                    // 3 sources

                    while (var4_6 = var1_1.hasNext()) {
                        break block8;
                    }
                    return;
                }
                catch (RemoteException var1_2) {
                    break block9;
                }
            }
            var3_4 = var1_1.next();
            var5_7 = var3_4 instanceof IBinder;
            if (var5_7) {
                var3_4 = (IBinder)var3_4;
                var3_4 = zzbhu.zzg((IBinder)var3_4);
            } else {
                var4_6 = false;
                var3_4 = null;
            }
            if (var3_4 == null) ** GOTO lbl14
            var6_8 = this.zza;
            var7_9 = new zzbun((zzbhv)var3_4);
            var6_8.add(var7_9);
            ** GOTO lbl14
        }
        zzm.zzh(var2_3, var1_2);
    }

    public final List getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}

