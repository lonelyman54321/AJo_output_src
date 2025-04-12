/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzef
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzed zzg;

    public zzef(zzed zzed2, String string2, String string3, Object object, boolean bl2) {
        this.zzc = string2;
        this.zzd = string3;
        this.zze = object;
        this.zzf = bl2;
        this.zzg = zzed2;
        super(zzed2);
    }

    public final void zza() {
        Object object;
        Object object2 = object = Preconditions.checkNotNull(zzed.zza(this.zzg));
        object2 = (zzdl)object;
        String string2 = this.zzc;
        String string3 = this.zzd;
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zze);
        boolean bl2 = this.zzf;
        long l2 = this.zza;
        object2.setUserProperty(string2, string3, iObjectWrapper, bl2, l2);
    }
}

