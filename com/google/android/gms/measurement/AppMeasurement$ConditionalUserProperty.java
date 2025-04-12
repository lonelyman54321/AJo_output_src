/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzlx;

public class AppMeasurement$ConditionalUserProperty {
    public boolean mActive;
    public String mAppId;
    public long mCreationTimestamp;
    public String mExpiredEventName;
    public Bundle mExpiredEventParams;
    public String mName;
    public String mOrigin;
    public long mTimeToLive;
    public String mTimedOutEventName;
    public Bundle mTimedOutEventParams;
    public String mTriggerEventName;
    public long mTriggerTimeout;
    public String mTriggeredEventName;
    public Bundle mTriggeredEventParams;
    public long mTriggeredTimestamp;
    public Object mValue;

    public AppMeasurement$ConditionalUserProperty() {
    }

    public AppMeasurement$ConditionalUserProperty(Bundle bundle) {
        long l2;
        long l3;
        boolean bl2;
        long l4;
        String string2;
        long l7;
        Preconditions.checkNotNull(bundle);
        Object object = String.class;
        Object object2 = (String)zzjk.zza(bundle, "app_id", object, null);
        this.mAppId = object2;
        object2 = (String)zzjk.zza(bundle, "origin", object, null);
        this.mOrigin = object2;
        object2 = (String)zzjk.zza(bundle, "name", object, null);
        this.mName = object2;
        this.mValue = object2 = zzjk.zza(bundle, "value", Object.class, null);
        this.mTriggerEventName = object2 = (String)zzjk.zza(bundle, "trigger_event_name", object, null);
        object2 = 0L;
        Class<Long> clazz = Long.class;
        this.mTriggerTimeout = l7 = ((Long)zzjk.zza(bundle, "trigger_timeout", clazz, object2)).longValue();
        this.mTimedOutEventName = string2 = (String)zzjk.zza(bundle, "timed_out_event_name", object, null);
        Class<Bundle> clazz2 = Bundle.class;
        string2 = (Bundle)zzjk.zza(bundle, "timed_out_event_params", clazz2, null);
        this.mTimedOutEventParams = string2;
        this.mTriggeredEventName = string2 = (String)zzjk.zza(bundle, "triggered_event_name", object, null);
        string2 = (Bundle)zzjk.zza(bundle, "triggered_event_params", clazz2, null);
        this.mTriggeredEventParams = string2;
        this.mTimeToLive = l4 = ((Long)zzjk.zza(bundle, "time_to_live", clazz, object2)).longValue();
        this.mExpiredEventName = object = (String)zzjk.zza(bundle, "expired_event_name", object, null);
        object = (Bundle)zzjk.zza(bundle, "expired_event_params", clazz2, null);
        this.mExpiredEventParams = object;
        object = Boolean.FALSE;
        this.mActive = bl2 = ((Boolean)zzjk.zza(bundle, "active", Boolean.class, object)).booleanValue();
        this.mCreationTimestamp = l3 = ((Long)zzjk.zza(bundle, "creation_timestamp", clazz, object2)).longValue();
        this.mTriggeredTimestamp = l2 = ((Long)zzjk.zza(bundle, "triggered_timestamp", clazz, object2)).longValue();
    }

    public AppMeasurement$ConditionalUserProperty(AppMeasurement$ConditionalUserProperty appMeasurement$ConditionalUserProperty) {
        Bundle bundle;
        boolean bl2;
        long l2;
        Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty);
        Object object = appMeasurement$ConditionalUserProperty.mAppId;
        this.mAppId = object;
        object = appMeasurement$ConditionalUserProperty.mOrigin;
        this.mOrigin = object;
        this.mCreationTimestamp = l2 = appMeasurement$ConditionalUserProperty.mCreationTimestamp;
        object = appMeasurement$ConditionalUserProperty.mName;
        this.mName = object;
        object = appMeasurement$ConditionalUserProperty.mValue;
        if (object != null) {
            this.mValue = object = zzlx.zza(object);
            if (object == null) {
                this.mValue = object = appMeasurement$ConditionalUserProperty.mValue;
            }
        }
        this.mActive = bl2 = appMeasurement$ConditionalUserProperty.mActive;
        this.mTriggerEventName = object = appMeasurement$ConditionalUserProperty.mTriggerEventName;
        this.mTriggerTimeout = l2 = appMeasurement$ConditionalUserProperty.mTriggerTimeout;
        this.mTimedOutEventName = object = appMeasurement$ConditionalUserProperty.mTimedOutEventName;
        object = appMeasurement$ConditionalUserProperty.mTimedOutEventParams;
        if (object != null) {
            bundle = appMeasurement$ConditionalUserProperty.mTimedOutEventParams;
            object = new Bundle(bundle);
            this.mTimedOutEventParams = object;
        }
        this.mTriggeredEventName = object = appMeasurement$ConditionalUserProperty.mTriggeredEventName;
        object = appMeasurement$ConditionalUserProperty.mTriggeredEventParams;
        if (object != null) {
            bundle = appMeasurement$ConditionalUserProperty.mTriggeredEventParams;
            object = new Bundle(bundle);
            this.mTriggeredEventParams = object;
        }
        this.mTriggeredTimestamp = l2 = appMeasurement$ConditionalUserProperty.mTriggeredTimestamp;
        this.mTimeToLive = l2 = appMeasurement$ConditionalUserProperty.mTimeToLive;
        this.mExpiredEventName = object = appMeasurement$ConditionalUserProperty.mExpiredEventName;
        object = appMeasurement$ConditionalUserProperty.mExpiredEventParams;
        if (object != null) {
            appMeasurement$ConditionalUserProperty = appMeasurement$ConditionalUserProperty.mExpiredEventParams;
            object = new Bundle((Bundle)appMeasurement$ConditionalUserProperty);
            this.mExpiredEventParams = object;
        }
    }
}

