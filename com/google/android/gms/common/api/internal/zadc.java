/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zadb;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class zadc {
    public static final Status zaa;
    final Set zab;
    private final zadb zac;

    static {
        Status status;
        zaa = status = new Status(8, "The connection to Google Play services was lost");
    }

    public zadc() {
        Object object = new WeakHashMap();
        this.zab = object = Collections.synchronizedSet(Collections.newSetFromMap(object));
        this.zac = object = new zadb(this);
    }

    public final void zaa(BasePendingResult basePendingResult) {
        this.zab.add(basePendingResult);
        zadb zadb2 = this.zac;
        basePendingResult.zan(zadb2);
    }

    public final void zab() {
        BasePendingResult[] basePendingResultArray = this.zab;
        BasePendingResult[] basePendingResultArray2 = new BasePendingResult[]{};
        for (BasePendingResult basePendingResult : basePendingResultArray.toArray(basePendingResultArray2)) {
            Set set = null;
            basePendingResult.zan(null);
            boolean bl2 = basePendingResult.zam();
            if (!bl2) continue;
            set = this.zab;
            set.remove(basePendingResult);
        }
    }
}

