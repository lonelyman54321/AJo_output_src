/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzcy;
import com.google.android.gms.internal.location.zzcz;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.LocationSettingsRequest;

final class zzcx
extends zzcy {
    final /* synthetic */ LocationSettingsRequest zza;

    public zzcx(zzcz zzcz2, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String string2) {
        this.zza = locationSettingsRequest;
        super(googleApiClient);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient object) {
        zzdf zzdf2;
        boolean bl2;
        LocationSettingsRequest locationSettingsRequest = this.zza;
        if (locationSettingsRequest != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzdf2 = null;
        }
        object = (zzdz)object;
        Preconditions.checkArgument(bl2, "locationSettingsRequest can't be null");
        object = (zzv)((BaseGmsClient)object).getService();
        zzdf2 = new zzdf(this);
        object.zzD(locationSettingsRequest, zzdf2, null);
    }
}

