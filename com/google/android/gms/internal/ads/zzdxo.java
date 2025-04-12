/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdxn;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdxo
implements zzczo,
zzdcg,
zzdbd {
    private final zzdya zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzdxn zze;
    private zzcze zzf;
    private zze zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    public zzdxo(zzdya object, zzfho zzfho2, String string2) {
        String string3;
        this.zzh = string3 = "";
        this.zzi = string3;
        this.zzj = string3;
        this.zza = object;
        this.zzc = string2;
        this.zzb = object = zzfho2.zzf;
        this.zzd = 0;
        object = zzdxn.zza;
        this.zze = object;
    }

    private static JSONObject zzh(zze zze2) {
        JSONObject jSONObject = new JSONObject();
        String string2 = zze2.zzc;
        jSONObject.put("errorDomain", (Object)string2);
        int n3 = zze2.zza;
        jSONObject.put("errorCode", n3);
        string2 = "errorDescription";
        String string3 = zze2.zzb;
        jSONObject.put(string2, (Object)string3);
        zze2 = zze2.zzd;
        zze2 = zze2 == null ? null : zzdxo.zzh(zze2);
        jSONObject.put("underlyingError", (Object)zze2);
        return jSONObject;
    }

    private final JSONObject zzi(zzcze object) {
        String string2;
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Object object2 = ((zzcze)object).zzg();
        jSONObject.put("winningAdapterClassName", object2);
        long l2 = ((zzcze)object).zzc();
        jSONObject.put("responseSecsSinceEpoch", l2);
        Object object3 = ((zzcze)object).zzi();
        jSONObject.put("responseId", object3);
        object2 = zzbep.zzjl;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3 && !(bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((zzcze)object).zzd())))) {
            object3 = String.valueOf(object2);
            string2 = "Bidding data: ";
            com.google.android.gms.ads.internal.util.client.zzm.zze(string2.concat((String)object3));
            object3 = new JSONObject((String)object2);
            object2 = "biddingData";
            jSONObject.put((String)object2, object3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = this.zzh)))) {
            object2 = this.zzh;
            object3 = "adRequestUrl";
            jSONObject.put((String)object3, object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = this.zzi)))) {
            object2 = this.zzi;
            object3 = "postBody";
            jSONObject.put((String)object3, object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = this.zzj)))) {
            object2 = this.zzj;
            object3 = "adResponseBody";
            jSONObject.put((String)object3, object2);
        }
        if ((object2 = this.zzk) != null) {
            object3 = "adResponseHeaders";
            jSONObject.put((String)object3, object2);
        }
        if ((object2 = this.zzl) != null) {
            object3 = "transactionExtras";
            jSONObject.put((String)object3, object2);
        }
        object2 = zzbep.zzjo;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl3 = (Boolean)object2;
        if (bl3) {
            bl3 = this.zzo;
            object3 = "hasExceededMemoryLimit";
            jSONObject.put((String)object3, bl3);
        }
        object2 = new JSONArray();
        object = ((zzcze)object).zzj().iterator();
        while (bl2 = object.hasNext()) {
            object3 = (zzu)object.next();
            string2 = new JSONObject();
            Object object4 = ((zzu)object3).zza;
            string2.put("adapterClassName", object4);
            long l3 = ((zzu)object3).zzb;
            String string3 = "latencyMillis";
            string2.put(string3, l3);
            object4 = zzbep.zzjm;
            Object object5 = zzba.zzc();
            object4 = (Boolean)((zzben)object5).zza((zzbeg)object4);
            boolean bl4 = (Boolean)object4;
            if (bl4) {
                object4 = zzay.zzb();
                object5 = ((zzu)object3).zzd;
                object4 = ((zzf)object4).zzi((Bundle)object5);
                object5 = "credentials";
                string2.put((String)object5, object4);
            }
            if ((object3 = ((zzu)object3).zzc) == null) {
                bl2 = false;
                object3 = null;
            } else {
                object3 = zzdxo.zzh((zze)object3);
            }
            object4 = "error";
            string2.put((String)object4, object3);
            object2.put((Object)string2);
        }
        jSONObject.put("adNetworks", object2);
        return jSONObject;
    }

    public final void zza(zzcup object) {
        Object object2 = this.zza;
        boolean bl2 = ((zzdya)object2).zzq();
        if (bl2) {
            this.zzf = object = ((zzcup)object).zzl();
            object = zzdxn.zzb;
            this.zze = object;
            object = zzbep.zzjs;
            object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            boolean bl3 = (Boolean)object;
            if (bl3) {
                object = this.zza;
                object2 = this.zzb;
                ((zzdya)object).zzf((String)object2, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject = new JSONObject();
        Object object = this.zze;
        jSONObject.put("state", object);
        Object object2 = zzfgt.zza(this.zzd);
        jSONObject.put("format", object2);
        object2 = zzbep.zzjs;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            bl2 = this.zzm;
            object = "isOutOfContext";
            jSONObject.put((String)object, bl2);
            bl2 = this.zzm;
            if (bl2) {
                bl2 = this.zzn;
                object = "shown";
                jSONObject.put((String)object, bl2);
            }
        }
        if ((object2 = this.zzf) != null) {
            object2 = this.zzi((zzcze)object2);
        } else {
            object2 = this.zzg;
            object = null;
            if (object2 != null && (object2 = ((zze)object2).zze) != null) {
                object2 = (zzcze)object2;
                object = this.zzi((zzcze)object2);
                bl2 = (object2 = ((zzcze)object2).zzj()).isEmpty();
                if (bl2) {
                    object2 = new JSONArray();
                    Object object3 = zzdxo.zzh(this.zzg);
                    object2.put(object3);
                    object3 = "errors";
                    object.put((String)object3, object2);
                }
            }
            object2 = object;
        }
        jSONObject.put("responseInfo", object2);
        return jSONObject;
    }

    public final void zzdB(zze object) {
        Object object2 = this.zza;
        boolean bl2 = ((zzdya)object2).zzq();
        if (bl2) {
            object2 = zzdxn.zzc;
            this.zze = object2;
            this.zzg = object;
            object = zzbep.zzjs;
            object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            boolean bl3 = (Boolean)object;
            if (bl3) {
                object = this.zza;
                object2 = this.zzb;
                ((zzdya)object).zzf((String)object2, this);
            }
        }
    }

    public final void zzdn(zzbxu object) {
        object = zzbep.zzjs;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2 && (bl2 = ((zzdya)(object = this.zza)).zzq())) {
            object = this.zza;
            object2 = this.zzb;
            ((zzdya)object).zzf((String)object2, this);
        }
    }

    public final void zzdo(zzfhf object) {
        Object object2 = this.zza;
        boolean n3 = ((zzdya)object2).zzq();
        if (n3) {
            int n4;
            boolean bl2;
            boolean bl3;
            object2 = ((zzfhf)object).zzb.zza;
            boolean bl4 = object2.isEmpty();
            int n7 = 0;
            if (!bl4) {
                int n8;
                object2 = (zzfgt)((zzfhf)object).zzb.zza.get(0);
                this.zzd = n8 = ((zzfgt)object2).zzb;
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((zzfhf)object).zzb.zzb.zzk)))) {
                this.zzh = object2 = ((zzfhf)object).zzb.zzb.zzk;
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((zzfhf)object).zzb.zzb.zzl)))) {
                this.zzi = object2 = ((zzfhf)object).zzb.zzb.zzl;
            }
            if ((n4 = (object2 = ((zzfhf)object).zzb.zzb.zzo).length()) > 0) {
                object2 = ((zzfhf)object).zzb.zzb.zzo;
                this.zzl = object2;
            }
            object2 = zzbep.zzjo;
            zzben zzben2 = zzba.zzc();
            object2 = (Boolean)zzben2.zza((zzbeg)object2);
            boolean bl5 = (Boolean)object2;
            if (bl5) {
                boolean bl6;
                int n10;
                object2 = this.zza;
                boolean bl7 = ((zzdya)object2).zzs();
                if (!bl7) {
                    this.zzo = true;
                    return;
                }
                object2 = ((zzfhf)object).zzb.zzb.zzm;
                boolean bl8 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl8) {
                    this.zzj = object2 = ((zzfhf)object).zzb.zzb.zzm;
                }
                if ((n10 = (object2 = ((zzfhf)object).zzb.zzb.zzn).length()) > 0) {
                    object = ((zzfhf)object).zzb.zzb.zzn;
                    this.zzk = object;
                }
                object = this.zza;
                object2 = this.zzk;
                if (object2 != null) {
                    object2 = object2.toString();
                    n7 = ((String)object2).length();
                }
                if (!(bl6 = TextUtils.isEmpty((CharSequence)(object2 = this.zzj)))) {
                    object2 = this.zzj;
                    int n14 = ((String)object2).length();
                    n7 += n14;
                }
                long l2 = n7;
                ((zzdya)object).zzk(l2);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        zzdxn zzdxn2 = this.zze;
        zzdxn zzdxn3 = zzdxn.zza;
        return zzdxn2 != zzdxn3;
    }
}

