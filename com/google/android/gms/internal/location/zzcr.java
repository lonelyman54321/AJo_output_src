/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.internal.location.zzcn;
import com.google.android.gms.internal.location.zzco;
import com.google.android.gms.internal.location.zzcp;
import com.google.android.gms.internal.location.zzcs;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest$Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final class zzcr
implements GeofencingApi {
    public static /* synthetic */ TaskCompletionSource zza(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task task2 = taskCompletionSource.getTask();
        zzcs zzcs2 = new zzcs(baseImplementation$ResultHolder);
        task2.addOnCompleteListener(zzcs2);
        return taskCompletionSource;
    }

    public final PendingResult addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        zzcn zzcn2 = new zzcn(this, googleApiClient, geofencingRequest, pendingIntent);
        return googleApiClient.execute(zzcn2);
    }

    public final PendingResult addGeofences(GoogleApiClient googleApiClient, List object, PendingIntent pendingIntent) {
        Object object2 = new GeofencingRequest$Builder();
        ((GeofencingRequest$Builder)object2).addGeofences((List)object);
        ((GeofencingRequest$Builder)object2).setInitialTrigger(5);
        object = ((GeofencingRequest$Builder)object2).build();
        object2 = new zzcn(this, googleApiClient, (GeofencingRequest)object, pendingIntent);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object2);
    }

    public final PendingResult removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        zzco zzco2 = new zzco(this, googleApiClient, pendingIntent);
        return googleApiClient.execute(zzco2);
    }

    public final PendingResult removeGeofences(GoogleApiClient googleApiClient, List list) {
        zzcp zzcp2 = new zzcp(this, googleApiClient, list);
        return googleApiClient.execute(zzcp2);
    }
}

