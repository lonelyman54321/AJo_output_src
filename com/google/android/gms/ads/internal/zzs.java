/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbfx;
import java.util.Map;
import java.util.TreeMap;

final class zzs {
    private final Context zza;
    private final String zzb;
    private final Map zzc;
    private String zzd;
    private String zze;
    private final String zzf;

    public zzs(Context object, String object2) {
        Object object3 = object.getApplicationContext();
        this.zza = object3;
        this.zzb = object2;
        object2 = new TreeMap();
        this.zzc = object2;
        object2 = object.getPackageName();
        object3 = Wrappers.packageManager((Context)object);
        object = object.getPackageName();
        String string2 = null;
        object = ((PackageManagerWrapper)object3).getPackageInfo((String)object, 0);
        object = ((PackageInfo)object).versionName;
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        string2 = "-";
        ((StringBuilder)object3).append(string2);
        try {
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object3 = "Unable to get package version name for reporting";
            zzm.zzh((String)object3, nameNotFoundException);
            object = String.valueOf(object2);
            object2 = "-missing";
            object = ((String)object).concat((String)object2);
        }
        this.zzf = object;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(zzl object, VersionInfoParcel iterator) {
        boolean bl2;
        String string2;
        this.zzd = string2 = ((zzl)object).zzj.zza;
        object = ((zzl)object).zzm;
        if (object != null) {
            string2 = AdMobAdapter.class.getName();
            object = object.getBundle(string2);
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            String string3;
            boolean bl3;
            string2 = (String)zzbfx.zzc.zze();
            Object object2 = object.keySet().iterator();
            while (bl3 = object2.hasNext()) {
                string3 = (String)object2.next();
                boolean bl4 = string2.equals(string3);
                if (bl4) {
                    this.zze = string3 = object.getString(string3);
                    continue;
                }
                Object object3 = "csa_";
                bl4 = string3.startsWith((String)object3);
                if (!bl4) continue;
                object3 = this.zzc;
                int n3 = 4;
                String string4 = string3.substring(n3);
                string3 = object.getString(string3);
                object3.put(string4, string3);
            }
            object = this.zzc;
            iterator = ((VersionInfoParcel)((Object)iterator)).afmaVersion;
            string2 = "SDKVersion";
            object.put(string2, iterator);
            object = (Boolean)zzbfx.zza.zze();
            bl2 = (Boolean)object;
            if (bl2) {
                boolean bl5;
                object = this.zza;
                iterator = (String)zzbfx.zzb.zze();
                object = zzad.zzb((Context)object, (String)((Object)iterator));
                iterator = object.keySet().iterator();
                while (bl5 = iterator.hasNext()) {
                    string2 = (String)iterator.next();
                    object2 = this.zzc;
                    string3 = object.get(string2).toString();
                    object2.put(string2, string3);
                }
            }
        }
    }
}

