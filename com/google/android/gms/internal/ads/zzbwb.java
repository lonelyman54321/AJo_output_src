/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;

final class zzbwb
extends zzbvu {
    final /* synthetic */ List zza;

    public zzbwb(zzbwd zzbwd2, List list) {
        this.zza = list;
    }

    public final void zze(String string2) {
        string2 = String.valueOf(string2);
        zzm.zzg("Error recording click: ".concat(string2));
    }

    public final void zzf(List object) {
        object = this.zza.toString();
        zzm.zzi("Recorded click: ".concat((String)object));
    }
}

