/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxg;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzeds;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzedv;
import com.google.android.gms.internal.ads.zzedw;
import com.google.android.gms.internal.ads.zzedx;
import com.google.android.gms.internal.ads.zzedy;
import com.google.android.gms.internal.ads.zzedz;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeee;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzeei;
import com.google.android.gms.internal.ads.zzeza;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzezm;
import com.google.android.gms.internal.ads.zzfar;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzeea
extends zzbxg {
    private final Context zza;
    private final zzezl zzb;
    private final zzezj zzc;
    private final zzeei zzd;
    private final zzgge zze;
    private final zzeef zzf;
    private final zzbyd zzg;

    public zzeea(Context context, zzezl zzezl2, zzezj zzezj2, zzeef zzeef2, zzeei zzeei2, zzgge zzgge2, zzbyd zzbyd2) {
        this.zza = context;
        this.zzb = zzezl2;
        this.zzc = zzezj2;
        this.zzf = zzeef2;
        this.zzd = zzeei2;
        this.zze = zzgge2;
        this.zzg = zzbyd2;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbxk object) {
        listenableFuture = zzgfk.zzu(listenableFuture);
        Object object2 = new zzedx(this);
        zzgge zzgge2 = zzcci.zza;
        listenableFuture = zzgft.zzn(listenableFuture, (zzgfa)object2, zzgge2);
        object2 = new zzedz(this, (zzbxk)object);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ListenableFuture zzb(zzbwz var1_1, int var2_2) {
        var4_4 = new HashMap();
        var5_5 = var1_1.zzc;
        if (var5_5 != null) {
            var6_6 /* !! */  = var5_5.keySet().iterator();
            while ((var7_7 = (char)var6_6 /* !! */ .hasNext()) != '\u0000') {
                var8_8 = (String)var6_6 /* !! */ .next();
                var9_9 /* !! */  = (byte[])var5_5.getString((String)var8_8);
                if (var9_9 /* !! */  == null) continue;
                var4_4.put(var8_8, var9_9 /* !! */ );
            }
        }
        var7_7 = var1_1.zzb;
        var6_6 /* !! */  = var1_1.zza;
        var9_9 /* !! */  = var1_1.zzd;
        var10_10 = var1_1.zze;
        var11_11 = "";
        var5_5 = var3_3;
        var3_3 = new zzeec((String)var6_6 /* !! */ , var7_7, (Map)var4_4, var9_9 /* !! */ , var11_11, var10_10);
        var5_5 = this.zzc;
        var6_6 /* !! */  = new zzfar((zzbwz)var1_1);
        var5_5.zza((zzfar)var6_6 /* !! */ );
        var12_12 = var3_3.zzf;
        var5_5 = var5_5.zzb();
        if (!var12_12) ** GOTO lbl-1000
        var1_1 = var1_1.zza;
        var6_6 /* !! */  = (String)zzbgr.zzb.zze();
        var7_7 = (char)TextUtils.isEmpty((CharSequence)var6_6 /* !! */ );
        if (var7_7 == '\u0000' && (var7_7 = (char)TextUtils.isEmpty((CharSequence)(var1_1 = Uri.parse((String)var1_1).getHost()))) == '\u0000') {
            var7_7 = ';';
            var8_8 = zzfyt.zzc(zzfxr.zzc(var7_7));
            var6_6 /* !! */  = var8_8.zzd((CharSequence)var6_6 /* !! */ ).iterator();
            while ((var7_7 = (char)var6_6 /* !! */ .hasNext()) != '\u0000') {
                var8_8 = (String)var6_6 /* !! */ .next();
                var7_7 = (char)var1_1.endsWith((String)var8_8);
                if (var7_7 == '\u0000') continue;
                var1_1 = var5_5.zza();
                var6_6 /* !! */  = new JSONObject();
                var8_8 = new Bundle();
                var1_1 = var1_1.zza(var6_6 /* !! */ , (Bundle)var8_8);
                var6_6 /* !! */  = new zzeds(var3_3);
                var8_8 = this.zze;
                var1_1 = zzgft.zzm((ListenableFuture)var1_1, (zzfxu)var6_6 /* !! */ , (Executor)var8_8);
                break;
            }
        } else lbl-1000:
        // 3 sources

        {
            var1_1 = zzgft.zzh(var3_3);
        }
        var5_5 = var5_5.zzb();
        var6_6 /* !! */  = this.zza;
        var8_8 = this.zzg;
        var4_4 = new zzeee((Context)var6_6 /* !! */ , "", (zzbyd)var8_8, var2_2);
        var13_13 /* !! */  = zzfln.zzi;
        var1_1 = var5_5.zzb((Object)var13_13 /* !! */ , (ListenableFuture)var1_1).zze((zzfkw)var4_4).zza();
        var13_13 /* !! */  = new zzedt();
        var5_5 = this.zze;
        return zzgft.zzn((ListenableFuture)var1_1, (zzgfa)var13_13 /* !! */ , (Executor)var5_5);
    }

    public final void zze(zzbwz object, zzbxk zzbxk2) {
        int n3 = Binder.getCallingUid();
        object = this.zzb((zzbwz)object, n3);
        this.zzc((ListenableFuture)object, zzbxk2);
    }

    public final void zzf(zzbwv object, zzbxk object2) {
        int n3 = Binder.getCallingUid();
        Object object3 = new zzeza((zzbwv)object, n3);
        object = this.zzb;
        object.zza((zzeza)object3);
        object = object.zzb();
        Object object4 = ((zzezm)object).zzb();
        object3 = new zzedu();
        zzedv zzedv2 = new zzedv();
        Object object5 = zzfln.zze;
        ListenableFuture listenableFuture = zzgft.zzi();
        object4 = ((zzfll)object4).zzb(object5, listenableFuture);
        object5 = new zzedw((zzezm)object);
        object = ((zzflk)object4).zzf((zzgfa)object5).zze(zzedv2).zzf((zzgfa)object3).zza();
        this.zzc((ListenableFuture)object, (zzbxk)object2);
        object2 = (Boolean)zzbgk.zzf.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzd;
            Objects.requireNonNull(object2);
            object4 = new zzedy((zzeei)object2);
            object2 = this.zze;
            object.addListener((Runnable)object4, (Executor)object2);
        }
    }
}

