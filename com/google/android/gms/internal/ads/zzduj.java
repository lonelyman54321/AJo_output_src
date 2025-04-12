/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzax;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvk;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzduj
implements zzdcg,
zzdaz,
zzczo,
zzdhu {
    private final zzdux zza;
    private final zzdvh zzb;

    public zzduj(zzdux zzdux2, zzdvh zzdvh2) {
        this.zza = zzdux2;
        this.zzb = zzdvh2;
    }

    private final void zzc(Bundle bundle) {
        if (bundle != null) {
            boolean bl2;
            Iterator iterator = bundle.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                long l2;
                String string2 = (String)iterator.next();
                long l3 = bundle.getLong(string2);
                long l4 = l3 - (l2 = 0L);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object < 0) continue;
                zzdux zzdux2 = this.zza;
                String string3 = String.valueOf(l3);
                zzdux2.zzc(string2, string3);
            }
        }
    }

    private final void zzd(Bundle bundle, zzgbc zzgbc2) {
        int n3 = zzgbc2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = (zzdum)zzgbc2.get(i3);
            String string2 = ((zzdum)object).zza().zza();
            long l2 = -1;
            long l3 = bundle.getLong(string2, l2);
            string2 = ((zzdum)object).zzb().zza();
            long l4 = bundle.getLong(string2, l2);
            long l7 = 0L;
            long l8 = l3 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 <= 0 || (object2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1)) <= 0) continue;
            zzdux zzdux2 = this.zza;
            object = ((zzdum)object).zzc();
            string2 = String.valueOf(l4 -= l3);
            zzdux2.zzc((String)object, string2);
        }
        zzgbc2 = bundle.getBundle("client_sig_latency_key");
        this.zzc((Bundle)zzgbc2);
        bundle = bundle.getBundle("gms_sig_latency_key");
        this.zzc(bundle);
    }

    public final void zzdB(zze object) {
        Object object2 = this.zza.zzb();
        String string2 = "ftl";
        object2.put("action", string2);
        object2 = String.valueOf(((zze)object).zza);
        this.zza.zzc(string2, (String)object2);
        object2 = this.zza;
        object = ((zze)object).zzc;
        ((zzdux)object2).zzc("ed", (String)object);
        object = this.zza;
        object2 = this.zzb;
        object = ((zzdux)object).zzb();
        ((zzdvk)object2).zzf((Map)object);
    }

    public final void zzdn(zzbxu zzbxu2) {
        zzdux zzdux2 = this.zza;
        zzbxu2 = zzbxu2.zza;
        zzdux2.zze((Bundle)zzbxu2);
    }

    public final void zzdo(zzfhf zzfhf2) {
        this.zza.zzd(zzfhf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzax object) {
        Object object2;
        Object object3;
        Object object4;
        block9: {
            block11: {
                JSONException jSONException2222;
                block10: {
                    block8: {
                        object4 = zzbep.zzhj;
                        object3 = zzba.zzc();
                        object4 = (Boolean)((zzben)object3).zza((zzbeg)object4);
                        boolean bl2 = (Boolean)object4;
                        if (!bl2) {
                            return;
                        }
                        object4 = "sgs";
                        object3 = "action";
                        if (object == null) {
                            this.zza.zzb().put(object3, object4);
                            this.zza.zzb().put("request_id", "-1");
                            object = this.zzb;
                            object4 = this.zza.zzb();
                            ((zzdvk)object).zzf((Map)object4);
                            return;
                        }
                        object2 = ((zzax)object).zzc;
                        Object object5 = zzbep.zzcd;
                        Object object6 = zzba.zzc();
                        object5 = (Boolean)((zzben)object6).zza((zzbeg)object5);
                        boolean bl3 = (Boolean)object5;
                        if (bl3 && object2 != null && (object2 = ((zzbxu)object2).zzm) != null) {
                            object5 = zzdul.zzn.zza();
                            object6 = zzu.zzB();
                            long l2 = object6.currentTimeMillis();
                            object2.putLong((String)object5, l2);
                            object5 = zzdum.zza;
                            this.zzd((Bundle)object2, (zzgbc)object5);
                        }
                        try {
                            object5 = ((zzax)object).zzb;
                            object2 = new JSONObject((String)object5);
                            this.zza.zzb().put(object3, object4);
                        }
                        catch (JSONException jSONException) {
                            this.zza.zzb().put(object3, "sgf");
                            this.zza.zzb().put("sgf_reason", "request_invalid");
                            object = this.zzb;
                            object4 = this.zza.zzb();
                            ((zzdvk)object).zzf((Map)object4);
                            return;
                        }
                        object4 = this.zza.zzb();
                        object3 = zzbep.zzjG;
                        object5 = zzba.zzc();
                        object3 = (Boolean)((zzben)object5).zza((zzbeg)object3);
                        boolean bl4 = (Boolean)object3;
                        if (!bl4) break block11;
                        object3 = "extras";
                        try {
                            object3 = object2.getJSONObject((String)object3);
                            object2 = "accept_3p_cookie";
                            bl4 = object3.getBoolean((String)object2);
                            if (!bl4) break block8;
                            object3 = "1";
                            break block9;
                        }
                        catch (JSONException jSONException2222) {
                            break block10;
                        }
                    }
                    object3 = "0";
                    break block9;
                }
                object2 = "Error retrieving JSONObject from the requestJson, ";
                zzm.zzh((String)object2, jSONException2222);
            }
            object3 = "na";
        }
        object2 = "tpc";
        object4.put(object2, object3);
        object = ((zzax)object).zzc;
        if (object != null) {
            object4 = this.zza;
            object = ((zzbxu)object).zza;
            ((zzdux)object4).zze((Bundle)object);
        }
        object = this.zzb;
        object4 = this.zza.zzb();
        ((zzdvk)object).zzf((Map)object4);
    }

    public final void zzf(String object) {
        Object object2 = zzbep.zzhj;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (!bl2) {
            return;
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", (String)object);
        object = this.zzb;
        object2 = this.zza.zzb();
        ((zzdvk)object).zzf((Map)object2);
    }

    public final void zzs() {
        Object object = this.zza.zzb();
        Object object2 = "loaded";
        object.put("action", object2);
        object = zzbep.zzcd;
        Object object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zza.zza();
            object3 = zzdul.zzn.zza();
            object2 = zzu.zzB();
            long l2 = object2.currentTimeMillis();
            object.putLong((String)object3, l2);
            object = this.zza.zza();
            object3 = zzdum.zzb;
            this.zzd((Bundle)object, (zzgbc)object3);
        }
        object = zzbep.zzmB;
        object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = this.zza;
            boolean bl3 = true;
            object3 = "MUTE_AUDIO";
            boolean bl4 = h83.c((String)object3);
            object3 = bl3 != bl4 ? "0" : "1";
            object = ((zzdux)object).zzb();
            object2 = "mafe";
            object.put(object2, object3);
        }
        object = this.zzb;
        object3 = this.zza.zzb();
        ((zzdvk)object).zzf((Map)object3);
    }
}

