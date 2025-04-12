/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.util.List;

public final class zzi
implements Runnable {
    public final /* synthetic */ FakeSplitInstallManager zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ List zze;

    public /* synthetic */ zzi(FakeSplitInstallManager fakeSplitInstallManager, long l2, List list, List list2, List list3) {
        this.zza = fakeSplitInstallManager;
        this.zzb = l2;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
    }

    public final void run() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zza;
        long l2 = this.zzb;
        List list = this.zzc;
        List list2 = this.zzd;
        List list3 = this.zze;
        fakeSplitInstallManager.zzf(l2, list, list2, list3);
    }
}

