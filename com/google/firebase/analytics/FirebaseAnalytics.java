/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.measurement.internal.zzlm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus;
import com.google.firebase.analytics.FirebaseAnalytics$ConsentType;
import com.google.firebase.analytics.zza;
import com.google.firebase.analytics.zzb;
import com.google.firebase.analytics.zzc;
import com.google.firebase.analytics.zzd;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzed zzb;
    private ExecutorService zzc;

    private FirebaseAnalytics(zzed zzed2) {
        Preconditions.checkNotNull(zzed2);
        this.zzb = zzed2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseAnalytics getInstance(Context object) {
        Object object2 = zza;
        if (object2 != null) return zza;
        object2 = FirebaseAnalytics.class;
        synchronized (object2) {
            try {
                FirebaseAnalytics firebaseAnalytics = zza;
                if (firebaseAnalytics != null) return zza;
                object = zzed.zza(object);
                zza = firebaseAnalytics = new FirebaseAnalytics((zzed)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static zzlm getScionFrontendApiImplementation(Context object, Bundle object2) {
        if ((object = zzed.zza(object, null, null, null, object2)) == null) {
            return null;
        }
        object2 = new zzc((zzed)object);
        return object2;
    }

    public static /* bridge */ /* synthetic */ zzed zza(FirebaseAnalytics firebaseAnalytics) {
        return firebaseAnalytics.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ExecutorService zza() {
        Class<FirebaseAnalytics> clazz = FirebaseAnalytics.class;
        synchronized (clazz) {
            try {
                ExecutorService executorService = this.zzc;
                if (executorService != null) return this.zzc;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int n3 = 100;
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(n3);
                int n4 = 1;
                long l2 = 30;
                this.zzc = executorService = new zzb(this, 0, n4, l2, timeUnit, arrayBlockingQueue);
                return this.zzc;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Task getAppInstanceId() {
        ExecutorService executorService;
        try {
            executorService = this.zza();
        }
        catch (RuntimeException runtimeException) {
            this.zzb.zza(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(runtimeException);
        }
        zza zza2 = new zza(this);
        return Tasks.call(executorService, zza2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getFirebaseInstanceId() {
        ExecutionException executionException2222;
        block4: {
            try {
                Object object2 = FirebaseInstallations.getInstance();
                object2 = ((FirebaseInstallations)object2).getId();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long l2 = 30000L;
                object2 = Tasks.await((Task)object2, l2, timeUnit);
                return (String)object2;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException2222) {
                break block4;
            }
            catch (TimeoutException timeoutException) {
                IllegalThreadStateException throwable = new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                throw throwable;
            }
            IllegalStateException illegalStateException = new IllegalStateException(interruptedException);
            throw illegalStateException;
        }
        Throwable throwable = executionException2222.getCause();
        IllegalStateException illegalStateException = new IllegalStateException(throwable);
        throw illegalStateException;
    }

    public final Task getSessionId() {
        ExecutorService executorService;
        try {
            executorService = this.zza();
        }
        catch (RuntimeException runtimeException) {
            this.zzb.zza(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(runtimeException);
        }
        zzd zzd2 = new zzd(this);
        return Tasks.call(executorService, zzd2);
    }

    public final void logEvent(String string2, Bundle bundle) {
        this.zzb.zza(string2, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.zzj();
    }

    public final void setAnalyticsCollectionEnabled(boolean bl2) {
        zzed zzed2 = this.zzb;
        Boolean bl3 = bl2;
        zzed2.zza(bl3);
    }

    public final void setConsent(Map object) {
        String string2;
        int n3;
        Bundle bundle = new Bundle();
        Object object2 = FirebaseAnalytics$ConsentType.AD_STORAGE;
        object2 = (FirebaseAnalytics$ConsentStatus)((Object)object.get(object2));
        String string3 = "granted";
        String string4 = "denied";
        int n4 = 1;
        if (object2 != null) {
            n3 = ((Enum)object2).ordinal();
            string2 = "ad_storage";
            if (n3 != 0) {
                if (n3 == n4) {
                    bundle.putString(string2, string4);
                }
            } else {
                bundle.putString(string2, string3);
            }
        }
        object2 = FirebaseAnalytics$ConsentType.ANALYTICS_STORAGE;
        if ((object2 = (FirebaseAnalytics$ConsentStatus)((Object)object.get(object2))) != null) {
            n3 = ((Enum)object2).ordinal();
            string2 = "analytics_storage";
            if (n3 != 0) {
                if (n3 == n4) {
                    bundle.putString(string2, string4);
                }
            } else {
                bundle.putString(string2, string3);
            }
        }
        object2 = FirebaseAnalytics$ConsentType.AD_USER_DATA;
        if ((object2 = (FirebaseAnalytics$ConsentStatus)((Object)object.get(object2))) != null) {
            n3 = ((Enum)object2).ordinal();
            string2 = "ad_user_data";
            if (n3 != 0) {
                if (n3 == n4) {
                    bundle.putString(string2, string4);
                }
            } else {
                bundle.putString(string2, string3);
            }
        }
        if ((object = (FirebaseAnalytics$ConsentStatus)((Object)object.get(object2 = FirebaseAnalytics$ConsentType.AD_PERSONALIZATION))) != null) {
            int n7 = ((Enum)object).ordinal();
            object2 = "ad_personalization";
            if (n7 != 0) {
                if (n7 == n4) {
                    bundle.putString((String)object2, string4);
                }
            } else {
                bundle.putString((String)object2, string3);
            }
        }
        this.zzb.zzc(bundle);
    }

    public final void setCurrentScreen(Activity activity, String string2, String string3) {
        this.zzb.zza(activity, string2, string3);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2;
            bundle = bundle2 = new Bundle(bundle);
        }
        this.zzb.zzd(bundle);
    }

    public final void setSessionTimeoutDuration(long l2) {
        this.zzb.zza(l2);
    }

    public final void setUserId(String string2) {
        this.zzb.zzd(string2);
    }

    public final void setUserProperty(String string2, String string3) {
        this.zzb.zzb(string2, string3);
    }
}

