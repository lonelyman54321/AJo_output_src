/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzeal;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfid;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeam {
    private final zzcjd zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfmn zzg;
    private final zzfid zzh;
    private final zzdux zzi;

    public zzeam(zzcjd object, Context context, VersionInfoParcel versionInfoParcel, zzfho zzfho2, Executor executor, String string2, zzfmn zzfmn2, zzdux zzdux2) {
        this.zza = object;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzfho2;
        this.zze = executor;
        this.zzf = string2;
        this.zzg = zzfmn2;
        this.zzh = object = ((zzcjd)object).zzx();
        this.zzi = zzdux2;
    }

    private final ListenableFuture zzc(String object, String object2) {
        Object object3 = this.zzb;
        Object object4 = zzfmu.zzs;
        object3 = zzfmb.zza((Context)object3, (zzfmu)object4);
        object3.zzj();
        object4 = zzu.zzf();
        Object object5 = this.zza;
        Object object6 = this.zzb;
        VersionInfoParcel versionInfoParcel = this.zzc;
        object5 = ((zzcjd)object5).zzz();
        object4 = ((zzbpy)object4).zza((Context)object6, versionInfoParcel, (zzfmq)object5);
        object6 = zzbqe.zza;
        object4 = ((zzbqh)object4).zza("google.afma.response.normalize", (zzbqa)object6, (zzbpz)object6);
        object5 = zzgft.zzh("");
        object6 = new zzeaj(this, (String)object, (String)object2);
        object = this.zze;
        object = zzgft.zzn((ListenableFuture)object5, (zzgfa)object6, (Executor)object);
        object2 = new zzeak((zzbpx)object4);
        object4 = this.zze;
        object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object4);
        object2 = new zzeal(this);
        object4 = this.zze;
        object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object4);
        object2 = this.zzg;
        zzfmm.zzb((ListenableFuture)object, (zzfmn)object2, (zzfmc)object3);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzd(String string2) {
        String string3 = "ad_types";
        try {
            JSONObject jSONObject = new JSONObject(string2);
            Object object = jSONObject.getJSONArray(string3);
            if (object == null) return jSONObject.toString();
            String string4 = "unknown";
            boolean bl2 = string4.equals(object = object.getString(0));
            if (!bl2) return jSONObject.toString();
            object = new JSONArray();
            string4 = this.zzf;
            object = object.put((Object)string4);
            jSONObject.put(string3, object);
            return jSONObject.toString();
        }
        catch (JSONException jSONException) {}
        String string5 = ((Object)((Object)jSONException)).toString();
        zzm.zzj("Failed to update the ad types for rendering. ".concat(string5));
        return string2;
    }

    private static final String zze(String string2) {
        JSONObject jSONObject;
        String string3 = "";
        try {
            jSONObject = new JSONObject(string2);
        }
        catch (JSONException jSONException) {
            return string3;
        }
        return jSONObject.optString("request_id", string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza() {
        Object object;
        block23: {
            Object object2;
            Object object3;
            block25: {
                block24: {
                    boolean bl2;
                    boolean bl3;
                    Object object4;
                    int n3;
                    block21: {
                        Object object5;
                        block22: {
                            object = this.zzd.zzd.zzx;
                            n3 = TextUtils.isEmpty((CharSequence)object);
                            object3 = "true";
                            if (n3 != 0) break block21;
                            object2 = zzbep.zzhg;
                            object4 = zzba.zzc();
                            object2 = (Boolean)((zzben)object4).zza((zzbeg)object2);
                            n3 = ((Boolean)object2).booleanValue();
                            if (n3 == 0) break block21;
                            object2 = zzeam.zze((String)object);
                            object4 = zzbep.zzhr;
                            object5 = (Boolean)zzba.zzc().zza((zzbeg)object4);
                            bl3 = (Boolean)object5;
                            int n4 = -1;
                            if (bl3 && (bl3 = ((String)object2).isEmpty())) {
                                object2 = "&request_id=";
                                n3 = ((String)object).lastIndexOf((String)object2);
                                object2 = n3 != n4 ? ((String)object).substring(n3 += 12) : "";
                            }
                            if (bl3 = TextUtils.isEmpty((CharSequence)object2)) {
                                object = new zzelj(15, "Invalid ad string.");
                                return zzgft.zzg((Throwable)object);
                            }
                            object5 = this.zza;
                            Object object6 = this.zzi;
                            object5 = ((zzcjd)object5).zzo().zzb((String)object2, (zzdux)object6);
                            object6 = zzba.zzc();
                            object4 = (Boolean)((zzben)object6).zza((zzbeg)object4);
                            bl2 = (Boolean)object4;
                            if (bl2) {
                                object4 = this.zzi;
                                int n7 = TextUtils.isEmpty((CharSequence)object5);
                                if (n7 == 0) {
                                    String string2;
                                    block19: {
                                        try {
                                            object6 = new JSONObject((String)object5);
                                            string2 = "is_gbid";
                                            object6 = object6.optString(string2);
                                            n7 = ((String)object6).equals(object3);
                                            if (n7 == 0) break block19;
                                            object6 = Boolean.TRUE;
                                        }
                                        catch (JSONException jSONException) {}
                                    }
                                    object6 = Boolean.FALSE;
                                    n7 = ((Boolean)object6).booleanValue();
                                    if (n7 != 0) {
                                        Object object7;
                                        object6 = "&";
                                        n7 = ((String)object).lastIndexOf((String)object6);
                                        string2 = null;
                                        if (n7 != n4) {
                                            n4 = 0;
                                            object7 = ((String)object).substring(0, n7);
                                        } else {
                                            n4 = 0;
                                            object7 = null;
                                        }
                                        n7 = (int)(TextUtils.isEmpty(object7) ? 1 : 0);
                                        if (n7 == 0) {
                                            UnsupportedEncodingException unsupportedEncodingException2;
                                            block20: {
                                                n7 = 11;
                                                try {
                                                    object7 = Base64.decode((String)object7, (int)n7);
                                                    object6 = "UTF-8";
                                                    object2 = ((String)object2).getBytes((String)object6);
                                                    try {
                                                        object6 = new JSONObject((String)object5);
                                                        String string3 = "arek";
                                                        string2 = object6.getString(string3);
                                                    }
                                                    catch (JSONException jSONException) {
                                                        Object object8 = ((Object)((Object)jSONException)).toString();
                                                        String string4 = "Failed to get key from QueryJSONMap";
                                                        object8 = string4.concat((String)object8);
                                                        com.google.android.gms.ads.internal.util.zze.zza((String)object8);
                                                        object8 = zzu.zzo();
                                                        string4 = "CryptoUtils.getKeyFromQueryJsonMap";
                                                        ((zzcby)object8).zzw(jSONException, string4);
                                                    }
                                                }
                                                catch (UnsupportedEncodingException unsupportedEncodingException2) {
                                                    break block20;
                                                }
                                                object = zzfid.zzb((byte[])object7, (byte[])object2, string2, (zzdux)object4);
                                                break block22;
                                            }
                                            object7 = ((Object)unsupportedEncodingException2).toString();
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat((String)object7));
                                            object4 = "PreloadedLoader.decryptAdResponseIfNecessary";
                                            object7 = zzu.zzo();
                                            ((zzcby)object7).zzw(unsupportedEncodingException2, (String)object4);
                                        }
                                    }
                                }
                            }
                        }
                        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0)) == 0) {
                            object2 = this.zzd((String)object5);
                            return this.zzc((String)object, (String)object2);
                        }
                    }
                    if ((object = this.zzd.zzd.zzs) == null) break block23;
                    object2 = zzbep.zzhe;
                    object4 = zzba.zzc();
                    object2 = (Boolean)((zzben)object4).zza((zzbeg)object2);
                    n3 = ((Boolean)object2).booleanValue();
                    if (n3 == 0) break block24;
                    object2 = ((zzc)object).zza;
                    object4 = ((zzc)object).zzb;
                    object2 = zzeam.zze((String)object2);
                    bl3 = TextUtils.isEmpty((CharSequence)(object4 = zzeam.zze((String)object4)));
                    if (bl3 || !(bl2 = ((String)object2).equals(object4))) break block25;
                    this.zza.zzo().zzf((String)object2);
                    object3 = this.zzi.zzb();
                    object4 = "request_id";
                    object3.put(object4, object2);
                }
                object2 = ((zzc)object).zza;
                object = ((zzc)object).zzb;
                object = this.zzd((String)object);
                return this.zzc((String)object2, (String)object);
            }
            object = this.zzi.zzb();
            object2 = "ridmm";
            object.put(object2, object3);
        }
        object = new zzelj(14, "Mismatch request IDs.");
        return zzgft.zzg((Throwable)object);
    }

    public final /* synthetic */ ListenableFuture zzb(JSONObject object) {
        Object object2 = this.zzd;
        zzfhc zzfhc2 = new zzfhc((zzfho)object2);
        object = object.toString();
        object2 = new StringReader((String)object);
        object = zzfhe.zza((Reader)object2, null);
        zzfhf zzfhf2 = new zzfhf(zzfhc2, (zzfhe)object);
        return zzgft.zzh(zzfhf2);
    }
}

