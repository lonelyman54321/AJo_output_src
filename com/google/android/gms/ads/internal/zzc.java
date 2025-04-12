/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;

public abstract class zzc
extends BaseGmsClient {
    public zzc(Context context, Looper looper, int n3, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener, String string2) {
        super(context, looper, n3, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
    }
}

