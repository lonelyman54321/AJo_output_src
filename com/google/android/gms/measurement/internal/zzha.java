/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.util.SparseArray
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzoe;

final class zzha
extends zzji {
    static final Pair zza;
    private long zzaa;
    public zzhe zzb;
    public final zzhf zzc;
    public final zzhf zzd;
    public final zzhh zze;
    public final zzhf zzf;
    public final zzhd zzg;
    public final zzhh zzh;
    public final zzhc zzi;
    public final zzhd zzj;
    public final zzhf zzk;
    public final zzhf zzl;
    public boolean zzm;
    public zzhd zzn;
    public zzhd zzo;
    public zzhf zzp;
    public final zzhh zzq;
    public final zzhh zzr;
    public final zzhf zzs;
    public final zzhc zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    static {
        Pair pair;
        Long l2 = 0L;
        zza = pair = new Pair((Object)"", (Object)l2);
    }

    public zzha(zzic object) {
        super((zzic)object);
        this.zzw = object = new Object();
        this.zzf = object = new zzhf(this, "session_timeout", 1800000L);
        this.zzg = object = new zzhd(this, "start_new_session", true);
        long l2 = 0L;
        this.zzk = object = new zzhf(this, "last_pause_time", l2);
        this.zzl = object = new zzhf(this, "session_id", l2);
        this.zzh = object = new zzhh(this, "non_personalized_ads", null);
        this.zzi = object = new zzhc(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = object = new zzhd(this, "allow_remote_dynamite", false);
        this.zzc = object = new zzhf(this, "first_open_time", l2);
        this.zzd = object = new zzhf(this, "app_install_time", l2);
        this.zze = object = new zzhh(this, "app_instance_id", null);
        this.zzn = object = new zzhd(this, "app_backgrounded", false);
        this.zzo = object = new zzhd(this, "deep_link_retrieval_complete", false);
        this.zzp = object = new zzhf(this, "deep_link_retrieval_attempts", l2);
        this.zzq = object = new zzhh(this, "firebase_feature_rollouts", null);
        this.zzr = object = new zzhh(this, "deferred_attribution_cache", null);
        this.zzs = object = new zzhf(this, "deferred_attribution_cache_timestamp", l2);
        this.zzt = object = new zzhc(this, "default_event_parameters", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Pair zza(String object) {
        Object object2;
        Object object3;
        block6: {
            Exception exception2;
            block5: {
                boolean bl2;
                block4: {
                    long l2;
                    long l3;
                    this.zzv();
                    object3 = this.zzp();
                    object2 = zzjj$zza.zza;
                    int n3 = ((zzjj)object3).zza((zzjj$zza)((Object)object2));
                    object2 = "";
                    if (n3 == 0) {
                        object3 = Boolean.FALSE;
                        return new Pair(object2, object3);
                    }
                    long l4 = this.zzb().elapsedRealtime();
                    object3 = this.zzy;
                    if (object3 != null && (n3 = (l3 = l4 - (l2 = this.zzaa)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
                        object3 = this.zzy;
                        object2 = this.zzz;
                        return new Pair(object3, object2);
                    }
                    object3 = this.zze();
                    this.zzaa = l2 = ((zzai)object3).zzd((String)object) + l4;
                    bl2 = true;
                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(bl2);
                    try {
                        object = this.zza();
                        object = AdvertisingIdClient.getAdvertisingIdInfo((Context)object);
                        this.zzy = object2;
                        object3 = ((AdvertisingIdClient$Info)object).getId();
                        if (object3 == null) break block4;
                        this.zzy = object3;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                this.zzz = bl2 = ((AdvertisingIdClient$Info)object).isLimitAdTrackingEnabled();
                break block6;
            }
            object3 = this.zzj().zzc();
            String string2 = "Unable to get advertising id";
            ((zzgq)object3).zza(string2, exception2);
            this.zzy = object2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        object3 = this.zzy;
        object2 = this.zzz;
        return new Pair(object3, object2);
    }

    public final void zza(Boolean bl2) {
        this.zzv();
        SharedPreferences.Editor editor = this.zzg().edit();
        String string2 = "measurement_enabled";
        if (bl2 != null) {
            boolean bl3 = bl2;
            editor.putBoolean(string2, bl3);
        } else {
            editor.remove(string2);
        }
        editor.apply();
    }

    public final void zza(boolean bl2) {
        this.zzv();
        SharedPreferences.Editor editor = this.zzg().edit();
        editor.putBoolean("use_service", bl2);
        editor.apply();
    }

    public final boolean zza(int n3) {
        int n4 = this.zzg().getInt("consent_source", 100);
        return zzjj.zza(n3, n4);
    }

    public final boolean zza(long l2) {
        long l3 = this.zzf.zza();
        zzhf zzhf2 = this.zzk;
        long l4 = (l2 -= l3) - (l3 = zzhf2.zza());
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0;
    }

    public final boolean zza(zzbd object) {
        this.zzv();
        zzbd zzbd2 = this.zzo();
        int n3 = ((zzbd)object).zza();
        int n4 = zzbd2.zza();
        n4 = (int)(zzjj.zza(n3, n4) ? 1 : 0);
        if (n4 != 0) {
            zzbd2 = this.zzg().edit();
            object = ((zzbd)object).zzf();
            zzbd2.putString("dma_consent_settings", (String)object);
            zzbd2.apply();
            return true;
        }
        return false;
    }

    public final boolean zza(zzjj object) {
        this.zzv();
        int n3 = ((zzjj)object).zza();
        boolean bl2 = this.zza(n3);
        if (bl2) {
            SharedPreferences.Editor editor = this.zzg().edit();
            object = ((zzjj)object).zzf();
            editor.putString("consent_settings", (String)object);
            editor.putInt("consent_source", n3);
            editor.apply();
            return true;
        }
        return false;
    }

    public final boolean zza(zzoe object) {
        this.zzv();
        Object object2 = this.zzg();
        String string2 = "";
        String string3 = "stored_tcf_param";
        object2 = object2.getString(string3, string2);
        object = ((zzoe)object).zzc();
        boolean bl2 = ((String)object).equals(object2);
        if (!bl2) {
            object2 = this.zzg().edit();
            object2.putString(string3, (String)object);
            object2.apply();
            return true;
        }
        return false;
    }

    public final void zzaa() {
        this.zzv();
        Boolean bl2 = this.zzw();
        SharedPreferences.Editor editor = this.zzg().edit();
        editor.clear();
        editor.apply();
        if (bl2 != null) {
            this.zza(bl2);
        }
    }

    public final void zzab() {
        boolean bl2;
        Object object = this.zza();
        boolean bl3 = false;
        object = object.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = object;
        String string2 = "has_been_opened";
        this.zzm = bl2 = object.getBoolean(string2, false);
        if (!bl2) {
            object = this.zzv.edit();
            bl3 = true;
            object.putBoolean(string2, bl3);
            object.apply();
        }
        long l2 = (Long)zzbn.zzc.zza(null);
        long l3 = Math.max(0L, l2);
        object = new zzhe(this, "health_monitor", l3, null);
        this.zzb = object;
    }

    public final boolean zzac() {
        SharedPreferences sharedPreferences2 = this.zzv;
        if (sharedPreferences2 == null) {
            return false;
        }
        return sharedPreferences2.contains("deferred_analytics_collection");
    }

    public final void zzb(Boolean bl2) {
        this.zzv();
        SharedPreferences.Editor editor = this.zzg().edit();
        String string2 = "measurement_enabled_from_api";
        if (bl2 != null) {
            boolean bl3 = bl2;
            editor.putBoolean(string2, bl3);
        } else {
            editor.remove(string2);
        }
        editor.apply();
    }

    public final void zzb(String string2) {
        this.zzv();
        SharedPreferences.Editor editor = this.zzg().edit();
        editor.putString("admob_app_id", string2);
        editor.apply();
    }

    public final void zzb(boolean bl2) {
        this.zzv();
        zzgq zzgq2 = this.zzj().zzq();
        Boolean bl3 = bl2;
        zzgq2.zza("App measurement setting deferred collection", bl3);
        zzgq2 = this.zzg().edit();
        zzgq2.putBoolean("deferred_analytics_collection", bl2);
        zzgq2.apply();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final SharedPreferences zzc() {
        this.zzv();
        this.zzad();
        Object object = this.zzx;
        if (object != null) return this.zzx;
        object = this.zzw;
        synchronized (object) {
            try {
                Object object2 = this.zzx;
                if (object2 != null) return this.zzx;
                object2 = this.zza();
                object2 = object2.getPackageName();
                Object object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                object2 = "_preferences";
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzq();
                String string2 = "Default prefs file";
                ((zzgq)object3).zza(string2, object2);
                object3 = this.zza();
                string2 = null;
                this.zzx = object2 = object3.getSharedPreferences((String)object2, 0);
                return this.zzx;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzc(String string2) {
        this.zzv();
        SharedPreferences.Editor editor = this.zzg().edit();
        editor.putString("gmp_app_id", string2);
        editor.apply();
    }

    public final SharedPreferences zzg() {
        this.zzv();
        this.zzad();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final boolean zzh() {
        return true;
    }

    public final SparseArray zzm() {
        Object object = this.zzi.zza();
        if (object == null) {
            object = new SparseArray();
            return object;
        }
        int[] nArray = object.getIntArray("uriSources");
        String string2 = "uriTimestamps";
        object = object.getLongArray(string2);
        if (nArray != null && object != null) {
            int n3;
            int n4 = nArray.length;
            int n7 = ((Bundle)object).length;
            if (n4 != n7) {
                this.zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                object = new SparseArray();
                return object;
            }
            string2 = new SparseArray();
            for (n7 = 0; n7 < (n3 = nArray.length); ++n7) {
                n3 = nArray[n7];
                Bundle bundle = object[n7];
                Long l2 = (long)bundle;
                string2.put(n3, (Object)l2);
            }
            return string2;
        }
        object = new SparseArray();
        return object;
    }

    public final zzbd zzo() {
        this.zzv();
        return zzbd.zza(this.zzg().getString("dma_consent_settings", null));
    }

    public final zzjj zzp() {
        this.zzv();
        String string2 = this.zzg().getString("consent_settings", "G1");
        int n3 = this.zzg().getInt("consent_source", 100);
        return zzjj.zza(string2, n3);
    }

    public final Boolean zzq() {
        this.zzv();
        SharedPreferences sharedPreferences2 = this.zzg();
        String string2 = "use_service";
        boolean bl2 = sharedPreferences2.contains(string2);
        if (!bl2) {
            return null;
        }
        return this.zzg().getBoolean(string2, false);
    }

    public final Boolean zzr() {
        this.zzv();
        SharedPreferences sharedPreferences2 = this.zzg();
        String string2 = "measurement_enabled_from_api";
        boolean bl2 = sharedPreferences2.contains(string2);
        if (bl2) {
            return this.zzg().getBoolean(string2, true);
        }
        return null;
    }

    public final Boolean zzw() {
        this.zzv();
        SharedPreferences sharedPreferences2 = this.zzg();
        String string2 = "measurement_enabled";
        boolean bl2 = sharedPreferences2.contains(string2);
        if (bl2) {
            return this.zzg().getBoolean(string2, true);
        }
        return null;
    }

    public final String zzx() {
        this.zzv();
        Object object = this.zzg();
        String string2 = "previous_os_version";
        object = object.getString(string2, null);
        this.zzf().zzad();
        String string3 = Build.VERSION.RELEASE;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2 && !(bl2 = string3.equals(object))) {
            SharedPreferences.Editor editor = this.zzg().edit();
            editor.putString(string2, string3);
            editor.apply();
        }
        return object;
    }

    public final String zzy() {
        this.zzv();
        return this.zzg().getString("admob_app_id", null);
    }

    public final String zzz() {
        this.zzv();
        return this.zzg().getString("gmp_app_id", null);
    }
}

