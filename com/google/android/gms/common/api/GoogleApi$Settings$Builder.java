/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.Preconditions;

public class GoogleApi$Settings$Builder {
    private StatusExceptionMapper zaa;
    private Looper zab;

    public GoogleApi$Settings build() {
        Object object = this.zaa;
        if (object == null) {
            object = new ApiExceptionMapper();
            this.zaa = object;
        }
        if ((object = this.zab) == null) {
            object = Looper.getMainLooper();
            this.zab = object;
        }
        StatusExceptionMapper statusExceptionMapper = this.zaa;
        Looper looper = this.zab;
        object = new GoogleApi$Settings(statusExceptionMapper, null, looper, null);
        return object;
    }

    public GoogleApi$Settings$Builder setLooper(Looper looper) {
        Preconditions.checkNotNull(looper, "Looper must not be null.");
        this.zab = looper;
        return this;
    }

    public GoogleApi$Settings$Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
        Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
        this.zaa = statusExceptionMapper;
        return this;
    }
}

