/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.measurement.api.AppMeasurementSdk$EventInterceptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener;
import java.util.List;
import java.util.Map;

public class AppMeasurementSdk {
    private final zzed zza;

    public AppMeasurementSdk(zzed zzed2) {
        this.zza = zzed2;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return zzed.zza(context).zzb();
    }

    public static AppMeasurementSdk getInstance(Context context, String string2, String string3, String string4, Bundle bundle) {
        return zzed.zza(context, string2, string3, string4, bundle).zzb();
    }

    public void beginAdUnitExposure(String string2) {
        this.zza.zzb(string2);
    }

    public void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        this.zza.zza(string2, string3, bundle);
    }

    public void endAdUnitExposure(String string2) {
        this.zza.zzc(string2);
    }

    public long generateEventId() {
        return this.zza.zza();
    }

    public String getAppIdOrigin() {
        return this.zza.zzd();
    }

    public String getAppInstanceId() {
        return this.zza.zzf();
    }

    public List getConditionalUserProperties(String string2, String string3) {
        return this.zza.zza(string2, string3);
    }

    public String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    public String getCurrentScreenName() {
        return this.zza.zzh();
    }

    public String getGmpAppId() {
        return this.zza.zzi();
    }

    public int getMaxUserProperties(String string2) {
        return this.zza.zza(string2);
    }

    public Map getUserProperties(String string2, String string3, boolean bl2) {
        return this.zza.zza(string2, string3, bl2);
    }

    public void logEvent(String string2, String string3, Bundle bundle) {
        this.zza.zzb(string2, string3, bundle);
    }

    public void logEventNoInterceptor(String string2, String string3, Bundle bundle, long l2) {
        this.zza.zza(string2, string3, bundle, l2);
    }

    public void performAction(Bundle bundle) {
        this.zza.zza(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zza.zza(bundle, true);
    }

    public void registerOnMeasurementEventListener(AppMeasurementSdk$OnEventListener appMeasurementSdk$OnEventListener) {
        this.zza.zza(appMeasurementSdk$OnEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        this.zza.zza(bundle);
    }

    public void setConsent(Bundle bundle) {
        this.zza.zzb(bundle);
    }

    public void setCurrentScreen(Activity activity, String string2, String string3) {
        this.zza.zza(activity, string2, string3);
    }

    public void setEventInterceptor(AppMeasurementSdk$EventInterceptor appMeasurementSdk$EventInterceptor) {
        this.zza.zza(appMeasurementSdk$EventInterceptor);
    }

    public void setMeasurementEnabled(Boolean bl2) {
        this.zza.zza(bl2);
    }

    public void setMeasurementEnabled(boolean bl2) {
        zzed zzed2 = this.zza;
        Boolean bl3 = bl2;
        zzed2.zza(bl3);
    }

    public void setUserProperty(String string2, String string3, Object object) {
        this.zza.zza(string2, string3, object, true);
    }

    public void unregisterOnMeasurementEventListener(AppMeasurementSdk$OnEventListener appMeasurementSdk$OnEventListener) {
        this.zza.zzb(appMeasurementSdk$OnEventListener);
    }

    public final void zza(boolean bl2) {
        this.zza.zza(bl2);
    }
}

