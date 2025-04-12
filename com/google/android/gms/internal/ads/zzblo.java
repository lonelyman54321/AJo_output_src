/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.View
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbki;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzblo {
    public static final zzblp zzA;
    public static final zzblp zzB;
    public static final zzblp zzC;
    public static final zzblp zza;
    public static final zzblp zzb;
    public static final zzblp zzc;
    public static final zzblp zzd;
    public static final zzblp zze;
    public static final zzblp zzf;
    public static final zzblp zzg;
    public static final zzblp zzh;
    public static final zzblp zzi;
    public static final zzblp zzj;
    public static final zzblp zzk;
    public static final zzblp zzl;
    public static final zzblp zzm;
    public static final zzblp zzn;
    public static final zzbmf zzo;
    public static final zzblp zzp;
    public static final zzblp zzq;
    public static final zzblp zzr;
    public static final zzblp zzs;
    public static final zzblp zzt;
    public static final zzblp zzu;
    public static final zzblp zzv;
    public static final zzblp zzw;
    public static final zzblp zzx;
    public static final zzblp zzy;
    public static final zzblp zzz;

    static {
        zzblp zzblp2 = new zzbkm();
        zza = zzblp2;
        zzblp2 = new zzbko();
        zzb = zzblp2;
        zzblp2 = new zzbkr();
        zzc = zzblp2;
        zzblp2 = new zzblg();
        zzd = zzblp2;
        zzblp2 = new zzblh();
        zze = zzblp2;
        zzblp2 = new zzbks();
        zzf = zzblp2;
        zzblp2 = new zzbli();
        zzg = zzblp2;
        zzblp2 = new zzblj();
        zzh = zzblp2;
        zzblp2 = new zzbkq();
        zzi = zzblp2;
        zzblp2 = new zzblk();
        zzj = zzblp2;
        zzblp2 = new zzbll();
        zzk = zzblp2;
        zzblp2 = new zzcfd();
        zzl = zzblp2;
        zzblp2 = new zzcfe();
        zzm = zzblp2;
        zzblp2 = new zzbki();
        zzn = zzblp2;
        zzblp2 = new zzbmf();
        zzo = zzblp2;
        zzblp2 = new zzblm();
        zzp = zzblp2;
        zzblp2 = new zzbln();
        zzq = zzblp2;
        zzblp2 = new zzbkt();
        zzr = zzblp2;
        zzblp2 = new zzbku();
        zzs = zzblp2;
        zzblp2 = new zzbkv();
        zzt = zzblp2;
        zzblp2 = new zzbkw();
        zzu = zzblp2;
        zzblp2 = new zzbkx();
        zzv = zzblp2;
        zzblp2 = new zzbky();
        zzw = zzblp2;
        zzblp2 = new zzbkz();
        zzx = zzblp2;
        zzblp2 = new zzbla();
        zzy = zzblp2;
        zzblp2 = new zzblb();
        zzz = zzblp2;
        zzblp2 = new zzblc();
        zzA = zzblp2;
        zzblp2 = new zzble();
        zzB = zzblp2;
        zzblp2 = new zzblf();
        zzC = zzblp2;
    }

    public static ListenableFuture zza(zzchd object, String object2) {
        long l2;
        long l3;
        Object object3;
        Object object4;
        Object object5;
        block21: {
            zzben zzben2;
            Object object6;
            block20: {
                object5 = Uri.parse((String)object2);
                object4 = object.zzI();
                object3 = object.zzS();
                object6 = zzbep.zzlW;
                zzben2 = zzba.zzc();
                object6 = zzben2.zza((zzbeg)object6);
                object6 = (Boolean)object6;
                boolean bl2 = (Boolean)object6;
                if (!bl2 || object3 == null) break block20;
                if (object4 == null) break block21;
                boolean bl3 = ((zzaxd)object4).zzf((Uri)object5);
                if (!bl3) break block21;
                object4 = object.getContext();
                object6 = object.zzF();
                zzben2 = object.zzi();
                object5 = ((zzfhs)object3).zza((Uri)object5, (Context)object4, (View)object6, (Activity)zzben2);
            }
            if (object4 == null) break block21;
            boolean bl4 = ((zzaxd)object4).zzf((Uri)object5);
            if (!bl4) break block21;
            object3 = object.getContext();
            object6 = object.zzF();
            zzben2 = object.zzi();
            try {
                object5 = ((zzaxd)object4).zza((Uri)object5, (Context)object3, (View)object6, (Activity)zzben2);
            }
            catch (zzaxe zzaxe2) {
                object4 = "Unable to append parameter to URL: ";
                object2 = ((String)object4).concat((String)object2);
                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object2);
            }
        }
        object2 = new HashMap();
        object4 = object.zzD();
        if (object4 != null) {
            object2 = object.zzD().zzax;
        }
        object4 = object.getContext();
        object2 = zzcaw.zzb((Uri)object5, (Context)object4, object2);
        object5 = (Long)zzbgj.zze.zze();
        long l4 = (Long)object5;
        long l7 = l4 - (l3 = 0L);
        Object object7 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object7 > 0 && (object7 = (l2 = l4 - (l3 = 241806202L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
            object = zzgfk.zzu(object.zzT());
            object5 = new zzbkj();
            object4 = zzcci.zzf;
            object3 = Throwable.class;
            object = zzgft.zze((ListenableFuture)object, (Class)object3, (zzfxu)object5, (Executor)object4);
            object5 = new zzbkk((String)object2);
            object = zzgft.zzm((ListenableFuture)object, (zzfxu)object5, (Executor)object4);
            object5 = new zzbkl((String)object2);
            return zzgft.zze((ListenableFuture)object, (Class)object3, (zzfxu)object5, (Executor)object4);
        }
        return zzgft.zzh(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzb(zzcik zzcik2, Map map2) {
        String string2 = "openableIntents";
        PackageManager packageManager = zzcik2.getContext().getPackageManager();
        Map map3 = map2;
        Object object = (String)map2.get("data");
        try {
            map3 = new JSONObject((String)object);
            object = "intents";
        }
        catch (JSONException jSONException) {
            object = zzcik2;
            object = (zzbok)((Object)zzcik2);
            packageManager = new JSONObject();
            object.zze(string2, (JSONObject)packageManager);
            return;
        }
        try {
            map3 = map3.getJSONArray((String)object);
        }
        catch (JSONException jSONException) {
            object = zzcik2;
            object = (zzbok)((Object)zzcik2);
            packageManager = new JSONObject();
            object.zze(string2, (JSONObject)packageManager);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int i3 = 0;
        while (true) {
            block22: {
                ResolveInfo resolveInfo;
                String string3;
                String string4;
                String string5;
                String string6;
                String string7;
                Object object2;
                String string8;
                int n3;
                block23: {
                    if (i3 >= (n3 = map3.length())) {
                        object = zzcik2;
                        ((zzbok)((Object)zzcik2)).zze(string2, jSONObject);
                        return;
                    }
                    try {
                        object = map3.getJSONObject(i3);
                    }
                    catch (JSONException jSONException) {
                        object = "Error parsing the intent data.";
                        com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, jSONException);
                        break block22;
                    }
                    string8 = object.optString("id");
                    object2 = object.optString("u");
                    string7 = object.optString("i");
                    string6 = object.optString("m");
                    string5 = object.optString("p");
                    string4 = object.optString("c");
                    string3 = object.optString("intent_url");
                    n3 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                    resolveInfo = null;
                    if (n3 == 0) {
                        try {
                            object = Intent.parseUri((String)string3, (int)0);
                            break block23;
                        }
                        catch (URISyntaxException uRISyntaxException) {
                            object = String.valueOf(string3);
                            string3 = "Error parsing the url: ";
                            object = string3.concat((String)object);
                            com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, uRISyntaxException);
                        }
                    }
                    n3 = 0;
                    object = null;
                }
                int n4 = 1;
                if (object == null) {
                    int n7;
                    int n8;
                    boolean bl2;
                    object = new Intent();
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl3) {
                        object2 = Uri.parse((String)object2);
                        object.setData((Uri)object2);
                    }
                    if (!(bl2 = TextUtils.isEmpty((CharSequence)string7))) {
                        object.setAction(string7);
                    }
                    if (!(bl2 = TextUtils.isEmpty((CharSequence)string6))) {
                        object.setType(string6);
                    }
                    if (!(bl2 = TextUtils.isEmpty((CharSequence)string5))) {
                        object.setPackage(string5);
                    }
                    if (!(bl2 = TextUtils.isEmpty((CharSequence)string4)) && (n8 = ((String[])(object2 = string4.split("/", n7 = 2))).length) == n7) {
                        string6 = object2[0];
                        object2 = object2[n4];
                        string7 = new ComponentName(string6, (String)object2);
                        object.setComponent((ComponentName)string7);
                    }
                }
                object2 = object;
                n3 = 65536;
                try {
                    resolveInfo = packageManager.resolveActivity((Intent)object, n3);
                }
                catch (NullPointerException nullPointerException) {
                    object = com.google.android.gms.ads.internal.zzu.zzo();
                    object2 = object2.toString();
                    ((zzcby)object).zzw(nullPointerException, (String)object2);
                }
                if (resolveInfo == null) {
                    n4 = 0;
                    string3 = null;
                }
                try {
                    jSONObject.put(string8, n4 != 0);
                }
                catch (JSONException jSONException) {
                    object = "Error constructing openable urls response.";
                    com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, jSONException);
                }
            }
            ++i3;
        }
    }

    public static void zzc(Map object, zzdhi zzdhi2) {
        boolean bl2;
        boolean bl3;
        Object object2 = zzbep.zzkL;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl4 = (Boolean)object2;
        if (bl4 && (bl3 = object.containsKey(object2 = "sc")) && (bl2 = ((String)(object = (String)object.get(object2))).equals(object2 = "1")) && zzdhi2 != null) {
            zzdhi2.zzdG();
        }
    }
}

