/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.base.zaa;

public final class zaby
extends zaa
implements IStatusCallback {
    public zaby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final void onResult(Status status) {
        throw null;
    }
}

