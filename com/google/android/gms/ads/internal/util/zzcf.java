/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.preference.PreferenceManager
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class zzcf {
    private final Map zza;
    private final List zzb;
    private final Context zzc;

    public zzcf(Context context) {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ List zza(zzcf zzcf2) {
        return zzcf2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                zzce zzce2;
                boolean bl2;
                Object object;
                block6: {
                    try {
                        object = this.zza;
                        bl2 = object.containsKey(string2);
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                object = "__default__";
                bl2 = Objects.equals(string2, object);
                if (bl2) {
                    object = this.zzc;
                    object = PreferenceManager.getDefaultSharedPreferences((Context)object);
                } else {
                    object = this.zzc;
                    zzce2 = null;
                    object = object.getSharedPreferences(string2, 0);
                }
                zzce2 = new zzce(this, string2);
                Map map2 = this.zza;
                map2.put(string2, zzce2);
                object.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)zzce2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzc() {
        boolean bl2;
        Object object = zzbep.zzkt;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (!bl3) {
            return;
        }
        zzu.zzp();
        object = zzbep.zzky;
        object = zzt.zzv((String)zzba.zzc().zza((zzbeg)object));
        object2 = object.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            String string2 = (String)object2.next();
            this.zzb(string2);
        }
        object2 = new zzcd((Map)object);
        this.zzd((zzcd)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzcd zzcd2) {
        synchronized (this) {
            List list = this.zzb;
            list.add(zzcd2);
            return;
        }
    }
}

