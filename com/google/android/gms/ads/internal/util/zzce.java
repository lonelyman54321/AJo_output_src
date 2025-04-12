/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcby;
import java.util.Iterator;
import java.util.Set;

final class zzce
implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcf zza;
    private final String zzb;

    public zzce(zzcf zzcf2, String string2) {
        this.zza = zzcf2;
        this.zzb = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSharedPreferenceChanged(SharedPreferences object, String string2) {
        object = this.zza;
        synchronized (object) {
            try {
                Iterator iterator = this.zza;
                iterator = zzcf.zza((zzcf)((Object)iterator));
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    Object object2 = iterator.next();
                    object2 = (zzcd)object2;
                    object2 = ((zzcd)object2).zza;
                    String string3 = this.zzb;
                    boolean bl3 = object2.containsKey(string3);
                    if (!bl3) continue;
                    object2 = object2.get(string3);
                    bl2 = (object2 = (Set)object2).contains(string2);
                    if (!bl2) continue;
                    object2 = zzu.zzo();
                    object2 = ((zzcby)object2).zzi();
                    string3 = null;
                    object2.zzJ(false);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

