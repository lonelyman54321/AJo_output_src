/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;

final class zzbwa
extends zzbvu {
    final /* synthetic */ List zza;

    public zzbwa(zzbwd zzbwd2, List list) {
        this.zza = list;
    }

    public final void zze(String string2) {
        string2 = String.valueOf(string2);
        zzm.zzg("Error recording impression urls: ".concat(string2));
    }

    public final void zzf(List object) {
        object = this.zza.toString();
        zzm.zzi("Recorded impression urls: ".concat((String)object));
    }
}

