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

final class zzfe
extends zzed$zzb {
    private final /* synthetic */ int zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ Object zzf;
    private final /* synthetic */ Object zzg;
    private final /* synthetic */ zzed zzh;

    public zzfe(zzed zzed2, boolean bl2, int n3, String string2, Object object, Object object2, Object object3) {
        this.zzc = 5;
        this.zzd = string2;
        this.zze = object;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzed2;
        super(zzed2, false);
    }

    public final void zza() {
        Object object;
        Object object2 = object = Preconditions.checkNotNull(zzed.zza(this.zzh));
        object2 = (zzdl)object;
        int n3 = this.zzc;
        String string2 = this.zzd;
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zze);
        IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(null);
        IObjectWrapper iObjectWrapper3 = ObjectWrapper.wrap(null);
        object2.logHealthData(n3, string2, iObjectWrapper, iObjectWrapper2, iObjectWrapper3);
    }
}

