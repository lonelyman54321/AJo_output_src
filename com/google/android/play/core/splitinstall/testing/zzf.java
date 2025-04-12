/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;

public final class zzf
implements Runnable {
    public final /* synthetic */ FakeSplitInstallManager zza;
    public final /* synthetic */ SplitInstallSessionState zzb;

    public /* synthetic */ zzf(FakeSplitInstallManager fakeSplitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        this.zza = fakeSplitInstallManager;
        this.zzb = splitInstallSessionState;
    }

    public final void run() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zza;
        SplitInstallSessionState splitInstallSessionState = this.zzb;
        fakeSplitInstallManager.zzg(splitInstallSessionState);
    }
}

