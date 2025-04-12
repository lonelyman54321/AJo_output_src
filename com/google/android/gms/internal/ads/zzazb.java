/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazb
extends zzazs {
    public zzazb(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "SHfJbyMgI7MrHewwYoTmYsM7CTkziBSZ0pvzhPCRWcLGoNw6AaEZWLqlKa0dpKuD", "SxHy+zpC+eGmQUPW4BYYcldQdVxiSSVnY0gIrWauGKU=", zzatp2, n3, 76);
    }

    public final void zza() {
        Object object = this.zzf;
        Context context = this.zzb.zzb();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = context;
        context = null;
        boolean bl2 = (Boolean)(object = (Boolean)((Method)object).invoke(null, objectArray));
        object = bl2 ? zzavc.zzb : zzavc.zza;
        this.zze.zzC((zzavc)object);
    }
}

