/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzu;

public final class zzca
extends zzb {
    private final zzr zza;
    private final String zzb;

    public zzca(Context object, String object2, String string2) {
        object = zzu.zzp().zzc((Context)object, (String)object2);
        this.zza = object2 = new zzr((String)object);
        this.zzb = string2;
    }

    public final void zza() {
        zzr zzr2 = this.zza;
        String string2 = this.zzb;
        zzr2.zza(string2);
    }
}

