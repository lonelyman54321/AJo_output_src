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
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.location.ActivityRecognitionApi;

public final class zzaf
implements ActivityRecognitionApi {
    public final PendingResult removeActivityUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        zzad zzad2 = new zzad(this, googleApiClient, pendingIntent);
        return googleApiClient.execute(zzad2);
    }

    public final PendingResult requestActivityUpdates(GoogleApiClient googleApiClient, long l2, PendingIntent pendingIntent) {
        zzac zzac2 = new zzac(this, googleApiClient, l2, pendingIntent);
        return googleApiClient.execute(zzac2);
    }
}

