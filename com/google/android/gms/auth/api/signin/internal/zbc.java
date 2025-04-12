/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;

public final class zbc
extends AsyncTaskLoader
implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set zbb;

    public zbc(Context object, Set set) {
        super((Context)object);
        super(0);
        this.zba = object;
        this.zbb = set;
    }

    public final void onComplete() {
        this.zba.release();
    }

    public final void onStartLoading() {
        this.zba.drainPermits();
        this.forceLoad();
    }
}

