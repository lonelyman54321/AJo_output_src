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
import com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import java.util.ArrayList;
import java.util.List;

public final class zzbhp
extends NativeAd$AdChoicesInfo {
    private final zzbho zza;
    private final List zzb;
    private String zzc;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbhp(zzbho var1_1) {
        block10: {
            block11: {
                block9: {
                    var2_3 = "";
                    super();
                    var3_4 = new ArrayList();
                    this.zzb = var3_4;
                    this.zza = var1_1;
                    try {
                        this.zzc = var3_4 = var1_1.zzg();
                    }
                    catch (RemoteException var3_5) {
                        zzm.zzh(var2_3, var3_5);
                        this.zzc = var2_3;
                    }
                    try {
                        var1_1 = var1_1.zzh();
                        var1_1 = var1_1.iterator();
lbl15:
                        // 3 sources

                        while (var4_6 = var1_1.hasNext()) {
                            var3_4 = var1_1.next();
                            break block9;
                        }
                        return;
                    }
                    catch (RemoteException var1_2) {
                        break block10;
                    }
                }
                var5_7 = var3_4 instanceof IBinder;
                var6_8 = false;
                var7_9 = null;
                {
                    if (!var5_7 || (var3_4 = (IBinder)var3_4) == null) break block11;
                    var8_10 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
                }
                var6_8 = (var8_10 = var3_4.queryLocalInterface((String)var8_10)) instanceof zzbhv;
                if (var6_8) {
                    var7_9 = var8_10;
                    var7_9 = (zzbhv)var8_10;
                } else {
                    var7_9 = new zzbht((IBinder)var3_4);
                }
            }
            if (var7_9 == null) ** GOTO lbl15
            var3_4 = this.zzb;
            var8_10 = new zzbhw((zzbhv)var7_9);
            var3_4.add(var8_10);
            ** GOTO lbl15
        }
        zzm.zzh(var2_3, var1_2);
    }

    public final List getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}

