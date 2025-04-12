/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzab;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzam;
import java.util.Map;

final class zzaf
implements zzam {
    private final zzae zzdy;
    private final zzab zzdz;

    public zzaf(zzae zzae2, zzab zzab2) {
        this.zzdy = zzae2;
        this.zzdz = zzab2;
    }

    public final Object zzp() {
        Object object = this.zzdy;
        Map map2 = this.zzdz.zzg();
        object = ((zzae)object).zzds;
        return (String)map2.get(object);
    }
}

