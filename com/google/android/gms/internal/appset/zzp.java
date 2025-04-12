/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.appset.zzm;
import com.google.android.gms.internal.appset.zzn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzp
extends GoogleApi
implements AppSetIdClient {
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;
    private static final Api zzc;
    private final Context zzd;
    private final GoogleApiAvailabilityLight zze;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzn zzn2 = new zzn();
        zzb = zzn2;
        zzc = api = new Api("AppSet.API", zzn2, api$ClientKey);
    }

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
        this.zzd = context;
        this.zze = googleApiAvailabilityLight;
    }

    public final Task getAppSetIdInfo() {
        Object object = null;
        Object object2 = this.zze;
        Object object3 = this.zzd;
        int n3 = 212800000;
        int n4 = ((GoogleApiAvailabilityLight)object2).isGooglePlayServicesAvailable((Context)object3, n3);
        if (n4 == 0) {
            object2 = TaskApiCall.builder();
            Feature feature = com.google.android.gms.appset.zze.zza;
            object3 = new Feature[]{feature};
            object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
            object3 = new zzm(this);
            object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setAutoResolveMissingFeatures(false).setMethodKey(27601).build();
            return this.doRead((TaskApiCall)object);
        }
        object2 = new Status(17);
        object = new ApiException((Status)object2);
        return Tasks.forException((Exception)object);
    }
}

