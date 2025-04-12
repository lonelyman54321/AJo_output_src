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
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzag;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzap;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zza;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;

public final class zzaj
extends GoogleApi
implements ActivityRecognitionClient {
    static final Api$ClientKey zza;
    public static final Api zzb;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzag zzag2 = new zzag();
        zzb = api = new Api("ActivityRecognition.API", zzag2, api$ClientKey);
    }

    public zzaj(Activity activity) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzaj(Context context) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final Task removeActivityTransitionUpdates(PendingIntent object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzam zzam2 = new zzam((PendingIntent)object);
        object = taskApiCall$Builder.run(zzam2).setMethodKey(2406).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task removeActivityUpdates(PendingIntent object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzak zzak2 = new zzak((PendingIntent)object);
        object = taskApiCall$Builder.run(zzak2).setMethodKey(2402).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task removeSleepSegmentUpdates(PendingIntent object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzan zzan2 = new zzan((PendingIntent)object);
        object = taskApiCall$Builder.run(zzan2).setMethodKey(2411).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task requestActivityTransitionUpdates(ActivityTransitionRequest object, PendingIntent pendingIntent) {
        Object object2 = this.getContextAttributionTag();
        ((ActivityTransitionRequest)object).zza((String)object2);
        object2 = TaskApiCall.builder();
        zzal zzal2 = new zzal((ActivityTransitionRequest)object, pendingIntent);
        object = ((TaskApiCall$Builder)object2).run(zzal2).setMethodKey(2405).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task requestActivityUpdates(long l2, PendingIntent pendingIntent) {
        Object object = new zza();
        ((zza)object).zza(l2);
        Object object2 = ((zza)object).zzb();
        Object object3 = this.getContextAttributionTag();
        ((zzb)object2).zza((String)object3);
        object3 = TaskApiCall.builder();
        object = new zzap((zzb)object2, pendingIntent);
        object2 = ((TaskApiCall$Builder)object3).run((RemoteCall)object).setMethodKey(2401).build();
        return this.doWrite((TaskApiCall)object2);
    }

    public final Task requestSleepSegmentUpdates(PendingIntent object, SleepSegmentRequest featureArray) {
        Preconditions.checkNotNull(object, "PendingIntent must be specified.");
        Object object2 = TaskApiCall.builder();
        zzao zzao2 = new zzao(this, (PendingIntent)object, (SleepSegmentRequest)featureArray);
        object = ((TaskApiCall$Builder)object2).run(zzao2);
        object2 = zzo.zzb;
        featureArray = new Feature[]{object2};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).setMethodKey(2410).build();
        return this.doRead((TaskApiCall)object);
    }
}

