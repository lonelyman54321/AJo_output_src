/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdoi;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzdpb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdoj {
    private final zzgge zza;
    private final zzdow zzb;
    private final zzdpb zzc;

    public zzdoj(zzgge zzgge2, zzdow zzdow2, zzdpb zzdpb2) {
        this.zza = zzgge2;
        this.zzb = zzdow2;
        this.zzc = zzdpb2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ListenableFuture zza(zzfhf zzfhf2, zzfgt zzfgt2, JSONObject jSONObject) {
        zzdoi zzdoi2;
        Object object;
        Object object2;
        zzdoj zzdoj2 = this;
        Object object3 = zzfhf2;
        Object object4 = zzfgt2;
        Object object5 = new zzdoh(this, zzfhf2, zzfgt2, jSONObject);
        object5 = this.zza.zzb((Callable)object5);
        Object object6 = this.zzb;
        Object object7 = "images";
        object6 = ((zzdow)object6).zzf(jSONObject, (String)object7);
        Object object8 = zzfhf2.zzb.zzb;
        Object object9 = this.zzb;
        ListenableFuture listenableFuture = ((zzdow)object9).zzg(jSONObject, (String)object7, zzfgt2, (zzfgw)object8);
        object8 = ((zzdow)object9).zze(jSONObject, "secondary_image");
        object7 = ((zzdow)object9).zze(jSONObject, "app_icon");
        object9 = ((zzdow)object9).zzd(jSONObject, "attribution");
        object3 = zzfhf2.zzb.zzb;
        ListenableFuture listenableFuture2 = this.zzb.zzh(jSONObject, zzfgt2, (zzfgw)object3);
        ListenableFuture listenableFuture3 = this.zzc.zza(jSONObject, "custom_assets");
        object3 = "enable_omid";
        boolean bl2 = jSONObject.optBoolean((String)object3);
        boolean bl3 = false;
        object4 = null;
        if (!bl2) {
            object3 = zzgft.zzh(null);
        } else {
            object3 = jSONObject.optJSONObject("omid_settings");
            if (object3 == null) {
                object3 = zzgft.zzh(null);
            } else {
                object2 = "omid_html";
                boolean bl4 = TextUtils.isEmpty((CharSequence)(object3 = object3.optString(object2)));
                if (bl4) {
                    object3 = zzgft.zzh(null);
                } else {
                    object2 = this.zzb;
                    object4 = zzgft.zzh(null);
                    object = new zzdol((zzdow)object2, (String)object3);
                    object3 = zzcci.zze;
                    object3 = zzgft.zzn((ListenableFuture)object4, (zzgfa)object, (Executor)object3);
                }
            }
        }
        object2 = object3;
        object3 = new ArrayList();
        ((ArrayList)object3).add(object5);
        ((ArrayList)object3).add(object6);
        ((ArrayList)object3).add(listenableFuture);
        ((ArrayList)object3).add(object8);
        ((ArrayList)object3).add(object7);
        ((ArrayList)object3).add(object9);
        ((ArrayList)object3).add(listenableFuture2);
        ((ArrayList)object3).add(listenableFuture3);
        object4 = zzbep.zzfi;
        object = zzba.zzc();
        object4 = (Boolean)((zzben)object).zza((zzbeg)object4);
        bl3 = (Boolean)object4;
        if (!bl3) {
            ((ArrayList)object3).add(object2);
        }
        object = zzgft.zza((Iterable)object3);
        object3 = zzdoi2;
        object4 = this;
        zzdoi2 = new zzdoi(this, (ListenableFuture)object5, (ListenableFuture)object6, (ListenableFuture)object7, (ListenableFuture)object8, (ListenableFuture)object9, jSONObject, listenableFuture2, listenableFuture, (ListenableFuture)object2, listenableFuture3);
        object3 = zzdoj2.zza;
        return ((zzgfs)object).zza(zzdoi2, (Executor)object3);
    }
}

