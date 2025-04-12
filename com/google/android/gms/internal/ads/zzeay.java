/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzear;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzeaw;
import com.google.android.gms.internal.ads.zzeax;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeay
extends zzeas {
    private String zzg;
    private int zzh = 1;

    public zzeay(Context context) {
        zzbwr zzbwr2;
        Looper looper = zzu.zzt().zzb();
        this.zzf = zzbwr2 = new zzbwr(context, looper, this, this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnected(Bundle var1_1) {
        var1_1 /* !! */  = this.zzb;
        synchronized (var1_1 /* !! */ ) {
            block12: {
                block11: {
                    block10: {
                        var2_2 = this.zzd;
                        if (var2_2 != 0) ** GOTO lbl53
                        var2_2 = 1;
                        this.zzd = var2_2;
                        {
                            catch (Throwable var8_19) {
                                break block12;
                            }
                        }
                        try {
                            var3_3 = this.zzh;
                            var4_4 = 2;
                            if (var3_3 != var4_4) break block10;
                            var5_5 = this.zzf;
                            var5_5 = var5_5.zzp();
                            var6_11 = this.zze;
                            var7_16 = new zzear(this);
                            var5_5.zze(var6_11, var7_16);
                            ** GOTO lbl53
                        }
                        catch (Throwable var5_6) {
                            break block11;
                        }
                    }
                    var4_4 = 3;
                    if (var3_3 == var4_4) {
                        var5_7 = this.zzf;
                        var5_7 = var5_7.zzp();
                        var6_12 = this.zzg;
                        var7_17 = new zzear(this);
                        var5_7.zzh(var6_12, var7_17);
                    } else {
                        var5_8 = this.zza;
                        var6_13 = new zzebh(var2_2);
                        var5_8.zzd(var6_13);
                    }
                    ** GOTO lbl53
                }
                var6_14 = zzu.zzo();
                var7_18 = "RemoteUrlAndCacheKeyClientTask.onConnected";
                var6_14.zzw(var5_6, var7_18);
                var5_9 = this.zza;
                var6_14 = new zzebh(var2_2);
                var5_9.zzd((Throwable)var6_14);
                catch (RemoteException | IllegalArgumentException v0) {
                    var5_10 = this.zza;
                    var6_15 = new zzebh(var2_2);
                    var5_10.zzd(var6_15);
lbl53:
                    // 6 sources

                    return;
                }
            }
            throw var8_19;
        }
    }

    public final void onConnectionFailed(ConnectionResult object) {
        zzm.zze("Cannot connect to remote service, fallback to local instance.");
        object = new zzebh(1);
        this.zza.zzd((Throwable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(zzbxu object) {
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                int n3;
                int n4;
                int n7;
                try {
                    n7 = this.zzh;
                    n4 = 1;
                    n3 = 2;
                    if (n7 != n4 && n7 != n3) {
                        object = new zzebh(n3);
                        return zzgft.zzg((Throwable)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                n7 = (int)(this.zzc ? 1 : 0);
                if (n7 != 0) {
                    return this.zza;
                }
                this.zzh = n3;
                this.zzc = n4;
                this.zze = object;
                object = this.zzf;
                ((BaseGmsClient)object).checkAvailabilityAndConnect();
                object = this.zza;
                zzeaw zzeaw2 = new zzeaw(this);
                zzgge zzgge2 = zzcci.zzf;
                ((zzccn)object).addListener(zzeaw2, zzgge2);
                return this.zza;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzd(String object) {
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                int n3;
                int n4;
                int n7;
                try {
                    n7 = this.zzh;
                    n4 = 3;
                    n3 = 1;
                    if (n7 != n3 && n7 != n4) {
                        n7 = 2;
                        object = new zzebh(n7);
                        return zzgft.zzg((Throwable)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                n7 = (int)(this.zzc ? 1 : 0);
                if (n7 != 0) {
                    return this.zza;
                }
                this.zzh = n4;
                this.zzc = n3;
                this.zzg = object;
                object = this.zzf;
                ((BaseGmsClient)object).checkAvailabilityAndConnect();
                object = this.zza;
                zzeax zzeax2 = new zzeax(this);
                zzgge zzgge2 = zzcci.zzf;
                ((zzccn)object).addListener(zzeax2, zzgge2);
                return this.zza;
            }
            throw throwable2;
        }
    }
}

