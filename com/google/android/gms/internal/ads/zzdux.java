/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzdux {
    private final ConcurrentHashMap zza;
    private final zzccc zzb;
    private final zzfho zzc;
    private final String zzd;
    private final String zze;
    private final zzj zzf;
    private final Bundle zzg;
    private final Context zzh;

    public zzdux(Context object, zzdvh object2, zzccc object3, zzfho zzfho2, String string2, String string3, zzj object4) {
        Bundle bundle;
        this.zzg = bundle = new Bundle();
        this.zza = object2 = ((zzdvk)object2).zzc();
        this.zzb = object3;
        this.zzc = zzfho2;
        this.zzd = string2;
        this.zze = string3;
        this.zzf = object4;
        this.zzh = object;
        object3 = Locale.ROOT;
        object3 = string3.toUpperCase((Locale)object3);
        ((ConcurrentHashMap)object2).put("ad_format", object3);
        object3 = zzbep.zzjz;
        object3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
        boolean n4 = (Boolean)object3;
        string3 = "1";
        int n3 = 1;
        if (n4) {
            int n7 = ((zzj)object4).zzj();
            int n8 = n7 + -1;
            if (n7 != 0) {
                object3 = n8 != 0 ? (n8 != n3 ? "na" : "2") : string3;
                object4 = "asv";
                ((ConcurrentHashMap)object2).put(object4, object3);
            } else {
                throw null;
            }
        }
        object3 = zzbep.zzcd;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean bl2 = (Boolean)object3;
        if (bl2) {
            object3 = Runtime.getRuntime();
            object4 = String.valueOf(((Runtime)object3).freeMemory());
            this.zzc("rt_f", (String)object4);
            object4 = String.valueOf(((Runtime)object3).maxMemory());
            String string4 = "rt_m";
            this.zzc(string4, (String)object4);
            long l2 = ((Runtime)object3).totalMemory();
            object3 = String.valueOf(l2);
            this.zzc("rt_t", (String)object3);
            object3 = String.valueOf(zzu.zzo().zzb());
            this.zzc("wv_c", (String)object3);
            object3 = zzbep.zzcf;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            boolean bl3 = (Boolean)object3;
            if (bl3 && (object = com.google.android.gms.ads.internal.util.client.zzf.zzc((Context)object)) != null) {
                object3 = String.valueOf(((ActivityManager.MemoryInfo)object).availMem);
                this.zzc("mem_avl", (String)object3);
                l2 = ((ActivityManager.MemoryInfo)object).totalMem;
                object3 = String.valueOf(l2);
                object4 = "mem_tt";
                this.zzc((String)object4, (String)object3);
                int n10 = ((ActivityManager.MemoryInfo)object).lowMemory;
                if (n3 != n10) {
                    string3 = "0";
                }
                object = "low_m";
                this.zzc((String)object, string3);
            }
        }
        object = zzbep.zzhj;
        object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        boolean bl4 = (Boolean)object;
        if (!bl4) {
            return;
        }
        int n14 = zzp.zzf(zzfho2) + -1;
        object3 = "scar";
        string3 = "request_id";
        if (n14 != 0) {
            object4 = "se";
            if (n14 != n3) {
                int n15 = 2;
                if (n14 != n15) {
                    n15 = 3;
                    if (n14 != n15) {
                        object = "r_both";
                        ((ConcurrentHashMap)object2).put(object4, object);
                    } else {
                        object = "r_adstring";
                        ((ConcurrentHashMap)object2).put(object4, object);
                    }
                } else {
                    object = "r_adinfo";
                    ((ConcurrentHashMap)object2).put(object4, object);
                }
            } else {
                ((ConcurrentHashMap)object2).put(string3, string2);
                object = "query_g";
                ((ConcurrentHashMap)object2).put(object4, object);
            }
            ((ConcurrentHashMap)object2).put(object3, "true");
            object = zzfho2.zzd.zzp;
            this.zzc("ragent", (String)object);
            object = zzp.zzb(zzp.zzc(zzfho2.zzd));
            this.zzc("rtype", (String)object);
            return;
        }
        ((ConcurrentHashMap)object2).put(string3, string2);
        ((ConcurrentHashMap)object2).put(object3, "false");
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            ConcurrentHashMap concurrentHashMap = this.zza;
            concurrentHashMap.put(string2, string3);
        }
    }

    public final void zzd(zzfhf object) {
        Object object2 = ((zzfhf)object).zzb.zza;
        int n3 = object2.isEmpty();
        if (n3 == 0) {
            object2 = (zzfgt)((zzfhf)object).zzb.zza.get(0);
            Object object3 = zzfgt.zza(((zzfgt)object2).zzb);
            String string2 = "ad_format";
            this.zzc(string2, (String)object3);
            n3 = ((zzfgt)object2).zzb;
            int n4 = 6;
            if (n3 == n4) {
                object2 = this.zza;
                int n7 = 1;
                object3 = this.zzb;
                n4 = (int)(((zzccc)object3).zzm() ? 1 : 0);
                object3 = n7 != n4 ? "0" : "1";
                string2 = "as";
                ((ConcurrentHashMap)object2).put(string2, object3);
            }
        }
        object = ((zzfhf)object).zzb.zzb.zzb;
        this.zzc("gqi", (String)object);
    }

    public final void zze(Bundle object) {
        if (object != null) {
            String string2 = "cnt";
            boolean bl2 = object.containsKey(string2);
            if (bl2) {
                int n3 = object.getInt(string2);
                string2 = Integer.toString(n3);
                String string3 = "network_coarse";
                this.zzc(string3, string2);
            }
            if (bl2 = object.containsKey(string2 = "gnt")) {
                int n4 = object.getInt(string2);
                object = Integer.toString(n4);
                string2 = "network_fine";
                this.zzc(string2, (String)object);
            }
        }
    }
}

