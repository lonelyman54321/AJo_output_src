/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzpn;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class zzai
extends zzjf {
    private Boolean zza;
    private String zzb;
    private zzak zzc;
    private Boolean zzd;

    public zzai(zzic object) {
        super((zzic)object);
        this.zzc = object = new zzal();
    }

    private final String zza(String object, String string2) {
        block19: {
            ClassNotFoundException classNotFoundException2;
            String string3;
            block18: {
                NoSuchMethodException noSuchMethodException2;
                block17: {
                    IllegalAccessException illegalAccessException2;
                    block16: {
                        int n3 = 1;
                        string3 = null;
                        int n4 = 2;
                        Object object2 = "android.os.SystemProperties";
                        object2 = Class.forName((String)object2);
                        String string4 = "get";
                        Class[] classArray = new Class[n4];
                        Class<String> clazz = String.class;
                        classArray[0] = clazz;
                        classArray[n3] = clazz;
                        object2 = ((Class)object2).getMethod(string4, classArray);
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n3] = string2;
                        object = null;
                        object = ((Method)object2).invoke(null, objectArray);
                        object = (String)object;
                        try {
                            Preconditions.checkNotNull(object);
                            return object;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block16;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block17;
                        }
                        catch (ClassNotFoundException classNotFoundException2) {
                            break block18;
                        }
                        zzgq zzgq2 = this.zzj().zzg();
                        string3 = "SystemProperties.get() threw an exception";
                        zzgq2.zza(string3, invocationTargetException);
                        break block19;
                    }
                    zzgq zzgq3 = this.zzj().zzg();
                    string3 = "Could not access SystemProperties.get()";
                    zzgq3.zza(string3, illegalAccessException2);
                    break block19;
                }
                zzgq zzgq4 = this.zzj().zzg();
                string3 = "Could not find SystemProperties.get() method";
                zzgq4.zza(string3, noSuchMethodException2);
                break block19;
            }
            zzgq zzgq5 = this.zzj().zzg();
            string3 = "Could not find SystemProperties class";
            zzgq5.zza(string3, classNotFoundException2);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle zzac() {
        PackageManager.NameNotFoundException nameNotFoundException2;
        block4: {
            int n3;
            Object object;
            try {
                object = this.zza();
                object = object.getPackageManager();
                if (object == null) {
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    String string2 = "Failed to load metadata: PackageManager is null";
                    ((zzgq)object).zza(string2);
                    return null;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                break block4;
            }
            object = this.zza();
            object = Wrappers.packageManager((Context)object);
            Object object2 = this.zza();
            if ((object = ((PackageManagerWrapper)object).getApplicationInfo((String)(object2 = object2.getPackageName()), n3 = 128)) == null) {
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object2 = "Failed to load metadata: ApplicationInfo is null";
                ((zzgq)object).zza((String)object2);
                return null;
            }
            return ((ApplicationInfo)object).metaData;
        }
        this.zzj().zzg().zza("Failed to load metadata: Package name not found", (Object)nameNotFoundException2);
        return null;
    }

    public static long zzg() {
        return (Long)zzbn.zzd.zza(null);
    }

    public static long zzh() {
        return ((Integer)zzbn.zzk.zza(null)).intValue();
    }

    public static long zzm() {
        return (Long)zzbn.zzam.zza(null);
    }

    public static long zzo() {
        return (Long)zzbn.zzah.zza(null);
    }

    public final double zza(String object, zzfx zzfx2) {
        double d2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return (Double)zzfx2.zza(null);
        }
        zzak zzak2 = this.zzc;
        String string2 = zzfx2.zza();
        bl2 = TextUtils.isEmpty((CharSequence)(object = zzak2.zza((String)object, string2)));
        if (bl2) {
            return (Double)zzfx2.zza(null);
        }
        try {
            d2 = Double.parseDouble((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return (Double)zzfx2.zza(null);
        }
        object = d2;
        object = zzfx2.zza(object);
        object = (Double)object;
        return (Double)object;
    }

    public final int zza(String string2) {
        zzfx zzfx2 = zzbn.zzar;
        return this.zza(string2, zzfx2, 500, 2000);
    }

    public final int zza(String string2, zzfx zzfx2, int n3, int n4) {
        return Math.max(Math.min(this.zzb(string2, zzfx2), n4), n3);
    }

    public final int zza(String string2, boolean bl2) {
        int n3 = 500;
        if (bl2) {
            zzfx zzfx2 = zzbn.zzbb;
            return this.zza(string2, zzfx2, 100, n3);
        }
        return n3;
    }

    public final void zza(zzak zzak2) {
        this.zzc = zzak2;
    }

    public final boolean zza(zzfx zzfx2) {
        return this.zzf(null, zzfx2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaa() {
        Object object = this.zzd;
        if (object != null) return this.zzd;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                String string2;
                block3: {
                    boolean bl2;
                    block5: {
                        block4: {
                            try {
                                object = this.zzd;
                                if (object != null) return this.zzd;
                                object = this.zza();
                                object = object.getApplicationInfo();
                                string2 = ProcessUtils.getMyProcessName();
                                if (object == null) break block3;
                                object = ((ApplicationInfo)object).processName;
                                if (object == null || !(bl2 = ((String)object).equals(string2))) break block4;
                                bl2 = true;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        bl2 = false;
                        object = null;
                    }
                    this.zzd = object = Boolean.valueOf(bl2);
                }
                if ((object = this.zzd) != null) return this.zzd;
                this.zzd = object = Boolean.TRUE;
                object = this.zzj();
                object = ((zzgo)object).zzg();
                string2 = "My process not in the list of running processes";
                ((zzgq)object).zza(string2);
                return this.zzd;
            }
            throw throwable2;
        }
    }

    public final boolean zzab() {
        Boolean bl2 = this.zze("google_analytics_sgtm_upload_enabled");
        if (bl2 == null) {
            return false;
        }
        return bl2;
    }

    public final int zzb(String string2) {
        zzfx zzfx2 = zzbn.zzas;
        return this.zza(string2, zzfx2, 25, 100);
    }

    public final int zzb(String object, zzfx zzfx2) {
        int n3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return (Integer)zzfx2.zza(null);
        }
        zzak zzak2 = this.zzc;
        String string2 = zzfx2.zza();
        bl2 = TextUtils.isEmpty((CharSequence)(object = zzak2.zza((String)object, string2)));
        if (bl2) {
            return (Integer)zzfx2.zza(null);
        }
        try {
            n3 = Integer.parseInt((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return (Integer)zzfx2.zza(null);
        }
        object = n3;
        object = zzfx2.zza(object);
        object = (Integer)object;
        return (Integer)object;
    }

    public final int zzb(String string2, boolean bl2) {
        return Math.max(this.zza(string2, bl2), 256);
    }

    public final int zzc() {
        boolean bl2;
        int n3;
        zzpn zzpn2 = this.zzs();
        boolean bl3 = zzpn2.zza(n3 = 201500000, bl2 = true);
        if (bl3) {
            return 100;
        }
        return 25;
    }

    public final int zzc(String string2) {
        zzfx zzfx2 = zzbn.zzo;
        return this.zzb(string2, zzfx2);
    }

    public final long zzc(String object, zzfx zzfx2) {
        long l2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return (Long)zzfx2.zza(null);
        }
        zzak zzak2 = this.zzc;
        String string2 = zzfx2.zza();
        bl2 = TextUtils.isEmpty((CharSequence)(object = zzak2.zza((String)object, string2)));
        if (bl2) {
            return (Long)zzfx2.zza(null);
        }
        try {
            l2 = Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return (Long)zzfx2.zza(null);
        }
        object = l2;
        object = zzfx2.zza(object);
        object = (Long)object;
        return (Long)object;
    }

    public final zzjm zzc(String string2, boolean bl2) {
        String string3;
        Object object;
        Preconditions.checkNotEmpty(string2);
        Object object2 = this.zzac();
        if (object2 == null) {
            object2 = this.zzj().zzg();
            object = "Failed to load metadata: Metadata bundle is null";
            ((zzgq)object2).zza((String)object);
            object2 = null;
        } else {
            object2 = object2.get(string2);
        }
        if (object2 == null) {
            return zzjm.zza;
        }
        object = Boolean.TRUE;
        boolean bl3 = ((Boolean)object).equals(object2);
        if (bl3) {
            return zzjm.zzd;
        }
        object = Boolean.FALSE;
        bl3 = ((Boolean)object).equals(object2);
        if (bl3) {
            return zzjm.zzc;
        }
        if (bl2 && (bl2 = (string3 = "eu_consent_policy").equals(object2))) {
            return zzjm.zzb;
        }
        this.zzj().zzr().zza("Invalid manifest metadata for", string2);
        return zzjm.zza;
    }

    public final long zzd(String string2) {
        zzfx zzfx2 = zzbn.zza;
        return this.zzc(string2, zzfx2);
    }

    public final String zzd(String string2, zzfx zzfx2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return (String)zzfx2.zza(null);
        }
        zzak zzak2 = this.zzc;
        String string3 = zzfx2.zza();
        string2 = zzak2.zza(string2, string3);
        return (String)zzfx2.zza(string2);
    }

    public final Boolean zze(String string2) {
        Preconditions.checkNotEmpty(string2);
        Bundle bundle = this.zzac();
        if (bundle == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        boolean bl2 = bundle.containsKey(string2);
        if (!bl2) {
            return null;
        }
        return bundle.getBoolean(string2);
    }

    public final boolean zze(String string2, zzfx zzfx2) {
        return this.zzf(string2, zzfx2);
    }

    public final String zzf(String string2) {
        zzfx zzfx2 = zzbn.zzav;
        return this.zzd(string2, zzfx2);
    }

    public final boolean zzf(String object, zzfx zzfx2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return (Boolean)zzfx2.zza(null);
        }
        zzak zzak2 = this.zzc;
        String string2 = zzfx2.zza();
        bl2 = TextUtils.isEmpty((CharSequence)(object = zzak2.zza((String)object, string2)));
        if (bl2) {
            return (Boolean)zzfx2.zza(null);
        }
        object = "1".equals(object);
        return (Boolean)zzfx2.zza(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzg(String object) {
        Preconditions.checkNotEmpty((String)object);
        Bundle bundle = this.zzac();
        if (bundle == null) {
            object = this.zzj().zzg();
            String string2 = "Failed to load metadata: Metadata bundle is null";
            ((zzgq)object).zza(string2);
            return null;
        }
        boolean bl2 = bundle.containsKey((String)object);
        if (!bl2) {
            return null;
        }
        int n3 = bundle.getInt((String)object);
        object = n3;
        if (object == null) {
            return null;
        }
        try {
            Context context = this.zza();
            Resources resources = context.getResources();
            n3 = (Integer)object;
            object = resources.getStringArray(n3);
            if (object != null) return Arrays.asList(object);
            return null;
        }
        catch (Resources.NotFoundException notFoundException) {
            this.zzj().zzg().zza("Failed to load string array from metadata: resource not found", (Object)notFoundException);
            return null;
        }
    }

    public final void zzh(String string2) {
        this.zzb = string2;
    }

    public final boolean zzi(String string2) {
        zzfx zzfx2 = zzbn.zzau;
        return this.zzf(string2, zzfx2);
    }

    public final boolean zzj(String string2) {
        string2 = this.zzc.zza(string2, "gaia_collection_enabled");
        return "1".equals(string2);
    }

    public final boolean zzk(String string2) {
        string2 = this.zzc.zza(string2, "measurement.event_sampling_enabled");
        return "1".equals(string2);
    }

    public final String zzp() {
        return this.zza("debug.firebase.analytics.app", "");
    }

    public final String zzq() {
        return this.zza("debug.deferred.deeplink", "");
    }

    public final String zzr() {
        return this.zzb;
    }

    public final boolean zzw() {
        boolean bl2;
        Boolean bl3 = this.zze("google_analytics_adid_collection_enabled");
        return bl3 == null || (bl2 = bl3.booleanValue());
        {
        }
    }

    public final boolean zzx() {
        boolean bl2;
        Boolean bl3 = this.zze("google_analytics_automatic_screen_reporting_enabled");
        return bl3 == null || (bl2 = bl3.booleanValue());
        {
        }
    }

    public final boolean zzy() {
        boolean bl2;
        Boolean bl3 = this.zze("firebase_analytics_collection_deactivated");
        return bl3 != null && (bl2 = bl3.booleanValue());
    }

    public final boolean zzz() {
        boolean bl2;
        Object object = this.zza;
        if (object == null) {
            object = this.zze("app_measurement_lite");
            this.zza = object;
            if (object == null) {
                this.zza = object = Boolean.FALSE;
            }
        }
        return (bl2 = ((Boolean)(object = this.zza)).booleanValue()) || !(bl2 = ((zzic)(object = this.zzu)).zzai());
        {
        }
    }
}

