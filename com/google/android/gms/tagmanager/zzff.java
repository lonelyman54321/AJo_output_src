/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzdt;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

abstract class zzff
extends zzdt {
    public zzff(String string2) {
        super(string2);
    }

    public abstract boolean zzc(String var1, String var2, Map var3);

    public final boolean zzd(zzap object, zzap object2, Map map2) {
        object = zzfp.zzm(zzfp.zzk((zzap)object));
        object2 = zzfp.zzm(zzfp.zzk((zzap)object2));
        String string2 = zzfp.zzl();
        if (object != string2 && object2 != (string2 = zzfp.zzl())) {
            return this.zzc((String)object, (String)object2, map2);
        }
        return false;
    }
}

