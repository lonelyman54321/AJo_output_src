/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzeb;
import java.util.Map;

public final class zzdn
extends zzbu
implements zzdl {
    public zzdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String string2, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeLong(l2);
        this.zzb(23, parcel);
    }

    public final void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, (Parcelable)bundle);
        this.zzb(9, parcel);
    }

    public final void clearMeasurementEnabled(long l2) {
        Parcel parcel = this.b_();
        parcel.writeLong(l2);
        this.zzb(43, parcel);
    }

    public final void endAdUnitExposure(String string2, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeLong(l2);
        this.zzb(24, parcel);
    }

    public final void generateEventId(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(22, parcel);
    }

    public final void getAppInstanceId(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(20, parcel);
    }

    public final void getCachedAppInstanceId(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(19, parcel);
    }

    public final void getConditionalUserProperties(String string2, String string3, zzdq zzdq2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, zzdq2);
        this.zzb(10, parcel);
    }

    public final void getCurrentScreenClass(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(17, parcel);
    }

    public final void getCurrentScreenName(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(16, parcel);
    }

    public final void getGmpAppId(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(21, parcel);
    }

    public final void getMaxUserProperties(String string2, zzdq zzdq2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        zzbw.zza(parcel, zzdq2);
        this.zzb(6, parcel);
    }

    public final void getSessionId(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(46, parcel);
    }

    public final void getTestFlag(zzdq zzdq2, int n3) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        parcel.writeInt(n3);
        this.zzb(38, parcel);
    }

    public final void getUserProperties(String string2, String string3, boolean bl2, zzdq zzdq2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, bl2);
        zzbw.zza(parcel, zzdq2);
        this.zzb(5, parcel);
    }

    public final void initForTests(Map map2) {
        Parcel parcel = this.b_();
        parcel.writeMap(map2);
        this.zzb(37, parcel);
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzdz zzdz2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        zzbw.zza(parcel, zzdz2);
        parcel.writeLong(l2);
        this.zzb(1, parcel);
    }

    public final void isDataCollectionEnabled(zzdq zzdq2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdq2);
        this.zzb(40, parcel);
    }

    public final void logEvent(String string2, String string3, Bundle bundle, boolean bl2, boolean bl3, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, (Parcelable)bundle);
        zzbw.zza(parcel, bl2);
        zzbw.zza(parcel, bl3);
        parcel.writeLong(l2);
        this.zzb(2, parcel);
    }

    public final void logEventAndBundle(String string2, String string3, Bundle bundle, zzdq zzdq2, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, (Parcelable)bundle);
        zzbw.zza(parcel, zzdq2);
        parcel.writeLong(l2);
        this.zzb(3, parcel);
    }

    public final void logHealthData(int n3, String string2, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcel = this.b_();
        parcel.writeInt(n3);
        parcel.writeString(string2);
        zzbw.zza(parcel, iObjectWrapper);
        zzbw.zza(parcel, iObjectWrapper2);
        zzbw.zza(parcel, iObjectWrapper3);
        this.zzb(33, parcel);
    }

    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(27, parcel);
    }

    public final void onActivityCreatedByScionActivityInfo(zzeb zzeb2, Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(53, parcel);
    }

    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeLong(l2);
        this.zzb(28, parcel);
    }

    public final void onActivityDestroyedByScionActivityInfo(zzeb zzeb2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeLong(l2);
        this.zzb(54, parcel);
    }

    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeLong(l2);
        this.zzb(29, parcel);
    }

    public final void onActivityPausedByScionActivityInfo(zzeb zzeb2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeLong(l2);
        this.zzb(55, parcel);
    }

    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeLong(l2);
        this.zzb(30, parcel);
    }

    public final void onActivityResumedByScionActivityInfo(zzeb zzeb2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeLong(l2);
        this.zzb(56, parcel);
    }

    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdq zzdq2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        zzbw.zza(parcel, zzdq2);
        parcel.writeLong(l2);
        this.zzb(31, parcel);
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(zzeb zzeb2, zzdq zzdq2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        zzbw.zza(parcel, zzdq2);
        parcel.writeLong(l2);
        this.zzb(57, parcel);
    }

    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeLong(l2);
        this.zzb(25, parcel);
    }

    public final void onActivityStartedByScionActivityInfo(zzeb zzeb2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeLong(l2);
        this.zzb(51, parcel);
    }

    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeLong(l2);
        this.zzb(26, parcel);
    }

    public final void onActivityStoppedByScionActivityInfo(zzeb zzeb2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeLong(l2);
        this.zzb(52, parcel);
    }

    public final void performAction(Bundle bundle, zzdq zzdq2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        zzbw.zza(parcel, zzdq2);
        parcel.writeLong(l2);
        this.zzb(32, parcel);
    }

    public final void registerOnMeasurementEventListener(zzdw zzdw2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdw2);
        this.zzb(35, parcel);
    }

    public final void resetAnalyticsData(long l2) {
        Parcel parcel = this.b_();
        parcel.writeLong(l2);
        this.zzb(12, parcel);
    }

    public final void retrieveAndUploadBatches(zzdr zzdr2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdr2);
        this.zzb(58, parcel);
    }

    public final void setConditionalUserProperty(Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(8, parcel);
    }

    public final void setConsent(Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(44, parcel);
    }

    public final void setConsentThirdParty(Bundle bundle, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzb(45, parcel);
    }

    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String string2, String string3, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeLong(l2);
        this.zzb(15, parcel);
    }

    public final void setCurrentScreenByScionActivityInfo(zzeb zzeb2, String string2, String string3, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzeb2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeLong(l2);
        this.zzb(50, parcel);
    }

    public final void setDataCollectionEnabled(boolean bl2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, bl2);
        this.zzb(39, parcel);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)bundle);
        this.zzb(42, parcel);
    }

    public final void setEventInterceptor(zzdw zzdw2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdw2);
        this.zzb(34, parcel);
    }

    public final void setInstanceIdProvider(zzdx zzdx2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdx2);
        this.zzb(18, parcel);
    }

    public final void setMeasurementEnabled(boolean bl2, long l2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, bl2);
        parcel.writeLong(l2);
        this.zzb(11, parcel);
    }

    public final void setMinimumSessionDuration(long l2) {
        Parcel parcel = this.b_();
        parcel.writeLong(l2);
        this.zzb(13, parcel);
    }

    public final void setSessionTimeoutDuration(long l2) {
        Parcel parcel = this.b_();
        parcel.writeLong(l2);
        this.zzb(14, parcel);
    }

    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, (Parcelable)intent);
        this.zzb(48, parcel);
    }

    public final void setUserId(String string2, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeLong(l2);
        this.zzb(7, parcel);
    }

    public final void setUserProperty(String string2, String string3, IObjectWrapper iObjectWrapper, boolean bl2, long l2) {
        Parcel parcel = this.b_();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbw.zza(parcel, iObjectWrapper);
        zzbw.zza(parcel, bl2);
        parcel.writeLong(l2);
        this.zzb(4, parcel);
    }

    public final void unregisterOnMeasurementEventListener(zzdw zzdw2) {
        Parcel parcel = this.b_();
        zzbw.zza(parcel, zzdw2);
        this.zzb(36, parcel);
    }
}

