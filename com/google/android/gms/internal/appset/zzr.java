/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.appset.zzl;
import com.google.android.gms.internal.appset.zzp;
import com.google.android.gms.internal.appset.zzq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzr
implements AppSetIdClient {
    private final AppSetIdClient zza;
    private final AppSetIdClient zzb;

    public zzr(Context object) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        zzp zzp2 = new zzp((Context)object, googleApiAvailabilityLight);
        this.zza = zzp2;
        object = zzl.zzc(object);
        this.zzb = object;
    }

    public static /* synthetic */ Task zza(zzr object, Task task2) {
        Exception exception;
        int n3;
        int n4 = task2.isSuccessful();
        if (n4 == 0 && (n4 = task2.isCanceled()) == 0 && (n3 = (exception = task2.getException()) instanceof ApiException) != 0) {
            n4 = ((ApiException)(exception = (ApiException)exception)).getStatusCode();
            if (n4 != (n3 = 43001) && n4 != (n3 = 43002) && n4 != (n3 = 43003) && n4 != (n3 = 17)) {
                int n7 = 43000;
                if (n4 == n7) {
                    object = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    task2 = Tasks.forException((Exception)object);
                } else {
                    n7 = 15;
                    if (n4 == n7) {
                        object = new Exception("The operation to get app set ID timed out. Please try again later.");
                        return Tasks.forException((Exception)object);
                    }
                }
            } else {
                object = ((zzr)object).zzb;
                task2 = object.getAppSetIdInfo();
            }
        }
        return task2;
    }

    public final Task getAppSetIdInfo() {
        Task task2 = this.zza.getAppSetIdInfo();
        zzq zzq2 = new zzq(this);
        return task2.continueWithTask(zzq2);
    }
}

