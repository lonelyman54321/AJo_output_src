/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement$EventInterceptor;
import com.google.android.gms.measurement.AppMeasurement$OnEventListener;
import com.google.android.gms.measurement.AppMeasurement$zza;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzlm;
import com.google.android.gms.measurement.zza;
import com.google.android.gms.measurement.zzb;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final AppMeasurement$zza zzb;

    private AppMeasurement(zzic zzic2) {
        zzb zzb2 = new zzb(zzic2);
        this.zzb = zzb2;
    }

    private AppMeasurement(zzlm zzlm2) {
        zza zza2 = new zza(zzlm2);
        this.zzb = zza2;
    }

    public static AppMeasurement getInstance(Context context) {
        return AppMeasurement.zza(context, null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AppMeasurement zza(Context object, String object2, String object3) {
        object2 = zza;
        if (object2 != null) return zza;
        object2 = AppMeasurement.class;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    zzdz zzdz2;
                    Object object4;
                    block3: {
                        try {
                            object3 = zza;
                            if (object3 != null) return zza;
                            object3 = null;
                            object4 = AppMeasurement.zza(object, null);
                            if (object4 == null) break block3;
                            object = new AppMeasurement((zzlm)object4);
                            zza = object;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    long l2 = 0L;
                    long l3 = 0L;
                    boolean bl2 = true;
                    object4 = zzdz2;
                    zzdz2 = new zzdz(l2, l3, bl2, null, null, null, null, null);
                    object = zzic.zza(object, zzdz2, null);
                    zza = object3 = new AppMeasurement((zzic)object);
                }
                return zza;
            }
            throw throwable2;
        }
    }

    private static zzlm zza(Context object, Bundle bundle) {
        Class<Context> clazz;
        Class[] classArray;
        int n3 = 1;
        int n4 = 2;
        Object object2 = FirebaseAnalytics.class;
        String string2 = "getScionFrontendApiImplementation";
        try {
            classArray = new Class[n4];
            clazz = Context.class;
        }
        catch (Exception exception) {
            return null;
        }
        classArray[0] = clazz;
        clazz = Bundle.class;
        classArray[n3] = clazz;
        object2 = ((Class)object2).getDeclaredMethod(string2, classArray);
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        objectArray[n3] = null;
        object = ((Method)object2).invoke(null, objectArray);
        return (zzlm)object;
    }

    public void beginAdUnitExposure(String string2) {
        this.zzb.zzb(string2);
    }

    public void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        this.zzb.zza(string2, string3, bundle);
    }

    public void endAdUnitExposure(String string2) {
        this.zzb.zzc(string2);
    }

    public long generateEventId() {
        return this.zzb.zzf();
    }

    public String getAppInstanceId() {
        return this.zzb.zzg();
    }

    public Boolean getBoolean() {
        return this.zzb.zza();
    }

    public List getConditionalUserProperties(String iterator, String arrayList) {
        int n3;
        AppMeasurement$zza appMeasurement$zza = this.zzb;
        if ((iterator = appMeasurement$zza.zza((String)((Object)iterator), (String)((Object)arrayList))) == null) {
            n3 = 0;
            appMeasurement$zza = null;
        } else {
            n3 = iterator.size();
        }
        arrayList = new ArrayList<AppMeasurement$ConditionalUserProperty>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            appMeasurement$zza = (Bundle)iterator.next();
            AppMeasurement$ConditionalUserProperty appMeasurement$ConditionalUserProperty = new AppMeasurement$ConditionalUserProperty((Bundle)appMeasurement$zza);
            arrayList.add(appMeasurement$ConditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.zzb.zzh();
    }

    public String getCurrentScreenName() {
        return this.zzb.zzi();
    }

    public Double getDouble() {
        return this.zzb.zzb();
    }

    public String getGmpAppId() {
        return this.zzb.zzj();
    }

    public Integer getInteger() {
        return this.zzb.zzc();
    }

    public Long getLong() {
        return this.zzb.zzd();
    }

    public int getMaxUserProperties(String string2) {
        return this.zzb.zza(string2);
    }

    public String getString() {
        return this.zzb.zze();
    }

    public Map getUserProperties(String string2, String string3, boolean bl2) {
        return this.zzb.zza(string2, string3, bl2);
    }

    public Map getUserProperties(boolean bl2) {
        return this.zzb.zza(bl2);
    }

    public void logEventInternal(String string2, String string3, Bundle bundle) {
        this.zzb.zzb(string2, string3, bundle);
    }

    public void logEventInternalNoInterceptor(String string2, String string3, Bundle bundle, long l2) {
        this.zzb.zza(string2, string3, bundle, l2);
    }

    public void registerOnMeasurementEventListener(AppMeasurement$OnEventListener appMeasurement$OnEventListener) {
        this.zzb.zza(appMeasurement$OnEventListener);
    }

    public void setConditionalUserProperty(AppMeasurement$ConditionalUserProperty appMeasurement$ConditionalUserProperty) {
        String string2;
        Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty);
        AppMeasurement$zza appMeasurement$zza = this.zzb;
        Bundle bundle = new Bundle();
        Object object = appMeasurement$ConditionalUserProperty.mAppId;
        if (object != null) {
            string2 = "app_id";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mOrigin) != null) {
            string2 = "origin";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mName) != null) {
            string2 = "name";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mValue) != null) {
            zzjk.zza(bundle, object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mTriggerEventName) != null) {
            string2 = "trigger_event_name";
            bundle.putString(string2, (String)object);
        }
        long l2 = appMeasurement$ConditionalUserProperty.mTriggerTimeout;
        bundle.putLong("trigger_timeout", l2);
        object = appMeasurement$ConditionalUserProperty.mTimedOutEventName;
        if (object != null) {
            string2 = "timed_out_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mTimedOutEventParams) != null) {
            string2 = "timed_out_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mTriggeredEventName) != null) {
            string2 = "triggered_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mTriggeredEventParams) != null) {
            string2 = "triggered_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        l2 = appMeasurement$ConditionalUserProperty.mTimeToLive;
        bundle.putLong("time_to_live", l2);
        object = appMeasurement$ConditionalUserProperty.mExpiredEventName;
        if (object != null) {
            string2 = "expired_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = appMeasurement$ConditionalUserProperty.mExpiredEventParams) != null) {
            string2 = "expired_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        l2 = appMeasurement$ConditionalUserProperty.mCreationTimestamp;
        bundle.putLong("creation_timestamp", l2);
        boolean bl2 = appMeasurement$ConditionalUserProperty.mActive;
        bundle.putBoolean("active", bl2);
        l2 = appMeasurement$ConditionalUserProperty.mTriggeredTimestamp;
        bundle.putLong("triggered_timestamp", l2);
        appMeasurement$zza.zza(bundle);
    }

    public void setEventInterceptor(AppMeasurement$EventInterceptor appMeasurement$EventInterceptor) {
        this.zzb.zza(appMeasurement$EventInterceptor);
    }

    public void unregisterOnMeasurementEventListener(AppMeasurement$OnEventListener appMeasurement$OnEventListener) {
        this.zzb.zzb(appMeasurement$OnEventListener);
    }
}

