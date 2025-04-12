/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.internal.icing;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzae
extends GmsClient {
    public zzae(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 19, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final int getMinApkVersion() {
        return 12600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

