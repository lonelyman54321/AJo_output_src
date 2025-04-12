/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzaj
extends Exception {
    public final ConnectionResult zza;

    public zzaj(ConnectionResult connectionResult) {
        Preconditions.checkArgument(connectionResult.hasResolution(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.zza = connectionResult;
    }
}

