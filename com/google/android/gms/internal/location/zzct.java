/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 */
package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzcu;
import com.google.android.gms.internal.location.zzcv;
import com.google.android.gms.internal.location.zzcw;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class zzct
extends GoogleApi
implements GeofencingClient {
    public static final /* synthetic */ int zza;

    public zzct(Activity activity) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzct(Context context) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final Task addGeofences(GeofencingRequest object, PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzcw zzcw2 = new zzcw((GeofencingRequest)object, pendingIntent);
        object = taskApiCall$Builder.run(zzcw2).setMethodKey(2424).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task removeGeofences(PendingIntent object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzcu zzcu2 = new zzcu((PendingIntent)object);
        object = taskApiCall$Builder.run(zzcu2).setMethodKey(2425).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task removeGeofences(List object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzcv zzcv2 = new zzcv((List)object);
        object = taskApiCall$Builder.run(zzcv2).setMethodKey(2425).build();
        return this.doWrite((TaskApiCall)object);
    }
}

