/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgt;

abstract class zzax {
    private static final zzce zza;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = null;
            var1_1 = zzaw.class;
            var1_1 = var1_1.getClassLoader();
            var2_2 = "com.google.android.gms.ads.internal.ClientApi";
            var1_1 = var1_1.loadClass((String)var2_2);
            var1_1 = var1_1.getDeclaredConstructor(null);
            var1_1 = var1_1.newInstance(null);
            var3_3 = var1_1 instanceof IBinder;
            if (var3_3) ** GOTO lbl18
            var1_1 = "ClientApi class is not an instance of IBinder.";
            zzm.zzj((String)var1_1);
            break block13;
lbl18:
            // 1 sources

            if ((var1_1 = (IBinder)var1_1) == null) break block13;
            var2_2 = "com.google.android.gms.ads.internal.client.IClientApi";
            var2_2 = var1_1.queryLocalInterface((String)var2_2);
            var4_4 = var2_2 instanceof zzce;
            if (var4_4) {
                var2_2 = (zzce)var2_2;
lbl26:
                // 2 sources

                while (true) {
                    var0 = var2_2;
                    break;
                }
            } else {
                try {
                    var2_2 = new zzcc((IBinder)var1_1);
                    ** continue;
                }
                catch (Exception v0) {
                    var1_1 = "Failed to instantiate ClientApi class.";
                    zzm.zzj((String)var1_1);
                }
            }
        }
        zzax.zza = var0;
    }

    private final Object zze() {
        zzce zzce2 = zza;
        if (zzce2 != null) {
            try {
                return this.zzb(zzce2);
            }
            catch (RemoteException remoteException) {
                zzm.zzk("Cannot invoke local loader using ClientApi class.", remoteException);
                return null;
            }
        }
        zzm.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object zzf() {
        try {
            return this.zzc();
        }
        catch (RemoteException remoteException) {
            zzm.zzk("Cannot invoke remote loader.", remoteException);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb(zzce var1);

    public abstract Object zzc();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object zzd(Context var1_1, boolean var2_2) {
        var3_3 = 1;
        if (!var2_2) {
            zzay.zzb();
            var4_4 = zzf.zzt(var1_1 /* !! */ , 12451000);
            if (var4_4 == 0) {
                var5_5 = "Google Play Services is not available.";
                zzm.zze((String)var5_5);
                var2_2 = true;
            }
        }
        var6_6 = "com.google.android.gms.ads.dynamite";
        var7_7 = DynamiteModule.getLocalVersion(var1_1 /* !! */ , (String)var6_6);
        var4_4 = DynamiteModule.getRemoteVersion(var1_1 /* !! */ , (String)var6_6);
        var8_8 = false;
        if (var7_7 > var4_4) {
            var4_4 = 0;
            var6_6 = null;
        } else {
            var4_4 = 1;
        }
        var4_4 ^= var3_3;
        zzbep.zza(var1_1 /* !! */ );
        var9_9 = (Boolean)zzbgf.zza.zze();
        var7_7 = (int)var9_9.booleanValue();
        if (var7_7 != 0) lbl-1000:
        // 2 sources

        {
            while (true) {
                var2_2 = false;
                var5_5 = null;
                break;
            }
        } else {
            var9_9 = (Boolean)zzbgf.zzb.zze();
            var7_7 = (int)var9_9.booleanValue();
            if (var7_7 != 0) {
                var2_2 = true;
                var8_8 = true;
            } else {
                var8_8 = var2_2 |= var4_4;
                ** continue;
            }
        }
        if (var8_8) {
            var1_1 /* !! */  = this.zze();
            if (var1_1 /* !! */  == null && !var2_2) {
                var1_1 /* !! */  = this.zzf();
            }
        } else {
            var5_5 = this.zzf();
            if (var5_5 == null) {
                var6_6 = (Long)zzbgt.zza.zze();
                var4_4 = var6_6.intValue();
                var9_9 = zzay.zze();
                var4_4 = var9_9.nextInt(var4_4);
                if (var4_4 == 0) {
                    var10_10 = new Bundle();
                    var10_10.putString("action", "dynamite_load");
                    var6_6 = "is_missing";
                    var10_10.putInt((String)var6_6, var3_3);
                    var9_9 = zzay.zzb();
                    var11_11 = zzay.zzc();
                    var12_12 = var11_11.afmaVersion;
                    var13_13 = "gmob-apps";
                    var14_14 = true;
                    var9_9.zzo(var1_1 /* !! */ , var12_12, var13_13, var10_10, var14_14);
                }
            }
            var1_1 /* !! */  = var5_5 == null ? this.zze() : var5_5;
        }
        if (var1_1 /* !! */  == null) {
            var1_1 /* !! */  = this.zza();
        }
        return var1_1 /* !! */ ;
    }
}

