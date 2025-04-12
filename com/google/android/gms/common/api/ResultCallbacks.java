/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public abstract class ResultCallbacks
implements ResultCallback {
    public abstract void onFailure(Status var1);

    public final void onResult(Result object) {
        Object object2 = object.getStatus();
        boolean bl2 = ((Status)object2).isSuccess();
        if (bl2) {
            this.onSuccess((Result)object);
            return;
        }
        this.onFailure((Status)object2);
        boolean bl3 = object instanceof Releasable;
        if (bl3) {
            object2 = object;
            object2 = (Releasable)object;
            try {
                object2.release();
                return;
            }
            catch (RuntimeException runtimeException) {
                object = String.valueOf(object);
                object2 = "Unable to release ";
                ((String)object2).concat((String)object);
            }
        }
    }

    public abstract void onSuccess(Result var1);
}

