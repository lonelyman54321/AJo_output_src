/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.os.ConditionVariable
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzfyw;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzben
implements SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza;
    private final Object zzb;
    private final ConditionVariable zzc;
    private volatile boolean zzd;
    private SharedPreferences zze;
    private Bundle zzf;
    private Context zzg;
    private JSONObject zzh;
    private boolean zzi;
    private boolean zzj;

    public zzben() {
        Bundle bundle;
        Object object;
        this.zzb = object = new Object();
        object = new ConditionVariable();
        this.zzc = object;
        this.zzd = false;
        this.zza = false;
        this.zze = null;
        this.zzf = bundle = new Bundle();
        this.zzh = bundle;
        this.zzi = false;
        this.zzj = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zzg(SharedPreferences object) {
        Object object2;
        zzbek zzbek2;
        if (object == null) {
            return;
        }
        try {
            zzbek2 = new zzbek((SharedPreferences)object);
            object2 = zzber.zza(zzbek2);
        }
        catch (JSONException jSONException) {
            return;
        }
        String string2 = (String)object2;
        zzbek2 = new JSONObject(string2);
        this.zzh = zzbek2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        String string3 = "flag_configuration";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            this.zzg(sharedPreferences2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object zza(zzbeg object) {
        block12: {
            Object object2;
            int n3;
            Object object3 = this.zzc;
            long l2 = 5000L;
            int n4 = object3.block(l2);
            if (n4 == 0) {
                object3 = this.zzb;
                // MONITORENTER : object3
                n3 = this.zza;
                if (n3 == 0) {
                    String string2 = "Flags.initialize() was not called!";
                    object = new IllegalStateException(string2);
                    throw object;
                }
                // MONITOREXIT : object3
            }
            if ((n4 = this.zzd) == 0 || (object3 = this.zze) == null || (n4 = this.zzj) != 0) {
                object3 = this.zzb;
                // MONITORENTER : object3
                n3 = this.zzd;
                if (n3 == 0 || (object2 = this.zze) == null || (n3 = (int)(this.zzj ? 1 : 0)) != 0) break block12;
                // MONITOREXIT : object3
            }
            if ((n4 = ((zzbeg)object).zze()) == (n3 = 2)) {
                object3 = this.zzf;
                if (object3 != null) return ((zzbeg)object).zzb((Bundle)object3);
                return ((zzbeg)object).zzm();
            }
            n4 = ((zzbeg)object).zze();
            if (n4 == (n3 = 1) && (n4 = (int)((object3 = this.zzh).has((String)(object2 = ((zzbeg)object).zzn())) ? 1 : 0)) != 0) {
                object3 = this.zzh;
                return ((zzbeg)object).zza((JSONObject)object3);
            }
            object3 = new zzbel(this, (zzbeg)object);
            return zzber.zza((zzfyw)object3);
        }
        object = ((zzbeg)object).zzm();
        // MONITOREXIT : object3
        return object;
    }

    public final Object zzb(zzbeg zzbeg2) {
        boolean bl2 = this.zzd;
        if (!bl2 && !(bl2 = this.zza)) {
            return zzbeg2.zzm();
        }
        return this.zza(zzbeg2);
    }

    public final /* synthetic */ Object zzc(zzbeg zzbeg2) {
        SharedPreferences sharedPreferences2 = this.zze;
        return zzbeg2.zzc(sharedPreferences2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(Context object) {
        boolean bl2 = this.zzd;
        if (bl2) {
            return;
        }
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable4;
            block33: {
                Throwable throwable22;
                block32: {
                    Object object3;
                    boolean bl3;
                    boolean bl4;
                    block30: {
                        block29: {
                            block31: {
                                int n3;
                                Object object4;
                                int n4;
                                Object object5;
                                block28: {
                                    Object object6;
                                    long l2;
                                    Object object7;
                                    long l3;
                                    block27: {
                                        try {
                                            bl4 = this.zzd;
                                            if (bl4) {
                                                return;
                                            }
                                            bl4 = this.zza;
                                            bl3 = true;
                                            if (!bl4) {
                                                this.zza = bl3;
                                            }
                                            object3 = object.getPackageName();
                                            object5 = "com.google.android.gms";
                                            this.zzi = bl4 = TextUtils.equals((CharSequence)object3, (CharSequence)object5);
                                            object3 = object.getApplicationContext();
                                            if (object3 != null) {
                                                object = object.getApplicationContext();
                                            }
                                            this.zzg = object;
                                            try {
                                                object = Wrappers.packageManager((Context)object);
                                                object3 = this.zzg;
                                                object3 = object3.getPackageName();
                                                n4 = 128;
                                                object = ((PackageManagerWrapper)object).getApplicationInfo((String)object3, n4);
                                                object = ((ApplicationInfo)object).metaData;
                                                this.zzf = object;
                                            }
                                            catch (PackageManager.NameNotFoundException | NullPointerException throwable3) {}
                                            object = null;
                                        }
                                        catch (Throwable throwable4) {}
                                        object3 = this.zzg;
                                        object5 = GooglePlayServicesUtilLight.getRemoteContext((Context)object3);
                                        if (object5 != null || object3 == null || (object5 = object3.getApplicationContext()) != null) {
                                            object3 = object5;
                                        }
                                        if (object3 != null) {
                                            zzba.zzb();
                                            object5 = zzbei.zza((Context)object3);
                                        } else {
                                            n4 = 0;
                                            object5 = null;
                                        }
                                        if (object5 != null) {
                                            object4 = new zzbem(this, (SharedPreferences)object5);
                                            zzbhb.zzc((zzbgz)object4);
                                        }
                                        n4 = (int)(this.zzi ? 1 : 0);
                                        l3 = 0L;
                                        if (n4 != 0) break block27;
                                        object5 = zzbgc.zzd;
                                        object7 = ((zzbfv)object5).zze();
                                        l2 = (Long)(object7 = (Long)object7);
                                        long l4 = l2 - l3;
                                        object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                        if (object6 <= 0) break block27;
                                        object7 = this.zzg;
                                        int n7 = zzbdz.zza((Context)object7);
                                        l2 = n7;
                                        object5 = ((zzbfv)object5).zze();
                                        long l7 = (Long)(object5 = (Long)object5);
                                        long l8 = l2 - l7;
                                        n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                        if (n4 < 0) break block27;
                                        this.zzj = bl3;
                                        this.zzd = bl3;
                                        this.zza = false;
                                        object = this.zzc;
                                        object.open();
                                        return;
                                    }
                                    n4 = (int)(this.zzi ? 1 : 0);
                                    if (n4 != 0) break block28;
                                    object5 = zzbgc.zzf;
                                    object7 = ((zzbfv)object5).zze();
                                    l2 = (Long)(object7 = (Long)object7);
                                    long l12 = l2 - l3;
                                    object6 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                    if (object6 <= 0) break block28;
                                    object4 = this.zzg;
                                    n3 = zzbdz.zzb((Context)object4);
                                    l3 = n3;
                                    object5 = ((zzbfv)object5).zze();
                                    l2 = (Long)(object5 = (Long)object5);
                                    long l14 = l3 - l2;
                                    n4 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                                    if (n4 < 0) break block28;
                                    this.zzj = bl3;
                                    this.zzd = bl3;
                                    this.zza = false;
                                    object = this.zzc;
                                    object.open();
                                    return;
                                }
                                object5 = this.zzg;
                                object4 = zzbgk.zzh;
                                object4 = ((zzbfv)object4).zze();
                                object4 = (Boolean)object4;
                                n3 = ((Boolean)object4).booleanValue();
                                if (n3 != 0) break block31;
                                object4 = zzbgk.zzi;
                                object4 = ((zzbfv)object4).zze();
                                n3 = (int)(((Boolean)(object4 = (Boolean)object4)).booleanValue() ? 1 : 0);
                                if (n3 == 0 || (object5 = object5.getSharedPreferences((String)(object4 = "admob"), 0)) == null) break block29;
                                object4 = new zzbej((SharedPreferences)object5);
                                object5 = zzber.zza((zzfyw)object4);
                                object5 = (String)object5;
                                try {
                                    object4 = new JSONObject((String)object5);
                                    object5 = "local_flags_enabled";
                                    n4 = (int)(object4.optBoolean((String)object5) ? 1 : 0);
                                    if (n4 == 0) break block29;
                                }
                                catch (JSONException jSONException) {}
                            }
                            object3 = this.zzg;
                            {
                            }
                        }
                        if (object3 != null) break block30;
                        this.zza = false;
                        object = this.zzc;
                        object.open();
                        return;
                    }
                    try {
                        zzba.zzb();
                        object3 = zzbei.zza((Context)object3);
                        this.zze = object3;
                        object3 = zzbgk.zza;
                        object3 = ((zzbfv)object3).zze();
                        object3 = (Boolean)object3;
                        bl4 = (Boolean)object3;
                        if (!bl4 && (object3 = this.zze) != null) {
                            object3.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
                        }
                        object3 = this.zze;
                        this.zzg((SharedPreferences)object3);
                        this.zzd = bl3;
                    }
                    catch (Throwable throwable22) {}
                    break block32;
                    this.zza = false;
                    object = this.zzc;
                    object.open();
                    return;
                    break block33;
                }
                this.zza = false;
                object = this.zzc;
                object.open();
                throw throwable22;
            }
            throw throwable4;
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}

