/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzax;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcxc;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcxd
implements zzdcg,
zzdhu {
    private zzbxo zza;
    private final AtomicBoolean zzb;
    private final Context zzc;
    private final zzfmq zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;

    public zzcxd(Context context, zzfmq zzfmq2, VersionInfoParcel versionInfoParcel, Executor executor) {
        AtomicBoolean atomicBoolean;
        this.zzb = atomicBoolean = new AtomicBoolean();
        this.zzc = context;
        this.zzd = zzfmq2;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    public final /* synthetic */ void zzc() {
        zzbdz.zze(this.zzc);
        this.zzh = true;
    }

    /*
     * Unable to fully structure code
     */
    public final void zzd() {
        block13: {
            block15: {
                block14: {
                    block12: {
                        var1_1 = this.zzb;
                        var2_2 = 1;
                        var3_3 = var1_1.getAndSet((boolean)var2_2);
                        if (var3_3) break block13;
                        var1_1 = (Boolean)zzbgk.zzk.zze();
                        var3_3 = var1_1.booleanValue();
                        var4_4 = 2;
                        if (var3_3) {
                            while (true) {
                                var5_5 = 2;
                                break block12;
                                break;
                            }
                        }
                        var1_1 = (Boolean)zzbgk.zzl.zze();
                        var3_3 = var1_1.booleanValue();
                        var5_5 = 3;
                        if (var3_3) break block12;
                        var1_1 = (Boolean)zzbgk.zzj.zze();
                        var3_3 = var1_1.booleanValue();
                        if (!var3_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var5_5 = 1;
                                break block12;
                                break;
                            }
                        }
                        var1_1 = zzu.zzo().zzi().zzh().zzc();
                        try {
                            var6_6 = new JSONObject((String)var1_1);
                            var1_1 = "local_flag_write";
                        }
                        catch (JSONException v0) {
                            ** continue;
                        }
                        var1_1 = var6_6.optString((String)var1_1);
                        var6_6 = "client";
                        var7_7 = TextUtils.equals((CharSequence)var1_1, (CharSequence)var6_6);
                        if (var7_7) ** continue;
                        var6_6 = "service";
                        var3_3 = TextUtils.equals((CharSequence)var1_1, (CharSequence)var6_6);
                        if (!var3_3) ** GOTO lbl-1000
                    }
                    if ((var5_5 += -1) == var2_2) break block14;
                    if (var5_5 != var4_4) break block13;
                    var1_1 = this.zzc;
                    var8_8 = this.zzd;
                    var9_9 = zzu.zzf();
                    var6_6 = VersionInfoParcel.forPackage();
                    var1_1 = var9_9.zzb((Context)var1_1, (VersionInfoParcel)var6_6, (zzfmq)var8_8);
                    break block15;
                }
                var1_1 = this.zzc;
                var8_8 = this.zzd;
                var9_9 = zzu.zzf();
                var6_6 = VersionInfoParcel.forPackage();
                var1_1 = var9_9.zza((Context)var1_1, (VersionInfoParcel)var6_6, (zzfmq)var8_8);
            }
            var9_9 = zzbqe.zza;
            var1_1 = var1_1.zza("google.afma.sdkConstants.getSdkConstants", (zzbqa)var9_9, (zzbpz)var9_9);
            var8_8 = this.zzc;
            var9_9 = this.zze;
            this.zza = var6_6 = new zzbxq((Context)var8_8, (zzbpx)var1_1, (VersionInfoParcel)var9_9);
            this.zzg = var2_2;
        }
        var3_3 = this.zzg;
        if (var3_3 && (var1_1 = this.zza) != null) {
            var1_1 = var1_1.zza();
            var2_2 = this.zzh;
            if (var2_2 == 0 && (var2_2 = (int)(var10_10 = (Boolean)zzbgc.zzi.zze()).booleanValue()) != 0) {
                var10_10 = new zzcxc(this);
                var8_8 = this.zzf;
                var1_1.addListener((Runnable)var10_10, (Executor)var8_8);
            }
            var10_10 = "persistFlagsClient";
            zzccl.zza((ListenableFuture)var1_1, (String)var10_10);
        }
    }

    public final void zzdn(zzbxu zzbxu2) {
        this.zzd();
    }

    public final void zzdo(zzfhf zzfhf2) {
    }

    public final void zze(zzax zzax2) {
        this.zzd();
    }

    public final void zzf(String string2) {
        this.zzd();
    }
}

