/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

abstract class zzfn
extends zzbp {
    public zzfn(String string2, String ... stringArray) {
        super(string2, stringArray);
    }

    public final zzap zza(Map map2) {
        this.zzc(map2);
        return zzfp.zza();
    }

    public boolean zzb() {
        return false;
    }

    public abstract void zzc(Map var1);
}

