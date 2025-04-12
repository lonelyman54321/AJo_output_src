/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzggg;
import java.util.concurrent.ScheduledExecutorService;

final class zzggj
extends zzggg
implements ScheduledExecutorService,
zzgge {
    final ScheduledExecutorService zza;

    public zzggj(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }
}

