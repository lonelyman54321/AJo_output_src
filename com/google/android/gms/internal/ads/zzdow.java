/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdof;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzdon;
import com.google.android.gms.internal.ads.zzdoo;
import com.google.android.gms.internal.ads.zzdop;
import com.google.android.gms.internal.ads.zzdoq;
import com.google.android.gms.internal.ads.zzdor;
import com.google.android.gms.internal.ads.zzdos;
import com.google.android.gms.internal.ads.zzdot;
import com.google.android.gms.internal.ads.zzdou;
import com.google.android.gms.internal.ads.zzdov;
import com.google.android.gms.internal.ads.zzdpo;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzdqy;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdow {
    private final Context zza;
    private final zzdof zzb;
    private final zzaxd zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbdm zzf;
    private final Executor zzg;
    private final zzbhk zzh;
    private final zzdpo zzi;
    private final zzdsd zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqy zzl;
    private final zzdvc zzm;
    private final zzfoe zzn;
    private final zzefz zzo;
    private final zzegk zzp;
    private final zzfhs zzq;

    public zzdow(Context context, zzdof zzdof2, zzaxd zzaxd2, VersionInfoParcel versionInfoParcel, zza zza2, zzbdm zzbdm2, Executor executor, zzfho zzfho2, zzdpo zzdpo2, zzdsd zzdsd2, ScheduledExecutorService scheduledExecutorService, zzdvc zzdvc2, zzfoe zzfoe2, zzefz zzefz2, zzdqy zzdqy2, zzegk zzegk2, zzfhs zzfhs2) {
        Object object = context;
        this.zza = context;
        object = zzdof2;
        this.zzb = zzdof2;
        object = zzaxd2;
        this.zzc = zzaxd2;
        object = versionInfoParcel;
        this.zzd = versionInfoParcel;
        object = zza2;
        this.zze = zza2;
        object = zzbdm2;
        this.zzf = zzbdm2;
        object = executor;
        this.zzg = executor;
        object = zzfho2;
        object = zzfho2.zzi;
        this.zzh = object;
        object = zzdpo2;
        this.zzi = zzdpo2;
        object = zzdsd2;
        this.zzj = zzdsd2;
        object = scheduledExecutorService;
        this.zzk = scheduledExecutorService;
        object = zzdvc2;
        this.zzm = zzdvc2;
        object = zzfoe2;
        this.zzn = zzfoe2;
        object = zzefz2;
        this.zzo = zzefz2;
        object = zzdqy2;
        this.zzl = zzdqy2;
        object = zzegk2;
        this.zzp = zzegk2;
        object = zzfhs2;
        this.zzq = zzfhs2;
    }

    public static final zzel zzi(JSONObject jSONObject) {
        String string2 = "mute";
        if ((jSONObject = jSONObject.optJSONObject(string2)) != null && (jSONObject = jSONObject.optJSONObject(string2 = "default_reason")) != null) {
            return zzdow.zzr(jSONObject);
        }
        return null;
    }

    public static final List zzj(JSONObject jSONObject) {
        int n3;
        Object object = "mute";
        if ((jSONObject = jSONObject.optJSONObject((String)object)) == null) {
            return zzgbc.zzm();
        }
        object = "reasons";
        if ((jSONObject = jSONObject.optJSONArray((String)object)) != null && (n3 = jSONObject.length()) > 0) {
            int n4;
            object = new Object();
            for (int i3 = 0; i3 < (n4 = jSONObject.length()); ++i3) {
                zzel zzel2 = zzdow.zzr(jSONObject.optJSONObject(i3));
                if (zzel2 == null) continue;
                ((ArrayList)object).add(zzel2);
            }
            return zzgbc.zzk(object);
        }
        return zzgbc.zzm();
    }

    private final zzq zzk(int n3, int n4) {
        if (n3 == 0) {
            if (n4 != 0) {
                n3 = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        Context context = this.zza;
        AdSize adSize = new AdSize(n3, n4);
        zzq zzq2 = new zzq(context, adSize);
        return zzq2;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object object) {
        object = new zzdou(null);
        zzgge zzgge2 = zzcci.zzf;
        return zzgft.zzf(listenableFuture, Exception.class, (zzgfa)object, zzgge2);
    }

    private static ListenableFuture zzm(boolean bl2, ListenableFuture listenableFuture, Object object) {
        Object object2;
        if (bl2) {
            object2 = new zzdov(listenableFuture);
            object = zzcci.zzf;
            object2 = zzgft.zzn(listenableFuture, (zzgfa)object2, (Executor)object);
        } else {
            bl2 = false;
            object2 = zzdow.zzl(listenableFuture, null);
        }
        return object2;
    }

    private final ListenableFuture zzn(JSONObject object, boolean bl2) {
        if (object == null) {
            return zzgft.zzh(null);
        }
        Object object2 = "url";
        String string2 = object.optString((String)object2);
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (bl3) {
            return zzgft.zzh(null);
        }
        double d2 = 1.0;
        double d5 = object.optDouble("scale", d2);
        object2 = "is_transparent";
        boolean bl4 = true;
        bl3 = object.optBoolean((String)object2, bl4);
        int n3 = -1;
        int n4 = object.optInt("width", n3);
        Object object3 = "height";
        int n7 = object.optInt((String)object3, n3);
        if (bl2) {
            Uri uri = Uri.parse((String)string2);
            object = new zzbhi(null, uri, d5, n4, n7);
            return zzgft.zzh(object);
        }
        ListenableFuture listenableFuture = this.zzb.zzb(string2, d5, bl3);
        object3 = object2;
        d2 = d5;
        object2 = new zzdom(string2, d5, n4, n7);
        object3 = this.zzg;
        listenableFuture = zzgft.zzm(listenableFuture, (zzfxu)object2, (Executor)object3);
        return zzdow.zzm(object.optBoolean("require"), listenableFuture, null);
    }

    private final ListenableFuture zzo(JSONArray object, boolean bl2, boolean n3) {
        int n4;
        if (object != null && (n4 = object.length()) > 0) {
            ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
            n3 = n3 != 0 ? object.length() : 1;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = object.optJSONObject(i3);
                object2 = this.zzn((JSONObject)object2, bl2);
                arrayList.add((JSONObject)object2);
            }
            object = zzgft.zzd(arrayList);
            zzdor zzdor2 = new zzdor();
            Executor executor = this.zzg;
            return zzgft.zzm((ListenableFuture)object, zzdor2, executor);
        }
        return zzgft.zzh(Collections.emptyList());
    }

    private final ListenableFuture zzp(JSONObject object, zzfgt object2, zzfgw object3) {
        String string2 = object.optString("base_url");
        String string3 = object.optString("html");
        int n3 = object.optInt("width", 0);
        int n4 = object.optInt("height", 0);
        zzq zzq2 = this.zzk(n3, n4);
        object = this.zzi.zzb(string2, string3, (zzfgt)object2, (zzfgw)object3, zzq2);
        object2 = new zzdon((ListenableFuture)object);
        object3 = zzcci.zzf;
        return zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
    }

    private static Integer zzq(JSONObject jSONObject, String string2) {
        try {
            jSONObject = jSONObject.getJSONObject(string2);
            string2 = "r";
        }
        catch (JSONException jSONException) {
            return null;
        }
        int n3 = jSONObject.getInt(string2);
        String string3 = "g";
        int n4 = jSONObject.getInt(string3);
        String string4 = "b";
        int n7 = jSONObject.getInt(string4);
        n7 = Color.rgb((int)n3, (int)n4, (int)n7);
        return n7;
    }

    private static final zzel zzr(JSONObject object) {
        if (object != null) {
            String string2 = object.optString("reason");
            Object object2 = "ping_url";
            object = object.optString((String)object2);
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                object2 = new zzel(string2, (String)object);
                return object2;
            }
        }
        return null;
    }

    public final /* synthetic */ zzbhf zza(JSONObject object, List list) {
        int n3;
        Object object2 = null;
        if (list != null && (n3 = list.isEmpty()) == 0) {
            zzbhf zzbhf2;
            String string2 = object.optString("text");
            Integer n4 = zzdow.zzq(object, "bg_color");
            Integer n7 = zzdow.zzq(object, "text_color");
            String string3 = "text_size";
            n3 = object.optInt(string3, -1);
            boolean bl2 = object.optBoolean("allow_pub_rendering");
            Object object3 = "animation_ms";
            int n8 = 1000;
            int n10 = object.optInt((String)object3, n8);
            Object object4 = "presentation_ms";
            int n14 = 4000;
            int n15 = object.optInt((String)object4, n14);
            if (n3 > 0) {
                object2 = n3;
            }
            int n16 = n15 + n10;
            object = this.zzh;
            int n17 = object.zze;
            object3 = zzbhf2;
            object4 = list;
            zzbhf2 = new zzbhf(string2, list, n4, n7, (Integer)object2, n16, n17, bl2);
            object2 = zzbhf2;
        }
        return object2;
    }

    public final /* synthetic */ ListenableFuture zzb(zzq zzq2, zzfgt zzfgt2, zzfgw zzfgw2, String string2, String string3, Object object) {
        Object object2 = this.zzj;
        Object object3 = zzq2;
        Object object4 = zzfgt2;
        Object object5 = zzfgw2;
        object2 = ((zzdsd)object2).zza(zzq2, zzfgt2, zzfgw2);
        object3 = zzccm.zza(object2);
        zzdqv zzdqv2 = this.zzl.zzb();
        object5 = object2.zzN();
        Object object6 = object4;
        Context context = this.zza;
        object4 = new zzb(context, null, null);
        zzefz zzefz2 = this.zzo;
        zzfoe zzfoe2 = this.zzn;
        object4 = this.zzm;
        object5.zzR(zzdqv2, zzdqv2, zzdqv2, zzdqv2, zzdqv2, false, null, (zzb)object6, null, null, zzefz2, zzfoe2, (zzdvc)object4, null, zzdqv2, null, null, null, null);
        object5 = zzblo.zzs;
        object2.zzag("/getNativeAdViewSignals", (zzblp)object5);
        object5 = zzblo.zzt;
        object2.zzag("/getNativeClickMeta", (zzblp)object5);
        object4 = object2.zzN();
        object5 = new zzdoq((zzccm)object3);
        object4.zzB((zzcit)object5);
        object4 = string2;
        object5 = string3;
        object2.zzae(string2, string3, null);
        return object3;
    }

    public final /* synthetic */ ListenableFuture zzc(String string2, Object object) {
        zzu.zzz();
        Object object2 = this.zza;
        Object object3 = zzcix.zza();
        zzaxd zzaxd2 = this.zzc;
        zza zza2 = this.zze;
        zzegk zzegk2 = this.zzp;
        VersionInfoParcel versionInfoParcel = this.zzd;
        zzbdm zzbdm2 = this.zzf;
        zzfhs zzfhs2 = this.zzq;
        int n3 = 0;
        String string3 = null;
        zzfhs zzfhs3 = zzfhs2;
        zzfhs2 = null;
        object2 = zzchq.zza((Context)object2, (zzcix)object3, "native-omid", false, false, zzaxd2, null, versionInfoParcel, null, null, zza2, zzbdm2, null, null, zzegk2, zzfhs3);
        object3 = zzccm.zza(object2);
        Object object4 = object2.zzN();
        Object object5 = new zzdos((zzccm)object3);
        object4.zzB((zzcit)object5);
        object4 = zzbep.zzff;
        object4 = (Boolean)zzba.zzc().zza((zzbeg)object4);
        boolean bl2 = (Boolean)object4;
        object5 = "text/html";
        if (bl2) {
            object4 = string2.getBytes();
            n3 = 1;
            object4 = Base64.encodeToString((byte[])object4, (int)n3);
            string3 = "base64";
            object2.loadData((String)object4, (String)object5, string3);
        } else {
            object4 = "UTF-8";
            string3 = string2;
            object2.loadData(string2, (String)object5, (String)object4);
        }
        return object3;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String string2) {
        if ((jSONObject = jSONObject.optJSONObject("attribution")) == null) {
            return zzgft.zzh(null);
        }
        Object object = jSONObject.optJSONArray("images");
        Object object2 = jSONObject.optJSONObject("image");
        if (object == null && object2 != null) {
            object = new JSONArray();
            object.put(object2);
        }
        object = this.zzo((JSONArray)object, false, true);
        object2 = new zzdot(this, jSONObject);
        Executor executor = this.zzg;
        object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
        return zzdow.zzm(jSONObject.optBoolean("require"), (ListenableFuture)object, null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String string2) {
        zzbhk zzbhk2 = this.zzh;
        jSONObject = jSONObject.optJSONObject(string2);
        boolean bl2 = zzbhk2.zzb;
        return this.zzn(jSONObject, bl2);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String object) {
        object = this.zzh;
        jSONObject = jSONObject.optJSONArray("images");
        boolean bl2 = ((zzbhk)object).zzb;
        boolean bl3 = ((zzbhk)object).zzd;
        return this.zzo((JSONArray)jSONObject, bl2, bl3);
    }

    public final ListenableFuture zzg(JSONObject object, String object2, zzfgt object3, zzfgw zzfgw2) {
        int n3;
        object2 = zzbep.zzjZ;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean n32 = (Boolean)object2;
        if (!n32) {
            return zzgft.zzh(null);
        }
        object2 = "images";
        if ((object = object.optJSONArray((String)object2)) != null && (n3 = object.length()) > 0) {
            boolean bl2 = false;
            object2 = null;
            if ((object = object.optJSONObject(0)) == null) {
                return zzgft.zzh(null);
            }
            String string2 = object.optString("base_url");
            String string3 = object.optString("html");
            String string4 = "width";
            int n4 = object.optInt(string4, 0);
            Object object4 = "height";
            int n7 = object.optInt((String)object4, 0);
            zzq zzq2 = this.zzk(n4, n7);
            n7 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
            if (n7 != 0) {
                return zzgft.zzh(null);
            }
            object = zzgft.zzh(null);
            object4 = object2;
            object2 = new zzdoo(this, zzq2, (zzfgt)object3, zzfgw2, string2, string3);
            object3 = zzcci.zze;
            object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
            object2 = new zzdop((ListenableFuture)object);
            object3 = zzcci.zzf;
            return zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
        }
        return zzgft.zzh(null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ListenableFuture zzh(JSONObject var1_1, zzfgt var2_2, zzfgw var3_3) {
        block3: {
            block5: {
                block6: {
                    block4: {
                        var4_4 = "instream";
                        var5_5 = new String[]{"html_containers", var4_4};
                        if ((var5_5 = zzbw.zzh(var1_1 /* !! */ , var5_5)) != null) break block3;
                        var1_1 /* !! */  = var1_1 /* !! */ .optJSONObject("video");
                        var5_5 = null;
                        if (var1_1 /* !! */  != null) break block4;
                        var1_1 /* !! */  = zzgft.zzh(null);
                        break block5;
                    }
                    var4_4 = var1_1 /* !! */ .optString("vast_xml");
                    var6_6 /* !! */  = zzbep.zzjY;
                    var6_6 /* !! */  = (Boolean)zzba.zzc().zza((zzbeg)var6_6 /* !! */ );
                    var7_7 = var6_6 /* !! */ .booleanValue();
                    var8_8 = false;
                    if (var7_7 && (var7_7 = var1_1 /* !! */ .has((String)(var6_6 /* !! */  = "html")))) {
                        var8_8 = true;
                    }
                    if (!(var9_9 = TextUtils.isEmpty((CharSequence)var4_4))) break block6;
                    if (var8_8) ** GOTO lbl-1000
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                    var1_1 /* !! */  = zzgft.zzh(null);
                    break block5;
                }
                if (!var8_8) {
                    var2_2 = this.zzi;
                    var1_1 /* !! */  = var2_2.zza(var1_1 /* !! */ );
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = this.zzp(var1_1 /* !! */ , (zzfgt)var2_2, (zzfgw)var3_3);
                }
                var2_2 = zzbep.zzdN;
                var3_3 = zzba.zzc();
                var2_2 = (Integer)var3_3.zza((zzbeg)var2_2);
                var10_10 = var2_2.intValue();
                var11_11 = var10_10;
                var4_4 = this.zzk;
                var6_6 /* !! */  = TimeUnit.SECONDS;
                var1_1 /* !! */  = zzdow.zzl(zzgft.zzo((ListenableFuture)var1_1 /* !! */ , var11_11, (TimeUnit)var6_6 /* !! */ , (ScheduledExecutorService)var4_4), null);
            }
            return var1_1 /* !! */ ;
        }
        return this.zzp((JSONObject)var5_5, (zzfgt)var2_2, (zzfgw)var3_3);
    }
}

