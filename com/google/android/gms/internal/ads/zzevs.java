/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzevt;
import com.google.android.gms.internal.ads.zzevu;
import java.util.ArrayList;

public final class zzevs
implements zzevu {
    public final /* synthetic */ zzevt zza;
    public final /* synthetic */ ArrayList zzb;

    public /* synthetic */ zzevs(zzevt zzevt2, ArrayList arrayList) {
        this.zza = zzevt2;
        this.zzb = arrayList;
    }

    public final void zzj(Object object) {
        zzevt zzevt2 = this.zza;
        ArrayList arrayList = this.zzb;
        object = (Bundle)object;
        zzevt2.zzd(arrayList, (Bundle)object);
    }
}

