/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zar;

final class zas {
    final /* synthetic */ BasePendingResult zaa;

    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zar2) {
        this.zaa = basePendingResult;
    }

    public final void finalize() {
        BasePendingResult.zal(BasePendingResult.zaj(this.zaa));
        super.finalize();
    }
}

