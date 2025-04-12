/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzcbc;

final class zzbvw
extends zzcbc {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    public zzbvw(zzbvx zzbvx2, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    public final void zzb(String string2) {
        this.zza.onFailure(string2);
    }

    public final void zzc(String string2, String string3, Bundle bundle) {
        zzem zzem2 = new zzem(string2, bundle, string3);
        QueryInfo queryInfo = new QueryInfo(zzem2);
        this.zza.onSuccess(queryInfo);
    }
}

