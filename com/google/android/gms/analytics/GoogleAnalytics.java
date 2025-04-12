/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 */
package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zze;
import com.google.android.gms.analytics.zzv;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.internal.gtm.zzcr;
import com.google.android.gms.internal.gtm.zzeg;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzen;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfe;
import com.google.android.gms.internal.gtm.zzfg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class GoogleAnalytics
extends zza {
    private static List zzb;
    private boolean zzc;
    private final Set zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    static {
        ArrayList arrayList;
        zzb = arrayList = new ArrayList();
    }

    public GoogleAnalytics(zzbu hashSet) {
        super((zzbu)((Object)hashSet));
        this.zzd = hashSet = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzbu.zzg(context).zzc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzf() {
        Class<GoogleAnalytics> clazz = GoogleAnalytics.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    try {
                        boolean bl2;
                        object = zzb;
                        if (object == null) break block4;
                        object = object.iterator();
                        while (bl2 = object.hasNext()) {
                            Object object2 = object.next();
                            object2 = (Runnable)object2;
                            object2.run();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = null;
                    zzb = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void dispatchLocalHits() {
        this.zzb().zzf().zzc();
    }

    public void enableAutoActivityReports(Application application) {
        boolean bl2 = this.zze;
        if (!bl2) {
            boolean bl3;
            zze zze2 = new zze(this);
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)zze2);
            this.zze = bl3 = true;
        }
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    public Logger getLogger() {
        return zzen.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Tracker newTracker(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Tracker tracker;
                block3: {
                    try {
                        Object object = this.zzb();
                        zzbu zzbu2 = null;
                        tracker = new Tracker((zzbu)object, null, null);
                        if (n3 <= 0) break block3;
                        zzbu2 = this.zzb();
                        object = new zzfd(zzbu2);
                        zzcp zzcp2 = ((zzcr)object).zza(n3);
                        if ((zzcp2 = (zzfe)zzcp2) == null) break block3;
                        tracker.zzm((zzfe)zzcp2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                tracker.zzW();
                return tracker;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Tracker newTracker(String string2) {
        synchronized (this) {
            zzbu zzbu2 = this.zzb();
            Tracker tracker = new Tracker(zzbu2, string2, null);
            tracker.zzW();
            return tracker;
        }
    }

    public void reportActivityStart(Activity activity) {
        boolean bl2 = this.zze;
        if (!bl2) {
            this.zzh(activity);
        }
    }

    public void reportActivityStop(Activity activity) {
        boolean bl2 = this.zze;
        if (!bl2) {
            this.zzi(activity);
        }
    }

    public void setAppOptOut(boolean bl2) {
        this.zzg = bl2;
        if (bl2 = this.zzg) {
            zzbp zzbp2 = this.zzb().zzf();
            zzbp2.zzg();
        }
    }

    public void setDryRun(boolean bl2) {
        this.zzf = bl2;
    }

    public void setLocalDispatchPeriod(int n3) {
        this.zzb().zzf().zzl(n3);
    }

    public void setLogger(Logger object) {
        zzen.zzc((Logger)object);
        boolean bl2 = this.zzh;
        if (!bl2) {
            object = zzeh.zzb;
            String cfr_ignored_0 = (String)((zzeg)object).zzb();
            object = (String)((zzeg)object).zzb();
            this.zzh = bl2 = true;
        }
    }

    public final void zzg() {
        zzfg zzfg2 = this.zzb().zzq();
        zzfg2.zzf();
        boolean bl2 = zzfg2.zze();
        if (bl2) {
            bl2 = zzfg2.zzc();
            this.setDryRun(bl2);
        }
        zzfg2.zzf();
        this.zzc = true;
    }

    public final void zzh(Activity activity) {
        boolean bl2;
        Iterator iterator = this.zzd.iterator();
        while (bl2 = iterator.hasNext()) {
            zzv zzv2 = (zzv)iterator.next();
            zzv2.zza(activity);
        }
    }

    public final void zzi(Activity activity) {
        boolean bl2;
        Iterator iterator = this.zzd.iterator();
        while (bl2 = iterator.hasNext()) {
            zzv zzv2 = (zzv)iterator.next();
            zzv2.zzb(activity);
        }
    }

    public final boolean zzj() {
        boolean bl2 = this.zzc;
        return bl2;
    }

    public final void zzk(zzv zzv2) {
        Set set = this.zzd;
        set.add(zzv2);
        zzv2 = this.zzb().zza();
        boolean bl2 = zzv2 instanceof Application;
        if (bl2) {
            zzv2 = (Application)zzv2;
            this.enableAutoActivityReports((Application)zzv2);
        }
    }

    public final void zzl(zzv zzv2) {
        this.zzd.remove(zzv2);
    }
}

