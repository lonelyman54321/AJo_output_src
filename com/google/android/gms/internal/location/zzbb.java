/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.location.Location
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaq;
import com.google.android.gms.internal.location.zzar;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzat;
import com.google.android.gms.internal.location.zzau;
import com.google.android.gms.internal.location.zzav;
import com.google.android.gms.internal.location.zzaw;
import com.google.android.gms.internal.location.zzax;
import com.google.android.gms.internal.location.zzay;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzfd;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LastLocationRequest$Builder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzac;
import com.google.android.gms.location.zzad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbb
implements FusedLocationProviderApi {
    public static /* synthetic */ TaskCompletionSource zza(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task task2 = taskCompletionSource.getTask();
        zzbd zzbd2 = new zzbd(baseImplementation$ResultHolder);
        task2.addOnCompleteListener(zzbd2);
        return taskCompletionSource;
    }

    public final PendingResult flushLocations(GoogleApiClient googleApiClient) {
        zzaq zzaq2 = new zzaq(this, googleApiClient);
        return googleApiClient.execute(zzaq2);
    }

    public final Location getLastLocation(GoogleApiClient object) {
        Object object2;
        AtomicReference atomicReference;
        boolean bl2;
        int n3 = 1;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            atomicReference = null;
        }
        Preconditions.checkArgument(bl2, "GoogleApiClient parameter is required.");
        atomicReference = zzbi.zza;
        object = (zzdz)((GoogleApiClient)object).getClient((Api$AnyClientKey)((Object)atomicReference));
        atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(n3);
        Object object3 = new TaskCompletionSource();
        try {
            object2 = new LastLocationRequest$Builder();
            object2 = ((LastLocationRequest$Builder)object2).build();
        }
        catch (Exception exception) {}
        ((zzdz)object).zzq((LastLocationRequest)object2, (TaskCompletionSource)object3);
        object = ((TaskCompletionSource)object3).getTask();
        object3 = new zzbe(atomicReference, countDownLatch);
        ((Task)object).addOnCompleteListener((OnCompleteListener)object3);
        long l2 = 30;
        object = TimeUnit.SECONDS;
        boolean bl3 = zzfd.zza(countDownLatch, l2, (TimeUnit)((Object)object));
        if (bl3) {
            return (Location)atomicReference.get();
        }
        return null;
    }

    public final LocationAvailability getLocationAvailability(GoogleApiClient object) {
        zzad zzad2;
        AtomicReference atomicReference;
        boolean bl2;
        int n3 = 1;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            atomicReference = null;
        }
        Preconditions.checkArgument(bl2, "GoogleApiClient parameter is required.");
        atomicReference = zzbi.zza;
        object = (zzdz)((GoogleApiClient)object).getClient((Api$AnyClientKey)((Object)atomicReference));
        atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(n3);
        Object object2 = new TaskCompletionSource();
        try {
            zzad2 = zzac.zza();
        }
        catch (RemoteException remoteException) {}
        ((zzdz)object).zzp(zzad2, (TaskCompletionSource)object2);
        object = ((TaskCompletionSource)object2).getTask();
        object2 = new zzbc(atomicReference, countDownLatch);
        ((Task)object).addOnCompleteListener((OnCompleteListener)object2);
        long l2 = 30;
        object = TimeUnit.SECONDS;
        boolean bl3 = zzfd.zza(countDownLatch, l2, (TimeUnit)((Object)object));
        if (bl3) {
            return (LocationAvailability)atomicReference.get();
        }
        return null;
    }

    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        zzav zzav2 = new zzav(this, googleApiClient, pendingIntent);
        return googleApiClient.execute(zzav2);
    }

    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        zzaw zzaw2 = new zzaw(this, googleApiClient, locationCallback);
        return googleApiClient.execute(zzaw2);
    }

    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        zzau zzau2 = new zzau(this, googleApiClient, locationListener);
        return googleApiClient.execute(zzau2);
    }

    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        zzat zzat2 = new zzat(this, googleApiClient, pendingIntent, locationRequest);
        return googleApiClient.execute(zzat2);
    }

    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback object, Looper object2) {
        if (object2 == null) {
            object2 = Looper.myLooper();
            String string2 = "invalid null looper";
            Preconditions.checkNotNull(object2, string2);
        }
        object = ListenerHolders.createListenerHolder(object, object2, "LocationCallback");
        object2 = new zzas(this, googleApiClient, (ListenerHolder)object, locationRequest);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object2);
    }

    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener object) {
        Object object2 = Looper.myLooper();
        Preconditions.checkNotNull(object2, "invalid null looper");
        object = ListenerHolders.createListenerHolder(object, object2, "LocationListener");
        object2 = new zzar(this, googleApiClient, (ListenerHolder)object, locationRequest);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object2);
    }

    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener object, Looper object2) {
        if (object2 == null) {
            object2 = Looper.myLooper();
            String string2 = "invalid null looper";
            Preconditions.checkNotNull(object2, string2);
        }
        object = ListenerHolders.createListenerHolder(object, object2, "LocationListener");
        object2 = new zzar(this, googleApiClient, (ListenerHolder)object, locationRequest);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object2);
    }

    public final PendingResult setMockLocation(GoogleApiClient googleApiClient, Location location) {
        zzay zzay2 = new zzay(this, googleApiClient, location);
        return googleApiClient.execute(zzay2);
    }

    public final PendingResult setMockMode(GoogleApiClient googleApiClient, boolean bl2) {
        zzax zzax2 = new zzax(this, googleApiClient, bl2);
        return googleApiClient.execute(zzax2);
    }
}

