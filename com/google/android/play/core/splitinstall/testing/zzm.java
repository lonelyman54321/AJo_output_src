/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.util.List;

public final class zzm
implements Runnable {
    public final /* synthetic */ FakeSplitInstallManager zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ List zzc;

    public /* synthetic */ zzm(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2) {
        this.zza = fakeSplitInstallManager;
        this.zzb = list;
        this.zzc = list2;
    }

    public final void run() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zza;
        List list = this.zzb;
        List list2 = this.zzc;
        fakeSplitInstallManager.zzi(list, list2);
    }
}

