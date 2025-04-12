/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzcax;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Iterator;
import java.util.Map;

final class zzcay
implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcaz zza;
    private final String zzb;

    public zzcay(zzcaz zzcaz2, String string2) {
        this.zza = zzcaz2;
        this.zzb = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        zzcaz zzcaz2 = this.zza;
        synchronized (zzcaz2) {
            try {
                Iterator iterator = this.zza;
                iterator = zzcaz.zza((zzcaz)((Object)iterator));
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    Object object = iterator.next();
                    object = (zzcax)object;
                    String string3 = this.zzb;
                    zzcaz zzcaz3 = ((zzcax)object).zza;
                    object = ((zzcax)object).zzb;
                    zzcaz3.zzb((Map)object, sharedPreferences2, string3, string2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

