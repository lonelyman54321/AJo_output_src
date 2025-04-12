/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;

public final class zznm
implements zzjm {
    private Clock zza;

    public zznm() {
        Clock clock;
        this.zza = clock = DefaultClock.getInstance();
    }

    public final void zza(Clock clock) {
        this.zza = clock = (Clock)Preconditions.checkNotNull(clock);
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object2 = (double)this.zza.currentTimeMillis();
        object = new zzqq((Double)object2);
        return object;
    }
}

