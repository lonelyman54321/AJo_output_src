/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;

final class zaab
implements PendingResult$StatusListener {
    final /* synthetic */ BasePendingResult zaa;
    final /* synthetic */ zaad zab;

    public zaab(zaad zaad2, BasePendingResult basePendingResult) {
        this.zab = zaad2;
        this.zaa = basePendingResult;
    }

    public final void onComplete(Status object) {
        object = zaad.zaa(this.zab);
        BasePendingResult basePendingResult = this.zaa;
        object.remove(basePendingResult);
    }
}

