/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzde;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdb
implements RemoteCall {
    private final /* synthetic */ LocationSettingsRequest zza;

    public /* synthetic */ zzdb(LocationSettingsRequest locationSettingsRequest) {
        this.zza = locationSettingsRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        zzde zzde2;
        boolean bl2;
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        LocationSettingsRequest locationSettingsRequest = this.zza;
        if (locationSettingsRequest != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzde2 = null;
        }
        Preconditions.checkArgument(bl2, "locationSettingsRequest can't be null");
        object = (zzv)((BaseGmsClient)object).getService();
        zzde2 = new zzde((TaskCompletionSource)object2);
        object.zzD(locationSettingsRequest, zzde2, null);
    }
}

