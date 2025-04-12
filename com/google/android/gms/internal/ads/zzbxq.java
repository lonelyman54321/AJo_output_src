/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbxq
extends zzbxo {
    private final Object zza;
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbpx zzd;
    private final VersionInfoParcel zze;

    public zzbxq(Context context, zzbpx zzbpx2, VersionInfoParcel versionInfoParcel) {
        Object object;
        this.zza = object = new Object();
        this.zzb = context = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbpx2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject zzc(Context object, VersionInfoParcel object2) {
        String string2;
        String string3;
        int n3;
        Object object3;
        JSONObject jSONObject;
        block21: {
            jSONObject = new JSONObject();
            try {
                object3 = zzbgk.zzb;
            }
            catch (JSONException jSONException) {
                return jSONObject;
            }
            object3 = ((zzbfv)object3).zze();
            object3 = (Boolean)object3;
            n3 = ((Boolean)object3).booleanValue();
            if (n3 == 0) break block21;
            object3 = "package_name";
            string3 = object.getPackageName();
            jSONObject.put((String)object3, (Object)string3);
        }
        object3 = "js";
        string2 = ((VersionInfoParcel)((Object)string2)).afmaVersion;
        jSONObject.put((String)object3, (Object)string2);
        string2 = "mf";
        object3 = zzbgk.zzc;
        object3 = ((zzbfv)object3).zze();
        jSONObject.put(string2, object3);
        string2 = "cl";
        object3 = "636244245";
        jSONObject.put(string2, object3);
        string2 = "rapid_rc";
        object3 = "dev";
        jSONObject.put(string2, object3);
        string2 = "rapid_rollup";
        object3 = "HEAD";
        jSONObject.put(string2, object3);
        string2 = "admob_module_version";
        n3 = 12451000;
        jSONObject.put(string2, n3);
        string2 = "dynamite_local_version";
        int n4 = 241806202;
        jSONObject.put(string2, n4);
        string2 = "dynamite_version";
        string3 = "com.google.android.gms.ads.dynamite";
        int n7 = DynamiteModule.getRemoteVersion(object, string3);
        jSONObject.put(string2, n7);
        String string4 = "container_version";
        jSONObject.put(string4, n3);
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final ListenableFuture zza() {
        String string2;
        Object object;
        Object object2;
        Object object3;
        block7: {
            block6: {
                object3 = this.zza;
                // MONITORENTER : object3
                object2 = this.zzc;
                if (object2 == null) break block6;
                // MONITOREXIT : object3
                break block7;
            }
            object2 = this.zzb;
            object = "google_ads_flags_meta";
            string2 = null;
            this.zzc = object2 = object2.getSharedPreferences((String)object, 0);
            // MONITOREXIT : object3
        }
        object3 = this.zzc;
        long l2 = 0L;
        if (object3 != null) {
            string2 = "js_last_update";
            l2 = object3.getLong(string2, l2);
        }
        long l3 = zzu.zzB().currentTimeMillis() - l2;
        object3 = (Long)zzbgk.zzd.zze();
        long l4 = (Long)object3;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 < 0) {
            return zzgft.zzh(null);
        }
        object3 = this.zzb;
        object2 = this.zze;
        object = this.zzd;
        object3 = zzbxq.zzc((Context)object3, (VersionInfoParcel)object2);
        object3 = object.zzb(object3);
        object2 = new zzbxp(this);
        object = zzcci.zzf;
        return zzgft.zzm((ListenableFuture)object3, (zzfxu)object2, (Executor)object);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        Object object = zzbep.zza;
        zzba.zzb();
        object = zzbei.zza(this.zzb);
        if (object != null) {
            object = object.edit();
            zzba.zza();
            Object object2 = zzbga.zza;
            object2 = zzba.zza();
            int n3 = 1;
            ((zzbeh)object2).zze((SharedPreferences.Editor)object, n3, jSONObject);
            zzba.zzb();
            object.commit();
            jSONObject = this.zzc;
            if (jSONObject != null) {
                jSONObject = jSONObject.edit();
                object = zzu.zzB();
                long l2 = object.currentTimeMillis();
                String string2 = "js_last_update";
                jSONObject = jSONObject.putLong(string2, l2);
                jSONObject.apply();
            }
        }
        return null;
    }
}

