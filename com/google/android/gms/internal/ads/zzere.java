/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzerd;
import com.google.android.gms.internal.ads.zzerf;
import com.google.android.gms.internal.ads.zzerg;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzere
implements zzexw {
    private final zzgge zza;
    private final zzdst zzb;
    private final zzdxf zzc;
    private final zzerg zzd;

    public zzere(zzgge zzgge2, zzdst zzdst2, zzdxf zzdxf2, zzerg zzerg2) {
        this.zza = zzgge2;
        this.zzb = zzdst2;
        this.zzc = zzdxf2;
        this.zzd = zzerg2;
    }

    public final int zza() {
        return 1;
    }

    public final ListenableFuture zzb() {
        boolean bl2;
        Object object = zzbep.zzlH;
        Object object2 = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl3 = (Boolean)object2;
        if (bl3 && (object2 = this.zzd.zza()) != null) {
            object = this.zzd.zza();
            object.getClass();
            return zzgft.zzh(object);
        }
        object2 = zzbep.zzbs;
        zzben zzben2 = zzba.zzc();
        object2 = (String)zzben2.zza((zzbeg)object2);
        bl3 = zzfyv.zzd((String)object2);
        if (!bl3 && ((bl2 = ((Boolean)(object = (Boolean)((zzben)(object2 = zzba.zzc())).zza((zzbeg)object))).booleanValue()) || !(bl2 = ((zzerg)(object = this.zzd)).zzd()) && (bl2 = ((zzdxf)(object = this.zzc)).zzt()))) {
            this.zzd.zzc(true);
            object = this.zza;
            object2 = new zzerd(this);
            return object.zzb((Callable)object2);
        }
        object2 = new Bundle();
        object = new zzerf((Bundle)object2);
        return zzgft.zzh(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ zzerf zzc() {
        Object object5;
        boolean bl2;
        Object object = zzbep.zzbs;
        object = Arrays.asList(((String)zzba.zzc().zza((zzbeg)object)).split(";"));
        Object object2 = new Bundle();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Bundle bundle;
            Object object3;
            Object object4;
            block11: {
                Object object6;
                object5 = (String)object.next();
                try {
                    object4 = this.zzb;
                    object3 = new JSONObject();
                    object4 = ((zzdst)object4).zzc((String)object5, (JSONObject)object3);
                    ((zzfim)object4).zzC();
                    object3 = this.zzc;
                    boolean bl3 = ((zzdxf)object3).zzt();
                    bundle = new Bundle();
                    object6 = zzbep.zzlH;
                    zzben zzben2 = zzba.zzc();
                    object6 = zzben2.zza((zzbeg)object6);
                    object6 = (Boolean)object6;
                    boolean bl4 = (Boolean)object6;
                    if (bl4 && !bl3) break block11;
                }
                catch (zzfhv zzfhv2) {}
                try {
                    object3 = ((zzfim)object4).zzf();
                    if (object3 != null) {
                        object6 = "sdk_version";
                        object3 = ((zzbtt)object3).toString();
                        bundle.putString((String)object6, (String)object3);
                    }
                }
                catch (zzfhv zzfhv3) {}
            }
            try {
                object4 = ((zzfim)object4).zze();
                if (object4 != null) {
                    object3 = "adapter_version";
                    object4 = ((zzbtt)object4).toString();
                    bundle.putString((String)object3, (String)object4);
                }
            }
            catch (zzfhv zzfhv4) {}
            object2.putBundle((String)object5, bundle);
        }
        object = new zzerf((Bundle)object2);
        object2 = zzbep.zzlH;
        object5 = zzba.zzc();
        object2 = (Boolean)((zzben)object5).zza((zzbeg)object2);
        boolean bl5 = (Boolean)object2;
        if (bl5) {
            object2 = this.zzd;
            ((zzerg)object2).zzb((zzerf)object);
        }
        return object;
    }
}

