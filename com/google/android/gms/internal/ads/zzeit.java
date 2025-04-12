/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzeiw;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeit
implements zzgfa {
    public final /* synthetic */ zzeiw zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzfgt zzc;

    public /* synthetic */ zzeit(zzeiw zzeiw2, View view, zzfgt zzfgt2) {
        this.zza = zzeiw2;
        this.zzb = view;
        this.zzc = zzfgt2;
    }

    public final ListenableFuture zza(Object object) {
        zzeiw zzeiw2 = this.zza;
        View view = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        return zzeiw2.zzc(view, zzfgt2, object);
    }
}

