/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.icing.zzbi;
import com.google.firebase.FirebaseExceptionMapper;
import com.google.firebase.appindexing.internal.zzf;

final class zzj
extends GoogleApi {
    public zzj(Context context) {
        Api api = zzf.zze;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        Looper looper = Looper.getMainLooper();
        FirebaseExceptionMapper firebaseExceptionMapper = new FirebaseExceptionMapper();
        super(context, api, api$ApiOptions$NoOptions, looper, firebaseExceptionMapper);
        zzbi.zza(context);
    }
}

