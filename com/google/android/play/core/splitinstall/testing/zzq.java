/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.splitinstall.zzf;
import java.util.List;

final class zzq
implements zzf {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ List zze;
    final /* synthetic */ FakeSplitInstallManager zzf;

    public zzq(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long l2, boolean bl2, List list3) {
        this.zzf = fakeSplitInstallManager;
        this.zza = list;
        this.zzb = list2;
        this.zzc = l2;
        this.zzd = bl2;
        this.zze = list3;
    }

    public final void zza() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zzf;
        List list = this.zza;
        List list2 = this.zzb;
        long l2 = this.zzc;
        FakeSplitInstallManager.zze(fakeSplitInstallManager, list, list2, l2);
    }

    public final void zzb(int n3) {
        FakeSplitInstallManager.zzj(this.zzf, 6, n3);
    }

    public final void zzc() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            FakeSplitInstallManager fakeSplitInstallManager = this.zzf;
            List list = this.zze;
            List list2 = this.zza;
            List list3 = this.zzb;
            long l2 = this.zzc;
            boolean bl3 = true;
            FakeSplitInstallManager.zzd(fakeSplitInstallManager, list, list2, list3, l2, bl3);
        }
    }
}

