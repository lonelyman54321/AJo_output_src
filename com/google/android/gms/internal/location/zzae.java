/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.location.ActivityRecognition;

abstract class zzae
extends BaseImplementation$ApiMethodImpl {
    public zzae(GoogleApiClient googleApiClient) {
        Api api = ActivityRecognition.API;
        super(api, googleApiClient);
    }
}

