/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IInterface
 */
package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzeb;
import java.util.Map;

public interface zzdl
extends IInterface {
    public void beginAdUnitExposure(String var1, long var2);

    public void clearConditionalUserProperty(String var1, String var2, Bundle var3);

    public void clearMeasurementEnabled(long var1);

    public void endAdUnitExposure(String var1, long var2);

    public void generateEventId(zzdq var1);

    public void getAppInstanceId(zzdq var1);

    public void getCachedAppInstanceId(zzdq var1);

    public void getConditionalUserProperties(String var1, String var2, zzdq var3);

    public void getCurrentScreenClass(zzdq var1);

    public void getCurrentScreenName(zzdq var1);

    public void getGmpAppId(zzdq var1);

    public void getMaxUserProperties(String var1, zzdq var2);

    public void getSessionId(zzdq var1);

    public void getTestFlag(zzdq var1, int var2);

    public void getUserProperties(String var1, String var2, boolean var3, zzdq var4);

    public void initForTests(Map var1);

    public void initialize(IObjectWrapper var1, zzdz var2, long var3);

    public void isDataCollectionEnabled(zzdq var1);

    public void logEvent(String var1, String var2, Bundle var3, boolean var4, boolean var5, long var6);

    public void logEventAndBundle(String var1, String var2, Bundle var3, zzdq var4, long var5);

    public void logHealthData(int var1, String var2, IObjectWrapper var3, IObjectWrapper var4, IObjectWrapper var5);

    public void onActivityCreated(IObjectWrapper var1, Bundle var2, long var3);

    public void onActivityCreatedByScionActivityInfo(zzeb var1, Bundle var2, long var3);

    public void onActivityDestroyed(IObjectWrapper var1, long var2);

    public void onActivityDestroyedByScionActivityInfo(zzeb var1, long var2);

    public void onActivityPaused(IObjectWrapper var1, long var2);

    public void onActivityPausedByScionActivityInfo(zzeb var1, long var2);

    public void onActivityResumed(IObjectWrapper var1, long var2);

    public void onActivityResumedByScionActivityInfo(zzeb var1, long var2);

    public void onActivitySaveInstanceState(IObjectWrapper var1, zzdq var2, long var3);

    public void onActivitySaveInstanceStateByScionActivityInfo(zzeb var1, zzdq var2, long var3);

    public void onActivityStarted(IObjectWrapper var1, long var2);

    public void onActivityStartedByScionActivityInfo(zzeb var1, long var2);

    public void onActivityStopped(IObjectWrapper var1, long var2);

    public void onActivityStoppedByScionActivityInfo(zzeb var1, long var2);

    public void performAction(Bundle var1, zzdq var2, long var3);

    public void registerOnMeasurementEventListener(zzdw var1);

    public void resetAnalyticsData(long var1);

    public void retrieveAndUploadBatches(zzdr var1);

    public void setConditionalUserProperty(Bundle var1, long var2);

    public void setConsent(Bundle var1, long var2);

    public void setConsentThirdParty(Bundle var1, long var2);

    public void setCurrentScreen(IObjectWrapper var1, String var2, String var3, long var4);

    public void setCurrentScreenByScionActivityInfo(zzeb var1, String var2, String var3, long var4);

    public void setDataCollectionEnabled(boolean var1);

    public void setDefaultEventParameters(Bundle var1);

    public void setEventInterceptor(zzdw var1);

    public void setInstanceIdProvider(zzdx var1);

    public void setMeasurementEnabled(boolean var1, long var2);

    public void setMinimumSessionDuration(long var1);

    public void setSessionTimeoutDuration(long var1);

    public void setSgtmDebugInfo(Intent var1);

    public void setUserId(String var1, long var2);

    public void setUserProperty(String var1, String var2, IObjectWrapper var3, boolean var4, long var5);

    public void unregisterOnMeasurementEventListener(zzdw var1);
}

