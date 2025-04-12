/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzdt;
import com.google.android.gms.tagmanager.zzfo;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

abstract class zzdm
extends zzdt {
    public zzdm(String string2) {
        super(string2);
    }

    public abstract boolean zzc(zzfo var1, zzfo var2, Map var3);

    public final boolean zzd(zzap object, zzap object2, Map map2) {
        object = zzfp.zzd(zzfp.zzk((zzap)object));
        object2 = zzfp.zzd(zzfp.zzk((zzap)object2));
        zzfo zzfo2 = zzfp.zzc();
        if (object != zzfo2 && object2 != (zzfo2 = zzfp.zzc())) {
            return this.zzc((zzfo)object, (zzfo)object2, map2);
        }
        return false;
    }
}

