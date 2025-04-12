/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.preference.PreferenceManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcax;
import com.google.android.gms.internal.ads.zzcay;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class zzcaz {
    private final Map zza;
    private final List zzb;
    private final Context zzc;
    private final zzcak zzd;

    public zzcaz(Context context, zzcak zzcak2) {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        this.zzc = context;
        this.zzd = zzcak2;
    }

    public static /* bridge */ /* synthetic */ List zza(zzcaz zzcaz2) {
        return zzcaz2.zzb;
    }

    public final /* synthetic */ void zzb(Map object, SharedPreferences sharedPreferences2, String string2, String string3) {
        boolean bl2;
        boolean bl3 = object.containsKey(string2);
        if (bl3 && (bl2 = (object = (Set)object.get(string2)).contains(string3))) {
            object = this.zzd;
            ((zzcak)object).zzd();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                zzcay zzcay2;
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
                    zzcay2 = null;
                    object = object.getSharedPreferences(string2, 0);
                }
                zzcay2 = new zzcay(this, string2);
                Map map2 = this.zza;
                map2.put(string2, zzcay2);
                object.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)zzcay2);
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
    public final void zzd(zzcax zzcax2) {
        synchronized (this) {
            List list = this.zzb;
            list.add(zzcax2);
            return;
        }
    }
}

