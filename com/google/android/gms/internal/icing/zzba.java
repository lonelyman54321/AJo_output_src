/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.internal.icing;

import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.search.SearchAuth;

final class zzba
extends BaseImplementation$ApiMethodImpl {
    private final String zza;
    private final String zzb;
    private final boolean zzc;

    public zzba(GoogleApiClient object, String string2) {
        boolean bl2;
        Api api = SearchAuth.API;
        super(api, (GoogleApiClient)object);
        this.zzc = bl2 = Log.isLoggable((String)"SearchAuth", (int)3);
        this.zza = string2;
        this.zzb = object = ((GoogleApiClient)object).getContext().getPackageName();
    }

    public static /* synthetic */ boolean zza(zzba zzba2) {
        return zzba2.zzc;
    }
}

