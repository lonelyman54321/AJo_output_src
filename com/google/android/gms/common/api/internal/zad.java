/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad
extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int n3, TaskCompletionSource taskCompletionSource) {
        super(n3);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(zabq var1);

    public final void zad(Status status) {
        ApiException apiException = new ApiException(status);
        this.zaa.trySetException(apiException);
    }

    public final void zae(Exception exception) {
        this.zaa.trySetException(exception);
    }

    public final void zaf(zabq object) {
        try {
            this.zac((zabq)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            this.zaa.trySetException(runtimeException);
            return;
        }
        catch (RemoteException remoteException) {
            object = zai.zah(remoteException);
            this.zad((Status)object);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            Status status = zai.zah((RemoteException)((Object)deadObjectException));
            this.zad(status);
            throw deadObjectException;
        }
    }

    public void zag(zaad zaad2, boolean bl2) {
    }
}

