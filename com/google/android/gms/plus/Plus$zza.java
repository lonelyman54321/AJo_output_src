/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.plus.Plus;

public abstract class Plus$zza
extends BaseImplementation$ApiMethodImpl {
    public Plus$zza(GoogleApiClient googleApiClient) {
        Api$ClientKey api$ClientKey = Plus.CLIENT_KEY;
        super(api$ClientKey, googleApiClient);
    }
}

