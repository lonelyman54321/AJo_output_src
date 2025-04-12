/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zacc
extends zap {
    private TaskCompletionSource zad;

    private zacc(LifecycleFragment object) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        super((LifecycleFragment)object, googleApiAvailability);
        this.zad = object = new TaskCompletionSource();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(Activity object) {
        Class<zacc> clazz;
        zacc zacc2 = (zacc)(object = LifecycleCallback.getFragment((Activity)object)).getCallbackOrNull("GmsAvailabilityHelper", clazz = zacc.class);
        if (zacc2 != null) {
            object = zacc2.zad.getTask();
            boolean bl2 = ((Task)object).isComplete();
            if (bl2) {
                zacc2.zad = object = new TaskCompletionSource();
            }
            return zacc2;
        }
        zacc2 = new zacc((LifecycleFragment)object);
        return zacc2;
    }

    public final void onDestroy() {
        super.onDestroy();
        TaskCompletionSource taskCompletionSource = this.zad;
        CancellationException cancellationException = new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        taskCompletionSource.trySetException(cancellationException);
    }

    public final void zab(ConnectionResult connectionResult, int n3) {
        String string2 = connectionResult.getErrorMessage();
        if (string2 == null) {
            string2 = "Error connecting to Google Play services";
        }
        TaskCompletionSource taskCompletionSource = this.zad;
        int n4 = connectionResult.getErrorCode();
        Status status = new Status(connectionResult, string2, n4);
        ApiException apiException = new ApiException(status);
        taskCompletionSource.setException(apiException);
    }

    public final void zac() {
        Object object = this.mLifecycleFragment.getLifecycleActivity();
        if (object == null) {
            object = this.zad;
            Status status = new Status(8);
            ApiException apiException = new ApiException(status);
            ((TaskCompletionSource)object).trySetException(apiException);
            return;
        }
        int n3 = this.zac.isGooglePlayServicesAvailable((Context)object);
        Object var2_3 = null;
        if (n3 == 0) {
            this.zad.trySetResult(null);
            return;
        }
        Object object2 = this.zad.getTask();
        boolean bl2 = ((Task)object2).isComplete();
        if (!bl2) {
            object2 = new ConnectionResult(n3, null);
            n3 = 0;
            object = null;
            this.zah((ConnectionResult)object2, 0);
        }
    }

    public final Task zad() {
        return this.zad.getTask();
    }
}

