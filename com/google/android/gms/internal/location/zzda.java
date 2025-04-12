/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdc;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;

public final class zzda
extends GoogleApi
implements SettingsClient {
    public static final /* synthetic */ int zza;

    public zzda(Activity activity) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzda(Context context) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final Task checkLocationSettings(LocationSettingsRequest object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzdb zzdb2 = new zzdb((LocationSettingsRequest)object);
        object = taskApiCall$Builder.run(zzdb2).setMethodKey(2426).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task isGoogleLocationAccuracyEnabled() {
        Object object = TaskApiCall.builder();
        Feature[] featureArray = zzdc.zza;
        object = ((TaskApiCall$Builder)object).run((RemoteCall)featureArray).setMethodKey(2444);
        Feature feature = zzo.zzm;
        featureArray = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).build();
        return this.doRead((TaskApiCall)object);
    }
}

