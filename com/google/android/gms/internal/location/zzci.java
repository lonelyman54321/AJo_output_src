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
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzcj;
import com.google.android.gms.internal.location.zzck;
import com.google.android.gms.internal.location.zzcl;
import com.google.android.gms.internal.location.zzcm;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedOrientationProviderClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public final class zzci
extends GoogleApi
implements FusedOrientationProviderClient {
    public static final /* synthetic */ int zza;

    public zzci(Activity activity) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzci(Context context) {
        Api api = zzbi.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task removeOrientationUpdates(DeviceOrientationListener object) {
        object = ListenerHolders.createListenerKey(object, "DeviceOrientationListener");
        object = this.doUnregisterEventListener((ListenerHolder$ListenerKey)object, 2440);
        zzcm zzcm2 = zzcm.zza;
        zzck zzck2 = zzck.zza;
        return ((Task)object).continueWith(zzcm2, zzck2);
    }

    public final Task requestOrientationUpdates(DeviceOrientationRequest object, Executor object2, DeviceOrientationListener object3) {
        object2 = ListenerHolders.createListenerHolder(object3, (Executor)object2, "DeviceOrientationListener");
        object3 = new zzcl((ListenerHolder)object2, (DeviceOrientationRequest)object);
        object = new zzcj((ListenerHolder)object2);
        object = RegistrationMethods.builder().register((RemoteCall)object3).unregister((RemoteCall)object).withHolder((ListenerHolder)object2).setMethodKey(2434).build();
        return this.doRegisterEventListener((RegistrationMethods)object);
    }
}

