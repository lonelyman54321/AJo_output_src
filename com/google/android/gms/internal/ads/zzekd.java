/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONArray;

public final class zzekd
implements zzgfa {
    public final /* synthetic */ zzekf zza;
    public final /* synthetic */ zzfhf zzb;
    public final /* synthetic */ zzfgt zzc;

    public /* synthetic */ zzekd(zzekf zzekf2, zzfhf zzfhf2, zzfgt zzfgt2) {
        this.zza = zzekf2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
    }

    public final ListenableFuture zza(Object object) {
        zzekf zzekf2 = this.zza;
        zzfhf zzfhf2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        object = (JSONArray)object;
        return zzekf2.zzf(zzfhf2, zzfgt2, (JSONArray)object);
    }
}

