/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zam;
import com.google.android.gms.common.internal.service.zan;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;

public final class zao
extends GoogleApi
implements TelemetryLoggingClient {
    public static final /* synthetic */ int zab;
    private static final Api$ClientKey zac;
    private static final Api$AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zac = api$ClientKey = new Api$ClientKey();
        zan zan2 = new zan();
        zad = zan2;
        zae = api = new Api("ClientTelemetry.API", zan2, api$ClientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        Api api = zae;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)telemetryLoggingOptions, googleApi$Settings);
    }

    public final Task log(TelemetryData object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = zaf.zaa;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder.setFeatures((Feature)object2);
        taskApiCall$Builder.setAutoResolveMissingFeatures(false);
        object2 = new zam((TelemetryData)object);
        taskApiCall$Builder.run((RemoteCall)object2);
        object = taskApiCall$Builder.build();
        return this.doBestEffortWrite((TaskApiCall)object);
    }
}

