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
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag
extends zac {
    private final TaskApiCall zaa;
    private final TaskCompletionSource zab;
    private final StatusExceptionMapper zad;

    public zag(int n3, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(n3);
        this.zab = taskCompletionSource;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        int n4 = 2;
        if (n3 == n4 && (n3 = (int)(taskApiCall.shouldAutoResolveMissingFeatures() ? 1 : 0)) != 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw illegalArgumentException;
        }
    }

    public final boolean zaa(zabq zabq2) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    public final Feature[] zab(zabq zabq2) {
        return this.zaa.zab();
    }

    public final void zad(Status object) {
        StatusExceptionMapper statusExceptionMapper = this.zad;
        TaskCompletionSource taskCompletionSource = this.zab;
        object = statusExceptionMapper.getException((Status)object);
        taskCompletionSource.trySetException((Exception)object);
    }

    public final void zae(Exception exception) {
        this.zab.trySetException(exception);
    }

    public final void zaf(zabq object) {
        DeadObjectException deadObjectException2;
        block9: {
            RemoteException remoteException2;
            block8: {
                TaskApiCall taskApiCall = this.zaa;
                object = ((zabq)object).zaf();
                TaskCompletionSource taskCompletionSource = this.zab;
                try {
                    taskApiCall.doExecute((Api$AnyClient)object, taskCompletionSource);
                    return;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (RemoteException remoteException2) {
                    break block8;
                }
                catch (DeadObjectException deadObjectException2) {
                    break block9;
                }
                this.zab.trySetException(runtimeException);
                return;
            }
            Status status = zai.zah(remoteException2);
            this.zad(status);
            return;
        }
        throw deadObjectException2;
    }

    public final void zag(zaad zaad2, boolean bl2) {
        TaskCompletionSource taskCompletionSource = this.zab;
        zaad2.zad(taskCompletionSource, bl2);
    }
}

