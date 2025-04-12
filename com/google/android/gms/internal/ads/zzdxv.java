/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdxu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class zzdxv {
    private final zzdxf zza;
    private final zzdsq zzb;
    private final Object zzc;
    private final List zzd;
    private boolean zze;

    public zzdxv(zzdxf arrayList, zzdsq zzdsq2) {
        Object object;
        this.zzc = object = new Object();
        this.zza = arrayList;
        this.zzb = zzdsq2;
        this.zzd = arrayList = new ArrayList();
    }

    public static /* bridge */ /* synthetic */ void zzb(zzdxv zzdxv2, List list) {
        zzdxv2.zzd(list);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzd(List var1_1) {
        var2_3 = this.zzc;
        synchronized (var2_3) {
            try {
                var3_4 = this.zze;
                if (var3_4) {
                    return;
                }
            }
            catch (Throwable var1_2) {}
            throw var1_2;
            var1_1 = var1_1.iterator();
            while (true) {
                var3_4 = var1_1.hasNext();
                var4_5 = true;
                if (!var3_4) {
                    this.zze = var4_5;
                    return;
                }
                var5_6 /* !! */  = var1_1.next();
                var5_6 /* !! */  = (zzbnn)var5_6 /* !! */ ;
                var6_7 = zzbep.zzjq;
                var7_8 = zzba.zzc();
                var6_7 = var7_8.zza((zzbeg)var6_7);
                var8_9 = (var6_7 = (Boolean)var6_7).booleanValue();
                if (var8_9) {
                    var6_7 = this.zzb;
                    var7_8 = var5_6 /* !! */ .zza;
                    var6_7 = (var6_7 = var6_7.zza((String)var7_8)) != null && (var6_7 = var6_7.zzc) != null ? var6_7.toString() : "";
                } else {
                    var6_7 = "";
                }
                var9_10 = var6_7;
                var6_7 = zzbep.zzjr;
                var7_8 = zzba.zzc();
                var6_7 = var7_8.zza((zzbeg)var6_7);
                var6_7 = (Boolean)var6_7;
                var8_9 = var6_7.booleanValue();
                var7_8 = null;
                if (!var8_9) ** GOTO lbl-1000
                var6_7 = this.zzb;
                var10_11 = var5_6 /* !! */ .zza;
                if ((var6_7 = var6_7.zza(var10_11)) != null && (var8_9 = var6_7.zzd)) {
                    var11_12 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var11_12 = false;
                }
                var12_13 = this.zzd;
                var10_11 = var5_6 /* !! */ .zza;
                var7_8 = this.zzb;
                var13_14 = var7_8.zzb(var10_11);
                var14_15 = var5_6 /* !! */ .zzb;
                var15_16 = var5_6 /* !! */ .zzd;
                var16_17 = var5_6 /* !! */ .zzc;
                var7_8 = var6_7;
                var6_7 = new zzdxu(var10_11, (String)var9_10, var13_14, var14_15, var15_16, var16_17, var11_12);
                var12_13.add(var6_7);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                Object object2;
                block5: {
                    try {
                        boolean bl3 = this.zze;
                        if (bl3) break block5;
                        object2 = this.zza;
                        bl3 = ((zzdxf)object2).zzt();
                        if (!bl3) {
                            this.zzc();
                            return jSONArray;
                        }
                        object2 = this.zza;
                        object2 = ((zzdxf)object2).zzg();
                        this.zzd((List)object2);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object2 = this.zzd;
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    Object object3 = object2.next();
                    object3 = (zzdxu)object3;
                    object3 = ((zzdxu)object3).zza();
                    jSONArray.put(object3);
                }
                return jSONArray;
            }
            throw throwable2;
        }
    }

    public final void zzc() {
        zzdxt zzdxt2 = new zzdxt(this);
        this.zza.zzs(zzdxt2);
    }
}

