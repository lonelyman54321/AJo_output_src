/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.util.List;

public final class zzd
implements Runnable {
    public final /* synthetic */ FakeSplitInstallManager zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ long zze;

    public /* synthetic */ zzd(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, long l2) {
        this.zza = fakeSplitInstallManager;
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
        this.zze = l2;
    }

    public final void run() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zza;
        List list = this.zzb;
        List list2 = this.zzc;
        List list3 = this.zzd;
        long l2 = this.zze;
        fakeSplitInstallManager.zzh(list, list2, list3, l2);
    }
}

