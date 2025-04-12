/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class GooglePlayServicesAvailabilityException
extends UserRecoverableAuthException {
    private final int zza;

    public GooglePlayServicesAvailabilityException(int n3, String string2, Intent intent) {
        super(string2, intent);
        this.zza = n3;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}

