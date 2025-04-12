/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.tagmanager.zzfl;

public final class zzfm {
    private GoogleAnalytics zza;
    private final Context zzb;
    private Tracker zzc;

    public zzfm(Context context) {
        this.zzb = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object == null) {
                        object = this.zzb;
                        this.zza = object = GoogleAnalytics.getInstance((Context)object);
                        Object object2 = new zzfl();
                        ((GoogleAnalytics)object).setLogger((Logger)object2);
                        object = this.zza;
                        object2 = "_GTM_DEFAULT_TRACKER_";
                        this.zzc = object = ((GoogleAnalytics)object).newTracker((String)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Tracker zza(String string2) {
        this.zzb("_GTM_DEFAULT_TRACKER_");
        return this.zzc;
    }
}

