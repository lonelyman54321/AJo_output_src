/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzciy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

public final class zzbqu
extends zzciy {
    private final AppMeasurementSdk zza;

    public zzbqu(AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    public final int zzb(String string2) {
        return this.zza.getMaxUserProperties(string2);
    }

    public final long zzc() {
        return this.zza.generateEventId();
    }

    public final Bundle zzd(Bundle bundle) {
        return this.zza.performActionWithResponse(bundle);
    }

    public final String zze() {
        return this.zza.getAppIdOrigin();
    }

    public final String zzf() {
        return this.zza.getAppInstanceId();
    }

    public final String zzg() {
        return this.zza.getCurrentScreenClass();
    }

    public final String zzh() {
        return this.zza.getCurrentScreenName();
    }

    public final String zzi() {
        return this.zza.getGmpAppId();
    }

    public final List zzj(String string2, String string3) {
        return this.zza.getConditionalUserProperties(string2, string3);
    }

    public final Map zzk(String string2, String string3, boolean bl2) {
        return this.zza.getUserProperties(string2, string3, bl2);
    }

    public final void zzl(String string2) {
        this.zza.beginAdUnitExposure(string2);
    }

    public final void zzm(String string2, String string3, Bundle bundle) {
        this.zza.clearConditionalUserProperty(string2, string3, bundle);
    }

    public final void zzn(String string2) {
        this.zza.endAdUnitExposure(string2);
    }

    public final void zzo(String string2, String string3, Bundle bundle) {
        this.zza.logEvent(string2, string3, bundle);
    }

    public final void zzp(Bundle bundle) {
        this.zza.performAction(bundle);
    }

    public final void zzq(Bundle bundle) {
        this.zza.setConditionalUserProperty(bundle);
    }

    public final void zzr(Bundle bundle) {
        this.zza.setConsent(bundle);
    }

    public final void zzs(IObjectWrapper iObjectWrapper, String string2, String string3) {
        iObjectWrapper = iObjectWrapper != null ? (Activity)ObjectWrapper.unwrap(iObjectWrapper) : null;
        this.zza.setCurrentScreen((Activity)iObjectWrapper, string2, string3);
    }

    public final void zzt(String string2, String string3, IObjectWrapper object) {
        object = object != null ? ObjectWrapper.unwrap((IObjectWrapper)object) : null;
        this.zza.setUserProperty(string2, string3, object);
    }
}

