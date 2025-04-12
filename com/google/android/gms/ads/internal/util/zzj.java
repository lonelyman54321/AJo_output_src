/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Looper
 *  android.security.NetworkSecurityPolicy
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzh;
import com.google.android.gms.ads.internal.util.zzi;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzj
implements zzg {
    private String zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private final Object zza;
    private boolean zzb;
    private final List zzc;
    private ListenableFuture zzd;
    private zzbbm zze;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private boolean zzh;
    private String zzi;
    private String zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private zzcbs zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private Set zzs;
    private JSONObject zzt;
    private boolean zzu;
    private boolean zzv;
    private String zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    public zzj() {
        JSONObject jSONObject;
        zzcbs zzcbs2;
        int n3;
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        this.zzc = arrayList = new ArrayList();
        this.zze = null;
        this.zzh = bl2 = true;
        this.zzk = bl2;
        this.zzl = "-1";
        this.zzm = n3 = -1;
        String string2 = "";
        long l2 = 0L;
        this.zzn = zzcbs2 = new zzcbs(string2, l2);
        this.zzo = l2;
        this.zzp = l2;
        this.zzq = n3;
        this.zzr = 0;
        this.zzs = jSONObject = Collections.emptySet();
        this.zzt = jSONObject = new JSONObject();
        this.zzu = bl2;
        this.zzv = bl2;
        this.zzw = null;
        this.zzx = string2;
        this.zzy = false;
        this.zzz = string2;
        this.zzA = "{}";
        this.zzB = n3;
        this.zzC = n3;
        this.zzD = l2;
    }

    /*
     * WARNING - void declaration
     */
    private final void zzV() {
        boolean bl2;
        ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture != null && !(bl2 = listenableFuture.isDone())) {
            InterruptedException interruptedException2;
            Object object;
            block9: {
                void var1_6;
                listenableFuture = this.zzd;
                object = TimeUnit.SECONDS;
                long l2 = 1L;
                try {
                    listenableFuture.get(l2, (TimeUnit)((Object)object));
                    return;
                }
                catch (TimeoutException timeoutException) {
                }
                catch (ExecutionException executionException) {
                }
                catch (CancellationException cancellationException) {
                }
                catch (InterruptedException interruptedException2) {
                    break block9;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", (Throwable)var1_6);
                return;
            }
            Thread.currentThread().interrupt();
            object = "Interrupted while waiting for preferences loaded.";
            com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object, interruptedException2);
        }
    }

    private final void zzW() {
        zzgge zzgge2 = zzcci.zza;
        zzh zzh2 = new zzh(this);
        zzgge2.execute(zzh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzA(boolean bl2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl3 = this.zzv;
                    if (bl3 == bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzv = bl2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "content_vertical_opted_out";
                    editor.putBoolean(string2, bl2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB(String string2) {
        Object object = zzbep.zzjj;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        this.zzV();
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    object2 = this.zzz;
                    boolean bl3 = ((String)object2).equals(string2);
                    if (bl3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.zzz = string2;
                object2 = this.zzg;
                if (object2 != null) {
                    String string3 = "linked_ad_unit";
                    object2.putString(string3, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzC(boolean bl2) {
        Object object = zzbep.zzjj;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (!bl3) {
            return;
        }
        this.zzV();
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl4 = this.zzy;
                    if (bl4 == bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.zzy = bl2;
                zzben2 = this.zzg;
                if (zzben2 != null) {
                    String string2 = "linked_device";
                    zzben2.putBoolean(string2, bl2);
                    SharedPreferences.Editor editor = this.zzg;
                    editor.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzD(String string2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                String string3;
                try {
                    string3 = this.zzw;
                    boolean bl2 = TextUtils.equals((CharSequence)string3, (CharSequence)string2);
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzw = string2;
                string3 = this.zzg;
                if (string3 != null) {
                    String string4 = "display_cutout";
                    string3.putString(string4, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzE(long l2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    long l3 = this.zzp;
                    long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (l4 == false) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzp = l2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "first_ad_req_time_ms";
                    editor.putLong(string2, l2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF(int n3) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block3: {
                    String string2;
                    block5: {
                        SharedPreferences.Editor editor;
                        block4: {
                            try {
                                this.zzm = n3;
                                editor = this.zzg;
                                if (editor == null) break block3;
                                int n4 = -1;
                                if (n3 != n4) break block4;
                                string2 = "gad_has_consent_for_cookies";
                                editor.remove(string2);
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        String string3 = "gad_has_consent_for_cookies";
                        editor.putInt(string3, n3);
                    }
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzG(String string2) {
        Object object = zzbep.zziU;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        this.zzV();
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    object2 = this.zzx;
                    boolean bl3 = ((String)object2).equals(string2);
                    if (bl3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.zzx = string2;
                object2 = this.zzg;
                if (object2 != null) {
                    String string3 = "inspector_info";
                    object2.putString(string3, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzH(String string2) {
        Object object = zzbep.zzjw;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        this.zzV();
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    object2 = this.zzA;
                    boolean bl3 = ((String)object2).equals(string2);
                    if (bl3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.zzA = string2;
                object2 = this.zzg;
                if (object2 != null) {
                    String string3 = "inspector_ui_storage";
                    object2.putString(string3, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzI(boolean bl2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl3 = this.zzk;
                    if (bl2 == bl3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzk = bl2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "gad_idless";
                    editor.putBoolean(string2, bl2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzJ(boolean bl2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        long l2 = System.currentTimeMillis();
                        Object object2 = zzbep.zzkw;
                        Object object3 = zzba.zzc();
                        object2 = ((zzben)object3).zza((zzbeg)object2);
                        object2 = (Long)object2;
                        long l3 = (Long)object2;
                        l2 += l3;
                        object2 = this.zzg;
                        if (object2 == null) break block3;
                        object3 = "is_topics_ad_personalization_allowed";
                        object2.putBoolean((String)object3, bl2);
                        SharedPreferences.Editor editor = this.zzg;
                        object2 = "topics_consent_expiry_time_ms";
                        editor.putLong((String)object2, l2);
                        editor = this.zzg;
                        editor.apply();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzK(String string2, String string3, boolean bl2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Object object2;
            int n3;
            String string4;
            JSONObject jSONObject;
            int n4;
            JSONObject jSONObject2;
            block11: {
                Throwable throwable2;
                block10: {
                    block9: {
                        try {
                            jSONObject2 = this.zzt;
                            jSONObject2 = jSONObject2.optJSONArray(string2);
                            if (jSONObject2 != null) break block9;
                            jSONObject2 = new JSONArray();
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    n4 = jSONObject2.length();
                    jSONObject = null;
                    string4 = null;
                    break block11;
                }
                throw throwable2;
            }
            for (int i3 = 0; i3 < (n3 = jSONObject2.length()); ++i3) {
                String string5;
                JSONObject jSONObject3 = jSONObject2.optJSONObject(i3);
                if (jSONObject3 == null) {
                    return;
                }
                String string6 = "template_id";
                boolean bl3 = string3.equals(string6 = jSONObject3.optString(string6));
                if (!bl3) continue;
                if (bl2 && (n4 = (int)(jSONObject3.optBoolean(string5 = "uses_media_view", false) ? 1 : 0)) != 0) {
                    return;
                }
                n4 = i3;
                break;
            }
            try {
                jSONObject = new JSONObject();
                string4 = "template_id";
                jSONObject.put(string4, (Object)string3);
                string3 = "uses_media_view";
                jSONObject.put(string3, bl2);
                string3 = "timestamp_ms";
                object2 = com.google.android.gms.ads.internal.zzu.zzB();
                long l2 = object2.currentTimeMillis();
                jSONObject.put(string3, l2);
                jSONObject2.put(n4, (Object)jSONObject);
                string3 = this.zzt;
                string3.put(string2, (Object)jSONObject2);
            }
            catch (JSONException jSONException) {
                string3 = "Could not update native advanced settings";
                com.google.android.gms.ads.internal.util.client.zzm.zzk(string3, jSONException);
            }
            string2 = this.zzg;
            if (string2 != null) {
                string3 = "native_advanced_settings";
                object2 = this.zzt;
                object2 = object2.toString();
                string2.putString(string3, (String)object2);
                string2 = this.zzg;
                string2.apply();
            }
            this.zzW();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(int n3) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    int n4 = this.zzq;
                    if (n4 == n3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzq = n3;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "request_in_session_count";
                    editor.putInt(string2, n3);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzM(int n3) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    int n4 = this.zzC;
                    if (n4 == n3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzC = n3;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "sd_app_measure_npa";
                    editor.putInt(string2, n3);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzN(long l2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    long l3 = this.zzD;
                    long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (l4 == false) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzD = l2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "sd_app_measure_npa_ts";
                    editor.putLong(string2, l2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzO(String string2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block3: {
                    block5: {
                        Object object2;
                        block4: {
                            try {
                                this.zzl = string2;
                                object2 = this.zzg;
                                if (object2 == null) break block3;
                                object2 = "-1";
                                boolean bl2 = string2.equals(object2);
                                if (!bl2) break block4;
                                string2 = this.zzg;
                                object2 = "IABTCF_TCString";
                                string2.remove((String)object2);
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        object2 = this.zzg;
                        String string3 = "IABTCF_TCString";
                        object2.putString(string3, string2);
                    }
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzP() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzu;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzQ() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzv;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzR() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzy;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzS() {
        Object object = zzbep.zzav;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return false;
        }
        this.zzV();
        object = this.zza;
        synchronized (object) {
            return this.zzk;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzT() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                long l2;
                boolean bl2;
                SharedPreferences sharedPreferences2;
                try {
                    sharedPreferences2 = this.zzf;
                    bl2 = false;
                    if (sharedPreferences2 == null) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                String string2 = "topics_consent_expiry_time_ms";
                long l3 = 0L;
                long l4 = sharedPreferences2.getLong(string2, l3);
                long l7 = l4 - (l2 = System.currentTimeMillis());
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 < 0) {
                    return false;
                }
                sharedPreferences2 = this.zzf;
                string2 = "is_topics_ad_personalization_allowed";
                object2 = sharedPreferences2.getBoolean(string2, false);
                if (object2 == false) return bl2;
                object2 = this.zzk;
                if (object2 != false) return bl2;
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void zzU(Context object, String object2) {
        Throwable throwable3;
        block11: {
            long l2;
            Object object3;
            long l3;
            int n3;
            block10: {
                Object object4 = null;
                object = object.getSharedPreferences("admob", 0);
                object2 = object.edit();
                try {
                    object4 = this.zza;
                    // MONITORENTER : object4
                }
                catch (Throwable throwable2) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(throwable2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                    com.google.android.gms.ads.internal.util.zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", throwable2);
                    return;
                }
                try {
                    this.zzf = object;
                    this.zzg = object2;
                    n3 = PlatformVersion.isAtLeastM();
                    if (n3 == 0) break block10;
                    object = sk3_1.a();
                    tk3_1.a((NetworkSecurityPolicy)object);
                }
                catch (Throwable throwable3) {
                    break block11;
                }
            }
            object = this.zzf;
            object2 = "use_https";
            int n4 = this.zzh;
            this.zzh = n3 = object.getBoolean((String)object2, n4 != 0);
            object = this.zzf;
            object2 = "content_url_opted_out";
            n4 = this.zzu;
            this.zzu = n3 = object.getBoolean((String)object2, n4 != 0);
            object = this.zzf;
            object2 = "content_url_hashes";
            Object object5 = this.zzi;
            this.zzi = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "gad_idless";
            n4 = this.zzk;
            this.zzk = n3 = object.getBoolean((String)object2, n4 != 0);
            object = this.zzf;
            object2 = "content_vertical_opted_out";
            n4 = this.zzv;
            this.zzv = n3 = object.getBoolean((String)object2, n4 != 0);
            object = this.zzf;
            object2 = "content_vertical_hashes";
            object5 = this.zzj;
            this.zzj = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "version_code";
            n4 = this.zzr;
            this.zzr = n3 = object.getInt((String)object2, n4);
            object = zzbgc.zzg;
            object = ((zzbfv)object).zze();
            n3 = (int)(((Boolean)(object = (Boolean)object)).booleanValue() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((zzben)(object = zzba.zzc())).zze() ? 1 : 0)) != 0) {
                object2 = "";
                l3 = 0L;
                this.zzn = object = new zzcbs((String)object2, l3);
            } else {
                object = this.zzf;
                object2 = "app_settings_json";
                object5 = this.zzn;
                object5 = ((zzcbs)object5).zzc();
                object = object.getString((String)object2, (String)object5);
                object2 = this.zzf;
                object5 = "app_settings_last_update_ms";
                object3 = this.zzn;
                long l4 = ((zzcbs)object3).zza();
                l3 = object2.getLong((String)object5, l4);
                this.zzn = object2 = new zzcbs((String)object, l3);
            }
            object = this.zzf;
            object2 = "app_last_background_time_ms";
            l3 = this.zzo;
            this.zzo = l2 = object.getLong((String)object2, l3);
            object = this.zzf;
            object2 = "request_in_session_count";
            n4 = this.zzq;
            this.zzq = n3 = object.getInt((String)object2, n4);
            object = this.zzf;
            object2 = "first_ad_req_time_ms";
            l3 = this.zzp;
            this.zzp = l2 = object.getLong((String)object2, l3);
            object = this.zzf;
            object2 = "never_pool_slots";
            object5 = this.zzs;
            this.zzs = object = object.getStringSet((String)object2, (Set)object5);
            object = this.zzf;
            object2 = "display_cutout";
            object5 = this.zzw;
            this.zzw = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "app_measurement_npa";
            n4 = this.zzB;
            this.zzB = n3 = object.getInt((String)object2, n4);
            object = this.zzf;
            object2 = "sd_app_measure_npa";
            n4 = this.zzC;
            this.zzC = n3 = object.getInt((String)object2, n4);
            object = this.zzf;
            object2 = "sd_app_measure_npa_ts";
            l3 = this.zzD;
            this.zzD = l2 = object.getLong((String)object2, l3);
            object = this.zzf;
            object2 = "inspector_info";
            object5 = this.zzx;
            this.zzx = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "linked_device";
            n4 = (int)(this.zzy ? 1 : 0);
            n3 = (int)(object.getBoolean((String)object2, n4 != 0) ? 1 : 0);
            this.zzy = n3;
            object = this.zzf;
            object2 = "linked_ad_unit";
            object5 = this.zzz;
            this.zzz = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "inspector_ui_storage";
            object5 = this.zzA;
            this.zzA = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "IABTCF_TCString";
            object5 = this.zzl;
            this.zzl = object = object.getString((String)object2, (String)object5);
            object = this.zzf;
            object2 = "gad_has_consent_for_cookies";
            n4 = this.zzm;
            this.zzm = n3 = object.getInt((String)object2, n4);
            try {
                object2 = this.zzf;
                object5 = "native_advanced_settings";
                object3 = "{}";
                object2 = object2.getString((String)object5, (String)object3);
                object = new JSONObject((String)object2);
                this.zzt = object;
            }
            catch (JSONException jSONException) {
                object2 = "Could not convert native advanced settings to json object";
                com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, jSONException);
            }
            this.zzW();
            // MONITOREXIT : object4
            return;
        }
        // MONITOREXIT : object4
        throw throwable3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzr;
        }
    }

    public final int zzb() {
        this.zzV();
        return this.zzm;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzc() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzq;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzd() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzo;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zze() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzp;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzf() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzD;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbbm zzg() {
        boolean bl2 = this.zzb;
        Object object = null;
        if (!bl2) {
            return null;
        }
        bl2 = this.zzP();
        if (bl2 && (bl2 = this.zzQ())) {
            return null;
        }
        Object object2 = (Boolean)zzbgb.zzb.zze();
        bl2 = (Boolean)object2;
        if (!bl2) {
            return null;
        }
        object2 = this.zza;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                try {
                    Looper looper = Looper.getMainLooper();
                    if (looper == null) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = this.zze;
                if (object == null) {
                    object = new zzbbm();
                    this.zze = object;
                }
                object = this.zze;
                ((zzbbm)object).zze();
                object = "start fetching content...";
                com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object);
                return this.zze;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcbs zzh() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            try {
                boolean bl2;
                Object object2 = zzbep.zzlJ;
                Object object3 = zzba.zzc();
                object2 = ((zzben)object3).zza((zzbeg)object2);
                object2 = (Boolean)object2;
                boolean bl3 = (Boolean)object2;
                if (!bl3) return this.zzn;
                object2 = this.zzn;
                bl3 = ((zzcbs)object2).zzj();
                if (!bl3) return this.zzn;
                object2 = this.zzc;
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    object3 = object2.next();
                    object3 = (Runnable)object3;
                    object3.run();
                }
                return this.zzn;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcbs zzi() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzn;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzj() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzk() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzj;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzl() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzz;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzm() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzw;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzn() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzx;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzo() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzA;
        }
    }

    public final String zzp() {
        this.zzV();
        return this.zzl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zzq() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            return this.zzt;
        }
    }

    public final void zzr(Runnable runnable2) {
        this.zzc.add(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs(Context object) {
        Object object2 = this.zza;
        synchronized (object2) {
            try {
                Object object3 = this.zzf;
                if (object3 != null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var2_3
                object2 = zzcci.zza;
                object3 = new zzi(this, (Context)object, "admob");
                object = object2.zza((Runnable)object3);
                this.zzd = object;
                this.zzb = true;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzt() {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        JSONObject jSONObject;
                        this.zzt = jSONObject = new JSONObject();
                        jSONObject = this.zzg;
                        if (jSONObject == null) break block3;
                        String string2 = "native_advanced_settings";
                        jSONObject.remove(string2);
                        jSONObject = this.zzg;
                        jSONObject.apply();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(long l2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    long l3 = this.zzo;
                    long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (l4 == false) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzo = l2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "app_last_background_time_ms";
                    editor.putLong(string2, l2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(String editor) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                long l2;
                block5: {
                    Object object2;
                    block6: {
                        try {
                            object2 = com.google.android.gms.ads.internal.zzu.zzB();
                            l2 = object2.currentTimeMillis();
                            if (editor == null) break block5;
                            Object object3 = this.zzn;
                            boolean bl2 = editor.equals(object3 = ((zzcbs)object3).zzc());
                            if (bl2) break block5;
                            this.zzn = object3 = new zzcbs((String)editor, l2);
                            object3 = this.zzg;
                            if (object3 == null) break block6;
                            String string2 = "app_settings_json";
                            object3.putString(string2, (String)editor);
                            editor = this.zzg;
                            object3 = "app_settings_last_update_ms";
                            editor.putLong((String)object3, l2);
                            editor = this.zzg;
                            editor.apply();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    this.zzW();
                    editor = this.zzc;
                    editor = editor.iterator();
                    while (true) {
                        boolean bl3;
                        if (!(bl3 = editor.hasNext())) {
                            return;
                        }
                        object2 = editor.next();
                        object2 = (Runnable)object2;
                        object2.run();
                    }
                }
                editor = this.zzn;
                editor.zzg(l2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzw(int n3) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    int n4 = this.zzr;
                    if (n4 == n3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzr = n3;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "version_code";
                    editor.putInt(string2, n3);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzx(String string2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                String string3;
                try {
                    string3 = this.zzi;
                    boolean bl2 = string2.equals(string3);
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzi = string2;
                string3 = this.zzg;
                if (string3 != null) {
                    String string4 = "content_url_hashes";
                    string3.putString(string4, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzy(boolean bl2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl3 = this.zzu;
                    if (bl3 == bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzu = bl2;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    String string2 = "content_url_opted_out";
                    editor.putBoolean(string2, bl2);
                    SharedPreferences.Editor editor2 = this.zzg;
                    editor2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz(String string2) {
        this.zzV();
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                String string3;
                try {
                    string3 = this.zzj;
                    boolean bl2 = string2.equals(string3);
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzj = string2;
                string3 = this.zzg;
                if (string3 != null) {
                    String string4 = "content_vertical_hashes";
                    string3.putString(string4, string2);
                    string2 = this.zzg;
                    string2.apply();
                }
                this.zzW();
                return;
            }
            throw throwable2;
        }
    }
}

