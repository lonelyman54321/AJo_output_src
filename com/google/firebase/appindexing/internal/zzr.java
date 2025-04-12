/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.appindexing.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.internal.icing.zze;
import com.google.firebase.FirebaseExceptionMapper;

final class zzr
extends GoogleApi {
    public zzr(Context context) {
        Api api = zze.zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        FirebaseExceptionMapper firebaseExceptionMapper = new FirebaseExceptionMapper();
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)firebaseExceptionMapper);
    }
}

