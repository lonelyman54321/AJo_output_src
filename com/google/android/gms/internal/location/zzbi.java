/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.location.Location
 *  android.os.Looper
 */
package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RegistrationMethods$Builder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzbg;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.internal.location.zzbj;
import com.google.android.gms.internal.location.zzbk;
import com.google.android.gms.internal.location.zzbl;
import com.google.android.gms.internal.location.zzbm;
import com.google.android.gms.internal.location.zzbn;
import com.google.android.gms.internal.location.zzbo;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.internal.location.zzbq;
import com.google.android.gms.internal.location.zzbr;
import com.google.android.gms.internal.location.zzbs;
import com.google.android.gms.internal.location.zzbt;
import com.google.android.gms.internal.location.zzbu;
import com.google.android.gms.internal.location.zzbv;
import com.google.android.gms.internal.location.zzbw;
import com.google.android.gms.internal.location.zzbx;
import com.google.android.gms.internal.location.zzby;
import com.google.android.gms.internal.location.zzbz;
import com.google.android.gms.internal.location.zzca;
import com.google.android.gms.internal.location.zzcb;
import com.google.android.gms.internal.location.zzcc;
import com.google.android.gms.internal.location.zzcd;
import com.google.android.gms.internal.location.zzce;
import com.google.android.gms.internal.location.zzcf;
import com.google.android.gms.internal.location.zzcg;
import com.google.android.gms.internal.location.zzch;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.CurrentLocationRequest$Builder;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

public final class zzbi
extends GoogleApi
implements FusedLocationProviderClient {
    static final Api$ClientKey zza;
    public static final Api zzb;
    private static final Object zzc;
    private static Object zzd;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zza = object;
        zzbf zzbf2 = new zzbf();
        zzb = api = new Api("LocationServices.API", zzbf2, (Api$ClientKey)object);
        zzc = object = new Object();
    }

    public zzbi(Activity activity) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzbi(Context context) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    private final Task zza(LocationRequest object, ListenerHolder listenerHolder) {
        Object object2 = zzcd.zza;
        zzbh zzbh2 = new zzbh(this, listenerHolder, (zzbg)object2);
        object2 = new zzbt(zzbh2, (LocationRequest)object);
        object = RegistrationMethods.builder().register((RemoteCall)object2).unregister(zzbh2).withHolder(listenerHolder).setMethodKey(2435).build();
        return this.doRegisterEventListener((RegistrationMethods)object);
    }

    private final Task zzb(LocationRequest object, ListenerHolder listenerHolder) {
        Object object2 = zzbz.zza;
        zzbh zzbh2 = new zzbh(this, listenerHolder, (zzbg)object2);
        object2 = new zzbu(zzbh2, (LocationRequest)object);
        object = RegistrationMethods.builder().register((RemoteCall)object2).unregister(zzbh2).withHolder(listenerHolder).setMethodKey(2436).build();
        return this.doRegisterEventListener((RegistrationMethods)object);
    }

    private final Task zzc(DeviceOrientationRequest object, ListenerHolder listenerHolder) {
        zzbm zzbm2 = new zzbm(listenerHolder, (DeviceOrientationRequest)object);
        object = new zzbn(listenerHolder);
        object = RegistrationMethods.builder().register(zzbm2).unregister((RemoteCall)object).withHolder(listenerHolder).setMethodKey(2434).build();
        return this.doRegisterEventListener((RegistrationMethods)object);
    }

    public final Task flushLocations() {
        Object object = TaskApiCall.builder();
        zzca zzca2 = zzca.zza;
        object = ((TaskApiCall$Builder)object).run(zzca2).setMethodKey(2422).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task getCurrentLocation(int n3, CancellationToken object) {
        Object object2;
        int n4;
        Object object3 = new CurrentLocationRequest$Builder();
        ((CurrentLocationRequest$Builder)object3).setPriority(n3);
        Object object4 = ((CurrentLocationRequest$Builder)object3).build();
        if (object != null) {
            n4 = ((CancellationToken)object).isCancellationRequested() ^ 1;
            object2 = "cancellationToken may not be already canceled";
            Preconditions.checkArgument(n4 != 0, object2);
        }
        object3 = TaskApiCall.builder();
        object2 = new zzbp((CurrentLocationRequest)object4, (CancellationToken)object);
        object4 = ((TaskApiCall$Builder)object3).run((RemoteCall)object2);
        n4 = 2415;
        object4 = ((TaskApiCall$Builder)object4).setMethodKey(n4).build();
        object4 = this.doRead((TaskApiCall)object4);
        if (object != null) {
            object3 = new TaskCompletionSource((CancellationToken)object);
            object = new zzbq((TaskCompletionSource)object3);
            ((Task)object4).continueWith((Continuation)object);
            object4 = ((TaskCompletionSource)object3).getTask();
        }
        return object4;
    }

    public final Task getCurrentLocation(CurrentLocationRequest object, CancellationToken object2) {
        Object object3;
        int n3;
        if (object2 != null) {
            n3 = ((CancellationToken)object2).isCancellationRequested() ^ 1;
            object3 = "cancellationToken may not be already canceled";
            Preconditions.checkArgument(n3 != 0, object3);
        }
        Object object4 = TaskApiCall.builder();
        object3 = new zzbp((CurrentLocationRequest)object, (CancellationToken)object2);
        object = ((TaskApiCall$Builder)object4).run((RemoteCall)object3);
        n3 = 2415;
        object = ((TaskApiCall$Builder)object).setMethodKey(n3).build();
        object = this.doRead((TaskApiCall)object);
        if (object2 != null) {
            object4 = new TaskCompletionSource((CancellationToken)object2);
            object2 = new zzbq((TaskCompletionSource)object4);
            ((Task)object).continueWith((Continuation)object2);
            object = ((TaskCompletionSource)object4).getTask();
        }
        return object;
    }

    public final Task getLastLocation() {
        Object object = TaskApiCall.builder();
        zzby zzby2 = zzby.zza;
        object = ((TaskApiCall$Builder)object).run(zzby2).setMethodKey(2414).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task getLastLocation(LastLocationRequest object) {
        Feature[] featureArray = TaskApiCall.builder();
        Object object2 = new zzbj((LastLocationRequest)object);
        object = featureArray.run((RemoteCall)object2).setMethodKey(2414);
        object2 = zzo.zzf;
        featureArray = new Feature[]{object2};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task getLocationAvailability() {
        Object object = TaskApiCall.builder();
        zzbr zzbr2 = zzbr.zza;
        object = ((TaskApiCall$Builder)object).run(zzbr2).setMethodKey(2416).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task removeDeviceOrientationUpdates(DeviceOrientationListener object) {
        object = ListenerHolders.createListenerKey(object, "DeviceOrientationListener");
        object = this.doUnregisterEventListener((ListenerHolder$ListenerKey)object, 2440);
        zzcg zzcg2 = zzcg.zza;
        zzbo zzbo2 = zzbo.zza;
        return ((Task)object).continueWith(zzcg2, zzbo2);
    }

    public final Task removeLocationUpdates(PendingIntent object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzbx zzbx2 = new zzbx((PendingIntent)object);
        object = taskApiCall$Builder.run(zzbx2).setMethodKey(2418).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task removeLocationUpdates(LocationCallback object) {
        object = ListenerHolders.createListenerKey(object, "LocationCallback");
        object = this.doUnregisterEventListener((ListenerHolder$ListenerKey)object, 2418);
        zzce zzce2 = zzce.zza;
        zzbw zzbw2 = zzbw.zza;
        return ((Task)object).continueWith(zzce2, zzbw2);
    }

    public final Task removeLocationUpdates(LocationListener object) {
        object = ListenerHolders.createListenerKey(object, "LocationListener");
        object = this.doUnregisterEventListener((ListenerHolder$ListenerKey)object, 2418);
        zzch zzch2 = zzch.zza;
        zzbv zzbv2 = zzbv.zza;
        return ((Task)object).continueWith(zzch2, zzbv2);
    }

    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, DeviceOrientationListener object, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            String string2 = "invalid null looper";
            Preconditions.checkNotNull(looper, string2);
        }
        object = ListenerHolders.createListenerHolder(object, looper, "DeviceOrientationListener");
        return this.zzc(deviceOrientationRequest, (ListenerHolder)object);
    }

    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor object, DeviceOrientationListener deviceOrientationListener) {
        object = ListenerHolders.createListenerHolder((Object)deviceOrientationListener, (Executor)object, "DeviceOrientationListener");
        return this.zzc(deviceOrientationRequest, (ListenerHolder)object);
    }

    public final Task requestLocationUpdates(LocationRequest object, PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzbs zzbs2 = new zzbs(pendingIntent, (LocationRequest)object);
        object = taskApiCall$Builder.run(zzbs2).setMethodKey(2417).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback object, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            String string2 = "invalid null looper";
            Preconditions.checkNotNull(looper, string2);
        }
        object = ListenerHolders.createListenerHolder(object, looper, "LocationCallback");
        return this.zzb(locationRequest, (ListenerHolder)object);
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationListener object, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            String string2 = "invalid null looper";
            Preconditions.checkNotNull(looper, string2);
        }
        object = ListenerHolders.createListenerHolder(object, looper, "LocationListener");
        return this.zza(locationRequest, (ListenerHolder)object);
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor object, LocationCallback locationCallback) {
        object = ListenerHolders.createListenerHolder((Object)locationCallback, (Executor)object, "LocationCallback");
        return this.zzb(locationRequest, (ListenerHolder)object);
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor object, LocationListener locationListener) {
        object = ListenerHolders.createListenerHolder((Object)locationListener, (Executor)object, "LocationListener");
        return this.zza(locationRequest, (ListenerHolder)object);
    }

    public final Task setMockLocation(Location object) {
        TaskApiCall$Builder taskApiCall$Builder;
        boolean bl2;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            taskApiCall$Builder = null;
        }
        Preconditions.checkArgument(bl2);
        taskApiCall$Builder = TaskApiCall.builder();
        zzbl zzbl2 = new zzbl((Location)object);
        object = taskApiCall$Builder.run(zzbl2).setMethodKey(2421).build();
        return this.doWrite((TaskApiCall)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Task setMockMode(boolean bl2) {
        Object object = zzc;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                int n3;
                Object object2;
                block4: {
                    object2 = null;
                    n3 = 2420;
                    if (!bl2) break block4;
                    try {
                        Object object3 = zzd;
                        if (object3 != null) return Tasks.forResult(null);
                        zzd = object3 = new Object();
                        object2 = RegistrationMethods.builder();
                        RemoteCall remoteCall = zzcb.zza;
                        object2 = ((RegistrationMethods$Builder)object2).register(remoteCall);
                        remoteCall = zzcc.zza;
                        object2 = ((RegistrationMethods$Builder)object2).unregister(remoteCall);
                        remoteCall = Looper.getMainLooper();
                        String string2 = "Object";
                        object3 = ListenerHolders.createListenerHolder(object3, (Looper)remoteCall, string2);
                        object3 = ((RegistrationMethods$Builder)object2).withHolder((ListenerHolder)object3);
                        object3 = ((RegistrationMethods$Builder)object3).setMethodKey(n3);
                        object3 = ((RegistrationMethods$Builder)object3).build();
                        return this.doRegisterEventListener((RegistrationMethods)object3);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                Object object4 = zzd;
                if (object4 == null) return Tasks.forResult(null);
                zzd = null;
                object2 = "Object";
                object4 = ListenerHolders.createListenerKey(object4, (String)object2);
                object4 = this.doUnregisterEventListener((ListenerHolder$ListenerKey)object4, n3);
                object2 = zzcf.zza;
                zzbk zzbk2 = zzbk.zza;
                return ((Task)object4).continueWith((Executor)object2, zzbk2);
            }
            throw throwable2;
        }
    }
}

