/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.IntentSender$SendIntentException
 */
package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public abstract class ResolvingResultCallbacks
extends ResultCallbacks {
    private final Activity zza;
    private final int zzb;

    public ResolvingResultCallbacks(Activity activity, int n3) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
        this.zzb = n3;
    }

    public final void onFailure(Status status) {
        boolean bl2 = status.hasResolution();
        if (bl2) {
            Activity activity;
            try {
                activity = this.zza;
            }
            catch (IntentSender.SendIntentException sendIntentException) {
                status = new Status(8);
                this.onUnresolvableFailure(status);
                return;
            }
            int n3 = this.zzb;
            status.startResolutionForResult(activity, n3);
            return;
        }
        this.onUnresolvableFailure(status);
    }

    public abstract void onSuccess(Result var1);

    public abstract void onUnresolvableFailure(Status var1);
}

