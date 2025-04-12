/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener;
import com.google.android.gms.common.util.ProcessUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BackgroundDetector
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    private static final BackgroundDetector zza;
    private final AtomicBoolean zzb;
    private final AtomicBoolean zzc;
    private final ArrayList zzd;
    private boolean zze;

    static {
        BackgroundDetector backgroundDetector;
        zza = backgroundDetector = new BackgroundDetector();
    }

    private BackgroundDetector() {
        Serializable serializable;
        this.zzb = serializable = new AtomicBoolean();
        this.zzc = serializable = new AtomicBoolean();
        this.zzd = serializable;
        this.zze = false;
    }

    public static BackgroundDetector getInstance() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void initialize(Application application) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2;
                        boolean bl3 = backgroundDetector.zze;
                        if (bl3) break block3;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)backgroundDetector);
                        application.registerComponentCallbacks((ComponentCallbacks)backgroundDetector);
                        backgroundDetector.zze = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
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
    private final void zza(boolean bl2) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                Object object = this.zzd;
                object = ((ArrayList)object).iterator();
                while (true) {
                    boolean bl3;
                    if (!(bl3 = object.hasNext())) {
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (BackgroundDetector$BackgroundStateChangeListener)object2;
                    object2.onBackgroundStateChanged(bl2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addListener(BackgroundDetector$BackgroundStateChangeListener backgroundDetector$BackgroundStateChangeListener) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            ArrayList arrayList = this.zzd;
            arrayList.add(backgroundDetector$BackgroundStateChangeListener);
            return;
        }
    }

    public boolean isInBackground() {
        return this.zzb.get();
    }

    public final void onActivityCreated(Activity object, Bundle object2) {
        object = this.zzc;
        object2 = this.zzb;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object2).compareAndSet(bl2, false);
        ((AtomicBoolean)object).set(bl2);
        if (bl3) {
            this.zza(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity object) {
        object = this.zzc;
        AtomicBoolean atomicBoolean = this.zzb;
        boolean bl2 = true;
        boolean bl3 = atomicBoolean.compareAndSet(bl2, false);
        ((AtomicBoolean)object).set(bl2);
        if (bl3) {
            this.zza(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n3) {
        int n4 = 20;
        if (n3 == n4) {
            AtomicBoolean atomicBoolean = this.zzb;
            n4 = 0;
            boolean bl2 = true;
            n3 = (int)(atomicBoolean.compareAndSet(false, bl2) ? 1 : 0);
            if (n3 != 0) {
                atomicBoolean = this.zzc;
                atomicBoolean.set(bl2);
                this.zza(bl2);
            }
        }
    }

    public boolean readCurrentStateIfPossible(boolean n3) {
        AtomicBoolean atomicBoolean = this.zzc;
        int n4 = atomicBoolean.get();
        if (n4 == 0) {
            n4 = ProcessUtils.zza();
            if (n4 == 0) {
                Object object = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)object);
                atomicBoolean = this.zzc;
                boolean bl2 = true;
                n4 = atomicBoolean.getAndSet(bl2);
                if (n4 == 0 && (n3 = ((ActivityManager.RunningAppProcessInfo)object).importance) > (n4 = 100)) {
                    object = this.zzb;
                    ((AtomicBoolean)object).set(bl2);
                }
            } else {
                return n3 != 0;
            }
        }
        return this.isInBackground();
    }
}

