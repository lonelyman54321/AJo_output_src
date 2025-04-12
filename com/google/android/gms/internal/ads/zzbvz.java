/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;

final class zzbvz
extends zzbvu {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbvz(zzbwd zzbwd2, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    public final void zze(String string2) {
        this.zza.onFailure(string2);
    }

    public final void zzf(List list) {
        list = (Uri)list.get(0);
        this.zza.onSuccess((Uri)list);
    }
}

